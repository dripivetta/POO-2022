package br.edu.fatecfranca.ex0;

public class Rio {
    String nome;
    float nivel;
    boolean poluido;
    
    Rio (){
        
    }
    
    Rio (String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    
    void chover (float chuva){
        this.nivel = nivel + chuva; 
        System.out.println ("Chuva: " + chuva);
    }
    void ensolarar (float secou){
        this.nivel = nivel - secou;
        System.out.println ("Secou: " + secou);
    }
    void limpar (){
        // COLOQUEI O SYSTEM APENAS PARA TESTAR
        System.out.println ("Poluido: " + poluido);
        this.poluido = false; 
    }
    void sujar (){
        // COLOQUEI O SYSTEM APENAS PARA TESTAR
        System.out.println ("Poluido: " + poluido);
        this.poluido = true;    
    }
    void mostrar (){
        System.out.println ("Nome do Rio: " + nome);
        System.out.println ("Nível: " + nivel);
        System.out.println ("Poluido: " + poluido);
    }
}
