package edu.hw3.Task5;

public class Contact {
    private final String firstName;
    private final String lastName;

    public Contact(String fullName) {
        String[] words = fullName.split(" ");
        firstName = words[0];
        lastName = words[1];
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstNameName() {
        return firstName;
    }
}
