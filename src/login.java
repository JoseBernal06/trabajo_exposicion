import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    private JLabel titulo;
    private JLabel texto_usuario;
    private JLabel texto_password;
    private JPasswordField ingreso_password;
    private JTextField ingreso_usuario;
    private JButton boton_entrar;
    JPanel panel_principal;
    private JLabel texto_pantalla;


    public login() {
        boton_entrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usuario="123456";
                String password="holamundo";
                String usuarioIngresado = ingreso_usuario.getText();
                String passwordIngresado = ingreso_password.getText();

                if (usuario.equals(usuarioIngresado) && password.equals(passwordIngresado)){
                    texto_pantalla.setText("BIENVENIDO");
                }
                else{
                    texto_pantalla.setText("ERROR, INTENTA DE NUEVO");
                }
            }
        });
    }
}
