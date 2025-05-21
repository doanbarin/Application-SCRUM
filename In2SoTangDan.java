package cong;

import javax.swing.*;
import java.awt.event.*;

public class In2SoTangDan {
	public In2SoTangDan() {
		JFrame frame = new JFrame("In 2 số theo thứ tự tăng dần");
        frame.setSize(350, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Nhãn và ô nhập số 1
        JLabel lbl1 = new JLabel("Số thứ nhất:");
        lbl1.setBounds(30, 20, 100, 25);
        JTextField txt1 = new JTextField();
        txt1.setBounds(130, 20, 150, 25);

        // Nhãn và ô nhập số 2
        JLabel lbl2 = new JLabel("Số thứ hai:");
        lbl2.setBounds(30, 60, 100, 25);
        JTextField txt2 = new JTextField();
        txt2.setBounds(130, 60, 150, 25);

        // Nút sắp xếp
        JButton btnSapXep = new JButton("Sắp xếp tăng dần");
        btnSapXep.setBounds(30, 100, 180, 30);

        // Nhãn và ô kết quả
        JLabel lblKQ = new JLabel("Kết quả:");
        lblKQ.setBounds(30, 140, 100, 25);
        JTextField txtKQ = new JTextField();
        txtKQ.setBounds(130, 140, 150, 25);
        txtKQ.setEditable(false);

        // Xử lý khi nhấn nút
        btnSapXep.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txt1.getText());
                    double so2 = Double.parseDouble(txt2.getText());

                    if (so1 < so2) {
                        txtKQ.setText(so1 + ", " + so2);
                    } else {
                        txtKQ.setText(so2 + ", " + so1);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm vào frame
        frame.add(lbl1);
        frame.add(txt1);
        frame.add(lbl2);
        frame.add(txt2);
        frame.add(btnSapXep);
        frame.add(lblKQ);
        frame.add(txtKQ);

        // Hiển thị
        frame.setVisible(true);
	}
}

