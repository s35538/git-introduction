//TODO: musimy dodac brakujace klasy!

// OK, ja dodam 'Adder', a s35517 doda 'Subtractor'.

public class Main {
    static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(2, 4));

        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.subtract(7, 3));
    }
}



// Test, changing commit author to uni account