import java.util.Scanner;

public class NombresAmis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Saisissez le premier entier positif : ");
            int premierNombre = scanner.nextInt();

            System.out.print("Saisissez le deuxieme entier positif : ");
            int deuxiemeNombre = scanner.nextInt();

            if (premierNombre <= 0 || deuxiemeNombre <= 0) {
                System.out.println("Les deux entiers doivent etre positifs.");
                return;
            }

            if (sontAmis(premierNombre, deuxiemeNombre)) {
                System.out.println(premierNombre + " et " + deuxiemeNombre + " sont amis.");
            } else {
                System.out.println(premierNombre + " et " + deuxiemeNombre + " ne sont pas amis.");
            }
        }
    }

    private static boolean sontAmis(int premierNombre, int deuxiemeNombre) {
        return premierNombre != deuxiemeNombre
                && sommeDiviseursPropres(premierNombre) == deuxiemeNombre
                && sommeDiviseursPropres(deuxiemeNombre) == premierNombre;
    }

    private static long sommeDiviseursPropres(int nombre) {
        if (nombre <= 1) {
            return 0;
        }

        long somme = 1;
        for (int diviseur = 2; diviseur <= nombre / diviseur; diviseur++) {
            if (nombre % diviseur == 0) {
                somme += diviseur;
                int diviseurAssocie = nombre / diviseur;
                if (diviseurAssocie != diviseur) {
                    somme += diviseurAssocie;
                }
            }
        }
        return somme;
    }
}