import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginScreen {

    JFrame window;
    JLabel noInfo;
    
    public void loginScreen() {
        // Create window & set features
        window = new JFrame();
        window.setSize(1280, 720);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the window closes properly

        // Add title
        JLabel title = new JLabel();
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("<html><div style='text-align: center;'>LOGIN</div></html>");
        title.setFont(new Font("Serif", Font.BOLD, 30));
        title.setBounds(265, 100, 750, 150);
        title.setForeground(Color.BLACK);
        window.getContentPane().add(title);

        // Add username textfield
        JTextField uInput = new JTextField(16);
        uInput.setBounds(500, 300, 250, 30);
        window.getContentPane().add(uInput);

        // Add password textfield
        JTextField pInput = new JTextField(16);
        pInput.setBounds(500, 360, 250, 30);
        window.getContentPane().add(pInput);

        // Add submit button
        JButton submit = new JButton();
        submit.setBounds(760, 360, 50, 30);
        submit.setText("OK");
        submit.setFont(new Font("Serif", Font.BOLD, 10));
        window.getContentPane().add(submit);

        // Functionality of submit button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            // Variables for inputted text
                String username = uInput.getText();
                String password = pInput.getText();

                if (username.equals("") && password.equals("")) {
                    System.out.println("NO INFO >:(");

                    noInfo = new JLabel();
                    noInfo.setHorizontalAlignment(SwingConstants.CENTER);
                    noInfo.setText("no info >:(");
                    noInfo.setFont(new Font("Serif", Font.BOLD, 30));
                    noInfo.setBounds(265, 400, 750, 150);
                    noInfo.setForeground(Color.BLACK);
                    window.getContentPane().add(noInfo);
                    window.revalidate();
                    window.repaint();

                } else if (username.equals("")) {
                    System.out.println("ENTER USERNAME");
                } else if (password.equals("")) {
                    System.out.println("ENTER PASSWORD");
                } else {
                    System.out.println(username);
                    System.out.println(password);
                }
            }
        });

        // Set window visible
        window.setVisible(true);
    }
}
