package cong;

import javax.swing.*;
import java.awt.event.*;

public class dienTichHinhTron {
	public dienTichHinhTron() {
		  // Tạo cửa sổ
        JFrame frame = new JFrame("Tính diện tích hình tròn");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label và ô nhập bán kính
        JLabel lblBanKinh = new JLabel("Bán kính:");
        lblBanKinh.setBounds(30, 30, 100, 25);
        JTextField txtBanKinh = new JTextField();
        txtBanKinh.setBounds(120, 30, 150, 25);

        // Nút tính diện tích
        JButton btnTinh = new JButton("Tính diện tích");
        btnTinh.setBounds(30, 70, 120, 30);

        // Label và ô kết quả
        JLabel lblKetQua = new JLabel("Diện tích:");
        lblKetQua.setBounds(30, 110, 100, 25);
        JTextField txtKetQua = new JTextField();
        txtKetQua.setBounds(120, 110, 150, 25);
        txtKetQua.setEditable(false);

        // Sự kiện nút tính
        btnTinh.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double r = Double.parseDouble(txtBanKinh.getText());
                    if (r < 0) {
                        JOptionPane.showMessageDialog(frame, "Bán kính phải lớn hơn hoặc bằng 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    double dienTich = Math.PI * r * r;
                    txtKetQua.setText(String.format("%.2f", dienTich));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập bán kính hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Thêm thành phần vào frame
        frame.add(lblBanKinh);
        frame.add(txtBanKinh);
        frame.add(btnTinh);
        frame.add(lblKetQua);
        frame.add(txtKetQua);

        // Hiển thị
        frame.setVisible(true);
	}
    public static void main(String[] args) {
      new dienTichHinhTron();
    }
}
