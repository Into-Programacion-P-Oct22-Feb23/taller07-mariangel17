/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo05;

/**
 *
 * @author Usuario PC
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1;
        String serie = "";
        double resultado = 0;
        int numerador = 1;
        int denominador = 1;

        do {
            if (numero % 2 == 0) {
                serie += " - " + numerador + "/" + denominador;
                resultado -= (double) numerador / denominador;
            } else {
                serie += " + " + numerador + "/" + denominador;
                resultado += (double) numerador / denominador;
            }
            numero++;
            denominador += 2;
        } while (numero <= 8);

        System.out.println("Serie: " + serie);
        System.out.println("Resultado: " + resultado);

    }
    
}
