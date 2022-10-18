package futbol;

public class Portero extends Futbolista {

    public short golesRecibidos;
    public byte dorsal;
    public final String posicion="Portero";

    public Portero(String nombre, int edad, short goles, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = goles;
        this.dorsal = dorsal;

    }
    public int compareTo(Futbolista obj) {return Math.abs(this.golesRecibidos-((Portero)obj).golesRecibidos);}
    public boolean jugarConLasManos() {return true;}
    public String toString() {return super.toString()+" con el dorsal " + this.dorsal + ". Le han marcado " + this.golesRecibidos;}
}
