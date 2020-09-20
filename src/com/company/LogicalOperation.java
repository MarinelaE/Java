package com.company;

import javax.swing.*;
import java.sql.SQLOutput;

public class LogicalOperation {
    //1. lab 12 for. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
// Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
// pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void numberVerify(int number) {
        for (int x = number; x <= 100; x++) {
            System.out.println(x);
        }

    }

    //2. lab 12 for.  Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void printNegativeNumber(int number) {
        for (int x = number; x >= -100; x--) {
            System.out.println(x);
        }
    }


    // 3. lab 12 for. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void numersBetween(int firstNumber, int secondNumber) {
        for (int x = firstNumber; firstNumber <= secondNumber; firstNumber++) {
            System.out.println(firstNumber);
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
// Metoda trebuie sa verifice care dintre cele doua numere este mai mare,
// si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
// (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
// atunci numaratoarea sa fie de la y la x).
    ///?????? Cum se face sa numere de la y la x???
    public void lowerToBiggest(int x, int y) {
        for (int i = x; x <= y; x++) {
            if (x < y) {
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }

    //5. lab 12 for.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void evenNumbers(int even) {
        for (int x = even; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }

    //6. lab 12 for. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void oddNumbers(int odd) {
        for (int x = odd; x <= 100; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }

    //7. lab 12 for. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
// Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
// iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void printSum(int firstNumber) {
        int sum = 0;
        for (int x = firstNumber; x <= 100; x++) {
            sum = sum + x;
        }
        System.out.println(sum);
    }


    //   8. lab 12 for.  Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    //   Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    //   si sa calculeze media numerelor. La final, metoda sa returneze media.

    public void printSumAndAverage(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
            count++;
        }
        System.out.println(sum);
        System.out.println(count);
        System.out.println(sum / count);
    }

    // 9 lab 12 for
    public void pattern() {
        int row = 7;
        for (int i = row-1; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
        System.out.println();
    }

}

// 1 lab 12 while. Creati o metoda in clasa LogicalOp, care sa primeste un numar
// ca si parametru. Metoda sa verifice numrul primit,
// si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit
// ca si parametru.
    public void countToHundred (int x){
        while (x<=100){
            System.out.println(x);
            x++;
        }
    }

    //2. lab 12 while. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    public void countToHundredNegative (int x){
        while (x>=-100){
            System.out.println(x);
            x--;
        }
    }
//3. lab 12 while Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
// Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
// pana la cel de-al doilea(ex: daca int x e primul parametru iar int y
// este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void countTowNumbers(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
/*public void printNumberBetween (int firstNumber, int secondNumber){
        while (firstNumber<secondNumber){
            if (firstNumber>secondNumber){
                System.out.println(firstNumber);
            }
        }
}*/

//5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void numberEven() {
        int i = 1;
        while (i <= 100) {
            if ((i % 2) == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

// 6. lab 12 while  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void numberOdd() {
        int i = 1;
        while (i <= 100) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
  //7. lab 12   Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    public void countNumbers (){
        int x= 111;
        int sum = 0;
        float count =0;
        while (x<=8899){
            sum = sum +x;
            x++;
            count++;}
            System.out.println(sum);
            System.out.println(count);
            System.out.println(sum/count);
        }
//8. ??????? Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.
    public void printAverageDivisibleWithSeven (int firstNumber, int secondNumber){
        int x= firstNumber;
        int y = secondNumber;
        int sum= x+y;
        while (sum >=100){
            if ((sum%7) ==0){
                System.out.println(sum);
                sum++;
            }
        }
    }

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
    public String equalText(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + number;
        } else if (text.equals("FastTrackIT") && number >= 4) {
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

    public boolean isNumberEven(int nr) {
        if (nr % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //ex.10 Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
    // iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18,
    // sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }


    //ex.11 Creati o metoda care sa primeasca 3 numere ca si parametrii si
    // sa returneze cel mai mare numar. Apelati metoda in main() pentru a verifica daca functioneaza.
    public String compareThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return "The first number: " + firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return "The second number: " + secondNumber;
        } else {
            return "The third number: " + thirdNumber;
        }
    }
}
