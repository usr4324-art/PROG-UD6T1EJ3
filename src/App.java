import java.util.ArrayList;
import java.io.*;
import net.salesianoscuesta.Videojuego.Videojuego;


public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Videojuego> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("videojuegos.csv"))) {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String titulo = datos[0];
                String genero = datos[1];
                int horas = Integer.parseInt(datos[2]);

                lista.add(new Videojuego(titulo, genero, horas));
            }
            registrarLog("Lectura completada. Objetos cargados: " + lista.size());

        } catch (IOException e) {
            registrarLog("ERROR de lectura: " + e.getMessage());
        }





        
    }

       public static void registrarLog(String mensaje) {
        try (PrintWriter log = new PrintWriter(new FileWriter("log_videojuegos.txt", true))) {
            log.println("[LOG] " + mensaje);
        } catch (IOException e) {
            System.err.println("No se pudo escribir en el log.");
        }
    }
}
