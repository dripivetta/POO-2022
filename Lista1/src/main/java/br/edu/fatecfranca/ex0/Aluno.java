package br.edu.fatecfranca.ex0;
public class Aluno {
    // Declaração de variáveis
    int numero;
    String nome;
    int idade;
    float p1;
    float p2;
    // Construtores
    Aluno () {
               
    }
    // Métodos
    float notafinal;
    void notafinal () {
        this.notafinal = this.p1 + this.p2; 
    }
    // OU
    // float notafinal () {
    //      return (this.p1 + this.p2)/2 ;
    // }
    
    void dadosaluno () {
        System.out.println("Número do aluno: "+ numero);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Nome do aluno: " + nome);
        // OU
        // JOptionPane.showMessageDialog (null, "Nome:" + this.nome + "Situação": + this.passou() );
    }
    void passou () {
        if (this.notafinal >=6){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Aluno reprovado");
        }
    }
    // OUT
    // String passou () {
    //     return (this.notafinal () > = 6) ? "Aprovado": "Reprovado";
    // }           
}
