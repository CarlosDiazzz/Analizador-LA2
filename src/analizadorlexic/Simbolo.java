/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorlexic;

/**
 *
 * @author carlo
 */
public class Simbolo {
    private String id;
    private String metodo;
    private int parametro;
    private int valor;

    public Simbolo(String id, String metodo, int parametro, int valor) {
        this.id = id;
        this.metodo = metodo;
        this.parametro = parametro;
        this.valor = valor;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getMetodo() {
        return metodo;
    }

    public int getParametro() {
        return parametro;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-10s %-10d %-10d", id, metodo, parametro, valor);
    }
}
