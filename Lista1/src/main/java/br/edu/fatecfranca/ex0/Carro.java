package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Carro {
    // Declaração de variáveis
    String modelo;
    int ano;
    float velocidade;
    boolean motor;
    
    // métodos construtores
    Carro () {
        
    }
    Carro (String modelo, int ano, float velocidade, boolean motor){
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
        this.motor = motor;
    }
    
    // métodos
    void ligar (){
        this.motor = true;
    }
    void desligar (){
        this.motor = false;
        this.velocidade = 0;
    }
    void acelerar (float x){
        this.velocidade += x;
    }
    void frear (float x) {
       this.velocidade -= x;
    }
    void mostrar (){
        // System.out.println("Modelo:" + modelo + " Ano:" + ano + " Vel:" + velocidade + " Motor:" + motor);
        
        JOptionPane.showMessageDialog(null, "Modelo:" + modelo + " Ano:" + ano + " Vel:" + velocidade + " Motor:" + motor);
        
    }
}
