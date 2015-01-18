package procesoso;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Principal extends javax.swing.JFrame {
    DateFormat df;
    ListaProceso lp=new ListaProceso();
    Proceso p;
    DateFormat hora;
    DefaultTableModel modelo;
    DefaultTableModel tablaSO;
    DefaultTableModel tDir,tDir1;
    int cod=0;
    
    private File file;
    private boolean hasLoaded = false;
    private String owner;
//    private Map<Timefield, Date> timefields = new HashMap<Timefield, Date>();
//    DateFormat dateformat = DateFormat.getDateInstance();
//    DateFormat horaformat = new SimpleDateFormat("HH:mm:ss");
        
    public Principal() {
        initComponents();
        df = DateFormat.getDateInstance();        
        hora = new SimpleDateFormat("HH:mm:ss");    
        modelo = (DefaultTableModel)jTable1.getModel();
        tablaSO = (DefaultTableModel)tSO.getModel();
        tDir = (DefaultTableModel)tDireccion.getModel();
        tDir1 = (DefaultTableModel)tDireccion1.getModel();
        DefaultTableCellRenderer tcC;
        
        tcC= new DefaultTableCellRenderer();
        tcC.setHorizontalAlignment(0);
        jTable1.getTableHeader().setReorderingAllowed(false) ;

        jTable1.getColumnModel().getColumn(0).setHeaderRenderer(tcC);        
        jTable1.getColumnModel().getColumn(1).setHeaderRenderer(tcC);
        jTable1.getColumnModel().getColumn(2).setHeaderRenderer(tcC);
        jTable1.getColumnModel().getColumn(3).setHeaderRenderer(tcC);
        jTable1.getColumnModel().getColumn(4).setHeaderRenderer(tcC);
        jTable1.getColumnModel().getColumn(5).setHeaderRenderer(tcC);
        jTable1.getColumnModel().getColumn(6).setHeaderRenderer(tcC);
        ActTxt(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        lnombre = new javax.swing.JLabel();
        lurl = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        txtTamano = new javax.swing.JTextField();
        ltamano = new javax.swing.JLabel();
        ltipo = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        lfechac = new javax.swing.JLabel();
        lhorac = new javax.swing.JLabel();
        txtFechaCreacion = new javax.swing.JTextField();
        txtHoraCreacion = new javax.swing.JTextField();
        btnSeleccionar = new javax.swing.JButton();
        btnEjecutar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tSO = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlatos = new javax.swing.JTextField();
        txtPistas = new javax.swing.JTextField();
        txtSectores = new javax.swing.JTextField();
        txtBytes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        cboProcesos = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tDireccion = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tDireccion1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 390, -1));

        lnombre.setText("Nombre:");
        jPanel1.add(lnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 50, -1));

        lurl.setText("URL:");
        jPanel1.add(lurl, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 110, 30, -1));
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 160, -1));
        jPanel1.add(txtTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 160, -1));

        ltamano.setText("Tamaño:");
        jPanel1.add(ltamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, 50, -1));

        ltipo.setText("Tipo:");
        jPanel1.add(ltipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 50, 30, -1));
        jPanel1.add(txtUrl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 390, -1));

        lfechac.setText("Fecha Creación:");
        jPanel1.add(lfechac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        lhorac.setText("Hora Creación:");
        jPanel1.add(lhorac, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));
        jPanel1.add(txtFechaCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 120, -1));
        jPanel1.add(txtHoraCreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, -1));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, -1));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutar(evt);
            }
        });
        jPanel1.add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 120, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 470, 210));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROCESOS DEL SISTEMA OPERATIVO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1030, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Tipo", "URL", "F.Creación", "H.Creación", "Tamaño", "FAT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 670, 150));

        tSO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SO", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tSO.setRowHeight(22);
        jScrollPane2.setViewportView(tSO);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 160, 280));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Platos:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setText("Pistas:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel4.setText("Sectores:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel5.setText("Bytes:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        jPanel3.add(txtPlatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 80, -1));
        jPanel3.add(txtPistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 80, -1));
        jPanel3.add(txtSectores, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, -1));
        jPanel3.add(txtBytes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 80, -1));

        jLabel6.setText("Capacidad:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtCapacidad.setEditable(false);
        jPanel3.add(txtCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, -1));
        txtCapacidad.getAccessibleContext().setAccessibleDescription("");

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel3.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 210));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.add(cboProcesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        jButton1.setText("Finalizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 160, 90));

        tDireccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FAT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDireccion.setRowHeight(22);
        jScrollPane3.setViewportView(tDireccion);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 100, 380));

        tDireccion1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tDireccion1.setRowHeight(22);
        jScrollPane4.setViewportView(tDireccion1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 100, 380));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int fil;
        String Proceso,value,val;        
        Proceso = cboProcesos.getSelectedItem().toString();
        int x = cboProcesos.getSelectedIndex();
        
                 
        int n=tSO.getRowCount();
        int m= tSO.getColumnCount();      
        value="";
        for(fil=0;fil<n;fil++){
            for(int col=0; col <m; col++){
                //Obtiene dato contenido en una celda de la tabla
                
                value = tSO.getValueAt(fil, col).toString();  
                 if(value.equals(Proceso)){
                     tSO.setValueAt("", fil, col);
                     tSO.setValueAt("", fil, (col+1));
                 }
            }
        }
        cboProcesos.removeItemAt(x);
        
        
         //DefaultTableModel miT = (DefaultTableModel) jTable1.getModel();
        val="";
        int w = jTable1.getRowCount();            
        int fl,fx=0;
        for(fl=0;fl<w;fl++){
            val="";
            val = jTable1.getValueAt(fl, 0).toString();             
            if(value.equals(Proceso)){                    
                //fx = Integer.parseInt(jTable1.getValueAt(fil,0).toString());
                fx = fl;
            }
        }
        modelo.removeRow(fx);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        if(this.txtPlatos.getText().equals("") || this.txtPistas.getText().equals("") || this.txtSectores.getText().equals("") || this.txtBytes.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingresar Cantidad");
        }
        else{
            int platos,pistas,sectores,bytes,capacidad;
            platos = Integer.parseInt(txtPlatos.getText());
            pistas = Integer.parseInt(txtPistas.getText());
            sectores = Integer.parseInt(txtSectores.getText());
            bytes = Integer.parseInt(txtBytes.getText());
            capacidad = platos*2*pistas*sectores*bytes;
            txtCapacidad.setText(""+capacidad);
            ActTxt(true);
            ActProc(false);
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnEjecutar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutar
        // TODO add your handling code here:
        String nom,tip,url,fcrea,hcrea;
        double tam;
        nom = txtNombre.getText();
        tip = txtTipo.getText();
        url = txtUrl.getText();
        tam = Double.parseDouble(txtTamano.getText());
        fcrea = txtFechaCreacion.getText();
        hcrea = txtHoraCreacion.getText();
        this.cboProcesos.addItem(nom);

        modelo.addRow(new Object[]{nom,tip,url,fcrea,hcrea,tam});
        
        String Fat="",vx;

        int bytes = Integer.parseInt(txtBytes.getText());
        double bloques=Math.ceil(tam/bytes);
        int z = tSO.getRowCount();
        
        if(tSO.getRowCount()>0){
            for(int fil=0;fil<z;fil++){        
                vx = tSO.getValueAt(fil, 1).toString();  
                if(vx.equals("")){                     
                    //tSO.setValueAt("", fil, col);
                    //tSO.setValueAt("", fil, (col+1));
                }           
            }        
        }
        
        
        System.out.println(""+tSO.getRowCount());
        for(int i=1;i<=bloques;i++){
            if (tSO.getRowCount()==0){
                lp.crearprimerproceso(cod, nom, tam);
                p=lp.listaprocesos();
                System.out.println(""+tSO.getRowCount());
            }
            else{
                cod++;
                lp.crearproyecto(cod, nom, tam);
            }
            String hex="00"+Integer.toHexString(cod).toUpperCase();
            tablaSO.addRow(new Object[] {nom,hex});
            tDir.addRow(new Object[] {hex} ); 
            if(i==1){
                Fat = hex;
            }
            if(i!=bloques){
                String hd="00"+Integer.toHexString(cod+1).toUpperCase();
                tDir1.addRow(new Object[] {hd});
            }
            else{
                tDir1.addRow(new Object[] {"FFFF"});
            }
        }
        
        int n = modelo.getRowCount()-1;        
        modelo.setValueAt(Fat, n,6);
        Clear();
    }//GEN-LAST:event_btnEjecutar
    
    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        try{
            Clear();
            JFileChooser jf = new JFileChooser(".");
            //JFileChooser jf = new JFileChooser();
            jf.setMultiSelectionEnabled(false);
            int escoja = jf.showOpenDialog(null);            
            if(escoja==JFileChooser.APPROVE_OPTION){
                File f = jf.getSelectedFile();
                                
                this.txtNombre.setText(f.getName());
                this.txtTipo.setText(getExtension(f.getName()));
                this.txtUrl.setText(f.getAbsolutePath());
                this.txtTamano.setText(""+f.length());
                String fc = df.format(f.lastModified());
                String hc = hora.format(f.lastModified());
                this.txtFechaCreacion.setText(fc);
                this.txtHoraCreacion.setText(hc);
                //this.txtNombre.setText(file.getName());                
                //this.txtTipo.setText(file.getExt());
                //this.txtUrl.setText(file.getAbsolutePath());
                //this.txtTamano.setText(""+file.getSize());
                //ArchivoInfo file = new ArchivoInfo(f);
                //String fc = df.format(file.getCreated());
                //String hc = hora.format(file.getCreated());
            }
        }catch(Exception e)  {System.out.println(e);}
    }//GEN-LAST:event_btnSeleccionarActionPerformed

      public static String getExtension(String filename) {
            int index = filename.lastIndexOf('.');
            if (index == -1) {
                  return "*.";
            } else {
                  return "*."+filename.substring(index + 1);
            }
      }
    public void ActTxt(boolean X){
        txtNombre.setEnabled(X);
        txtTipo.setEnabled(X);
        txtUrl.setEnabled(X);
        txtTamano.setEnabled(X);
        txtFechaCreacion.setEnabled(X);
        txtHoraCreacion.setEnabled(X);
        btnSeleccionar.setEnabled(X);
        btnEjecutar.setEnabled(X);
    }
    public void ActProc(boolean X){
        txtPlatos.setEnabled(X);
        txtSectores.setEnabled(X);
        txtPistas.setEnabled(X);
        txtBytes.setEnabled(X);
        btnProcesar.setEnabled(X);
    }        
    public void Clear(){
        this.txtNombre.setText("");
        this.txtTipo.setText("");
        this.txtUrl.setText("");
        this.txtTamano.setText("");
        this.txtFechaCreacion.setText("");
        this.txtHoraCreacion.setText("");          
    }
    public void convertirHexa(int num){
        
    }
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox cboProcesos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lfechac;
    private javax.swing.JLabel lhorac;
    private javax.swing.JLabel lnombre;
    private javax.swing.JLabel ltamano;
    private javax.swing.JLabel ltipo;
    private javax.swing.JLabel lurl;
    private javax.swing.JTable tDireccion;
    private javax.swing.JTable tDireccion1;
    private javax.swing.JTable tSO;
    private javax.swing.JTextField txtBytes;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtFechaCreacion;
    private javax.swing.JTextField txtHoraCreacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPistas;
    private javax.swing.JTextField txtPlatos;
    private javax.swing.JTextField txtSectores;
    private javax.swing.JTextField txtTamano;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables
}
