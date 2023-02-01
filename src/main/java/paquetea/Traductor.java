/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

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
public class Traductor {
     private SortedMap<String, String> traductor; 

     // Inicialmente el traductor se crea vacío, sin registros
    public Traductor() {
        this.traductor=new TreeMap<>();
    }

    @Override
    public String toString() {
        String tmp="Inglés -> Castellano" + "\n";
        for (Map.Entry<String, String> entrada : traductor.entrySet()) {
            String key = entrada.getKey();
            String val = entrada.getValue();
            tmp+= """
                  %s -> %s
                  """.formatted(key,val);
        }
        return tmp;
    }
    
    
         
    // Existirá un método que servirá para guardar una entrada y recibirá dos palabras (palabraExtranjera, palabraEspañol) 
    // para ir guardando traducciones. 
    public boolean guardarEntrada (String palabraIngles, String palabraCastellano) {
        try {
            traductor.put(palabraIngles.toLowerCase(), palabraCastellano.toLowerCase());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    } 
    
    // borrar entradas y  
    public boolean borrarEntrada (String key) {
        if(key!=null){
            traductor.remove(key.toLowerCase());
            return true;
        } else  {
            return false;
        }
   
    }
    
    //modificar entradas ya creadas
    public boolean modificarEntrada (String palabraIngles, String palabraCastellano) {
        return ((palabraIngles!=null)&&traductor.containsKey(palabraIngles.toLowerCase())) 
                        ? guardarEntrada(palabraIngles.toLowerCase(), palabraCastellano.toLowerCase()) 
                        : false;
    }
    
    // realizar la traducción de una palabra dada.
    public String traducirPalabra(String palabraIngles) {
        return (palabraIngles!=null&&traductor.containsKey(palabraIngles.toLowerCase()))
                        ? traductor.get(palabraIngles.toLowerCase())
                        : "no existe traducción" ;
    }
    
    // lista de palabras en Ingles
    public ArrayList listaPalabrasInglesas () {
        ArrayList<String> array = new ArrayList<String>(traductor.keySet());
        return array;
    }
    
    //lista de palabras en Castellano
    public ArrayList listaPalabrasCastellano () {
    return new ArrayList(traductor.values());
    }
}
