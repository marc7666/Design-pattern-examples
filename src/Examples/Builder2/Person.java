package Examples.Builder2;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 21/06/2022.
 */
public class Person {
    private String name;
    private String dni;
    private boolean passport;
    private int age;
    private boolean drivingLicense;

    public Person(String name, String dni, boolean passport, int age, boolean drivingLicense) {
        this.name = name;
        this.dni = dni;
        this.passport = passport;
        this.age = age;
        this.drivingLicense = drivingLicense;
    }

    static class PersonBuilder {
        private String name;
        private String dni;
        private boolean passport;
        private int age;
        private boolean drivingLicense;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder dni(String dni) {
            this.dni = dni;
            return this;
        }

        public PersonBuilder passport(boolean passport) {
            this.passport = passport;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder drivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Person build() {
            return new Person(name, dni, passport, age, drivingLicense);
        }
    }

    @Override
    public String toString() {
        return "Person{ " +
                "name = '" + name + '\'' +
                ", dni = '" + dni + '\'' +
                ", passport = " + passport +
                ", age = " + age +
                ", drivingLicense = " + drivingLicense +
                '}';
    }
}
