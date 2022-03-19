
package br.edu.fatecfranca.ex01;

public class TesteExercicio01 {

   
    public static void main(String[] args) {
        
        Exercicio01 bancoItau = new Exercicio01 ();
        bancoItau.setNome ("Fulano");
        bancoItau.setNagencia ("000-03");
        bancoItau.setNconta ("123456-7");
        bancoItau.setSaldo (1000);
        bancoItau.realizarDeposito (1000);
        bancoItau.realizarSaque(10);
        bancoItau.retornaDados ();      
    }
    
}

// Se for acessar as variáveis sem os metódos getters e setters fala que a variável é privada