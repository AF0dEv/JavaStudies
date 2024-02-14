/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import Exceptions.NomeInvalidoException;
import Exceptions.ValorNumericoInvalidoException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author afons
 */
public class TestePaiis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pop: ");
        Integer nrPop = sc.nextInt();
        sc.nextLine();
        System.out.println("pib: ");
        Integer pib = sc.nextInt();
        sc.nextLine();
        System.out.println("1º Ministro: ");
        String primMinistro = sc.nextLine();
        Paiis portugal = new Paiis("Portugal", "Europa");
        portugal.setLingua("Português");
        try {
            portugal.setNrPopulacao(nrPop);
        } catch (ValorNumericoInvalidoException e) {
            Logger.getLogger(TestePaiis.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            portugal.setPib(pib);
        } catch (ValorNumericoInvalidoException e) {
            Logger.getLogger(TestePaiis.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            portugal.setPrimeiroMinistro(primMinistro);
        } catch (NomeInvalidoException ex) {
            Logger.getLogger(TestePaiis.class.getName()).log(Level.SEVERE, null, ex);
        }
        portugal.setRei("Afonso");

        System.out.println(portugal.toString());
    }
}
