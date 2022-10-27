package taskOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Skriv in ditt förnamn, med små bokstäver: ");
            String name = scanner.nextLine();
            char firstLetter = name.charAt(0);
            System.out.println("Namnet börjar på bokstaven " + firstLetter);
            char letter = 'ö';
            if(name.charAt(0) =='ö') {
                System.out.println("Namnet börjat på bokstaven ö som är den sista bokstaven i alfabetet");
            }
            break;

            /*
            * Fick det inte att fungera så att while loopen fortsätter loopa även när man inte skriver in något
            *
             */
        }
    }
}
