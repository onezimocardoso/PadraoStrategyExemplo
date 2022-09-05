/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accounttest.mavenproject7;

/**
 *
 * @author onezi
 */
public class Rei extends Personagem{
    
    public Rei(){
        arma = new Espada();
        escudo = new EscudoDePrata();
    }
    
    public void lutar(){
        System.out.println("Sou um rei lutando!");
    }
    
    
    
}
