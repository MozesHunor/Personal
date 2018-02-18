import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JButton ADDButton;
    private JButton SUBTRACTButton;
    private JButton MULTIPLYButton;
    private JButton DIVIDEButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextArea textArea1;
    private JPanel Panel;

    public Calculator() {
        ADDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1, num2, answer;
                try {
                    num1 = Integer.parseInt(textField1.getText());
                    num2 = Integer.parseInt(textField2.getText());
                    answer = num1 + num2;
                    textArea1.setText(Integer.toString(answer));
                } catch (NumberFormatException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "That's not a number!");
                }
            }
        });
        SUBTRACTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1, num2, answer;
                try {
                    num1 = Integer.parseInt(textField1.getText());
                    num2 = Integer.parseInt(textField2.getText());
                    answer = num1 - num2;
                    textArea1.setText(Integer.toString(answer));
                } catch (NumberFormatException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "That's not a number!");
                }
            }
        });
        MULTIPLYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1, num2, answer;
                try {
                    num1 = Integer.parseInt(textField1.getText());
                    num2 = Integer.parseInt(textField2.getText());
                    answer = num1 * num2;
                    textArea1.setText(Integer.toString(answer));
                } catch (NumberFormatException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "That's not a number!");
                }
            }
        });
        DIVIDEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1, num2, answer;
                try {
                    num1 = Integer.parseInt(textField1.getText());
                    num2 = Integer.parseInt(textField2.getText());
                    answer = num1 / num2;
                    textArea1.setText(Integer.toString(answer));
                } catch (NumberFormatException e1) {
                    e1.printStackTrace();
                    JOptionPane.showMessageDialog(null, "That's not a number!");
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
