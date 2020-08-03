package fr.raphew.jour3;

import java.util.Scanner;

/**
 * This file of '[Aout] Jour 3 - JustePrix' was created by Raphew on 03/08/2020
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Premier nombre : minimum | Deuxième nombre : maxium (Exemple : 0 10) :");
        String rep = scanner.nextLine();
        String[] repSplit = rep.split(" ");
        int min = Integer.parseInt(repSplit[0]);
        int max = Integer.parseInt(repSplit[1]);
        boolean good;
        int n = 0;
        do{
            n++;
            int random = getRandomN(min, max);
            System.out.println(random + " ?");
            String pem = scanner.nextLine();
            if ("+".equals(pem)) {
                int diff = random - min;
                diff++;
                min += diff;
                good = false;
            } else if ("-".equals(pem)) {
                int diff = max - random;
                diff++;
                max -= diff;
                good = false;
            } else if ("=".equals(pem)) {
                System.out.println("Trouvé en " + n + " nombre !");
                good = true;
            } else {
                good = false;
            }
        }while (!good);
    }

    public static int getRandomN(int min, int max){
        max++;
        return ((int) (Math.random()*(max - min))) + min;
    }
}
