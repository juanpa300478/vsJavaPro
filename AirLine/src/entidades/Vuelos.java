package entidades;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Vuelos {
    private String  nombreP,
                    destinoP,
                    origenP;
    private Date fechaLLegada;
    private int  numPasajeros;
    DateFormat df = new SimpleDateFormat("YYYY-MM-dd hh:mm");
    
    public Vuelos(String nombreP, String destinoP, 
                String origenP, Date fecha, int numPasajeros){
        this.nombreP = nombreP;
        this.destinoP = destinoP;
        this.origenP = origenP;
        this.fechaLLegada = fecha;
        this.numPasajeros = numPasajeros;
    }
     public String getNombreP (){return this.nombreP;}
     public String getDestinoP (){return this.destinoP;}
     public String getOrigenP (){return this.origenP;}
     public Date getFechaLLegada (){return this.fechaLLegada;}
     public int getNumPasajeros (){return this.numPasajeros;}
    
    
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Vuelos vuelo = (Vuelos) o;
        return Objects.equals(nombreP, vuelo.nombreP) &&
                        Objects.equals(origenP, vuelo.origenP);
    }

    @Override
    public int hashCode (){return Objects.hash(nombreP,origenP);}

    @Override
    public String toString() {
        return nombreP + ": " + origenP + ", Aterriza el " + df.format(fechaLLegada) 
                        + ", con " + numPasajeros + " pasajeros";
    }

    

}
