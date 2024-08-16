import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginScreen {
    public static void loginScreen() {
    //make window & set features
        JFrame window = new JFrame();
        window.setSize(1280,720);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
    
    //add title
        JLabel title = new JLabel();
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("<html><div style='text-align: center;'>LOGIN</html>");
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setBounds(265, 100, 750, 150);
        title.setForeground(Color.BLACK);
        window.getContentPane().add(title);
    
    //add username textfield
        JTextField uInput = new JTextField(16);
        uInput.setBounds(500,300, 250, 30);
        window.getContentPane().add(uInput);
    
    //add submit username button
        JButton uSubmit = new JButton();
        uSubmit.setBounds(760, 300, 50, 30);
        uSubmit.setText("OK");
        uSubmit.setFont(new Font("Serif", Font.BOLD, 10));
        window.getContentPane().add(uSubmit);

    //add password textfield
        JTextField pInput = new JTextField(16);
        pInput.setBounds(500,360, 250, 30);
        window.getContentPane().add(pInput);
    
    //add submit password button
        JButton pSubmit = new JButton();
        pSubmit.setBounds(760, 360, 50, 30);
        pSubmit.setText("OK");
        pSubmit.setFont(new Font("Serif", Font.BOLD, 10));
        window.getContentPane().add(pSubmit);

    //set window visible
        window.setVisible(true);
    }
}
