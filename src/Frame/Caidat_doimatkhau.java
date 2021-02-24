
package Frame;
import DAOGUI.DAONguoidung;
import DBConnect.MySQLConnUtils;
import Main.Login;
import OBJGUI.Nguoidung;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Caidat_doimatkhau extends javax.swing.JPanel {
    DAOGUI.DAONguoidung DAOnguoidung = new DAONguoidung();
    Main.Login login = new Login();
    public Caidat_doimatkhau() {
        initComponents();
    }
    Connection dbConnection = null;
    Statement statement = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_mkmoi = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_taikhoan = new javax.swing.JTextField();
        txt_mkcu = new javax.swing.JPasswordField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 137, 62));
        jLabel3.setText("Mật Khẩu Cũ:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 137, 62));
        jLabel4.setText("Mật Khẩu Mới:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        txt_mkmoi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_mkmoi.setForeground(new java.awt.Color(16, 137, 62));
        add(txt_mkmoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 320, 30));

        jPanel2.setBackground(new java.awt.Color(16, 137, 62));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 140, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 137, 62));
        jLabel5.setText("Tài khoản:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jPanel8.setBackground(new java.awt.Color(16, 137, 62));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ĐỔI MẬT KHẨU");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        txt_taikhoan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_taikhoan.setForeground(new java.awt.Color(16, 137, 62));
        add(txt_taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 320, 30));

        txt_mkcu.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_mkcu.setForeground(new java.awt.Color(16, 137, 62));
        add(txt_mkcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 320, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void reset(){
        txt_mkcu.setText("");
        txt_mkmoi.setText("");
        txt_taikhoan.setText("");
    }
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        String sql = "SELECT * FROM nguoidung WHERE Taikhoan='"+txt_taikhoan+"' AND Matkhau='"+txt_mkcu+"'";
        Nguoidung nguoidung = new Nguoidung();
//
//        try {
//            dbConnection = MySQLConnUtils.getMySQLConnection();
//            statement = dbConnection.createStatement();
//            ResultSet rs = statement.executeQuery(sql);
//            while ((rs != null) && (rs.next())) {
                nguoidung.setMatkhau(txt_mkmoi.getText());
                nguoidung.setTaikhoan(txt_taikhoan.getText());
//                nguoidung.setTaikhoan(rs.getString("Taikhoan"));
                DAOnguoidung.Doimatkhau(nguoidung);
//            }
            JOptionPane.showMessageDialog(this,"Mật khẩu đã thay đổi thành công","Thông báo", JOptionPane.WARNING_MESSAGE);
//        }
//        catch(Exception e ){
//            JOptionPane.showMessageDialog(null, e);
//        } 
        reset();
    }//GEN-LAST:event_jPanel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txt_mkcu;
    private javax.swing.JPasswordField txt_mkmoi;
    private javax.swing.JTextField txt_taikhoan;
    // End of variables declaration//GEN-END:variables
}