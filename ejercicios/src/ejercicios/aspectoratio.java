/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class aspectoratio {

    public static void main(String[] args) {
        try {
            // URL de la imagen
            String imageUrl = "https://media.gq.com.mx/photos/5f6ce732bc946e88f6c96320/16:9/w_2560%2Cc_limit/goky%2520ultra%2520instinto.jpg";
            URL url = new URL(imageUrl);

            // Leer la imagen desde la URL
            BufferedImage image = ImageIO.read(url);

            // Obtener dimensiones
            int width = image.getWidth();
            int height = image.getHeight();

            // Calcular el aspecto
            int gcd = gcd(width, height); // Máximo común divisor para simplificar
            int aspectWidth = width / gcd;
            int aspectHeight = height / gcd;

            // Imprimir resultados
            System.out.println("Dimensiones: " + width + "x" + height);
            System.out.println("Aspect Ratio: " + aspectWidth + ":" + aspectHeight);
        } catch (IOException e) {
            System.err.println("Error al leer la imagen: " + e.getMessage());
        }
    }

    // Método para calcular el máximo común divisor (MCD)
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

