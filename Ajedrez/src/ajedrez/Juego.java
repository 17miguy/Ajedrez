/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;



/**
 *
 * @author dam1
 */
public class Juego {
   public static void main(String[]args){
       
       Tablero juego1 = new Tablero();
       juego1.pintarTablero();
       Posicion inicial = new Posicion(0, 0);
       Posicion finale = new Posicion (5,0);
       Movimiento primero = new Movimiento(inicial, finale);
       juego1.moverPieza(primero);
       System.out.println("");
       System.out.println("");
       juego1.pintarTablero();
       
       }
   
   }
    

