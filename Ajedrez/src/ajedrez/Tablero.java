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
public class Tablero {
        public Pieza tabla[][] = new Pieza[8][8];

    public Pieza[][] getTabla() {
        return tabla;
    }

    public void setTabla(Pieza[][] tabla) {
        this.tabla = tabla;
    }



    public Tablero() {
        tabla[7][0] = new Torre("B");
        tabla[7][1] = new Caballo("B");
        tabla[7][2] = new Alfil("B");
        tabla[7][3] = new Dama("B");
        tabla[7][4] = new Rey("B");
        tabla[7][5] = new Alfil("B");
        tabla[7][6] = new Caballo("B");
        tabla[7][7] = new Torre("B");
        for (int i = 0; i < 8; i++) {

            tabla[6][i] = new Peon("B");

        }

        tabla[0][0] = new Torre("N");
        tabla[0][1] = new Caballo("N");
        tabla[0][2] = new Alfil("N");
        tabla[0][3] = new Rey("N");
        tabla[0][4] = new Dama("N");
        tabla[0][5] = new Alfil("N");
        tabla[0][6] = new Caballo("N");
        tabla[0][7] = new Torre("N");
        for (int i = 0; i < 8; i++) {

            tabla[1][i] = new Peon("N");

        }

    }

    public boolean hayPieza(int fila, int columna) {

        boolean hayp = false;
        if (tabla[fila][columna] != null) {

            hayp = true;

        }
        return hayp;
    }
        
        public boolean hayPieza(Posicion pos) {

        boolean hayp = false;
        if (tabla[pos.getFila()][pos.getColumna()] != null) {

            hayp = true;

        }
        

        return hayp;

    }
        //public boolean hayPiezasEntre(Movimiento mov){boolean hayp = false;}
            
          
        
        

    public void moverPieza(Movimiento mov) {
        tabla[mov.getPosFinal().getFila()][mov.getPosFinal().getColumna()] = tabla[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()];
        tabla[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()] = null;
    }
    
    public void pintarTablero(){
        for(int i=0;i<8;i++){
            
           for(int u=0;u<8;u++){
               if(tabla[i][u]!=null){
               System.out.print((tabla[i][u]).pintarPieza());}
               else{System.out.print("00");}
                   
           
           
           }
            System.out.println("");
    }
    
    

}
}
