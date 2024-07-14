import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biografia extends JFrame{
    private JPanel panel1;
    private JLabel a;
    private JButton masInfoButton;
    private JLabel r;
    private JButton salirButton;

    public biografia() {
        setTitle("biografia");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String imagePath = "C:/Users/Isaac/IdeaProjects/t11/user.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image originalImage = imageIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        a.setIcon(scaledIcon);

        setContentPane(panel1);

        masInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hobby h = new hobby();
                h.setVisible(true);
                dispose();
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login l = new login();
                l.setVisible(true);
                dispose();
            }
        });

    }
}
