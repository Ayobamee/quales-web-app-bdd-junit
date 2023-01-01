package org.LearningApp;

import java.util.Random;

public class randomdigits {

    // generate four random digits
    public String randomfourdigits() {
        int randomdig = (int) (Math.random() * 9000) + 1000;
        String digit = String.valueOf(randomdig);
        return digit;
    }

    public String randomAlphabet(int length) {
        Random random = new Random();
        final int alphabetLength = 'Z' - 'A' + 1;
        StringBuilder result = new StringBuilder(length);
        while (result.length() < length) {
            final char charCaseBit = (char) (random.nextInt(2) << 5);
            result.append((char) (charCaseBit | ('A' + random.nextInt(alphabetLength))));
        }
        return result.toString();
    }

}
