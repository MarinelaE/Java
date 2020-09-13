package com.company;

import javax.swing.*;

public class LogicalOperation {

    public int verifyNumber(int number) {
        if (number >= 2 && number <= 8) {
            return number;
        }
        return (0);
    }

    //ex 3. creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
    // si sa primeasca doua int-uri ca si parametrii. Folosind if - else,
    // verificati in interiorul metode care numar este mai mare,
    // dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
    public int checkBiggerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else
            return secondNumber;
    }

    // ex.4 Creati o metoda de tip String, care sa primeasca un parametru de tip String.
// Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
// Dca da, atunci metoda sa returneze “Learning text comparison”.
// Daca nu, atunci metoda sa returneze “Got to try some more”.

    public String verifyText(String first) {
        if (first.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }

    }


    //ex.5 Creati o metoda de tip String, care sa primeasca un parametru de tip String,
    // si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”,
    // si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
    // Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
    // returnati numarul si textul, in ordinea asta.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
public String equalText (String text, int number){
        if (text.equals("FastTrackIT") && number <=3){
            return text + number;
        }else if (text.equals("FastTrackIT") && number>=4){
            return number + text;
        }
        return "";
}

    //ex.6 Creati o metoda de tip String,
    // care sa primeasca un parametru de tip int.
    // Daca numarul primit este mai mare de 8, SAU egal cu 6,
    // atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul.
    // Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String amountSnow(int input) {
        if (input > 8 || input == 6) {
            return ("The amount of snow this winter was(cm): " + input);
        } else
            return "The forecast snow is(cm): 0";
    }

    //ex. 7  Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”,
    // iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String comparisonNumbers(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number < 3) {
            return "The number is lower than 3";
        }
        return "";
    }

    //ex.8 Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
    // unde x trebuie sa reprezinte numarul apasat.
    // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru,
    // ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String parametru(int a) {
        switch (a) {
            case 1:
                return "The number is:  1 !";
            case 2:
                return "The number is:  2 !";
            case 3:
                return "The number is:  3 !";

            case 4:
                return "The number is:  4 !";

            case 5:
                return "The number is:  5 !";

            default:
                return "The number is not between 1 and 5";
        }
    }

    //ex.9 Creati o metoda care sa se numeasca isNumberEven.
    // Metoda trebuie sa primeasca ca parametru un numar,
    // si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

public boolean isNumberEven (int nr){
        if (nr % 2==0){
            return true;
        } else {
            return false;
        }
}
    //ex.10 Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18,
    // sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.

public boolean isEligibleToVote(int age){
        if (age >=18) {
            return true;
    } else {
            return false;
    }
}


    //ex.11 Creati o metoda care sa primeasca 3 numere ca si parametrii si
    // sa returneze cel mai mare numar. Apelati metoda in main() pentru a verifica daca functioneaza.
    public String compareThreeNumbers (int firstNumber, int secondNumber, int thirdNumber){
        if (firstNumber > secondNumber && firstNumber> thirdNumber){
            return "The first number: " + firstNumber;
        }else if(secondNumber>firstNumber && secondNumber>thirdNumber){
            return "The second number: " + secondNumber;
        } else{
            return "The third number: " + thirdNumber;
    }
    }
}
