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

    // inicializamos el id a 0
    public Ejercitos() {
        this.ejercitos = new TreeMap<>();
        this.id = 0;
    }

    // Sobreescribimos el toString para que muestre una lista mas ordenada
    @Override
    public String toString() {
        String tmp="LISTA DE EJERCITOS";
        for (Map.Entry<Integer, Ejercito> entry : ejercitos.entrySet()) {
            Integer id = entry.getKey();
            Ejercito ejercito = entry.getValue();
            tmp+="\n";
            tmp+="""
                 Ejercito con Id %s
                 """.formatted(id);
            tmp+=ejercito.toString();
        }
        return tmp;
    }
    
    
    // metodo para mostrar solo los id de los ejercitos
    // lo he creado solo para comprobación
    public String mostrarIdEjercitos(){
        String tmp="";
        for (Integer key : ejercitos.keySet()) {
            tmp+="""
                Id=%s  
                 """.formatted(key);
        }
        return tmp;
    }

    // método privado que comprueba que el id es único
    // suma 1 al id si está repetido, así el contructor por defecto siempre añadirá un ejercito con un id único
    private boolean idEsUnico() {
        if (ejercitos.containsKey(id)) {
            id++;
            return false;
        } else {
            return true;
        }
    }

    /*añade un ejercito y se pone un id único, si el id que le corresponde ya está en el sistema
    el método privado isIdUnico nos devuelve un false y añade un +1 y vuleve a comprobar si es único
    hasta que el id sea único seguirá añadiendo +1 y comprobando, esto lo he hecho así porque en el
    siguiente constructor permitimos que el usuario ponga un id*/
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

    // método que permite añadir un ejercito con su id
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
