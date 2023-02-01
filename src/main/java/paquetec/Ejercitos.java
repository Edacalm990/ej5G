package paquetec;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author eli
 */
public class Ejercitos {

    private SortedMap<Integer, Ejercito> ejercitos;
    private int id;

    // Inicialmente el traductor se crea vacío, sin registros
    public Ejercitos() {
        this.ejercitos = new TreeMap<>();
        this.id = 0;
    }
    
    public String mostrarEjercitos(){
        String tmp="";
        for (Integer key : ejercitos.keySet()) {
            tmp+="""
                Id=%s  
                 """.formatted(key);
        }
        return tmp;
    }

    private boolean idEsUnico() {
        if (ejercitos.containsKey(id)) {
            id++;
            return false;
        } else {
            return true;
        }
    }

    public boolean addEjercito(Ejercito ejercito) {
        if (ejercito != null) {
            do {
                if (idEsUnico()) {
                    ejercitos.put(id, ejercito);
                    id++;
                    return true;
                }
            } while (!idEsUnico());

        }
        return false;
    }

    public boolean addEjercito(Ejercito ejercito, int id) {
        if (ejercito != null && !ejercitos.containsKey(id)) {
            ejercitos.put(id, ejercito);
            id++;
            return true;
        } else {
            return false;
        }
    }
    
    // obtener un Ejercito según su id
    public Ejercito buscarEjercito(int id){
        return this.ejercitos.get(id);
    }
    
    // obtener todos los Ejércitos contenidos en la estructura map
    public ArrayList devolverEjercitos(){
    return new ArrayList<>(ejercitos.values());
    }

}
