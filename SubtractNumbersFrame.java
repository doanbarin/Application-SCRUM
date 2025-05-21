package thuchanh5;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubtractNumbersFrame extends javax.swing.JFrame {
    private JTextField num1Field, num2Field;
    private JButton subtractButton;
    private JLabel resultLabel;

    public SubtractNumbersFrame() {
        setTitle("Phép Trừ Hai Số");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Số thứ nhất:");
        label1.setBounds(20, 20, 100, 30);
        add(label1);

        num1Field = new JTextField();
        num1Field.setBounds(120, 20, 150, 30);
        add(num1Field);

        JLabel label2 = new JLabel("Số thứ hai:");
        label2.setBounds(20, 60, 100, 30);
        add(label2);

        num2Field = new JTextField();
        num2Field.setBounds(120, 60, 150, 30);
        add(num2Field);

        subtractButton = new JButton("Trừ");
        subtractButton.setBounds(100, 100, 80, 30);
        add(subtractButton);

        resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(20, 140, 250, 30);
        add(resultLabel);

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = num1 - num2;
                    resultLabel.setText("Kết quả: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SubtractNumbersFrame();
    }
}
