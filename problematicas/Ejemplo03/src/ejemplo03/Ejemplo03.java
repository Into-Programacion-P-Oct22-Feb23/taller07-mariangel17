/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo03;

/**
 *
 * @author Usuario PC
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 2;
        int numero2=3;
        do {
            System.out.print(numero1 + " \n");
            numero1 += numero2;
            numero2 += 2;
        } while (numero1 <= 37);
    }
    
}
