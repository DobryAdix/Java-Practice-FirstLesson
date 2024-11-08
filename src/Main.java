public class Main {
    public static void main(String[] args) {

        System.out.println("\n------------- Introduction to Java Data Types -------------");

        // 1. Deklaracja i inicjalizacja zmiennych wieku, wzrostu i statusu studenta
        int age = 29;
        double heightInMeters = 1.83;
        boolean areAStudent = false;

        // 2. Przypisanie oceny ('A' - w tym przypadku, 'B', 'C') do zmiennej i wyświetlenie jej
        char grade = 'A';
        System.out.println(grade); // Wyświetlenie oceny

        // 3. Utworzenie zmiennej String przechowującej pełne imię i nazwisko oraz jego wyświetlenie
        String imieINazwisko = "Karol Cepr";
        System.out.println(imieINazwisko); // Wyświetlenie imienia i nazwiska

        System.out.println("\n------------- Operations on Variables -------------");

        // 1. Obliczenie sumy i iloczynu dwóch liczb
        int firstNumber = 30;
        int secondNumber = 4;
        int sum = firstNumber + secondNumber;
        int multiply = firstNumber * secondNumber;

        /*
        System.out.println("Suma: " + sum);
        System.out.println("Iloczyn: " + multiply);
        */

        // 2. Sprawdzenie, czy liczby są równe
        boolean isEqual = (firstNumber == secondNumber); // false;
        if (isEqual) {
            System.out.println("Liczby " + firstNumber + " i " + secondNumber + " są równe");
        } else {
            System.out.println("Liczby " + firstNumber + " i " + secondNumber + " nie są równe");
        }

        // 3 Sprawdzenie, czy liczba jest parzysta lub nieparzysta
        if (firstNumber % 2 == 0){
            System.out.println("Liczba " + firstNumber + " jest parzysta");
        } else {
            System.out.println("Liczba " + firstNumber + " jest nieparzysta");
        }

        System.out.println("\n------------- Control Flow Statements -------------");

        // 1. Sprawdzenie, czy liczba jest dodatnia, ujemna, czy równa zero
        int number = 312;
        if (number > 0){
            System.out.println("Liczba " + number + " jest dodatnia");
        } else if (number < 0) {
            System.out.println("Liczba " + number + " jest ujemna");
        } else {
            System.out.println("Liczba " + number + " jest równa 0");
        }

        // 2. Wypisanie pierwszych 10 liczb ciągu Fibonacciego
        int n = 10;
        firstNumber = 0;
        secondNumber = 1;
        int nextNumber;
        for (int i = 1; i <= n; i++){
            System.out.println("Liczba " + i + " = " + firstNumber);
            nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        // 3. Pętla wypisująca liczby od 1 do 100
        n = 100;
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i); // Ostatnia liczba bez przecinka
            }
        }
    }
}