package br.edu.fatecfranca.ex01;

public final class Exercicio01 {
    
    // Declaração de variáveis
    
    private String nConta;
    private String nAgencia;
    private String nome;
    private float saldo;
    
    // Construtores
    public Exercicio01 () {
        
    }
    
    public Exercicio01 (String nConta, String nAgencia, String nome, float saldo) {
        this.setNconta (nConta);
        this.setNagencia (nAgencia);
        this.setNome (nome);
        this.setSaldo (saldo);
    }
    
    public void setNconta (String x) {
        if (x.length() == 8) {
            if (x.charAt(6) == '-') { // %% (nConta.chartAt (6) == '-') 
                this.nConta = x;
            }
            else {
                this.nConta = "Inválido";
                System.out.println ("Conta deve ter um dígito verificador");
            }
        }
        else {
            this.nConta = "Inválido";
            System.out.println ("Conta deve ter tamanho 8");
        }
    }
    
    // OU
    // public void setNconta (String nConta) {
    //  if ((nConta.length() == 8) && (nConta.charAt (6) == '-')) {
    //      this.nConta = nConta;
    //  }
    //  else {
    //      this.nConta = "Inválido";
    //      System.out.println ("Conta deve ter tamanho 8");
    // }
    
    public String getNconta () {
        return this.nConta;
    }
    
    public void setNagencia (String x) {
        if (x.length() == 6) {
            if (x.charAt(4) == '-'){
                this.nAgencia = x;
            }
            else {
                this.nAgencia = "Inválido";
                System.out.println ("Agência deve ter um digito verificador");
            }
        }
        else {
            this.nConta = "Inválido";
            System.out.println ("Agência deve ter um tamanho 6");
        }
    }
    
    // OU
    // public void setAgencia (String nAgencia) {
    //  if ((nConta.length() == 6) && (nConta.charAt (4) == '-')) {
    //      this.nAgencia = nAgencia;
    //  }
    //  else {
    //      this.nAgencia = "Inválido";
    //      System.out.println ("Agencia deve ter tamanho 6");
    // }
    
    public String getNagencia () {
        return this.nAgencia;
    }
    
    public void setNome (String x) {
        if (x.length() <= 30) {
            this.nome = x;
        }
        else {
            this.nome = "Inválido";
            System.out.println ("O nome deve conter menos que 30 caracteres");
        }
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setSaldo (float x) {
        if (x >=0) {
            this.saldo = x;
        }
        else {
            System.out.println("Saldo inválido");
        }
        
    }
    
    public float getSaldo () {
        return this.saldo;
    }
    
    public void realizarDeposito (float deposito){
        this.setSaldo(saldo + deposito);
        System.out.println("Depósito: "+ deposito);
    }
    
    public void realizarSaque (float saque){
        this.setSaldo(saldo - saque);
        System.out.println("Saque: " + saque);
    }
    
    public void retornaDados () {
        System.out.println("Número da conta: "+ getNconta ()); // ou this.nConta
        System.out.println ("Número da agência: " + getNagencia ());
        System.out.println("Nome do cliente: " + getNome());
        System.out.println("Saldo atual: " + getSaldo());
    } 
}
