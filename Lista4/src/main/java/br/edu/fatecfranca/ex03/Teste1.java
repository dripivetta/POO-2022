
package br.edu.fatecfranca.ex03;

import java.util.Calendar;

import java.util.Date;

public class Teste1 {

    public static void main(String[] args) {
        Conta c1 = new Conta ("0102341-1", "3259", "Fulano", 1000);
        
        Calendar val = Calendar.getInstance();
        val.set (Calendar.YEAR, 2023);
        val.set(Calendar.MONTH, 2);
        val.set(Calendar.DAY_OF_MONTH, 18);
        //val é um Calendar, devemos transforma-lo para Date
        // val.getTime() transforma val(Calendar) em Date
        Cartao ca1 = new Cartao (1234, 186, val.getTime(), "Visa", 9876, c1);
        
        ca1.mostra ();
        ca1.sacar(600, 9876);
        ca1.mostra();
    }
    
}
