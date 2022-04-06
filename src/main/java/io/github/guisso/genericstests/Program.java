/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package io.github.guisso.genericstests;

/**
 * Central point of program execution.
 *
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 06/04/2022
 */
public class Program {

    public static void main(String[] args) {
        // Default constructor
        Tupla<Double, Double> resposta1 = new Tupla<>();

        resposta1.setValorA(3.14159);
        resposta1.setValorB(2.75839);

        System.out.println(">> " + resposta1.getValorA());
        System.out.println(">> " + resposta1.getValorB());
        System.out.println("   " + resposta1);

        // Tuple as method return value
        Tupla<Integer, Integer> resposta2 = calcular();

        System.out.println(">> " + resposta2.getValorA());
        System.out.println(">> " + resposta2.getValorB());
        System.out.println("   " + resposta2);
    }

    // Tuple as return value
    public static Tupla<Integer, Integer> calcular() {
        // Overloaded constructor
        return new Tupla<>(123, 456);
    }
}
