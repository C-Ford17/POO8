import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PruebaFiguras {
    public static void main(String[] args) {
        int opcion = 0;
        Figura figura = null;
        while (opcion != -1){
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Crear rectangulo \n2. Crear cuadrado\n3. Crear triangulo\n4. Ver figura\n5. Salir"));
            switch (opcion) {
                case 1:
                    double base = Double.parseDouble(JOptionPane.showInputDialog("Introduce la base del rectangulo"));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del rectangulo"));
                    figura = new Rectangulo(base, altura);
                    break;
                case 2:
                    double lado = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
                    figura = new Cuadrado(lado);
                    break;
                case 3:
                    double ladoDelTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Introduce un lado del triangulo"));
                    figura = new TrianguloRectangulo(ladoDelTriangulo);
                    break;
                case 4:
                    if (figura == null) {
                        JOptionPane.showInputDialog("No has creado una figura");
                        break;
                    }
                    figura.dibujarTxt();
                    System.out.println(figura.getClass().getName());
                    break;
                case 5:
                    opcion = -1;
                    break;
                default:
                    break;
            }
        }
    }
}