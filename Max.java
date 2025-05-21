package cong;

import javax.swing.*;
import java.awt.event.*;

public class Max {
	public Max() {
		JFrame frame = new JFrame("Tìm số lớn nhất trong 2 số");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Ô nhập số thứ nhất
        JLabel lbl1 = new JLabel("Số thứ nhất:");
        lbl1.setBounds(30, 20, 100, 25);
        JTextField txt1 = new JTextField();
        txt1.setBounds(130, 20, 150, 25);

        // Ô nhập số thứ hai
        JLabel lbl2 = new JLabel("Số thứ hai:");
        lbl2.setBounds(30, 60, 100, 25);
        JTextField txt2 = new JTextField();
        txt2.setBounds(130, 60, 150, 25);

        // Nút tìm số lớn nhất
        JButton btnTim = new JButton("Tìm số lớn nhất");
        btnTim.setBounds(30, 100, 150, 30);

        // Ô kết quả
        JLabel lblKQ = new JLabel("Kết quả:");
        lblKQ.setBounds(30, 140, 100, 25);
        JTextField txtKQ = new JTextField();
        txtKQ.setBounds(130, 140, 150, 25);
        txtKQ.setEditable(false);

        // Xử lý khi nhấn nút
        btnTim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txt1.getText());
                    double so2 = Double.parseDouble(txt2.getText());
                    double max = Math.max(so1, so2);
                    txtKQ.setText(String.valueOf(max));
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
        frame.add(btnTim);
        frame.add(lblKQ);
        frame.add(txtKQ);

        // Hiển thị
        frame.setVisible(true);
	}
}

