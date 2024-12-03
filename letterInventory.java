package cs145.labs.Lab3;
/*This program is meant to take in inputs, store them, and identify values stored. */

//Nolan Lawler
public class letterInventory {
    private static final int ALPHABET_SIZE = 26;
    private int[] letterCounts;
    private int size;

    //manipulates data for use.
    public letterInventory(String data) {
        letterCounts = new int[ALPHABET_SIZE];
        size = 0;
        if (data != null) {
            data = data.toLowerCase();
            for (char ch : data.toCharArray()) {
                if (Character.isLetter(ch)) {
                    int index = ch - 'a';
                    letterCounts[index]++;
                    size++;
                }
            }
        }
    }

    // cathes errors by converting to lowercase and prepares for correct indexing.
    public int get(char letter) {
        if (!Character.isLetter(letter)) {
            throw new IllegalArgumentException("Input must be an alphabetic character.");
        }
        return letterCounts[Character.toLowerCase(letter) - 'a'];
    }

    // counts for letters using indexes.
    public void set(char letter, int value) {
        if (!Character.isLetter(letter) || value < 0) {
            throw new IllegalArgumentException("Input must be an alphabetic character and value must be non-negative.");
        }
        int index = Character.toLowerCase(letter) - 'a'; // line that counts indexes - a calculates diffrences in distance between leters resulting in perfect indexing., fond this online never used it before.
        size += value - letterCounts[index]; 
        letterCounts[index] = value;
    }

    // total number of letters in the inventory
    public int size() {
        return size;
    }

    // printable representation of the inventory if called on in test
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            for (int j = 0; j < letterCounts[i]; j++) {
                result.append((char) ('a' + i));
            }
        }
        result.append("]");
        return result.toString();
    }
}
