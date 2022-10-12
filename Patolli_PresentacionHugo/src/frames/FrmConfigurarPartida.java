/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frames;

import dominio.Jugador;
import dominio.Partida;
import java.util.ArrayList;

/**
 *
 * @author Daniel Salas
 */
public class FrmConfigurarPartida extends FrmClienteAux {

    /**
     * 
     */
    private static FrmSeleccion frmSeleccion;
    public static int numCasillas;
    private final int MIN_CASILLAS = 8;
    private final int MAX_CASILLAS = 14;
    public static int numFichas;
    private final int MIN_FICHAS = 2;
    private final int MAX_FICHAS = 6;
    public static int numFondoApuesta;
    private final int MIN_FONDO = 10;
    private final int MAX_FONDO = 10000;
    public static int numMontoApuesta;
    private final int MIN_MONTO = 1;
    private int MAX_MONTO = 10;
    public FrmConfigurarPartida() {
        super();
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void init(){
        inicializarValores();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnMenosFondos = new javax.swing.JButton();
        btnMasValorApuesta = new javax.swing.JButton();
        lblNumCasillas = new javax.swing.JLabel();
        btnMenosValorApuesta = new javax.swing.JButton();
        lblMontoApuesta = new javax.swing.JLabel();
        btnMenosFichas = new javax.swing.JButton();
        lblFondoApuesta = new javax.swing.JLabel();
        btnMasFichas = new javax.swing.JButton();
        lblNumFichas = new javax.swing.JLabel();
        btnMasCasillas = new javax.swing.JButton();
        btnMenosCasillas = new javax.swing.JButton();
        btnMasFondos = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(500, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btnCancelar2.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        btnMenosFondos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn -.png"))); // NOI18N
        btnMenosFondos.setBorder(null);
        btnMenosFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosFondosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenosFondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 40, 40));

        btnMasValorApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn +.png"))); // NOI18N
        btnMasValorApuesta.setBorder(null);
        btnMasValorApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasValorApuestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMasValorApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 40, 40));

        lblNumCasillas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumCasillas.setText("0");
        jPanel1.add(lblNumCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 70, 40));

        btnMenosValorApuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn -.png"))); // NOI18N
        btnMenosValorApuesta.setBorder(null);
        btnMenosValorApuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosValorApuestaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenosValorApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 40, 40));

        lblMontoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMontoApuesta.setText("0");
        jPanel1.add(lblMontoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 50, 40));

        btnMenosFichas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn -.png"))); // NOI18N
        btnMenosFichas.setBorder(null);
        btnMenosFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosFichasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenosFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 40, 40));

        lblFondoApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFondoApuesta.setText("0");
        jPanel1.add(lblFondoApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 50, 40));

        btnMasFichas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn +.png"))); // NOI18N
        btnMasFichas.setBorder(null);
        btnMasFichas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasFichasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMasFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 40, 40));

        lblNumFichas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumFichas.setText("0");
        jPanel1.add(lblNumFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 60, 40));

        btnMasCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn +.png"))); // NOI18N
        btnMasCasillas.setBorder(null);
        btnMasCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCasillasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMasCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 40, 40));

        btnMenosCasillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn -.png"))); // NOI18N
        btnMenosCasillas.setBorder(null);
        btnMenosCasillas.setMaximumSize(null);
        btnMenosCasillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosCasillasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenosCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 40, 40));

        btnMasFondos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btn +.png"))); // NOI18N
        btnMasFondos.setBorder(null);
        btnMasFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasFondosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMasFondos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 40, 40));

        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/btnCrear2.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dibujos/FrmConfiguracion.png"))); // NOI18N
        jLabel6.setMaximumSize(null);
        jLabel6.setMinimumSize(new java.awt.Dimension(500, 600));
        jLabel6.setPreferredSize(new java.awt.Dimension(500, 600));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Evento que crea el frmSeleccion y configura la partida.
     *
     * @param evt
     */
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
         ArrayList<Jugador> jugadores =new ArrayList<>();
        for (int i = 0; i < 4; i++) {
          Jugador jug=new Jugador();
          jugadores.add(jug);
        }
        partida.setFondoApuesta(numFondoApuesta);
        partida.setNumCasillasAspa(numCasillas);
        partida.setNumFichasJugador(numFichas);
        partida.setValorApuesta(numMontoApuesta);
        partida.setJugadores(jugadores);
                 if (!partida.getJugadores().get(0).isAsignado()) {
                        jugador = partida.getJugadores().get(0);
                        jugador.setAsignado(true);
                        jugador.setNumFrijoles(numFichas);
                        partida.getJugadores().set(0, jugador);
                 }
        partida.setJugadorTurno(jugador); 
        
        getFrmSeleccion().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCrearActionPerformed
    /**
     * Evento que representa cancelar la configuracion donde se regresa a el frm de inicio
     *
     * @param evt
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        getFrmInicio().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    /**
     * Evento que incrementa las casillas en la configuración.
     *
     * @param evt
     */
    private void btnMasCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCasillasActionPerformed
        // TODO add your handling code here:
        if (numCasillas != MAX_CASILLAS) {
            numCasillas += 2;
            lblNumCasillas.setText(numCasillas + "");
        }
    }//GEN-LAST:event_btnMasCasillasActionPerformed
    /**
     * Evento que decrementa las casillas en la configuración.
     *
     * @param evt
     */
    private void btnMenosCasillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosCasillasActionPerformed
        // TODO add your handling code here:
        if (numCasillas != MIN_CASILLAS) {
            numCasillas -= 2;
            lblNumCasillas.setText(numCasillas + "");
        }
    }//GEN-LAST:event_btnMenosCasillasActionPerformed
    /**
     * Evento que decrementa los fondos en la configuración.
     *
     * @param evt
     */
    private void btnMenosFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosFondosActionPerformed
        // TODO add your handling code here:
        if (numFondoApuesta != MIN_FONDO) {
            numFondoApuesta -= 10;
            MAX_MONTO = numFondoApuesta;
            if (numMontoApuesta > numFondoApuesta) {
                numMontoApuesta = numFondoApuesta;
            }
            lblFondoApuesta.setText(numFondoApuesta + "");
            lblMontoApuesta.setText(numMontoApuesta + "");
        }
    }//GEN-LAST:event_btnMenosFondosActionPerformed
    /**
     * Evento que incrementa los fondos en la configuración.
     *
     * @param evt
     */
    private void btnMasFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasFondosActionPerformed
        // TODO add your handling code here:
        if (numFondoApuesta != MAX_FONDO) {
            numFondoApuesta += 10;
            MAX_MONTO = numFondoApuesta;
            if (numMontoApuesta > numFondoApuesta) {
                numMontoApuesta = numFondoApuesta;
            }
            lblFondoApuesta.setText(numFondoApuesta + "");
            lblMontoApuesta.setText(numMontoApuesta + "");
        }
    }//GEN-LAST:event_btnMasFondosActionPerformed
    /**
     * Evento que decrementa el tamaño de la apuesta en la configuración.
     *
     * @param evt
     */
    private void btnMenosValorApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosValorApuestaActionPerformed
        // TODO add your handling code here:
        if (numMontoApuesta != MIN_MONTO) {
            numMontoApuesta -= 1;
            lblMontoApuesta.setText(numMontoApuesta + "");
        }
    }//GEN-LAST:event_btnMenosValorApuestaActionPerformed
    /**
     * Evento que incrementa el tamaño de la apuesta  en la configuración.
     *
     * @param evt
     */
    private void btnMasValorApuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasValorApuestaActionPerformed
        // TODO add your handling code here:
        if (numMontoApuesta != MAX_MONTO) {
            numMontoApuesta += 1;
            lblMontoApuesta.setText(numMontoApuesta + "");
        }
    }//GEN-LAST:event_btnMasValorApuestaActionPerformed
    /**
     * Evento que decrementa la cantidad de fichas
     *
     * @param evt
     */
    private void btnMenosFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosFichasActionPerformed
        // TODO add your handling code here:
         if (numFichas != MIN_FICHAS) {
            numFichas--;
            lblNumFichas.setText(numFichas + "");
        }
    }//GEN-LAST:event_btnMenosFichasActionPerformed
     /**
     * Evento que incrementa la cantidad de fichas
     *
     * @param evt
     */
    private void btnMasFichasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasFichasActionPerformed
        // TODO add your handling code here:
         if (numFichas != MAX_FICHAS) {
            numFichas++;
            lblNumFichas.setText(numFichas + "");
        }
    }//GEN-LAST:event_btnMasFichasActionPerformed

   
    /**
     * Método de singleton para obtener la instancia de FrmSeleccion
     * @return Instancia de FrmSeleccion
     */
    public static FrmSeleccion getFrmSeleccion() {
        if(frmSeleccion==null){
            frmSeleccion=new FrmSeleccion();
        }
        return frmSeleccion;
    }
    /**
     * Inicializa los valores de casillas, fichas y fondo con el valor minimo.
     */
    private void inicializarValores() {
        numCasillas = MIN_CASILLAS;
        numFichas = MIN_FICHAS;
        numFondoApuesta = MIN_FONDO;
        numMontoApuesta = MIN_MONTO;

        lblNumCasillas.setText(numCasillas + "");
        lblNumFichas.setText(numFichas + "");
        lblFondoApuesta.setText(numFondoApuesta + "");
        lblMontoApuesta.setText(numMontoApuesta + "");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnMasCasillas;
    private javax.swing.JButton btnMasFichas;
    private javax.swing.JButton btnMasFondos;
    private javax.swing.JButton btnMasValorApuesta;
    private javax.swing.JButton btnMenosCasillas;
    private javax.swing.JButton btnMenosFichas;
    private javax.swing.JButton btnMenosFondos;
    private javax.swing.JButton btnMenosValorApuesta;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondoApuesta;
    private javax.swing.JLabel lblMontoApuesta;
    private javax.swing.JLabel lblNumCasillas;
    private javax.swing.JLabel lblNumFichas;
    // End of variables declaration//GEN-END:variables
}
