import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginForm {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
    private JPanel mainPanel;

    public LoginForm() {
        // Initialize components
        textField1 = new JTextField(15);
        passwordField1 = new JPasswordField(15);
        loginButton = new JButton("Login");
        mainPanel = new JPanel();

        // Add components to the panel
        mainPanel.add(new JLabel("Username:"));
        mainPanel.add(textField1);
        mainPanel.add(new JLabel("Password:"));
        mainPanel.add(passwordField1);
        mainPanel.add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(passwordField1.getPassword());
                authenticateUser(username, password);
            }
        });

        // Set up the frame
        JFrame frame = new JFrame("Login Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }

    private void authenticateUser(String username, String password) {
        String url = "jdbc:mysql://localhost:3306/loginDB"; // Update with your database URL
        String dbUsername = "loginDB"; // Update with your DB username
        String dbPassword = "root"; // Update with your DB password

        try (Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword)) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(mainPanel, "Login successful!");
                } else {
                    JOptionPane.showMessageDialog(mainPanel, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(mainPanel, "Database connection error!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginForm());
    }
}
