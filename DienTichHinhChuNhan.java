package thuchanh5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DienTichHinhChuNhan extends JFrame {
    private JTextField lengthField, widthField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public DienTichHinhChuNhan() {
        setTitle("Tính Diện Tích Hình Chữ Nhật");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Chiều dài:");
        label1.setBounds(20, 20, 100, 30);
        add(label1);

        lengthField = new JTextField();
        lengthField.setBounds(120, 20, 150, 30);
        add(lengthField);

        JLabel label2 = new JLabel("Chiều rộng:");
        label2.setBounds(20, 60, 100, 30);
        add(label2);

        widthField = new JTextField();
        widthField.setBounds(120, 60, 150, 30);
        add(widthField);

        calculateButton = new JButton("Tính");
        calculateButton.setBounds(100, 100, 80, 30);
        add(calculateButton);

        resultLabel = new JLabel("Diện tích:");
        resultLabel.setBounds(20, 140, 250, 30);
        add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(lengthField.getText());
                    double width = Double.parseDouble(widthField.getText());
                    double area = length * width;
                    resultLabel.setText("Diện tích: " + area);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Vui lòng nhập số hợp lệ.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DienTichHinhChuNhan();
    }
}
