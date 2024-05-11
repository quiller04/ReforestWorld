/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package RW.forms;

import RW.Tabbed.TabbedForm;
import RW.controller_dao.ConexaoController;
import java.sql.SQLException;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class EventoIndividualTela extends TabbedForm {

    /**
     * Creates new form CadastroEventosTela
     */
    public EventoIndividualTela() {
        initComponents();
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
        localTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricaoTextArea = new javax.swing.JTextArea();
        nomeEventoTextField = new javax.swing.JTextField();
        dataEventoTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cadastrarEventoButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();

        descricaoTextArea.setColumns(20);
        descricaoTextArea.setRows(5);
        jScrollPane1.setViewportView(descricaoTextArea);

        jLabel1.setText("Nome do evento");

        jLabel2.setText("Local do evento");

        jLabel3.setText("Data do evento");

        jLabel4.setText("Descrição do evento");

        cadastrarEventoButton.setText("Cadastrar evento");
        cadastrarEventoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEventoButtonActionPerformed(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(525, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(limparButton)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrarEventoButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(dataEventoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(localTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeEventoTextField, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(113, 113, 113))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeEventoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(localTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataEventoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarEventoButton)
                    .addComponent(limparButton))
                .addContainerGap(298, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // chama a ação do botão cadastrar
    private void cadastrarEventoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEventoButtonActionPerformed
        String mensagemErro = verificarCamposCadastro();
        if ( 1 == 1// mensagemErro.isEmpty()
                ) {

        formClose();
        } else{
            JOptionPane.showMessageDialog(null, mensagemErro);
        }
    }//GEN-LAST:event_cadastrarEventoButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limparButtonActionPerformed
    
    // Validar preenchimento dos campos
    private String verificarCamposCadastro() {
        StringBuilder mensagemErro = new StringBuilder();
        String nome = nomeEventoTextField.getText().trim();
        if (nome.isEmpty() || !nome.contains(" ")) {
            mensagemErro.append("Por favor, preencha o campo: Nome do evento. \n");
        }
        if (dataEventoTextField.getText().isEmpty()) {
            mensagemErro.append("Por favor, preencha o campo: Data do evento.\n");
        }
        if (localTextField.getText().isEmpty()) {
            mensagemErro.append("Por favor, preencha o campo: Local do evento.\n");
        }
          if (descricaoTextArea.getText().isEmpty()) {
            mensagemErro.append("Por favor, preencha o campo: Descricao do evento.\n");
        }
          return mensagemErro.toString();
    }
    


//     Cria um formatador de máscara de data
//    private MaskFormatter createDateMaskFormatter() {
//        try {
//            return new MaskFormatter("##/##/####");
//        } catch (java.text.ParseException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

// getters
    public javax.swing.JTextField getDataEventoTextField() {
        return dataEventoTextField;
    }

    public javax.swing.JTextArea getDescricaoTextArea() {
        return descricaoTextArea;
    }

    public javax.swing.JTextField getLocalTextField() {
        return localTextField;
    }

    public javax.swing.JTextField getNomeEventoTextField() {
        return nomeEventoTextField;
    }
    
    @Override
    public boolean formClose() {
        int opt = JOptionPane.showConfirmDialog(this, "Evento cadastrado com sucesso, deseja realizar outro cadastro?", "Sucesso", JOptionPane.YES_NO_OPTION);
        return opt == JOptionPane.NO_OPTION;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarEventoButton;
    private javax.swing.JTextField dataEventoTextField;
    private javax.swing.JTextArea descricaoTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField localTextField;
    private javax.swing.JTextField nomeEventoTextField;
    // End of variables declaration//GEN-END:variables
}
