package mipaquete;

import javax.swing.JOptionPane;

public class Imprimir {
    
    public static void saludo(){
        System.out.println("Hola desde libreria");
    }
    
    public static void visualizar(){
        System.out.println("Ya que lo voy a subir a Github, añado esta clase");
    }
    
    public static void areaTriangulo(){
        double altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura del triangulo"));
        double base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base del triangulo"));
        JOptionPane.showMessageDialog(null, "El area del triangulo de altura: " + altura + " y base " + base + " es de: " + (altura*base/2) + "u");
    }
}
