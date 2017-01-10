package com.dewoch.diamondkata;

import com.dewoch.exceptions.MultipleLettersException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by boris on 07/01/2017.
 */
public final class Diamond {

    public static void main(String[] args) throws MultipleLettersException {

        Diamond.print(args[0]);
    }



    public static String print(String letter) throws MultipleLettersException{

        if(letter == null || letter.length() != 1){

            throw new MultipleLettersException("Only one letter must be entered");
        }

        letter = letter.toUpperCase();

        StringBuilder result = new StringBuilder();
        StringBuilder lineBuilder;
        List<String> lines = new ArrayList<>();

        int letterRank = letter.charAt(0) - 64;// A = 65

        for (int i = 1; i < letterRank + 1; i++) {

            lineBuilder = new StringBuilder();
            // i represents current letter rank.
            for (int j = 0; j < (2 * (letterRank - i)); j++) {

                lineBuilder.append(" ");

            }

            String currentLetter = String.valueOf((char) (i + 64));
            lineBuilder.append(currentLetter);

            if (!"A".equals(currentLetter)) {
                for (int k = 0; k < (3 + (4 * (i - 2))); k++) {

                    lineBuilder.append(" ");

                }

                lineBuilder.append(currentLetter);
            }

            lineBuilder.append("\n");

            result.append(lineBuilder);

            if (!currentLetter.equals(letter)) {
                lines.add(lineBuilder.toString());
            }

        }

        // Add Symetric
        for (int i = lines.size() - 1; i >= 0; i--) {

            result.append(lines.get(i));
        }

        return result.toString();
    }
}
