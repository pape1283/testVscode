import java.math.BigDecimal;
import java.math.BigDecimal;
public class Bonjour {
    public static void main(String[] args) {
       
        System.out.println(0.1 + 0.2);                 // pas 0.3 !
        double solde = 1.10;
        solde = solde - 0.20;
        System.out.println("Solde double : " + solde);

        // Solution 1 : des entiers dans la plus petite unité (le FCFA n'a pas de centimes)
        long prixFcfa = 1_500;
        long total = prixFcfa * 3;
        System.out.println("Total : " + total + " FCFA");

        // Solution 2 : BigDecimal pour les devises à décimales (euro, dollar)
        BigDecimal a = new BigDecimal("1.10");
        BigDecimal b = new BigDecimal("0.20");
        System.out.println("Solde BigDecimal : " + a.subtract(b));

    }
}
