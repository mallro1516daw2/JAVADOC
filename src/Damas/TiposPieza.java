package Damas;

/**
 * 
 * @author Marc Victor Sheng
 */
public enum TiposPieza {
    NEGRO(1), BLANCO(-1);

    final int moveDir;
/**
 * 
 * @param moveDir direccion en la quwe se mueve
 */
    TiposPieza(int moveDir) {
        this.moveDir = moveDir;
    }
}
