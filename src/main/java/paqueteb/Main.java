/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteb;

/**
 *
 * @author venganzaalchocolate
 */
public class Main {
    public static void main(String[] args) {
        int a = 1+2;
        Loteria loteria = new Loteria();
        
        // mostramos numeros d ela loteria y premios para comprobar que funciona correctamente
        System.out.println(loteria.toString());
        
        // añadimos un numero y premio nostros para comprobar que el método comprobarDecimo funciona
        loteria.meterDecimo("123456", 5);
        
        // comprobamos si un decimo esta premiado
        System.out.println("""
                           El decimo "123456" que premio tiene? %s €
                           El decimo "kjhsadfkljhfse" que premio tiene? %s
                           
                           """.formatted(loteria.comprobarDecimo("123456"),
                                   loteria.comprobarDecimo("kjhsadfkljhfse")));
    }
}
