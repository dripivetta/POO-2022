package br.edu.fatecfranca.ex0;

public class TestaProduto {

    public static void main(String[] args) {
        Produto HD = new Produto ();
        HD.id = 1;
        HD.descricao = "HD 1 GB";
        HD.qnt = 10;
        HD.preco = 10;
        HD.comprar (10);
        HD.vender (8);
        HD.subir (20);
        HD.descer (19);
        HD.mostrar ();
        
        Produto impressora = new Produto (2, "Impressora Epson", 5, 1000);
        impressora.id = 2;
        impressora.descricao = "Impressora EPSON";
        impressora.qnt = 0;
        impressora. preco = 1000;
        impressora.comprar (10);
        impressora.vender (5);
        impressora.subir (500);
        impressora.descer (400);
        impressora.mostrar ();
    }
    
}
