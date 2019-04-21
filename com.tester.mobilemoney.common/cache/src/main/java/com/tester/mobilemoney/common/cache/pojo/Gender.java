package com.tester.mobilemoney.common.cache.pojo;

public enum Gender {
    MALE("male"), FEMALE("female");
    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
