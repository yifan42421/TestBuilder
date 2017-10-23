package com.example.byc.testbuilder;

/**
 * Created by byc on 2017/10/22.
 * 使用InnerBuilder插件自动生成builder模式的代码
 */

public class PersonInnerBuilder {
    private final String firstName;//必选
    private final String lastName;//必选
    private final String middleName;//可选
    private final String salutation;//可选
    private final boolean isFemale;//可选

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    private PersonInnerBuilder(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        middleName = builder.middleName;
        salutation = builder.salutation;
        isFemale = builder.isFemale;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String salutation;
        private boolean isFemale;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder middleName(String val) {
            middleName = val;
            return this;
        }

        public Builder salutation(String val) {
            salutation = val;
            return this;
        }

        public Builder isFemale(boolean val) {
            isFemale = val;
            return this;
        }

        public PersonInnerBuilder build() {
            return new PersonInnerBuilder(this);
        }
    }
}
