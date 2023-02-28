
import javax.swing.JOptionPane;

public class Vinicio {
    
    public static void main(String[] args) {
        
        String cadena;
        int opcion= 0;
        
        do {            
            cadena = JOptionPane.showInputDialog("Las opciones que puedes realizar son:\n[1] Pilas\n[2] Colas\n Elige una opción");
            opcion = Integer.parseInt(cadena);
        } while (opcion< 1 || opcion > 2);
        
        switch (opcion) {
            case 1:
                Pilas pilas = new Pilas();
                break;
                
                 case 2:
                Colas colas = new Colas();
                break;

        }
        
    }
    
}
