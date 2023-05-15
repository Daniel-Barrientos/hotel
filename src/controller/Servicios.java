package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.VO.Alquiler;
import model.DAO.Conexion;
import model.DAO.UsuarioServicios;
import model.VO.Usuario;
import view.FormularioView;

/**
 *
 * @author Hp
 */
public class Servicios implements ActionListener {

    private FormularioView vista;

    public Servicios(FormularioView vista) {
        this.vista = vista;
        ActionListener(this);
    }

    public void Alquilar(Alquiler alquiler) {
        try {
            UsuarioServicios us = new UsuarioServicios();
            us.guardar(Conexion.obtener(), alquiler.getUsuario());
        } catch (Exception e) {
        }
    }

    private void ActionListener(ActionListener controller) {
        vista.btnRegistrarAlquiler.addActionListener(controller);
        vista.btnLimpiar.addActionListener(controller);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().contentEquals("Registrar Alquiler")) {

            String nombre = vista.txtNombre.getText();
            String identificacion = vista.txtDocumento.getText();
            String id = identificacion.substring(identificacion.length() - 4, identificacion.length());
            int edad = Integer.parseInt(vista.txtEdad.getText());

            Usuario usuario = new Usuario(id, identificacion, nombre, edad);

            Alquiler alquiler = new Alquiler();

            alquiler.setUsuario(usuario);

            Alquilar(alquiler);
            
            JOptionPane.showMessageDialog(vista, "Se ha registrado correctamente");
        }

        if (e.getActionCommand().contentEquals("Limpiar")) {

            vista.txtDoble.setText("");
            vista.txtDocumento.setText("");
            vista.txtEdad.setText("");
            vista.txtNombre.setText("");
            vista.txtSencilla.setText("");
            vista.txtSuite.setText("");

        }

    }

}
