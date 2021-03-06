
package Frame;

import DAOFrame.DAODanhmuc_nhacc;
import DBConnect.MySQLConnUtils;
import OBJFrame.Dm_nhacc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Danhmuc_nhacc extends javax.swing.JPanel {
    DAOFrame.DAODanhmuc_nhacc DAOnhacc=new DAODanhmuc_nhacc();
    public Danhmuc_nhacc() {
        initComponents();
        loadData();
        cbcungcap.setEnabled(false);
    }
    Connection dbConnection = null;
    Statement statement = null;
    public void loadData() {
    // Clear table
    tbl_data.setModel(new DefaultTableModel());
    // Model for Table
    DefaultTableModel model = new DefaultTableModel() {
        public Class<?> getColumnClass(int column) {
            switch (column) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return Boolean.class;
            default:
                return String.class;        
          }
        }
    };
    tbl_data.setModel(model);

    // Add Column
    model.addColumn("STT");
    model.addColumn("Mã Nhà Cung Cấp");
    model.addColumn("Tên Nhà Cung Cấp");
    model.addColumn("Địa Chỉ");
    model.addColumn("Số Điện Thoại");
    model.addColumn("Tình Trạng Cung Cấp");
    model.addColumn("Chọn");
    
    String sql = "SELECT * FROM  nhacungcap";
    try {
        dbConnection = MySQLConnUtils.getMySQLConnection();
        statement = dbConnection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        int row = 0;
        while ((rs != null) && (rs.next())) {
            model.addRow(new Object[0]);
            model.setValueAt(row+1, row, 0);
            model.setValueAt(rs.getString("Ma_NCC"), row, 1);
            model.setValueAt(rs.getString("Ten_NCC"), row, 2);
            model.setValueAt(rs.getString("Diachi_NCC"), row, 3);
            model.setValueAt(rs.getString("SDT_NCC"), row, 4);
            if(rs.getString("Nghi_CCap").equals("0")){
                model.setValueAt("Nghỉ Cung Cấp", row, 5);
            }else{
                model.setValueAt("Còn Cung Cấp", row, 5);
            }
                
            model.setValueAt(false, row, 6); // Checkbox
            
            row++;
            }
        } catch (Exception e) {
            e.printStackTrace();
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_sdt = new javax.swing.JTextField();
        txt_tennhacc = new javax.swing.JTextField();
        cbcungcap = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txt_manhacc = new javax.swing.JTextField();
        txt_diachi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_data.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_data.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbl_dataMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 830, 300));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 120, 215));
        jLabel2.setText("SDT");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 120, 215));
        jLabel3.setText("Tên Nhà Cung Cấp");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txt_sdt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_sdt.setForeground(new java.awt.Color(0, 120, 215));
        add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 180, 30));

        txt_tennhacc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_tennhacc.setForeground(new java.awt.Color(0, 120, 215));
        add(txt_tennhacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, 30));

        cbcungcap.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cbcungcap.setForeground(new java.awt.Color(0, 120, 215));
        cbcungcap.setText("Nghỉ Cung Cấp");
        add(cbcungcap, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 120, 215));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Thêm Nhà Cung Cấp");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 170, 40));

        jPanel3.setBackground(new java.awt.Color(0, 120, 215));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Xóa Nhà Cung Cấp");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 170, 40));

        jPanel1.setBackground(new java.awt.Color(0, 120, 215));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NHÀ CUNG CẤP");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(379, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 120, 215));
        jLabel6.setText("Mã Nhà Cung Cấp");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txt_manhacc.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_manhacc.setForeground(new java.awt.Color(0, 120, 215));
        add(txt_manhacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, 30));

        txt_diachi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_diachi.setForeground(new java.awt.Color(0, 120, 215));
        add(txt_diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 180, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 120, 215));
        jLabel8.setText("Địa Chỉ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 120, 215));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sửa thông tin Nhà cung cấp");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 170, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void reset(){
        txt_manhacc.setText("");
        txt_tennhacc.setText("");
        txt_diachi.setText("");
        txt_sdt.setText("");
        cbcungcap.setSelected(false);
    }
    private void tbl_dataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMousePressed
        int row = tbl_data.getSelectedRow();
        String ma_nhacc = tbl_data.getValueAt(row, 1).toString();
        Dm_nhacc nhacc = new Dm_nhacc();
        nhacc = DAOnhacc.TimNhacc(ma_nhacc);
        txt_manhacc.setText(ma_nhacc);
        txt_tennhacc.setText(nhacc.getTen_NCC());
        txt_diachi.setText(nhacc.getDiachi_NCC());
        txt_sdt.setText(nhacc.getSDT_NCC().toString());
        if (nhacc.getNghi_CCap() == 0) {//0 là nghỉ cung cấp
            cbcungcap.setSelected(true);
        }else
            cbcungcap.setSelected(false);
        
        cbcungcap.setEnabled(true);
        txt_manhacc.setEnabled(false);
    }//GEN-LAST:event_tbl_dataMousePressed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        boolean isNumeric = true;
       
        try {
            int num = Integer.parseInt(txt_sdt.getText());
            isNumeric = true;

         } catch (NumberFormatException e) {
            isNumeric = false;
        }
        if (isNumeric) {
            Dm_nhacc cungcap = new Dm_nhacc();
            cungcap.setMa_NCC(txt_manhacc.getText());
            cungcap.setTen_NCC(txt_tennhacc.getText());
            cungcap.setDiachi_NCC(txt_diachi.getText());
            cungcap.setSDT_NCC(Integer.parseInt(txt_sdt.getText()));
            if (cbcungcap.isSelected()) {
                cungcap.setNghi_CCap(0);
            }else
                cungcap.setNghi_CCap(1);
            if(DAOnhacc.ThemNhaCC(cungcap)){
                if (txt_sdt.getText().equals("") || txt_tennhacc.getText().equals("")) {
                    //nếu 1 số ô trong đó để rỗng sẽ đưa ra thông báo
                    JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
                } else {
                   //ngược lại thực hiện lấy dữ liệu trong các ô để đưa vào CSDL


                    DAOnhacc.ThemNhaCC(cungcap);
                    cbcungcap.setEnabled(false);
                    txt_manhacc.setEditable(true);
                    JOptionPane.showMessageDialog(this, "Thêm mới Nhà cung cấp thành công!");//đưa ra thông báo khi thực hiện thành công
                    loadData();//load lại form
                    reset();//xóa dữ liệu trong các ô text
                }
            }else{
                JOptionPane.showMessageDialog(this, "Mã nhà cung cấp đã bị trùng!", "Lỗi", JOptionPane.WARNING_MESSAGE);
                loadData();
                reset();
        }
            
        }
        else{
            
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa các nhà cung cấp này không?", "Xóa", 2);
        //khi người dùng ấn đồng ý
        if (confirm == JOptionPane.YES_OPTION) {

            for (int i = 0; i < tbl_data.getRowCount(); i++) {
                Boolean chkDel = Boolean.valueOf(tbl_data.getValueAt(i, 6).toString()); // Checked
                if(chkDel){
                    String cungcap = tbl_data.getValueAt(i, 1).toString();

                    DAOnhacc.XoaNhacungcap(cungcap); // Delete Data
                    reset();
                    cbcungcap.setEnabled(false);
                    txt_manhacc.setEditable(true);
                }
            }
            JOptionPane.showMessageDialog(this, "Xóa dữ liệu thành công!");
            loadData(); // Reload Table
        }else{
            reset();
        }

   
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Dm_nhacc nhacc = new Dm_nhacc();
        nhacc.setMa_NCC(txt_manhacc.getText());
        nhacc.setTen_NCC(txt_tennhacc.getText());
        nhacc.setDiachi_NCC(txt_diachi.getText());
        nhacc.setSDT_NCC(Integer.parseInt(txt_sdt.getText()));
        if (cbcungcap.isSelected()) {
            nhacc.setNghi_CCap(0);
        }else
            nhacc.setNghi_CCap(1);
        
        DAOnhacc.SuaNhaCC(nhacc);
        cbcungcap.setEnabled(false);
        txt_manhacc.setEnabled(true);
        JOptionPane.showMessageDialog(this, "Cập nhật nhà cung câp thành công!");//đưa ra thông báo khi thực hiện thành công
        loadData();//load lại form
        reset();
    }//GEN-LAST:event_jPanel4MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbcungcap;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_manhacc;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tennhacc;
    // End of variables declaration//GEN-END:variables
}
