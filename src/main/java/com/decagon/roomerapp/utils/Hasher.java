package com.decagon.roomerapp.utils;

public interface Hasher {
    String hash(String rawPassword) throws Exception;

    boolean checkPassword(String passwordHash, String userInput) throws Exception;

}
