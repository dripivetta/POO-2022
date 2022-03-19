package br.edu.fatecfranca.ex0;

public class TestaRio {

    public static void main(String[] args) {
        Rio rioSP = new Rio ();
        rioSP.nome = "Amazonas";
        rioSP.nivel = 10;
        rioSP.poluido = true;
        rioSP.chover (10);
        rioSP.ensolarar (5);
        rioSP.limpar();
        rioSP.mostrar ();
        
        Rio rioMG = new Rio ("Queijo", 20, false);
        rioMG.chover (20);
        rioMG.ensolarar (10);
        rioMG.sujar();
        rioMG.mostrar ();   
        
        // JOptionPane.showMessageDialog(null,
        //      "Nome:" + this.nome +
        //      "Nível:" + this.nivel +
        //      "Poluído:" + (this.poluido ? "Sim" : "Não") );
    }    
}
