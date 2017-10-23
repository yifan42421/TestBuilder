package com.example.byc.testbuilder;

/**
 * Created by byc on 2017/10/22.
 */

public class Person {
    private final String firstName;//必选
    private final String lastName;//必选
    private final String middleName;//可选
    private final String salutation;//可选
    private final boolean isFemale;//可选

    private Person(PersonBuilder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        isFemale = builder.isFemale;
        middleName = builder.middleName;
        salutation = builder.salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSalutation() {
        return salutation;
    }

    public boolean getIsFemale() {
        return isFemale;
    }

    public static class PersonBuilder {
        private final String firstName;//必选
        private final String lastName;//必选
        private String middleName;//可选
        private String salutation;//可选
        private boolean isFemale;//可选

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder setSalutation(String salutation) {
            this.salutation = salutation;
            return this;
        }

        public PersonBuilder setIsFemale(boolean isFemale) {
            this.isFemale = isFemale;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
