/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDien;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.TableModelEvent;
import javax.swing.table.TableModel;

/**
 *
 * @author ADMIN
 */
public class NewJFrame extends javax.swing.JFrame {

//    public static ArrayList<SinhVien> list = new ArrayList<SinhVien>();
//    public static SInhVienTable model = new SInhVienTable(list);

    /**
     * Creates new form NewJFrame
     */

    public NewJFrame() {
        initComponents();
        //them();
       // displayStudentDataOnTable();
    }

//    public static void them() {
//        SinhVien sv1 = new SinhVien("101", "Dao", 12);
//        SinhVien sv2 = new SinhVien("102", "Daodz", 15);
//        list.add(sv1);
//        list.add(sv2);
//    }

//    private void themsv() {
//        jButton12.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Hiển thị cửa sổ dialog để nhập thông tin sinh viên mới
//                JPanel panel = new JPanel(new GridLayout(2, 2));
//
//                JTextField maSVField = new JTextField();
//                JTextField tenSVField = new JTextField();
//
//                panel.add(new JLabel("Mã Sinh Viên:"));
//                panel.add(maSVField);
//                panel.add(new JLabel("Tên Sinh Viên:"));
//                panel.add(tenSVField);
//
//                int result = JOptionPane.showConfirmDialog(
//                        jFrame1,
//                        panel,
//                        "Thêm Sinh Viên trực nhật",
//                        JOptionPane.OK_CANCEL_OPTION,
//                        JOptionPane.PLAIN_MESSAGE);
//
//                if (result == JOptionPane.OK_OPTION) {
//                    String maSV = maSVField.getText();
//                    String tenSV = tenSVField.getText();
//
//                    // Kiểm tra xem người dùng đã nhập thông tin hay chưa
//                    if (!maSV.isEmpty() && !tenSV.isEmpty()) {
//                        // Thêm sinh viên mới vào mô hình
//                        model.addStudent(new SinhVien(maSV, tenSV, 5));
//                    }
//                }
//            }
//        });
////cap nhat lai vao csdl
//        trucnhat.getModel().addTableModelListener(e -> {
//            if (e.getType() == TableModelEvent.UPDATE) {
//                int row = e.getFirstRow();
//                int column = e.getColumn();
//                // Lấy giá trị từ ô đã được chỉnh sửa và cập nhật vào dữ liệu của ứng dụng
//                Object newValue = trucnhat.getValueAt(row, column);
//                // Cập nhật dữ liệu vào mô hình (EditableTableModel) hoặc thực hiện hành động cần thiết
//                model.setValueAt(newValue, row, column);
//                System.out.println("Updated value: " + newValue);
//            }
//        });
//    }
//
//    static void showEditDialog(JFrame parent, SinhVien student) {
//        JPanel panel = new JPanel(new GridLayout(2, 2));
//
//        JTextField maSVField = new JTextField();
//        JTextField tenSVField = new JTextField();
//
//        if (student != null) {
//            // Nếu có sinh viên, hiển thị thông tin cũ
//            maSVField.setText(student.getmasv());
//            tenSVField.setText(student.getTen());
//        }
//
//        panel.add(new JLabel("Mã Sinh Viên:"));
//        panel.add(maSVField);
//        panel.add(new JLabel("Tên Sinh Viên:"));
//        panel.add(tenSVField);
//
//        int result = JOptionPane.showConfirmDialog(
//                parent,
//                panel,
//                "Sửa Thông Tin Sinh Viên",
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.PLAIN_MESSAGE);
//
//        if (result == JOptionPane.OK_OPTION) {
////           
//            // Nếu có sinh viên (sửa), cập nhật thông tin sinh viên
//            student.setMaSV(maSVField.getText());
//            student.setTenSV(tenSVField.getText());
//            model.fireTableDataChanged(); // Cập nhật toàn bộ bảng
//        }
//    }
//
//    private void sua() {
//        sua.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Lấy chỉ số hàng đã chọn
//                int selectedRow = trucnhat.getSelectedRow();
//                // Kiểm tra xem có hàng được chọn không
//                if (selectedRow != -1) {
//                    // Lấy sinh viên từ mô hình dựa trên chỉ số hàng
//                    SinhVien student = model.getStudentAt(selectedRow);
//                    // Hiển thị cửa sổ dialog để sửa thông tin sinh viên
//                    showEditDialog(jFrame1, student);
//                } else {
//                    // Nếu không có hàng nào được chọn, thông báo cho người dùng
//                    JOptionPane.showMessageDialog(jFrame1, "Vui lòng chọn một sinh viên để sửa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
//                }
//            }
//        });
//    }
//
//    private void xoa() {
//        xoa.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int selectedRow = trucnhat.getSelectedRow();
//                if (selectedRow != -1) {
//                    int confirmResult = JOptionPane.showConfirmDialog(
//                            jFrame1,
//                            "Bạn có chắc chắn muốn xóa sinh viên này không?",
//                            "Xác nhận Xóa",
//                            JOptionPane.OK_CANCEL_OPTION);
//
//                    if (confirmResult == JOptionPane.OK_OPTION) {
//                        model.removeStudentAt(selectedRow);
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(jFrame1, "Vui lòng chọn một sinh viên để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
//                }
//            }
//        });
//    }
//
//    private void displayStudentDataOnTable() {
//
//        trucnhat.setModel(model); // hien thi lít tren table 
//        themsv();
//        sua();
//        xoa();
//        // lang nghe su kien kik them
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        trucnhat = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Malop = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        sua = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jMenu1.setText("jMenu1");
        jSeparator1.getAccessibleContext().setAccessibleParent(jMenu3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        trucnhat.setBackground(new java.awt.Color(204, 255, 255));
        trucnhat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        trucnhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        trucnhat.setForeground(new java.awt.Color(0, 51, 51));
        trucnhat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(trucnhat);

        jLayeredPane1.add(jScrollPane2);
        jScrollPane2.setBounds(340, 170, 670, 330);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Trở về");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(1340, 640, 100, 30);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Trực nhật"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLayeredPane2.add(jScrollPane3);
        jScrollPane3.setBounds(290, 120, 400, 290);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane2.add(jPanel2);
        jPanel2.setBounds(80, 60, 100, 100);

        jButton3.setText("jButton1");
        jLayeredPane2.add(jButton3);
        jButton3.setBounds(870, 470, 75, 23);

        jButton4.setText("jButton1");
        jLayeredPane2.add(jButton4);
        jButton4.setBounds(770, 470, 75, 23);

        jLayeredPane1.add(jLayeredPane2);
        jLayeredPane2.setBounds(0, 0, 0, 0);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Trực nhật"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jLayeredPane3.add(jScrollPane4);
        jScrollPane4.setBounds(290, 120, 400, 290);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane3.add(jPanel3);
        jPanel3.setBounds(80, 60, 100, 100);

        jButton5.setText("jButton1");
        jLayeredPane3.add(jButton5);
        jButton5.setBounds(870, 470, 75, 23);

        jButton6.setText("jButton1");
        jLayeredPane3.add(jButton6);
        jButton6.setBounds(770, 470, 75, 23);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Trực nhật"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jLayeredPane4.add(jScrollPane5);
        jScrollPane5.setBounds(290, 120, 400, 290);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane4.add(jPanel4);
        jPanel4.setBounds(80, 60, 100, 100);

        jButton7.setText("jButton1");
        jLayeredPane4.add(jButton7);
        jButton7.setBounds(870, 470, 75, 23);

        jButton8.setText("jButton1");
        jLayeredPane4.add(jButton8);
        jButton8.setBounds(770, 470, 75, 23);

        jLayeredPane3.add(jLayeredPane4);
        jLayeredPane4.setBounds(0, 0, 0, 0);

        jLayeredPane1.add(jLayeredPane3);
        jLayeredPane3.setBounds(0, 0, 0, 0);

        jButton10.setBackground(new java.awt.Color(255, 204, 204));
        jButton10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton10.setText("Đăng xuất");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton10);
        jButton10.setBounds(1290, 20, 100, 30);

        xoa.setBackground(new java.awt.Color(255, 204, 204));
        xoa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });
        jLayeredPane1.add(xoa);
        xoa.setBounds(1210, 640, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectest/z4968704981627_c1ccb4d47a9e6888724cb365ce93bf07.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(130, 10, 162, 190);

        jTextField3.setText("text\tThông tin Tên lớp");
        jLayeredPane1.add(jTextField3);
        jTextField3.setBounds(510, 100, 100, 30);

        Malop.setText("Thông tin mã lớp");
        jLayeredPane1.add(Malop);
        Malop.setBounds(510, 40, 100, 30);

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Quản lý trực nhật");
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 0, 51), new java.awt.Color(0, 0, 51), null, null));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField5);
        jTextField5.setBounds(130, 210, 150, 120);

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setLabelFor(Malop);
        jLabel2.setText("Tên lớp");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(390, 100, 110, 30);

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setLabelFor(Malop);
        jLabel3.setText("Mã lớp");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(390, 40, 110, 30);

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton12.setText("Thêm");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton12);
        jButton12.setBounds(920, 640, 100, 30);

        sua.setBackground(new java.awt.Color(255, 204, 204));
        sua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });
        jLayeredPane1.add(sua);
        sua.setBounds(1070, 640, 100, 30);

        getContentPane().add(jLayeredPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoaActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Malop;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton sua;
    private javax.swing.JTable trucnhat;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
