package hotel;

import controller.Servicios;
import view.FormularioView;

/**
 *
 * @author Daniel Barrientos - 1152143
 */
public class Hotel {

    public static void main(String[] args) {
        
        FormularioView vista = new FormularioView();
        Servicios servicios = new Servicios(vista);
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        
    }
    
}
