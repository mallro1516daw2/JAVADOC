package Damas;

/**
 * 
 * @author Marc Victor Sheng
 */

public abstract class Jugador {
    
    public String jugador;
    public String Jugador;
    public int Puntos;
    /**
     * 
     * @return Devuelve la variable jugador
     */
    public String getJugador() {
        return jugador;
    }
    /**
     * 
     * @param Jugador nombre del jugador
     * @param Puntos puntucion del jugador
     */
    public Jugador(String Jugador, int Puntos) {
        this.Jugador = Jugador;
        this.Puntos = Puntos;
    }
    /**
     * 
     * @param jugador setter de jugador
     */
    public void setJugador(String jugador) {
        this.jugador = jugador;
    }
/**
 * 
 * @param jugador definim jugador
 */
    public Jugador(String jugador) {
        this.jugador = jugador;
    }
    
}
