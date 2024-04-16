import java.util.*;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;

import entidades.Vuelos;

public class App {
    public static void main(String[] args) throws ParseException{
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<Vuelos> vuelos = new ArrayList<>();
        
        
        vuelos.add(new Vuelos("AAL933","Santiago","New York", 
        df.parse("2021-08-29 05:39"), 62));
        
        vuelos.add(new Vuelos("LAT755","Santiago","Sao Paulo", 
        df.parse("2021-08-31 04:45"), 47));

        vuelos.add(new Vuelos("SKU621","Santiago","Rio De Janeiro", 
        df.parse("2021-08-30 16:00"), 52));

        vuelos.add(new Vuelos("DAL147","Santiago","Atlanta", 
        df.parse("2021-08-29 13:22"), 59));

        vuelos.add(new Vuelos("AVA241","Santiago","Bogota", 
        df.parse("2021-08-31 14:05"), 25));

        vuelos.add(new Vuelos("AMX10","Santiago","Mexico City", 
        df.parse("2021-08-31 05:20"), 29));

        vuelos.add(new Vuelos("IBE6833","Santiago","Londres", 
        df.parse("2021-08-30 08:45"), 55));

        vuelos.add(new Vuelos("LAT2479","Santiago","Frankfurt", 
        df.parse("2021-08-29 07:41"), 51));

        vuelos.add(new Vuelos("SKU803","Santiago","Lima", 
        df.parse("2021-08-30 10:35"), 48));

        vuelos.add(new Vuelos("LAT533","Santiago","Los Angeles", 
        df.parse("2021-08-29 09:14"), 59));

        vuelos.add(new Vuelos("LAT1447","Santiago","Guayaquil", 
        df.parse("2021-08-31 08:33"), 31));

        vuelos.add(new Vuelos("CMP111","Santiago","Panama City", 
        df.parse("2021-08-31 15:15"), 29));

        vuelos.add(new Vuelos("LAT705","Santiago","Madrid", 
        df.parse("2021-08-30 08:14"), 47));

        vuelos.add(new Vuelos("AAL957","Santiago","Miami", 
        df.parse("2021-08-29 22:53"), 60));

        vuelos.add(new Vuelos("ARG5091","Santiago","Buenos Aires", 
        df.parse("2021-08-31 09:57"), 32));

        vuelos.add(new Vuelos("LAT1283","Santiago","Cancun", 
        df.parse("2021-08-31 04:00"), 35));

        vuelos.add(new Vuelos("LAT579","Santiago","Barcelona", 
        df.parse("2021-08-29 07:45"), 61));

        vuelos.add(new Vuelos("AAL945","Santiago","Dallas-fort worth", 
        df.parse("2021-08-30 07:12"), 58));

        vuelos.add(new Vuelos("LAT501","Santiago","Paris", 
        df.parse("2021-08-29 18:29"), 49));

        vuelos.add(new Vuelos("LAT425","Santiago","Montevideo", 
        df.parse("2021-08-29 15:45"), 39));

        vuelos.sort(Comparator.comparing((Vuelos::getFechaLLegada)));
        System.out.println("El ultimo vuelo el llegar es: " + vuelos.get(vuelos.size()-1));
        vuelos.sort(Comparator.comparing((Vuelos::getNumPasajeros)));
        System.out.println("el vuelo con menor nuemro de pasajeros es: " + vuelos.get(0));


    }
}
