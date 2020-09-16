package com.decagon.roomerapp.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class BcryptHasher implements Hasher {
    private static final int COST_FACTOR = 6;
    private final BCrypt.Hasher hashAlg = BCrypt.with(BCrypt.Version.VERSION_2Y);
    @Override
    public String hash(String rawPassword) throws Exception {
        return hashAlg.hashToString(COST_FACTOR, rawPassword.toCharArray());
    }

    @Override
    public boolean checkPassword(String passwordHash, String userInput) throws Exception {
        if (passwordHash == null || passwordHash.isEmpty()) return false;
        return BCrypt.verifyer().verify(userInput.toCharArray(), passwordHash).verified;
    }
}
