package app;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;


public class CampoTextoMarco extends JFrame {

    private final JTextField campoTexto1; // campo de texto con tamaño fijo
    private final JTextField campoTexto2; // campo de texto con texto
    private final JTextField campoTexto3; // campo de texto con texto y tamaño
    private final JPasswordField campoContrasenia; // campo de contraseña con texto
    private final JTextField etiqueta1; // JLabel sólo con texto
    private final JTextField etiqueta2; // JLabel construida con texto y un icono
    private final JTextField etiqueta3;
    private final JTextField etiqueta4;

    public CampoTextoMarco() {
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout());

        etiqueta1 = new JTextField("Etiqueta1");
        etiqueta1.setEditable(false);
        etiqueta1.setToolTipText("Esta es etiqueta1");
        add(etiqueta1); // agrega etiqueta1 a JFrame
            
        // construye campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1); // agrega campoTexto1 a JFrame
               
        etiqueta2 = new JTextField("Etiqueta2");
        etiqueta2.setEditable(false);
        etiqueta2.setToolTipText("Esta es etiqueta2");
        add(etiqueta2); 
        
        // construye campo de texto con texto predeterminado
        campoTexto2 = new JTextField("Escriba el texto aqui");
        add(campoTexto2); // agrega campoTexto2 a JFrame
        
        etiqueta3 = new JTextField("Etiqueta3");
        etiqueta3.setEditable(false);
        etiqueta3.setToolTipText("Esta es etiqueta3");
        add(etiqueta3);
        
        // construye campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false); // deshabilita la edición
        add(campoTexto3); // agrega campoTexto3 a JFrame
        // construye campo de contraseña con texto predeterminado
        etiqueta4 = new JTextField("Etiqueta4");
        etiqueta4.setEditable(false);
        etiqueta4.setToolTipText("Esta es etiqueta4");
        add(etiqueta4);
        
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia); // agrega campoContrasenia a JFrame
        // registra los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
        etiqueta1.addActionListener(manejador);
        etiqueta2.addActionListener(manejador);
        etiqueta3.addActionListener(manejador);
        etiqueta4.addActionListener(manejador);
        
    }
    // clase interna privada para el manejo de eventos

    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto

        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            // el usuario oprimió Intro en el objeto JTextField campoTexto1
            if (evento.getSource() == campoTexto1) {
                cadena = String.format("\n campoTexto1: %s", evento.getActionCommand());
            } // el usuario oprimió Intro en el objeto JTextField campoTexto2
            else if (evento.getSource() == campoTexto2) {
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());
            } // el usuario oprimió Intro en el objeto JTextField campoTexto3
            else if (evento.getSource() == campoTexto3) {
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());
            } // el usuario oprimió Intro en el objeto JTextField campoContrasenia
            else if (evento.getSource() == campoContrasenia) {
                cadena = String.format("campoContrasenia: %s",
                        evento.getActionCommand());
            }
            else if (evento.getSource() == etiqueta1) {
                cadena = String.format("etiqueta1: %s", evento.getActionCommand());
            } // el usuario oprimió Intro en el objeto JTextField campoTexto3
            else if (evento.getSource() == etiqueta2) {
                cadena = String.format("etiqueta2: %s", evento.getActionCommand());
            }
            else if (evento.getSource() == etiqueta3) {
                cadena = String.format("etiqueta3: %s", evento.getActionCommand());
            }
            else if (evento.getSource() == etiqueta4) {
                cadena = String.format("etiqueta4: %s", evento.getActionCommand());
            }

            // muestra el contenido del objeto JTextField
            JOptionPane.showMessageDialog(null, cadena);
        }
    } //fin de la clase privada interna ManejadorCampoTexto
}
