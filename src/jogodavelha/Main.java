
package jogodavelha;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private Tabuleiro obj;
    public Main() {
        initComponents();
        setLocationRelativeTo(null);  //centraliza a tela
         obj = new Tabuleiro();
        
    }
    
    private void limpatabuleiro(){
        
        Lin0Col0.setEnabled(true);
        Lin0Col1.setEnabled(true);
        Lin0Col2.setEnabled(true);
        Lin1Col0.setEnabled(true);
        Lin1Col1.setEnabled(true);
        Lin1Col2.setEnabled(true);
        Lin2Col0.setEnabled(true);
        Lin2Col1.setEnabled(true);
        Lin2Col2.setEnabled(true);
        Lin0Col0.setText("");
        Lin0Col1.setText("");
        Lin0Col2.setText("");
        Lin1Col0.setText("");
        Lin1Col1.setText("");
        Lin1Col2.setText("");
        Lin2Col0.setText("");
        Lin2Col1.setText("");
        Lin2Col2.setText("");
        jLabelvitoriasX.setText(String.valueOf(obj.getVitoriasX())); //pega o valor de vitorias de X
        jLabelvitoriasO.setText(String.valueOf(obj.getVitoriasO())); //pega o valor de vitorias de O
        jLabelempates.setText(String.valueOf(obj.getEmpates())); //pega o valor de empates
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Lin0Col0 = new javax.swing.JButton();
        Lin0Col1 = new javax.swing.JButton();
        Lin0Col2 = new javax.swing.JButton();
        Lin1Col0 = new javax.swing.JButton();
        Lin1Col1 = new javax.swing.JButton();
        Lin1Col2 = new javax.swing.JButton();
        Lin2Col0 = new javax.swing.JButton();
        Lin2Col1 = new javax.swing.JButton();
        Lin2Col2 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelvitoriasX = new javax.swing.JLabel();
        jLabelvitoriasO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelempates = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);

        Lin0Col0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin0Col0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin0Col0ActionPerformed(evt);
            }
        });

        Lin0Col1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin0Col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin0Col1ActionPerformed(evt);
            }
        });

        Lin0Col2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin0Col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin0Col2ActionPerformed(evt);
            }
        });

        Lin1Col0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin1Col0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin1Col0ActionPerformed(evt);
            }
        });

        Lin1Col1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin1Col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin1Col1ActionPerformed(evt);
            }
        });

        Lin1Col2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin1Col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin1Col2ActionPerformed(evt);
            }
        });

        Lin2Col0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin2Col0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin2Col0ActionPerformed(evt);
            }
        });

        Lin2Col1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin2Col1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin2Col1ActionPerformed(evt);
            }
        });

        Lin2Col2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lin2Col2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lin2Col2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Lin2Col0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lin0Col0, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(Lin1Col0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lin1Col1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lin1Col2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lin0Col1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lin0Col2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lin2Col1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Lin2Col2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Lin0Col0, Lin0Col1, Lin0Col2, Lin1Col0});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lin0Col1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lin0Col2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(Lin0Col0, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lin1Col0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lin1Col2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lin1Col1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lin2Col0, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lin2Col1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lin2Col2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Lin0Col0, Lin0Col1, Lin0Col2});

        jButton17.setText("Sair");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jLabel3.setText("Jogador X:");

        jLabel4.setText("Jogador O:");

        jLabelvitoriasX.setText("0");

        jLabelvitoriasO.setText("0");

        jLabel5.setText("Empates:");

        jLabelempates.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelempates)
                            .addComponent(jLabelvitoriasX, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelvitoriasO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelvitoriasX, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jLabel4)
                    .addComponent(jLabelvitoriasO, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelempates))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lin0Col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin0Col2ActionPerformed
        Lin0Col2.setEnabled(false);
        String a = Lin0Col2.getText();
        Lin0Col2.setText(obj.preenche(a,0,2));//verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){ //verifica vitoria se true começa denovo
            limpatabuleiro(); //se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin0Col2ActionPerformed

    private void Lin0Col1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin0Col1ActionPerformed
        Lin0Col1.setEnabled(false);
        String a = Lin0Col1.getText();
        Lin0Col1.setText(obj.preenche(a,0,1));//verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin0Col1ActionPerformed

    private void Lin1Col1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin1Col1ActionPerformed
        Lin1Col1.setEnabled(false);
        String a = Lin1Col1.getText();
        Lin1Col1.setText(obj.preenche(a,1,1));//verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin1Col1ActionPerformed

    private void Lin1Col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin1Col2ActionPerformed
        Lin1Col2.setEnabled(false);
        String a = Lin1Col2.getText();
        Lin1Col2.setText(obj.preenche(a,1,2));//verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin1Col2ActionPerformed

    private void Lin2Col1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin2Col1ActionPerformed
       Lin2Col1.setEnabled(false); 
       String a = Lin2Col1.getText();
        Lin2Col1.setText(obj.preenche(a,2,1)); //verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin2Col1ActionPerformed

    private void Lin2Col2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin2Col2ActionPerformed
       Lin2Col2.setEnabled(false);
       String a = Lin2Col2.getText();
       Lin2Col2.setText(obj.preenche(a,2,2));//verifica matriz para preencher o X ou O
       if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
       
    }//GEN-LAST:event_Lin2Col2ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    System.exit(-1);  
    }//GEN-LAST:event_jButton17ActionPerformed

    private void Lin0Col0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin0Col0ActionPerformed
        Lin0Col0.setEnabled(false);
        String a = Lin0Col0.getText();
        Lin0Col0.setText(obj.preenche(a,0,0));//verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin0Col0ActionPerformed

    private void Lin1Col0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin1Col0ActionPerformed
        Lin1Col0.setEnabled(false);
        String a = Lin1Col0.getText();
        Lin1Col0.setText(obj.preenche(a,1,0));//verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin1Col0ActionPerformed

    private void Lin2Col0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lin2Col0ActionPerformed
        Lin2Col0.setEnabled(false);
        String a = Lin2Col0.getText();
        Lin2Col0.setText(obj.preenche(a,2,0));//verifica matriz para preencher o X ou O
        if (obj.verificarvitoria()){//verifica vitoria se true começa denovo
            limpatabuleiro();//se verdadeiro começa denovo
        }
        
    }//GEN-LAST:event_Lin2Col0ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lin0Col0;
    private javax.swing.JButton Lin0Col1;
    private javax.swing.JButton Lin0Col2;
    private javax.swing.JButton Lin1Col0;
    private javax.swing.JButton Lin1Col1;
    private javax.swing.JButton Lin1Col2;
    private javax.swing.JButton Lin2Col0;
    private javax.swing.JButton Lin2Col1;
    private javax.swing.JButton Lin2Col2;
    private javax.swing.JButton jButton17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelempates;
    private javax.swing.JLabel jLabelvitoriasO;
    private javax.swing.JLabel jLabelvitoriasX;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
