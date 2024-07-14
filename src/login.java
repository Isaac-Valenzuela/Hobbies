import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class login extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton iniciarSesionButton;

    public login(){
        setTitle("login");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);

        iniciarSesionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Informacion quemada
//                String user = "isaac@epn";
//                String pass = "123";
//                String userIngresado = textField1.getText();
//                String passIngresada = textField2.getText();
                try{
                    IniciarSesion();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }


            }
        });
    }

    public void IniciarSesion()throws SQLException{
        String userIngresado = textField1.getText();
        String passIngresada = textField2.getText();

        Connection conectate = connection();
        String query = "SELECT * FROM usuariosadministrador WHERE correo=? AND constra=?";
        PreparedStatement pstmt = conectate.prepareStatement(query);
        pstmt.setString(1, userIngresado);
        pstmt.setString(2, passIngresada);
        ResultSet rs = pstmt.executeQuery();

        if(rs.next()){
            JOptionPane.showMessageDialog(null, "INICIO EXITOSO");
            biografia b = new biografia();
            b.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Datos Incorrectos");
        }
        rs.close();
        pstmt.close();
        conectate.close();

    }
    public Connection connection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/curso";
        String user = "root";
        String pass = "123456";
        return DriverManager.getConnection(url,user,pass);
    }
}
