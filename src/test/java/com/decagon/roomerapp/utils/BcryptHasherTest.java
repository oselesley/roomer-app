package com.decagon.roomerapp.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BcryptHasherTest {
    BcryptHasher bcryptHasher;
    private final String RAW_PASSWORD = "12345";

    @BeforeEach
    void setUp() {
        bcryptHasher = new BcryptHasher();
    }

    @Test
    void hash() throws Exception {
        String hash = bcryptHasher.hash(RAW_PASSWORD);
        assertNotEquals(hash, RAW_PASSWORD);
    }

    @Test
    void checkPassword() throws Exception {
        String hash = bcryptHasher.hash(RAW_PASSWORD);
        assertTrue(bcryptHasher.checkPassword(hash, RAW_PASSWORD));
        assertFalse(bcryptHasher.checkPassword(hash, "1234"));
    }
}