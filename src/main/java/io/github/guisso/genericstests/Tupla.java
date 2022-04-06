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
 * Transporting values through a generic tuple.
 *
 * @param <T> First (generic) type.
 * @param <U> Second (generic) type.
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.1, 06/04/2022
 */
public class Tupla<T, U> {

    private T valorA;
    private U valorB;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Tupla() {
    }

    public Tupla(T valorA, U valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public T getValorA() {
        return valorA;
    }

    public void setValorA(T valorA) {
        this.valorA = valorA;
    }

    public U getValorB() {
        return valorB;
    }

    public void setValorB(U valorB) {
        this.valorB = valorB;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="toString">
    @Override
    public String toString() {
        return '<' + valorA.toString()
                + ", " + valorB.toString() + '>';
    }
    //</editor-fold>

}
