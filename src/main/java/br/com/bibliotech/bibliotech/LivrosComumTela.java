/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.bibliotech.bibliotech;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author unity
 */
public class LivrosComumTela extends javax.swing.JFrame {
    /**
     * Creates new form LivrosComumTela
     */
    public LivrosComumTela() {
        super ("Livros");
        initComponents();
        buscarLivros();
        setLocationRelativeTo(null);   
    }

    LivrosComumTela(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     private void buscarLivros (){
    try{
    DAO dao = new DAO();
    Livros [] livro = dao.obterLivros();
    livrosComboBox.setModel(new DefaultComboBoxModel<>(livro));
    }
    catch (Exception e){
    JOptionPane.showMessageDialog(null, "Livros indisponíveis, tente novamente mais tarde.");
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

        livrosAdminPanel = new javax.swing.JPanel();
        idLivroTextField = new javax.swing.JTextField();
        nomeLivroTextField = new javax.swing.JTextField();
        autorLivroTextField = new javax.swing.JTextField();
        editoraLivroTextField = new javax.swing.JTextField();
        paginasLivroTextField = new javax.swing.JTextField();
        adicionarLivroButton = new javax.swing.JButton();
        cancelarLivroButton = new javax.swing.JButton();
        generoLivroTextField = new javax.swing.JTextField();
        livrosComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        livrosAdminPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Gerenciamento de Livros"));

        idLivroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        idLivroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idLivroTextFieldActionPerformed(evt);
            }
        });

        nomeLivroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        autorLivroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Autor"));

        editoraLivroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Editora"));
        editoraLivroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editoraLivroTextFieldActionPerformed(evt);
            }
        });

        paginasLivroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Número de Páginas"));

        adicionarLivroButton.setText("Novo");
        adicionarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarLivroButtonActionPerformed(evt);
            }
        });

        cancelarLivroButton.setText("Cancelar");
        cancelarLivroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLivroButtonActionPerformed(evt);
            }
        });

        generoLivroTextField.setBorder(javax.swing.BorderFactory.createTitledBorder("Gênero"));
        generoLivroTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoLivroTextFieldActionPerformed(evt);
            }
        });

        livrosComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livrosComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout livrosAdminPanelLayout = new javax.swing.GroupLayout(livrosAdminPanel);
        livrosAdminPanel.setLayout(livrosAdminPanelLayout);
        livrosAdminPanelLayout.setHorizontalGroup(
            livrosAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livrosAdminPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(livrosAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, livrosAdminPanelLayout.createSequentialGroup()
                        .addComponent(adicionarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(cancelarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(idLivroTextField)
                    .addComponent(livrosComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomeLivroTextField)
                    .addComponent(autorLivroTextField)
                    .addComponent(editoraLivroTextField)
                    .addComponent(generoLivroTextField)
                    .addComponent(paginasLivroTextField))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        livrosAdminPanelLayout.setVerticalGroup(
            livrosAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(livrosAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(livrosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(idLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nomeLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(autorLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editoraLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generoLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paginasLivroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(livrosAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarLivroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(livrosAdminPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(livrosAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idLivroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idLivroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idLivroTextFieldActionPerformed

    private void editoraLivroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editoraLivroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editoraLivroTextFieldActionPerformed

    private void adicionarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarLivroButtonActionPerformed
        String nomeLivros = nomeLivroTextField.getText();
        String autorLivros = autorLivroTextField.getText();
        String editoraLivros = editoraLivroTextField.getText();
        String generoLivros = generoLivroTextField.getText();
        String paginasLivros = paginasLivroTextField.getText();
        if (nomeLivros == null || nomeLivros.length() == 0 ||
            autorLivros == null || autorLivros.length() == 0 ||
            editoraLivros == null || editoraLivros.length() == 0 ||
            generoLivros == null || generoLivros.length() == 0 ||
            paginasLivros == null || paginasLivros.length() == 0){
            JOptionPane.showMessageDialog (null, "Preencha os dados do livro");
        }
        else{
            try{
                int escolha = JOptionPane.showConfirmDialog(null, "Confirmar cadastro do novo livro?");
                if (escolha == JOptionPane.YES_OPTION){
                }
                Livros livro = new Livros ( nomeLivros, autorLivros, editoraLivros, generoLivros, paginasLivros);
                DAO dao = new DAO();
                dao.inserirLivros(livro);
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
                buscarLivros();
                nomeLivroTextField.setText("");
                autorLivroTextField.setText("");
                editoraLivroTextField.setText("");
                generoLivroTextField.setText("");
                paginasLivroTextField.setText("");
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Falha técnica, tente mais tarde");
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_adicionarLivroButtonActionPerformed

    private void cancelarLivroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLivroButtonActionPerformed
        DashboardComumTela dt = new DashboardComumTela();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarLivroButtonActionPerformed

    private void generoLivroTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoLivroTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoLivroTextFieldActionPerformed

    private void livrosComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livrosComboBoxActionPerformed
        Livros livro = (Livros) livrosComboBox.getSelectedItem();
        idLivroTextField.setText(Integer.toString(livro.getId()));
        nomeLivroTextField.setText(livro.getNome());
        autorLivroTextField.setText(livro.getAutor());
        editoraLivroTextField.setText(livro.getEditora());
        generoLivroTextField.setText(livro.getGenero());
        paginasLivroTextField.setText(livro.getPaginas());
    }//GEN-LAST:event_livrosComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(LivrosComumTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivrosComumTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivrosComumTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivrosComumTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivrosComumTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarLivroButton;
    private javax.swing.JTextField autorLivroTextField;
    private javax.swing.JButton cancelarLivroButton;
    private javax.swing.JTextField editoraLivroTextField;
    private javax.swing.JTextField generoLivroTextField;
    private javax.swing.JTextField idLivroTextField;
    private javax.swing.JPanel livrosAdminPanel;
    private javax.swing.JComboBox<Livros> livrosComboBox;
    private javax.swing.JTextField nomeLivroTextField;
    private javax.swing.JTextField paginasLivroTextField;
    // End of variables declaration//GEN-END:variables

}

