/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2.ejercicio2;

/**
 *
 * @author Yair
 */
public class Fecha {
    private int mes;
    private int dia;
    private int año;
    String resultado;

    public Fecha(int mes, int dia, int año) {
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String mostrarFecha(){
        resultado = "Tú fecha es: " + dia + "/" + mes + "/" + año;
        return resultado;
    }
    
}
