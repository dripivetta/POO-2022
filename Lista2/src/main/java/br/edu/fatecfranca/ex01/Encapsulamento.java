package br.edu.fatecfranca.ex01;

import java.util.ArrayList;

public final class Encapsulamento {
    
    // Declaração de variáveis
    
    private int dia;
    private String mes;
    
    // Construtor 
    public Encapsulamento () {
        
    }
    
    public Encapsulamento (int dia, String mes) {
        this.setDia (dia);
        this.setMes(mes);
    }
    
    public void setDia (int dia) {
        if ((dia >=1) && (dia <=31)) {
            this.dia = dia;
        }
        else {
            this.dia = 0;
            System.out.println ("Dia inválido");
        }
    }
    
    public void setMes (String mes) {
        // vamos criar um vetor
        ArrayList <String> vetor = new ArrayList ();
        vetor.add ("Janeiro");
        vetor.add ("Fevereiro");
        vetor.add ("Março");
        vetor.add ("Abril");
        vetor.add ("Maio");
        vetor.add ("Junho");
        vetor.add ("Julho");
        vetor.add ("Agosto");
        vetor.add ("Setembro");
        vetor.add ("Outubro");
        vetor.add ("Novembro");
        vetor.add ("Dezembro");
        if (vetor.contains(mes)){
            this.mes = mes;
        }
        else {
            this.mes = "invalido";
            System.out.println ("Mês inválido");
        }
    }
    
    public int getDia () {
        return this.dia;
    }
    
    public String getMes () {
        return this.mes;
    }
}
