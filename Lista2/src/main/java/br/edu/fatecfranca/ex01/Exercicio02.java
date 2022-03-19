
package br.edu.fatecfranca.ex01;

public final class Exercicio02 {
    // Declaração de variáveis
    private int nAluno;
    private String nome;
    private int idade;
    private float p1;
    private float p2;
    
    // Construtores
    public Exercicio02 () {
    
    }
    
    public Exercicio02 (int nAluno, String nome, int idade, float p1, float p2){
        this.setNaluno (nAluno);
        this.setNome (nome);
        this.setIdade (idade);
        this.setP1 (p1);
        this.setP2 (p2);
    }
    
    // Métodos
    public void setNaluno (int x){
        if (String.valueOf(x).length () == 6) {
            this.nAluno = x;
        }
        else {
            this.nAluno = 0;
            System.out.println ("O número do aluno deve conter 6 dígitos");
        }
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
    
    public void setIdade (int x){
        if (x > 0) {
            this.idade = x;
        }
        else {
            System.out.println ("A idade deve ser maior que zero");
        }
    }
    
    public void setP1 (float x){
        if (x > 0) {
            this.p1 = x;
        }
        else {
            System.out.println ("A nota não pode ser negativa");
        }
    }
    
    public void setP2 (float x){
        if (x > 0) {
            this.p2 = x;
        }
        else {
            System.out.println ("A nota não pode ser negativa");
        }
    }
    
    public int getNaluno (){
        return this.nAluno;
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public int getIdade (){
        return this.idade;
    }
    
    public float getP1 (){
        return this.p1;
    }
    
    public float getP2 (){
        return this.p2;
    }
    
    
    float notaFinal (){
        return (this.getP1() + this.getP2())/2;
    }
    
    public void dadosAluno () {
        System.out.println("Número aluno: "+ getNaluno ()); 
        System.out.println ("Nome do aluno: " + getNome ());
        System.out.println("Idade do aluno: " + getIdade());
        System.out.println("Nota P1 :" + getP1());
        System.out.println("NOta P2 :" + getP2());
        System.out.println("Nota final: " + notaFinal());
    }     
}
