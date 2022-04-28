package com.sparta.jm;

public class FilmClassifications {
    public static String availableClassifications(int ageOfViewer) {
        /*
            U -> All ages
            PG -> All ages
            12a -> 12 and above OR accompanied by adult
            12 -> 12 and above
            15 -> 15 and above
            18 -> 18 and above
         */

        String result;
        if (ageOfViewer < 12) {
            result = "U & PG films are available.";
        } else if (ageOfViewer < 15) {
            result = "U, PG & 12 films are available.";
        } else if (ageOfViewer < 18) {
            result = "U, PG, 12 & 15 films are available.";
        } else {
            result = "All films are available.";
        }
        return result;
    }
}
