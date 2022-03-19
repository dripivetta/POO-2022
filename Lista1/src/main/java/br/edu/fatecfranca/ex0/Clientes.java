package br.edu.fatecfranca.ex0;

public class Clientes {
    
    // Declarando as variáveis
    int conta;
    int agencia;
    String nome;
    float saldo;
    
    // Construtores
    Clientes (){
        
    }
    
    public void realizarDeposito (float deposito){
        this.saldo = saldo + deposito;
        System.out.println("Depósito: "+ deposito);
    }
    
    void realizarSaque (float saque){
        this.saldo = saldo - saque;
        System.out.println("Saque: " + saque);
    }
    
    void retornaDados () {
        System.out.println("Número da conta: "+ conta);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Saldo atual: " + saldo);
    }    
}
