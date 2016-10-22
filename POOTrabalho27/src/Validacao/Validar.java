/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacao;

import java.util.Scanner;

/**
 *
 * @author Arcano
 */
public class Validar {

    private static Scanner input = new Scanner(System.in);

    /**
     * Metodo que exibe uma mensagem recebida por parÃ¢metro para o usuario e
     * captura o proximo int que serÃ¡ digitado
     *
     * @param mensagem Recebe a mensagem que serÃ¡ exibida ao usuÃ¡rio
     * @return Retorna o int inserido pelo usuÃ¡rio
     */
    public static int inInt(String mensagem) {
        System.out.print(mensagem);
        int in = 1;
        try {
            in = input.nextInt();
            input.nextLine();
        } catch (Exception e) {
            System.out.println("Ocorreu algum erro, tente novamente");
            System.out.print("");
            input.nextLine();
            return inInt(mensagem);
        }
        return in;
    }

    /**
     * Metodo que exibe uma mensagem recebida por parÃ¢metro para o usuario e
     * captura o proximo double que serÃ¡ digitado
     *
     * @param mensagem Recebe a mensagem que serÃ¡ exibida ao usuÃ¡rio
     * @return Retorna o double inserido pelo usuÃ¡rio
     */
    public static double inDouble(String mensagem) {
        System.out.print(mensagem);
        double in;
        try {
            in = input.nextDouble();
            input.nextLine();
        } catch (Exception e) {
            System.out.print("Ocorreu algum erro, tente novamente");
            System.out.print("");
            input.nextLine();
            return inDouble(mensagem);
        }
        return in;
    }

    /**
     * Metodo que exibe uma mensagem recebida por parÃ¢metro para o usuario e
     * captura a proxima String que serÃ¡ digitado
     *
     * @param mensagem Recebe a mensagem que serÃ¡ exibida ao usuÃ¡rio
     * @return Retorna a String inserido pelo usuÃ¡rio
     */
    public static String inString(String mensagem) {
        String in;
        System.out.print(mensagem);
        in = input.nextLine();
        return in;
    }

    /**
     * Metodo que exibe um separador (####) para o usuario
     */
    public static void div() {
        System.out.println("----------------------------------------------------");
    }
}


