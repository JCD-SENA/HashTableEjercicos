package juanca.hashtableejemplos;

import java.util.Hashtable;
import javax.swing.JOptionPane;

/*
Ejercico 2

Un programa que le permita al usuario escojer entre Español, Arabe e Inglés, permitiendole ver las palabras para saludar y sus equivalentes en los otros
idiomas.
*/

public class Ejercicio2 {
    public static void main(String[] args) {
        int opt=0, lang=0;
        Hashtable<Integer, String> menu = new Hashtable<Integer, String>();
        Hashtable<String, String> dictionary = new Hashtable<String, String>();
        menu.put(1, "Hola!\n1. Ver equivalente en otros idiomas.\n2. Salir");
        menu.put(2, "Hi!\n1. See equivalent in other languages.\n2. Exit");
        menu.put(3, "!ٱلسَّلَامُ عَلَيْكُم, \nيعادل اللغة الإنجليزية .1\nإكزت.2");
        dictionary.put("ES", "Hola");
        dictionary.put("EN", "Hi");
        dictionary.put("AR", "ٱلسَّلَامُ عَلَيْكُم");
        lang = Integer.parseInt(JOptionPane.showInputDialog("1. Español\n2. English\n3. العربية"));
        System.out.print(lang);
        if (lang >= 1 && lang <= 3) {
            do {
                opt = Integer.parseInt(JOptionPane.showInputDialog(menu.get(lang)));
                if (opt == 1) {
                    switch (lang) {
                        case 1:
                            JOptionPane.showMessageDialog(null, dictionary.get("EN"));
                            JOptionPane.showMessageDialog(null, dictionary.get("AR"));
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, dictionary.get("AR"));
                            JOptionPane.showMessageDialog(null, dictionary.get("ES"));
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, dictionary.get("EN"));
                            JOptionPane.showMessageDialog(null, dictionary.get("ES"));
                            break;
                    }
                }
                if (!(opt >= 1 && opt <= 2)) {
                    JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            } while (opt!=2);
        } else {
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
