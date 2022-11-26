/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo04;

/**
 *
 * @author Usuario PC
 */
public class Ejemplo04 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
int numero1 = 1;
        String serie = "";
        double resultado = 0;
        int numerador = 1;
        int denominador = 1;

        while (numero1 <= 8) {
            if (numero1 % 2 == 0) {
                serie += " - " + numerador + "/" + denominador;
                resultado -= (double) numerador / denominador;
            } else {
                serie += " + " + numerador + "/" + denominador;
                resultado += (double) numerador / denominador;
            }
            numero1++;
            denominador += 2;
        }
        System.out.println("Serie: " + serie);
        System.out.println("Resultado: " + resultado);

    }
    }
    

