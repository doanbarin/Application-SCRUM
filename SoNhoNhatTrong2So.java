package thuchanh5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SoNhoNhatTrong2So extends JFrame {
    private JTextField num1Field, num2Field;
    private JButton findMinButton;
    private JLabel resultLabel;

    public SoNhoNhatTrong2So() {
        setTitle("Tìm Số Nhỏ Nhất");
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

        findMinButton = new JButton("Tìm số nhỏ nhất");
        findMinButton.setBounds(70, 100, 150, 30);
        add(findMinButton);

        resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(20, 140, 250, 30);
        add(resultLabel);

        findMinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double minNumber = Math.min(num1, num2);
                    resultLabel.setText("Số nhỏ nhất: " + minNumber);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SoNhoNhatTrong2So();
    }
}
