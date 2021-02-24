
package Frame;

import DAOFrame.DAODanhmuc_donvitinh;
import DBConnect.MySQLConnUtils;
import OBJFrame.Dm_donvitinh;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Danhmuc_donvitinh extends javax.swing.JPanel {
    DAOFrame.DAODanhmuc_donvitinh DAOdvt = new DAODanhmuc_donvitinh();
    public Danhmuc_donvitinh() {
        initComponents();
        loadData();
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
                return Boolean.class;
            default:
                return String.class;        
          }
        }
    };
    tbl_data.setModel(model);

    // Add Column
    model.addColumn("STT");
    model.addColumn("Mã Đơn Vị Tính");
    model.addColumn("Tên Đơn Vị Tính");
    model.addColumn("Chọn");
    
    String sql = "SELECT * FROM  donvitinh";
    try {
        dbConnection = MySQLConnUtils.getMySQLConnection();
        statement = dbConnection.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        int row = 0;
        while ((rs != null) && (rs.next())) {
            model.addRow(new Object[0]);
            model.setValueAt(row+1, row, 0);
            model.setValueAt(rs.getString("Ma_dvt"), row, 1);
            model.setValueAt(rs.getString("Ten_dvt"), row, 2);
            model.setValueAt(false, row, 3); // Checkbox
            
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_tendvt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_madvt = new javax.swing.JTextField();
        btnthem = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnxoa = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        btnsua = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 120, 215));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ĐƠN VỊ TÍNH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

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
        jLabel2.setText("Tên Đơn Vị Tính");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        txt_tendvt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_tendvt.setForeground(new java.awt.Color(0, 120, 215));
        add(txt_tendvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 120, 215));
        jLabel3.setText("Mã Đơn Vị Tính");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txt_madvt.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txt_madvt.setForeground(new java.awt.Color(0, 120, 215));
        add(txt_madvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, 30));

        btnthem.setBackground(new java.awt.Color(0, 120, 215));
        btnthem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnthemMouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Thêm Đơn Vị Tính");

        javax.swing.GroupLayout btnthemLayout = new javax.swing.GroupLayout(btnthem);
        btnthem.setLayout(btnthemLayout);
        btnthemLayout.setHorizontalGroup(
            btnthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnthemLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(33, 33, 33))
        );
        btnthemLayout.setVerticalGroup(
            btnthemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnthemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(btnthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 170, 40));

        btnxoa.setBackground(new java.awt.Color(0, 120, 215));
        btnxoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnxoaMouseClicked(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Xóa Đơn Vị Tính");

        javax.swing.GroupLayout btnxoaLayout = new javax.swing.GroupLayout(btnxoa);
        btnxoa.setLayout(btnxoaLayout);
        btnxoaLayout.setHorizontalGroup(
            btnxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnxoaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel18)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        btnxoaLayout.setVerticalGroup(
            btnxoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnxoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(btnxoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 170, 40));

        btnsua.setBackground(new java.awt.Color(0, 120, 215));
        btnsua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsuaMouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sửa thông tin DVT");

        javax.swing.GroupLayout btnsuaLayout = new javax.swing.GroupLayout(btnsua);
        btnsua.setLayout(btnsuaLayout);
        btnsuaLayout.setHorizontalGroup(
            btnsuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsuaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel19)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        btnsuaLayout.setVerticalGroup(
            btnsuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnsuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        add(btnsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 170, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void reset(){
        txt_madvt.setText("");
        txt_tendvt.setText("");
    }
    private void tbl_dataMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMousePressed
        int row = tbl_data.getSelectedRow();
        String ma_dvt = tbl_data.getValueAt(row, 0).toString();
        Dm_donvitinh dvt = new Dm_donvitinh();
        dvt = DAOdvt.TimDVT(ma_dvt);
        txt_madvt.setText(ma_dvt);
        txt_tendvt.setText(dvt.getTen_dvt());
        txt_madvt.setEditable(false);
    }//GEN-LAST:event_tbl_dataMousePressed

    private void btnthemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnthemMouseClicked
        Dm_donvitinh dvt = new Dm_donvitinh();
        dvt.setMa_dvt(txt_madvt.getText());
        dvt.setTen_dvt(txt_tendvt.getText());
        if(DAOdvt.ThemDVT(dvt)){
            if (txt_madvt.getText().equals("") || txt_tendvt.getText().equals("")) {
                //nếu 1 số ô trong đó để rỗng sẽ đưa ra thông báo
                JOptionPane.showMessageDialog(null, "Bạn chưa nhập đủ thông tin!", "Thông báo", JOptionPane.WARNING_MESSAGE);
            } else {
                //ngược lại thực hiện lấy dữ liệu trong các ô để đưa vào CSDL
                DAOdvt.ThemDVT(dvt);
                txt_madvt.setEditable(true);
                JOptionPane.showMessageDialog(this, "Thêm mới Đơn vị tính thành công!");//đưa ra thông báo khi thực hiện thành công
                loadData();//load lại form
                reset();//xóa dữ liệu trong các ô text
            }
        }else{
            JOptionPane.showMessageDialog(this, "Mã đơn vị tính đã bị trùng!", "Lỗi", JOptionPane.WARNING_MESSAGE);
            loadData();
            reset();
        }

    }//GEN-LAST:event_btnthemMouseClicked

    private void btnxoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnxoaMouseClicked
        Integer confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa các đơn vị tính này không?", "Xóa", 2);
        //khi người dùng ấn đồng ý
        if (confirm == JOptionPane.YES_OPTION) {

            for (int i = 0; i < tbl_data.getRowCount(); i++) {
                Boolean chkDel = Boolean.valueOf(tbl_data.getValueAt(i, 3).toString()); // Checked
                if(chkDel){
                    String dvt = tbl_data.getValueAt(i, 1).toString();

                    DAOdvt.XoaDVT(dvt); // Delete Data
                    reset();
                    txt_madvt.setEditable(true);
                }
            }
            JOptionPane.showMessageDialog(this, "Xóa dữ liệu thành công!");
            loadData(); // Reload Table
        }else{
            reset();
        }
    }//GEN-LAST:event_btnxoaMouseClicked

    private void btnsuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsuaMouseClicked
        Dm_donvitinh dvt = new Dm_donvitinh();
        
        dvt.setMa_dvt(txt_madvt.getText());
        dvt.setTen_dvt(txt_tendvt.getText());

        DAOdvt.SuaDVT(dvt);
        txt_madvt.setEditable(true);
        JOptionPane.showMessageDialog(this, "Cập nhật đơn vị tính thành công!");//đưa ra thông báo khi thực hiện thành công
        loadData();//load lại form
        reset();
    }//GEN-LAST:event_btnsuaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnsua;
    private javax.swing.JPanel btnthem;
    private javax.swing.JPanel btnxoa;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_data;
    private javax.swing.JTextField txt_madvt;
    private javax.swing.JTextField txt_tendvt;
    // End of variables declaration//GEN-END:variables
}
