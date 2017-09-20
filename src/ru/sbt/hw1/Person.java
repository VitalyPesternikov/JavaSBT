package ru.sbt.hw1;

/**
 * Created by Vitaly on 20.09.2017.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;


    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (!person.man == this.man) {
            if (person.spouse == this && this.spouse == person) {
                return false;
            } else {

                if (this.spouse != null) {
                    if (this.spouse.spouse != null) {
                        this.spouse.divorce();
                    }
                    this.divorce();
                }
                if (person.spouse != null) {
                    if (person.spouse.spouse != null) {
                        person.spouse.divorce();
                    }
                    person.divorce();
                }


                person.spouse = this;
                this.spouse = person;
                return true;
            }
        } else return false;
    }

    public boolean divorce() {
        if (this.spouse == null)
            return false;
        else {
            this.spouse = null;
            return true;
        }
    }

//    public static void main(String[] args) {
//        Person p1 = new Person(true, "Vas");
//        Person p2 = new Person(false, "Mas");
//        Person p3 = new Person(true, "Bor");
//        Person p4 = new Person(false, "Kat");
//        System.out.println(p1.marry(p2));
//        System.out.println(p3.marry(p2));
//        System.out.println(p2.marry(p3));
//        System.out.println(p1.divorce());
//        System.out.println(p4.divorce());
//
//    }

}