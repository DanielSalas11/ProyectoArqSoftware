/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import dibujosG.CnvTablero;
import dominio.Tablero;
import java.util.Random;

/**
 *
 * @author Hugo Rivera
 */
public class FrmTablero extends FrmClienteAux {

    /**
     * Creates new form FrmTablero
     */
    private CnvTablero cnvTablero;
    public FrmTablero() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtJugador1 = new javax.swing.JTextField();
        panelTablero = new javax.swing.JPanel();
        panelAreaTablero = new javax.swing.JPanel();
        panelControles = new javax.swing.JPanel();
        txtJugadorTurno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDado = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtJugador = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtSemillas = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtApuestas = new javax.swing.JTextField();
        btnEjercerTurno = new javax.swing.JButton();
        btnApostar = new javax.swing.JButton();
        btnRetirarse = new javax.swing.JButton();
        labelAcciones = new javax.swing.JLabel();
        panelTitulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

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

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));

        jPanel7.setBackground(new java.awt.Color(255, 230, 0));

        txtJugador1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtJugador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador1.setText("Nombre del Jugador");
        txtJugador1.setToolTipText("");
        txtJugador1.setBorder(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtJugador1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTablero.setBackground(new java.awt.Color(0, 153, 255));
        panelTablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAreaTablero.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelAreaTableroLayout = new javax.swing.GroupLayout(panelAreaTablero);
        panelAreaTablero.setLayout(panelAreaTableroLayout);
        panelAreaTableroLayout.setHorizontalGroup(
            panelAreaTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        panelAreaTableroLayout.setVerticalGroup(
            panelAreaTableroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        panelTablero.add(panelAreaTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 710, 630));

        panelControles.setBackground(new java.awt.Color(255, 255, 255));
        panelControles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtJugadorTurno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtJugadorTurno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugadorTurno.setText("Jugador en Turno");
        txtJugadorTurno.setBorder(null);
        panelControles.add(txtJugadorTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 230, -1));

        jLabel1.setText("Numero de mover Fichas");
        panelControles.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 600, -1, -1));

        txtDado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDado.setText("#numero dado");
        panelControles.add(txtDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 230, 0));

        txtJugador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtJugador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtJugador.setText("Nombre del Jugador");
        txtJugador.setToolTipText("");
        txtJugador.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtJugador, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelControles.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 200, 60));

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jPanel5.setBackground(new java.awt.Color(255, 230, 0));

        txtSemillas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSemillas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSemillas.setText("# de Semillas");
        txtSemillas.setToolTipText("");
        txtSemillas.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSemillas, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSemillas, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelControles.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 200, 50));

        jPanel8.setBackground(new java.awt.Color(0, 153, 255));

        jPanel9.setBackground(new java.awt.Color(255, 230, 0));

        txtApuestas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtApuestas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApuestas.setText("# de Apuestas");
        txtApuestas.setToolTipText("");
        txtApuestas.setBorder(null);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtApuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtApuestas, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelControles.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 200, -1));

        btnEjercerTurno.setText("Mover Fichas");
        btnEjercerTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjercerTurnoActionPerformed(evt);
            }
        });
        panelControles.add(btnEjercerTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 30));

        btnApostar.setText("Hacer Apuesta");
        panelControles.add(btnApostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 150, 30));

        btnRetirarse.setText("Retirarse");
        btnRetirarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarseActionPerformed(evt);
            }
        });
        panelControles.add(btnRetirarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 150, 30));

        labelAcciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/PanelAcciones.png"))); // NOI18N
        panelControles.add(labelAcciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        panelTablero.add(panelControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, 700));

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel10.setText("PATOLLI");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(31, 31, 31))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        panelTablero.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 220, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablero, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTablero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarseActionPerformed
        // TODO add your handling code here:
        FrmSalir salir=new FrmSalir(this);
        salir.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnRetirarseActionPerformed

    private void btnEjercerTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjercerTurnoActionPerformed
        // TODO add your handling code here:
        int[] numMovimientos= {1,2,3,4,5,6};
        Random r=new Random();        
      	int randomNumber=r.nextInt(numMovimientos.length);
      	txtDado.setText(numMovimientos[randomNumber]+"");
    }//GEN-LAST:event_btnEjercerTurnoActionPerformed
   private void init(){
       inizializarValores();
       //Dibujando tablero
       Tablero tablero= partida.getTablero();
       cnvTablero=new CnvTablero(tablero.getCasillas(),partida.getNumCasillasAspa(),this.getSize().width);
       tablero.setCasillas(cnvTablero.generarCasillas());
       cnvTablero.setSize(this.getWidth(), partida.getNumCasillasAspa() * 50 + (50 * 5));
       cnvTablero.setLocation(0,0);
       panelAreaTablero.add(cnvTablero);
   }
    /**
     * @param args the command line arguments
     */
   
   private void inizializarValores(){
      txtJugadorTurno.setText(jugador.getNombre());
      txtJugador.setText(jugador.getNombre());
      txtSemillas.setText(jugador.getNumFrijoles()+"");
      txtApuestas.setText("0");
      txtDado.setText("0"); 
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApostar;
    private javax.swing.JButton btnEjercerTurno;
    private javax.swing.JButton btnRetirarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel labelAcciones;
    private javax.swing.JPanel panelAreaTablero;
    private javax.swing.JPanel panelControles;
    private javax.swing.JPanel panelTablero;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTextField txtApuestas;
    private javax.swing.JTextField txtDado;
    private javax.swing.JTextField txtJugador;
    private javax.swing.JTextField txtJugador1;
    private javax.swing.JTextField txtJugadorTurno;
    private javax.swing.JTextField txtSemillas;
    // End of variables declaration//GEN-END:variables
}
