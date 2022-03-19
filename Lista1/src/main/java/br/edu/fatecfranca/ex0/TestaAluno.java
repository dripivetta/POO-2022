package br.edu.fatecfranca.ex0;

public class TestaAluno {

     public static void main(String[] args) {
        Aluno fatec = new Aluno ();
        fatec.numero = 01;
        fatec.nome = "Jessica";
        fatec.idade = 20;
        fatec.p1 = 10;
        fatec.p2 = 10; 
        fatec.notafinal();
        fatec.dadosaluno ();
        fatec.passou();
    }  
     
    // OU
    // public static void main(String[] args) {
    //   int auxNroAluno = Inter.parseInt (JOptionPane.showInputDialog ("Nro"));
    //   int auxIdade = Inter.parseInt (JOptionPane.showInputDialog ("Idade"));
    //   int String auxNome = JOptionPane.showInputDialog ("Nome");
    //   float auxP1 = Float.parseFloat (JOptionPane.showInputDialog ("P1"));
    //   float auxP2 = Float.parseFloat (JOptionPane.showInputDialog ("P2"));
    //   Aluno obj1 = new ALuno (auxoNroAluno, auxIdade, auxNome, auxP1, auxP2);
    //   obj1. dadosaluno ();
    //} 
}
