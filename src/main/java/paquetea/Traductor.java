/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author eli
 */
/*PARTE A
Aplica lo estudiado realizando un "Traductor" de idiomas, incluyendo un nuevo paquete llamado "traductor". 
Para ello, el traductor se crea usando dos objetos de tipo String, de forma que la clave es una palabra en 
el idioma que tú elijas y el valor es la traducción española. Es indispensable que las palabras extranjeras estén ordenadas alfabéticamente.

Inicialmente el traductor se crea vacío, sin registros. Existirá un método que servirá para guardar una entrada 
y recibirá dos palabras (palabraExtranjera, palabraEspañol) para ir guardando traducciones. 
Se deben poder borrar entradas y modificar entradas ya creadas, así como realizar la traducción de una palabra dada. 
También debe haber dos métodos: una para crear una lista con las palabras no españolas que hay en el traductor 
y otro para obtener las palabras en español.

Realiza una clase conteniendo el main() y 10 registros en tu traductor. Prueba los métodos realizados.*/
public class Traductor implements Comparable<Traductor>{
     private Map<String, String> traductor; 

     // Inicialmente el traductor se crea vacío, sin registros
    public Traductor() {
        this.traductor=new HashMap<>();
    }
    
    
     
    // Existirá un método que servirá para guardar una entrada y recibirá dos palabras (palabraExtranjera, palabraEspañol) 
    // para ir guardando traducciones. 
    public boolean guardarEntrada (String palabraExtranjera, String palabraEspanol) {
        try {
            traductor.put(palabraExtranjera, palabraEspanol);
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    } 
    
    // borrar entradas y modificar entradas ya creadas, así como realizar la traducción de una palabra dada. 
    @Override
    public int compareTo(Traductor o) {
        
    }
    
}
