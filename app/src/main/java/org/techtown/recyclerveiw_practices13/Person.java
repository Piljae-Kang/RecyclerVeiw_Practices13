package org.techtown.recyclerveiw_practices13;

public class Person {
    String nameAndBirthday;
    String mobile;

    public Person(String nameAndBirthday, String mobile) {
        this.nameAndBirthday = nameAndBirthday;
        this.mobile = mobile;

    }

    public String getNameAndBirthday() {
        return nameAndBirthday;
    }

    public void setNameAndBirthday(String nameAndBirthday) {
        this.nameAndBirthday = nameAndBirthday;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
