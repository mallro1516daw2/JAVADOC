package Damas;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
/**
 * 
 * @author Marc Victor Sheng
 */
public class Tablero extends Rectangle {

    public Pieza Pieza;
/**
 * 
 * @return devuelve si una posicion tiene una posicion
 */
    public boolean hasPieza() {
        return Pieza != null;
    }
/**
 * 
 * @return devuelve el getter de la pieza
 */
    public Pieza getPieza() {
        return Pieza;
    }
/**
 * 
 * @param Pieza setter de la pieza
 */
    public void setPieza(Pieza Pieza) {
        this.Pieza = Pieza;
    }
/**
 * 
 * @param light casillas del tablero
 * @param x posicion horizontal de la casilla en el tablero
 * @param y posicion vertical de la casilla en el tablero
 */
    public Tablero(boolean light, int x, int y) {
        setWidth(Main.TAMANY);
        setHeight(Main.TAMANY);

        relocate(x * Main.TAMANY, y * Main.TAMANY);

        setFill(light ? Color.valueOf("#ffffff") : Color.valueOf("#424242"));
    }
}
