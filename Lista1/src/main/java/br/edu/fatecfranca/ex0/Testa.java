package br.edu.fatecfranca.ex0;

import javax.swing.JOptionPane;

public class Testa {

    public static void main(String[] args) {
       System.out.println("Hoje é sexta feira");
       
       // criar um objeto da classe Carro
       Carro objeto1 = new Carro ();
       objeto1.modelo = JOptionPane.showInputDialog ("Informe modelo:");
       objeto1.ano = Integer.parseInt(JOptionPane.showInputDialog ("Informe ano:"));
       objeto1.velocidade = Float.parseFloat(JOptionPane.showInputDialog ("Informe a velocidade:"));
       int resp = JOptionPane.showConfirmDialog(null,"Criar o carro com motor ligado?");  
       objeto1.motor = (resp == JOptionPane.OK_OPTION);
       
       objeto1.mostrar ();
       objeto1.ligar ();
       objeto1.mostrar ();
       objeto1.acelerar(80);
       objeto1.mostrar ();
       objeto1.frear (20);
       objeto1.mostrar ();
       objeto1.desligar ();
       objeto1.mostrar ();
       
       Carro objeto2 = new Carro ("Palio", 2012, 0, false); 
       objeto2.mostrar ();         
    }    
}
