package controlador;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import modelo.modelo;
import vista.login;

/**
 *
 * @author Ardilla Jedi
 */
public class TiendaFelina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               //se crean los objetos MODELO Y VISTA
        modelo modelo = new modelo();
        login vista = new login();
       //Para colocar un skin propio de java
       try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(vista);
            new controlador(vista, modelo).go();
        }catch (UnsupportedLookAndFeelException ex) {}
        catch (ClassNotFoundException ex) {}
        catch (InstantiationException ex) {}
        catch (IllegalAccessException ex) {}
    }
    
}
