/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest.mavenproject7;

/**
 *
 * @author onezi
 */
public abstract class Personagem {
    TrocaArma arma;
    TrocaEscudo escudo;
  
    
        public abstract void lutar();

        public void getArma(){
            arma.usarArma();
        }
        
        public void setArma(TrocaArma arma){
            this.arma=arma;
        }
        
        public void getEscudo(){
            escudo.usarEscudo();
        }
        
        public void setEscudo(TrocaEscudo escudo){
            this.escudo=escudo;
        }
        
        
}

   
