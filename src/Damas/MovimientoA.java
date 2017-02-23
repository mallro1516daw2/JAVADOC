package Damas;

import javafx.scene.Group;
import javafx.scene.text.Font;

/**
 *
 * @author Marc Victor Sheng
 */
public class MovimientoA extends Main implements Comparable{

    public int MovimientoA = 0;
/**
 * 
 * @param MovimientoA  definimos MovimientoA
 */
    public MovimientoA(int MovimientoA) {
        this.MovimientoA = MovimientoA;
    }
    /**
     * 
     * @return devuelve el tipo de movimiento
     */
    public int getMoviminetos() {
        return MovimientoA;
    }
/**
 * 
 * @param MovimientoA setter de MovimientoA
 */
    public void setMoviminetos(int MovimientoA) {
        this.MovimientoA = MovimientoA;
    }
/**
 * 
 * @return devuelve el tablero
 */
    public Tablero[][] getTabla() {
        return Tabla;
    }
/**
 * 
 * @param Tabla setter de Tabla
 */
    public void setTabla(Tablero[][] Tabla) {
        this.Tabla = Tabla;
    }
/**
 * 
 * @return getter de TableroGroup
 */
    public Group getTableroGroup() {
        return TableroGroup;
    }
/**
 * 
 * @param TableroGroup setter de TableroGroup
 */
    public void setTableroGroup(Group TableroGroup) {
        this.TableroGroup = TableroGroup;
    }
/**
 * 
 * @return getter de PiezaGroup
 */
    public Group getPiezaGroup() {
        return PiezaGroup;
    }
/**
 * 
 * @param PiezaGroup setter de PiezaGroup
 */
    public void setPiezaGroup(Group PiezaGroup) {
        this.PiezaGroup = PiezaGroup;
    }
/**
 * 
 * @return getter de Font
 */
    public static Font getFont() {
        return font;
    }
/**
 * 
 * @param font setter de Font
 */
    public static void setFont(Font font) {
        Main.font = font;
    }
/**
 * 
 * @return getter del menu
 */
    public CajaMenu getMenu() {
        return menu;
    }
/**
 * 
 * @param menu setter de menu
 */
    public void setMenu(CajaMenu menu) {
        this.menu = menu;
    }
    
/**
 * 
 * @param o comprueba si se de ha de canviar de turno
 * @return devuelve el cambio de turno
 */
    public int compareTo(Object o) {
        int resultado = 0;
        
        if(this.MovimientoA < ((MovimientoA)o).MovimientoA){
           resultado =  resultado + 1;
        }
        return resultado+1;
    }
    
}
