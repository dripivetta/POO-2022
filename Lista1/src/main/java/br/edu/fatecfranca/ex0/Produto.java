package br.edu.fatecfranca.ex0;
public class Produto {
    // Declaração de variáveis
    int id;
    String descricao;
    int qnt;
    float preco;  
    // Construtores
    Produto (){
        
    }
    Produto (int id, String descricao, int qnt, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qnt = qnt;
        this.preco = preco;
    }
    void comprar (int compra){
        this.qnt = qnt + compra;
        System.out.println("Compra: " + compra);
    }
    void vender (int venda){
        this.qnt = qnt - venda;
        System.out.println ("Venda: " + venda);
    }
    void subir (float newpreco){
        this.preco = preco + newpreco;
        System.out.println ("Aumento: " + newpreco);
    }
    void descer (float preconovo){
        this.preco = preco - preconovo;
        System.out.println ("Desconto: " + preconovo);
    }
    void mostrar (){
       System.out.println ("ID: " + id);
       System.out.println ("DESCRICAO: " + descricao);
       System.out.println ("QUANTIDADE: " + qnt);
       System.out.println ("PREÇO: " + preco);
    }
}
