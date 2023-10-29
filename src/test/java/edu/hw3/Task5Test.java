package edu.hw3;

import edu.hw3.Task5.Contact;
import edu.hw3.Task5.Task5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5Test {
    @Test
    @DisplayName("ascending test")
    void ascendingTest() {
        String[] names = new String[] {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        String sortingType = "ASC";
        String[] resultLastNames = new String[] {"Aquinas", "Descartes", "Hume", "Locke"};

        String[] result = new String[names.length];
        Contact[] contacts = Task5.parseContacts(names, sortingType);
        for (int i = 0; i < names.length; i++) {
            result[i] = contacts[i].getLastName();
        }
        assertThat(result).isEqualTo(resultLastNames);
    }

    @Test
    @DisplayName("descending test")
    void descendingTest() {
        String[] names = new String[] {"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        String sortingType = "DESC";
        String[] resultLastNames = new String[] {"Gauss", "Euler", "Erdos"};

        String[] result = new String[names.length];
        Contact[] contacts = Task5.parseContacts(names, sortingType);
        for (int i = 0; i < names.length; i++) {
            result[i] = contacts[i].getLastName();
        }
        assertThat(result).isEqualTo(resultLastNames);
    }

    @Test
    @DisplayName("empty array")
    void emptyArrayTest() {
        String[] names = new String[] {};
        String sortingType = "DESC";
        Contact[] contacts = Task5.parseContacts(names, sortingType);

        assertThat(contacts.length).isEqualTo(0);
    }

    @Test
    @DisplayName("null array")
    void nullArrayTest() {
        String[] names = null;
        String sortingType = "DESC";
        Contact[] contacts = Task5.parseContacts(names, sortingType);

        assertThat(contacts.length).isEqualTo(0);
    }

    @Test
    @DisplayName("incorrect sortingType")
    void incorrectSortingType() {
        String[] names = null;
        String sortingType = "AFS";
        Contact[] contacts = Task5.parseContacts(names, sortingType);

        assertThat(contacts.length).isEqualTo(0);
    }

    @Test
    @DisplayName("null sortingType")
    void nullSortingType() {
        String[] names = new String[] {"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        String sortingType = null;
        Contact[] contacts = Task5.parseContacts(names, sortingType);

        assertThat(contacts.length).isEqualTo(0);
    }
}
