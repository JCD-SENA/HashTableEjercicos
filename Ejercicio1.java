package juanca.hashtableejemplos;

import javax.swing.JOptionPane;
import java.util.Hashtable;

/*
Ejercicio 1

Un programa con un diccionario el cual le de al usuario acceso a la edad de una persona, usando su nombre como llave.
*/

public class Ejercicio1 {
    public static void main(String[] args) {
        Hashtable<String, Integer> personas = new Hashtable<String, Integer>();
        personas.put("Pedro", 20);
        personas.put("Andrea", 27);
        personas.put("Celine", 18);
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona");
        if (personas.containsKey(nombre)) {//este metodo funciona para revisar si la tabla contiene esa llave.
            System.out.println("La edad de "+nombre+" es: "+personas.get(nombre));
        } else {
            System.out.println("No existe esa persona en la base de datos");
        }
    }
}
