package edu.hw3.Task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Task5 {
    private static final String DESCENDING_STRING = "DESC";
    private static final String ASCENDING_STRING = "ASC";

    private Task5() {
    }

    public static Contact[] parseContacts(String[] names, String sortingType) {
        if (names == null || (!Objects.equals(sortingType, ASCENDING_STRING)
            && !Objects.equals(sortingType, DESCENDING_STRING))) {
            return new Contact[] {};
        }
        Contact[] contacts = new Contact[names.length];
        for (int i = 0; i < names.length; i++) {
            contacts[i] = new Contact(names[i]);
        }
        if (sortingType.equals(DESCENDING_STRING)) {
            Arrays.sort(contacts, (Comparator.comparing(Contact::getLastName, Comparator.reverseOrder())));
        } else {
            Arrays.sort(contacts, (Comparator.comparing(Contact::getLastName)));
        }
        return contacts;
    }
}
