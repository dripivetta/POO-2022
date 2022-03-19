package br.edu.fatecfranca.ex0;

public class TestaCliente {

    public static void main(String[] args) {
       Clientes bancoFatec = new Clientes ();
       bancoFatec.conta = 0001;
       bancoFatec.agencia = 0001;
       bancoFatec.nome = "Jessica";
       bancoFatec.saldo = 0;
       bancoFatec.realizarDeposito (10);
       bancoFatec.realizarSaque (5);
       bancoFatec.retornaDados ();
       
       
       Clientes bancoFacef = new Clientes ();
       bancoFacef.conta = 1111;
       bancoFacef.agencia = 1111;
       bancoFacef.nome = "Fulano";
       bancoFacef.saldo = 1000;
       bancoFacef.realizarDeposito (0);
       bancoFacef.realizarSaque (500);
       bancoFacef.retornaDados ();
    }
    
}
