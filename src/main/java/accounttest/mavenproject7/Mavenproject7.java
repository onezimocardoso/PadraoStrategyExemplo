/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package accounttest.mavenproject7;

/**
 *
 * @author onezi
 */
public class Mavenproject7 {

    public static void main(String[] args) {
       Personagem player = new Rei();
       player.lutar();
       player.getArma();
       player.setArma(new Machado());
       player.getArma();
       ArcoEFlecha flecha = new ArcoEFlecha();
       player.setArma(flecha);
       player.getArma();
       player.getEscudo();
       player.setEscudo(new EscudoDeOuro());
       player.getEscudo();
       
    }
}
