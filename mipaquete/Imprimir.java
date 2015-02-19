package mipaquete;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Imprimir {
    
    /**
     * Imprime por pantalla:<br>"Hola desde libreria"
    */
    public static void saludo(){
        System.out.println("Hola desde libreria");
    }
    
    /**
     * Imprime por pantalla:<br>"Ya que lo voy a subir a Github, añado esta clase"
     */
    public static void visualizar(){
        System.out.println("Ya que lo voy a subir a Github, añado esta clase");
    }
    
    /**
     * Sale con JOptionPane para introducir dos varialbes, una <b>altura</b> y una <b>base</b> <br>para posteriormente imprimir la area de un triangulo con esas variables
     */
    public static void areaTriangulo(){
        double altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura del triangulo"));
        double base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base del triangulo"));
        JOptionPane.showMessageDialog(null, "El area del triangulo de altura: " + altura + " y base " + base + " es de: " + (altura*base/2) + "u");
    }
    
    /**     
     * 
     * @param tipo introduce el tipo de introducion de datos<br><br>
     * tipo = 0 - Introducir dato con scanner;<br>
     * tipo = 1 - Introducir dato con JOptionPane;<br>
     * 
     * @return Devuelve el dato introducido por el usuario
     * si no se introduce un parametro no valido, el programa devuelve 0
     */
    public static int introducir(int tipo){
        int dato = 0;
        
        switch(tipo){
            case 0:
                Scanner scn = new Scanner(System.in);
                System.out.println("Introducir entero");
                dato = scn.nextInt();
                break;
            
            case 1:
                dato = Integer.parseInt(JOptionPane.showInputDialog("Introduce entero"));
                break;
        }
        
        return dato;
    }
}
