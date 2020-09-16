package com.decagon.roomerapp.models;

public enum Gender {
    MALE, FEMALE;
    public static Gender stringToEnum(String value) {
        if ("male".equals(value.toLowerCase())) return MALE;
        return FEMALE;
    }
}
