package Damas;

/**
 * 
 * @author Marc Victor Sheng
 */
public class Jugadores extends Jugador{

    private final int i;
/**
 * 
 * @param jugador nombre jugador
 * @param i puntuacion jugador
 */
    public Jugadores(String jugador, int i) {
        super(jugador);
        this.i = i;
    }

/**
 * 
 * @return Devuelve la variable Jugador
 */
    public String getJugador() {
        return Jugador;
    }
/**
 * 
 * @param Jugador Jugador es igual a Jugador
 */
    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }
/**
 * 
 * @return Devuelve la variable Puntos
 */
    public int getPuntos() {
        return Puntos;
    }
/**
 * 
 * @param Puntos setter de los puntos
 */
    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }
/**
 * 
 * @return Devuelve la puntuacion
 */
    @Override
    public int hashCode() {
        return Puntos * this.Jugador.length();
    }
/**
 * 
 * @param o definimos el objeto de turno
 * @return Devuelve falso si no detecta los jugadores
 */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Jugadores) {
            Jugadores p = (Jugadores) o;
            return this.Jugador.equals(p.Jugador);
        } else {
            return false;
        }
    }
}
