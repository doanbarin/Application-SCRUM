package thuchanh5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class In2SoGiamDan extends JFrame {
    private JTextField num1Field, num2Field;
    private JButton sortButton;
    private JLabel resultLabel;

    public In2SoGiamDan() {
        setTitle("Sắp Xếp Hai Số Giảm Dần");
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

        sortButton = new JButton("Sắp xếp");
        sortButton.setBounds(100, 100, 100, 30);
        add(sortButton);

        resultLabel = new JLabel("Kết quả:");
        resultLabel.setBounds(20, 140, 250, 30);
        add(resultLabel);

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());

                    double[] numbers = {num1, num2};
                    Arrays.sort(numbers);

                    resultLabel.setText("Giảm dần: " + numbers[1] + ", " + numbers[0]);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new In2SoGiamDan();
    }
}
