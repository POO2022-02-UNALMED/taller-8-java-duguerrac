package futbol;

public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;


    public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados=goles;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        golesMarcados = 289;
        dorsal = 7;
    }
    public int compareTo(Futbolista obj) {return Math.abs(this.getEdad()-((Jugador)obj).getEdad());}
    public boolean jugarConLasManos() {return false;}
    public String toString() {return super.toString()+" con el dorsal " + this.dorsal + ". Ha marcado " + this.golesMarcados;}

}