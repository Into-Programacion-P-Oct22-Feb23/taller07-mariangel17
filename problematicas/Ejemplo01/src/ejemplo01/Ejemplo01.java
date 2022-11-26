/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo01;
import java.util.Scanner;
/**
 *
 * @author Usuario PC
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombreJugador;
        String posicionJugador;
        int edadJugador;
        double estaturaJugador;
        String reporteJugadores = "";
        String reporteEdades = "";
        int contadorJugadores = 0;
        double sumaEdades = 0;
        double sumaEstaturas = 0;
        double promedioEdades;
        double promedioEstaturas;
        

        do {
            System.out.println("Ingrese el nombre del jugador");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición del jugador");
            posicionJugador = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edadJugador = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estaturaJugador = entrada.nextDouble();
            entrada.nextLine();
          
            contadorJugadores++;
            sumaEdades += edadJugador;
            sumaEstaturas += estaturaJugador;
            reporteJugadores = String.format(" %s%d. %s -%s-, edad %d, estatura %.2f\n", reporteJugadores, contadorJugadores, nombreJugador, posicionJugador, edadJugador, estaturaJugador);
            reporteEdades = String.format("%s%d ", reporteEdades, edadJugador);
           
            System.out.println("¿Desea ingresar otro jugador? (s/n)");
        } while (entrada.nextLine().equals("si"));
     
        promedioEdades = sumaEdades / contadorJugadores;
        promedioEstaturas = sumaEstaturas / contadorJugadores;
       
        System.out.printf("Listado de Jugadores %s Listado de Edades: %s Promedio de edades: %.1f Promedio de estaturas: %.2f", reporteJugadores, reporteEdades, promedioEdades, promedioEstaturas);

    
  }
}
