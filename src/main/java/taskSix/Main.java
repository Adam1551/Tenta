package taskSix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;

        System.out.println("1. Nämn en av rollerna som finns inom Scrum, " +
                "svaret ska vara på engelska med stor första bokstav i början: ");
        String firstQuestion = scanner.nextLine();
        if(firstQuestion.equals("Product owner")) {
            points++;
        }
        if(firstQuestion.equals("Scrum master")) {
            points++;
        }
        if(firstQuestion.equals("Development team")) {
            points++;
        }

        System.out.println("2. Nämn en av ceremonierna som finns inom Scrum, " +
                "svaret ska vara på engelska med stor bokstav i början: ");
        String secondQuestion = scanner.nextLine();
        if(secondQuestion.equals("Sprint planning")) {
            points++;
        }
        if(secondQuestion.equals("Daily stand-up")) {
            points++;
        }
        if(secondQuestion.equals("Sprint review")) {
            points++;
        }
        if (secondQuestion.equals("Sprint retrospective")) {
            points++;
        }

        System.out.println("3. Vad är rekommenderat max antal personer i ett team?:");
        int thirdQuestion = scanner.nextInt();
        if(thirdQuestion == 9) {
            points++;
        }
        //Jag kan inte få programmet att inte hoppa förbi user input på fråga 4,
        // jag vet aatt det beror på att jag använder "==" på fråga 3 mwwn hittade ingen alternativ lösning som fungerar.

        System.out.println("4. Vad heter dokumentet som innehåller all information om scrum?, " +
                "svaret ska vara på engelska med stor bokstav i början: ");
        String forthQuestion = scanner.nextLine();
        if(forthQuestion.equals("Scrum guide")) {
            points++;
        }

        System.out.println("5. Vem är den enda personen som får avbryta en Sprint?, " +
                "svaret ska vara på engelska med stor bokstav i början: ");
        String fifthQuestion = scanner.nextLine();
        if(fifthQuestion.equals("Product owner")) {
            points++;
        }

        System.out.println("Du fick ihop " + points + " poäng.");
        if(points == 5) {
            System.out.println("Stort grattis till alla rätt!");
        }
        if(points < 3) {
            System.out.println("Du rekommenderas att läsa på lite mer.");
        }

    }
}
