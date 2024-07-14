import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class hobby extends JFrame {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton VOLVERButton;
    private JLabel a;

    public hobby(){
        setTitle("hobby");
        setSize(500, 500);
        setLocationRelativeTo(null);
        String imagePath = "C:/Users/Isaac/IdeaProjects/t11/goat.jpeg";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image originalImage = imageIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        a.setIcon(scaledIcon);
        textArea1.setText("El baloncesto fue inventado en 1891 por James Naismith" +
                ", un profesor de educación física canadiense que trabajaba en la Escuela de Entrenamiento" +
                " YMCA de Springfield, Massachusetts (Estados Unidos). Naismith creó el juego con el" +
                " objetivo de mantener a sus alumnos activos durante el invierno. Inicialmente se" +
                " jugaba con una pelota de fútbol y dos cestas de melocotón clavadas a 10 pies (3,05 m)" +
                " de altura. El primer partido de baloncesto se jugó el 21 de diciembre de 1891 entre dos" +
                " equipos de 9 jugadores cada uno. Naismith estableció 13 reglas originales para el juego," +
                " que incluían prohibiciones como dar empujones, zancadillas o golpes a los oponentes." +
                " En 1895 se redujo el número de jugadores por equipo a 7, y en 1896 se fijó en 5 jugadores" +
                " por equipo, que es el número actual.");
        textArea1.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);

        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                biografia b = new biografia();
                b.setVisible(true);
                dispose();
            }
        });

    }
}
