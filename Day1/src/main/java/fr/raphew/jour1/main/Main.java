package fr.raphew.jour1.main;

import java.util.Scanner;

/**
 * This file of '[Aout] Jour 1 - Difference texte' was created by Raphew on 01/08/2020
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";

        System.out.println("Texte 1 :");
        String texte1 = scanner.nextLine();
        System.out.println("Texte 2 :");
        String texte2 = scanner.nextLine();

        int length = Math.max(texte1.length(), texte2.length());

        for(int i = 0 ; i < length ; i++){
            char ct1 = texte1.charAt(i);
            char ct2 = texte2.charAt(i);

            if(ct1 != ct2)
                ct2 = 'X';

            answer += ct2;
        }

        System.out.println("\n" + answer);

    }

}
