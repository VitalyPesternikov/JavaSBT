package ru.sbt.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


public class BeanUtils {
    public static void assign(Object to, Object from) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {

        for (Method methodFrom : from.getClass().getMethods()) {
            String name = methodFrom.getClass().getName();

            for (Method methodTo : to.getClass().getMethods()) {

                if (methodTo.getName().startsWith("set") && Modifier.isPublic(methodTo.getModifiers())) {
                    String nameCheck = "get" + methodTo.getClass().getName().substring(3);

                    if (name.equals(nameCheck) && isCompatible(methodTo.getReturnType(), methodFrom.getReturnType())) {
                        Object param = methodFrom.invoke(from);

                        try {
                            methodTo.invoke(to, param);

                        } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
                            e.getMessage();
                        }
                    }
                }
            }
        }
    }

    private static boolean isCompatible(Class to, Class from) {
        while (from != null) {
            if (to.equals(from)) return true;
            from = from.getSuperclass();
        }
        return false;
    }

}
