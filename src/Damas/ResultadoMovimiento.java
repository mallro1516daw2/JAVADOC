package Damas;
/**
 * 
 * @author Marc Victor Sheng
 */
public class ResultadoMovimiento {

    public TiposMovimiento type;
/**
 * 
 * @return devuelve los diferentes tipos de pieza(blanco o negro)
 */
    public TiposMovimiento getType() {
        return type;
    }

    public Pieza Pieza;
/**
 * 
 * @return devuelve la pieza
 */
    public Pieza getPieza() {
        return Pieza;
    }
/**
 * 
 * @param type devuelve el tipo de movimiento (matar, nulo o mover)
 */
    public ResultadoMovimiento(TiposMovimiento type) {
        this(type, null);
    }
/**
 * 
 * @param type devuelve el tipo de movimiento (matar, nulo o mover)
 * @param Pieza devuelve la pieza que esta tratando de moverse
 */
    public ResultadoMovimiento(TiposMovimiento type, Pieza Pieza) {
        this.type = type;
        this.Pieza = Pieza;
    }
}
