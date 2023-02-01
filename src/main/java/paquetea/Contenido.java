/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author venganzaalchocolate
 */
public class Contenido {
    public static void main(String[] args) {
        Traductor traductor = new Traductor();
        // introducimos palabras al traductor
        traductor.guardarEntrada("Hello", "Hola");
        traductor.guardarEntrada("Avoid", "Evitar");
        traductor.guardarEntrada("Face", "Cara");
        traductor.guardarEntrada("Fingers", "Dedos");
        traductor.guardarEntrada("Nose", "Nariz");
        traductor.guardarEntrada("Ankle", "Tobillo");
        traductor.guardarEntrada("time", "tiempo");
        traductor.guardarEntrada("purple", "violeta");
        traductor.guardarEntrada("pink", "rosa");
        traductor.guardarEntrada("blueberry", "arandano");
        
        // mostramos las palabras con su traduccion
        System.out.println(traductor.toString());
        
        // eliminamos una palabra
        System.out.println("""
                           Borramos "Face" -> resultado : %b
                           """.formatted(traductor.borrarEntrada("Face")));
        
        // mostramos las palabras con su traduccion
        System.out.println(traductor.toString());
        
        // modificamos una palabra
        System.out.println("""
                           Modificamos "Fingers", en vez de "Dedos" será "Deditos" -> resultado : %b
                           Modificamos una palabra inexistente dskjhfg -> resultado : %b
                           """.formatted(traductor.modificarEntrada("Fingers", "Deditos"), 
                                   traductor.modificarEntrada(null, "hola")));
        
        // mostramos las palabras con su traduccion
        System.out.println(traductor.toString());
        
        // buscamos una traduccion
        System.out.println("""
                           Cual es la traducción de "Nose" ? %s
                           Cual es la traducción de "kjhwefkjulhgwfre" ? %s
                           """.formatted(traductor.traducirPalabra("Nose"),
                                   traductor.traducirPalabra("kjhwefkjulhgwfre")));
        
        // obtener lista de palabras inglesas
        ArrayList palabrasInglesas= traductor.listaPalabrasInglesas();
        System.out.println("--------Lista de palabras en Inglés--------");
        palabrasInglesas.forEach(System.out::println);
        
        // obtener lista de palabras en castellano
        ArrayList palabrasCastellano= traductor.listaPalabrasCastellano();
        System.out.println("--------Lista de palabras en Castellano--------");
        palabrasCastellano.forEach(System.out::println);
    }
    
    
            
}
