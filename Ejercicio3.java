package juanca.hashtableejemplos;

import java.util.Hashtable;
import javax.swing.JOptionPane;
import java.util.Enumeration;

/*
Ejercicio 3

Un directorio telefonico que permite añadir y remover contactos.
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        Hashtable<String, String> contacts = new Hashtable<String, String>();
        Enumeration<String> keys;
        String key, contactsText, nombre, numero;
        int opt=0;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog("1. Ver contactos\n2. Añadir contactos\n3. Remover contactos\n4. Salir"));
            switch (opt) {
                case 1:
                    if (contacts.size() > 0) {
                        keys = contacts.keys();
                        contactsText = "";
                        while (keys.hasMoreElements()) {
                            key = keys.nextElement();
                            contactsText += key+": "+contacts.get(key)+"\n";
                        }
                        JOptionPane.showMessageDialog(null, contactsText);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay contactos.");
                    }
                    break;
                case 2:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto");
                    numero = JOptionPane.showInputDialog("Ingrese el número del contacto");
                    contacts.put(nombre, numero);
                    JOptionPane.showMessageDialog(null, "Contacto "+nombre+" añadido");
                    break;
                case 3:
                    nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto a eliminar");
                    contacts.remove(nombre);
                    JOptionPane.showMessageDialog(null, "Contacto "+nombre+" removido");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Terminando ejecución");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } while (opt!=4);
    }
}
