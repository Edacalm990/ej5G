/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


/**
 *
 * @author venganzaalchocolate
 */
public class Loteria {
     Map<String, Integer> loteria;
     
     // contructor que crea un map sin ordenar
     // llama al método llenar Loteria
    public Loteria() {
        this.loteria= new HashMap<>();
        llenarLoteria();
    }

    // método que pone 1000 entradas 
    // key -> 6 numeros aleatorios (numeros de la loteria)
    // value - > premio entre 1 y 99.999
    private void llenarLoteria () {
        Random random = new Random();
        for (int i = 0; i <=1000; i++) {
            loteria.put(RandomStringUtils.randomNumeric(6), random.nextInt(1, 99999));
        }
    }
    
    @Override
    public String toString() {
        String tmp="numero -> Premio" + "\n";
//        for (Map.Entry<String, Integer> entrada : loteria.entrySet()) {
//            Object key = entrada.getKey();
//            Object val = entrada.getValue();
//            tmp+= """
//                  %s -> %d
//                  """.formatted(key,val);
//        }
//        return tmp;
        
        
          for (String key : loteria.keySet()) {
              tmp+="""
                   %s -> %s €
                   """.formatted(key, loteria.get(key));
          }
        return tmp;
    }
    
    // método extra solo para comprobar que comprobar decimo funciona
    public void meterDecimo (String numeroLoteria, int premio) {
    loteria.put(numeroLoteria, premio);
    }
    
    // método que comprueba si un decimo está premiado
    public String comprobarDecimo(String numeroLoteria) {
        return (numeroLoteria!=null && loteria.containsKey(numeroLoteria)) 
                ? loteria.get(numeroLoteria).toString() 
                : "Este número no está premiado" ;
    }
    
   
}
