package Damas;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import static Damas.Main.TAMANY;
/**
 * 
 * @author Marc Victor Sheng
 */
public class Pieza extends StackPane{

    public TiposPieza type;
    public double RatonX, RatonY;
    public double oldX, oldY;
    public Pieza Pieza;

/**
 * 
 * @return devuelve los tipos de pieza disponibles
 */
    public TiposPieza getType() {
        return type;
    }
/**
 * 
 * @return devuelve la vieja posicion horizontal
 */
    public double getOldX() {
        return oldX;
    }
/**
 * 
 * @return devuelve la vieja posicion vertical
 */
    public double getOldY() {
        return oldY;
    }
/**
 * 
 * @param type tipo de pieza (blnca o negra)
 * @param x posicion horizontal de la pieza
 * @param y posicion vertical de la pieza
 */
    public Pieza(TiposPieza type, int x, int y) {
        this.type = type;

        move(x, y);

        Ellipse bg = new Ellipse(TAMANY * 0.3125, TAMANY * 0.26);
        bg.setFill(Color.WHITE);

        bg.setStroke(Color.BLACK);
        bg.setStrokeWidth(TAMANY * 0.03);

        bg.setTranslateX((TAMANY - TAMANY * 0.3125 * 2) / 2);
        bg.setTranslateY((TAMANY - TAMANY * 0.26 * 2) / 2 + TAMANY * 0.07);

        Ellipse ellipse = new Ellipse(TAMANY * 0.3125, TAMANY * 0.26);
        ellipse.setFill(type == TiposPieza.NEGRO ? Color.valueOf("#000") : Color.valueOf("#e2e2e2"));

        ellipse.setStroke(Color.BLACK);
        ellipse.setStrokeWidth(TAMANY * 0.03);

        ellipse.setTranslateX((TAMANY - TAMANY * 0.3125 * 2) / 2);
        ellipse.setTranslateY((TAMANY - TAMANY * 0.26 * 2) / 2);

        getChildren().addAll(bg, ellipse);

        setOnMousePressed(e -> {
            RatonX = e.getSceneX();
            RatonY = e.getSceneY();
        });

        setOnMouseDragged(e -> {
            relocate(e.getSceneX() - RatonX + oldX, e.getSceneY() - RatonY + oldY);
        });
    }
/**
 * 
 * @param x presunta nueva posicion horizontal de la pieza
 * @param y presunta nueva posicion vertical de la pieza
 */
    public void move(int x, int y) {
        oldX = x * TAMANY;
        oldY = y * TAMANY;
        relocate(oldX, oldY);
    }
/**
 * devuelve la pieza a sus viejas posiciones debiado a que no es un movimiento correcto
 */
    public void abortMove() {
        relocate(oldX, oldY);
    }

}
