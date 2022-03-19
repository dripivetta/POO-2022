
package br.edu.fatecfranca.ex01;


public class TesteEncapsulamento {

    
    public static void main(String[] args) {
       
        Encapsulamento obj = new Encapsulamento ();
        obj.setDia (3);
        obj.setDia (80);
        obj.setDia (-3);
        obj.setMes ("Janeiro");
        obj.setMes ("Outono");
        
        System.out.println ("Dia " + obj.getDia() + "Mês " + obj.getMes() );
        System.out.println ("----------------------------------------------");
       
        Encapsulamento obj2 = new Encapsulamento ();
        obj2.setDia (5);
        obj2.setMes ("Março");
        System.out.println ("Dia " + obj2.getDia() + "Mês " + obj2.getMes() );
        System.out.println ("----------------------------------------------");
        
        Encapsulamento obj3 = new Encapsulamento (9, "Junho");
        System.out.println ("Dia " + obj3.getDia() + "Mês " + obj3.getMes() );
       
        
    }
    
}
