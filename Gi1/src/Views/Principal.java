
package Views;

import Models.Itiz;
import java.util.ArrayList;


public class Principal extends javax.swing.JFrame {

  
    public Principal() {
        initComponents();
        ITIZ = new ArrayList<Itiz>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButtonEstudiantes = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonDirectivo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonDocentes = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButtonAdmin = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButtonSalir = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jToolBar1.setForeground(new java.awt.Color(0, 0, 153));
        jToolBar1.setRollover(true);

        jButtonEstudiantes.setText("Estudiantes");
        jButtonEstudiantes.setFocusable(false);
        jButtonEstudiantes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEstudiantes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstudiantesActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonEstudiantes);
        jToolBar1.add(jSeparator1);

        jButtonDirectivo.setText("Directivo");
        jButtonDirectivo.setFocusable(false);
        jButtonDirectivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDirectivo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonDirectivo);
        jToolBar1.add(jSeparator2);

        jButtonDocentes.setText("Docentes");
        jButtonDocentes.setFocusable(false);
        jButtonDocentes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDocentes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonDocentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDocentesActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonDocentes);
        jToolBar1.add(jSeparator3);

        jButtonAdmin.setText("Administrativo");
        jButtonAdmin.setFocusable(false);
        jButtonAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButtonAdmin);
        jToolBar1.add(jSeparator4);

        jButtonSalir.setText("Salir");
        jButtonSalir.setFocusable(false);
        jButtonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSalir);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstudiantesActionPerformed
        if(!(Estudiantes instanceof JEstudiantes)){
            Estudiantes = new JEstudiantes();
            Escritorio.add(Estudiantes);
            Estudiantes.setVisible(true);
        }else{
            Estudiantes.setVisible(true);
        }
        Estudiantes.setArrayList(ITIZ);
    }//GEN-LAST:event_jButtonEstudiantesActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonDocentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDocentesActionPerformed
        if(!(Docentes instanceof JDocentes)){
            Docentes = new JDocentes();
            Escritorio.add(Docentes);
            Docentes.setVisible(true);
        }else{
            Docentes.setVisible(true);
        }
        Docentes.setArrayList(ITIZ);
    }//GEN-LAST:event_jButtonDocentesActionPerformed

    //Declaraciones Private
    ArrayList<Itiz> ITIZ;
    JEstudiantes Estudiantes;
    JDocentes Docentes;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonDirectivo;
    private javax.swing.JButton jButtonDocentes;
    private javax.swing.JButton jButtonEstudiantes;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
