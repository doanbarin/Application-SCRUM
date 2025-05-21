package cong;

import javax.swing.*;
import java.awt.event.*;

public class Cong extends javax.swing.JFrame{
    public static void main(String[] args) {
        // Tạo cửa sổ
        JFrame frame = new JFrame("Cộng hai số");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // tự định vị các thành phần

        // Ô nhập số thứ nhất
        JLabel lbl1 = new JLabel("Số thứ nhất:");
        lbl1.setBounds(30, 20, 100, 25);
        JTextField txt1 = new JTextField();
        txt1.setBounds(130, 20, 150, 25);

        // Ô nhập số thứ hai
        JLabel lbl2 = new JLabel("Số thứ hai:");
        lbl2.setBounds(30, 50, 100, 25);
        JTextField txt2 = new JTextField();
        txt2.setBounds(130, 50, 150, 25);

        // Nút Cộng
        JButton btnCong = new JButton("Cộng");
        btnCong.setBounds(30, 90, 80, 30);

        // Kết quả
        JLabel lblKQ = new JLabel("Kết quả:");
        lblKQ.setBounds(130, 90, 60, 30);
        JTextField txtKQ = new JTextField();
        txtKQ.setBounds(190, 90, 90, 30);
        txtKQ.setEditable(false); // Không cho nhập

        // Xử lý khi nhấn nút
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txt1.getText());
                    double so2 = Double.parseDouble(txt2.getText());
                    double tong = so1 + so2;
                    txtKQ.setText(String.valueOf(tong));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm thành phần vào frame
        frame.add(lbl1);
        frame.add(txt1);
        frame.add(lbl2);
        frame.add(txt2);
        frame.add(btnCong);
        frame.add(lblKQ);
        frame.add(txtKQ);

        // Hiển thị
        frame.setVisible(true);
    }
}
