package paquetec;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eli
 */
/*
PARTE C
En una estructura map, asocia a cada objeto de tipo Ejercito un identificador único. 
Se deben poder guardar Ejércitos con sus identificadores asociados, obtener un Ejercito según su nombre 
y obtener todos los Ejércitos contenidos en la estructura map.
*/
public class Prueba {
    public static void main(String[] args) {
        Soldado soldadoUno= new Soldado("12345678A", "pepe", "pepe1", "pepe2", 25);
        Soldado soldadoDos= new Soldado("12345678B", "juan", "juan1", "juan2", 30);
        Soldado soldadoTres= new Soldado("12345678C", "maria", "maria1", "maria2", 45);
        Soldado soldadoCuatro= new Soldado("12345678D", "lisa", "lisa1", "lisa2", 19);
        Soldado soldadoZero= new Soldado("00000000", "carmina", "carmina1", "carmina2", 25);
        
        Ejercito ejercitoUno = new Ejercito();
        Ejercito ejercitoDos = new Ejercito();
        Ejercito ejercitoTres = new Ejercito();
        
        ejercitoUno.alistarSoldado(soldadoUno);
        ejercitoUno.alistarSoldado(soldadoDos);
        ejercitoDos.alistarSoldado(soldadoTres);
        ejercitoDos.alistarSoldado(soldadoCuatro);
        ejercitoTres.alistarSoldado(soldadoZero);
        ejercitoTres.alistarSoldado(soldadoUno);
        
        // creo unu ejercito de tierra compuesto por unos ejercitos
        Ejercitos tierra = new Ejercitos();
        System.out.println("""
                           Añadir ejercitoUno -> %b
                           Añadir ejercitoDos -> %b
                           Añadir ejercitoTres con el mismo id que Dos -> %b
                           Añadir ejercitoTres con un id que no existe -> %b
                           """.formatted(tierra.addEjercito(ejercitoUno),
                                   tierra.addEjercito(ejercitoDos),
                                   tierra.addEjercito(ejercitoTres, 1),
                                   tierra.addEjercito(ejercitoTres, 4)));
        
                
        // muestro los id de los ejercitos
        System.out.println(tierra.mostrarEjercitos());
        
        // muestro una lista de ejercitos 
        tierra.devolverEjercitos().forEach(System.out::println);
        

        
    }
}
