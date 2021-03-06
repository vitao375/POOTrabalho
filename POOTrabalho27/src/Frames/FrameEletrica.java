/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import ClassesPeca.Eletrica;
import ClassesPeca.PecaAuto;
import Enum.Sistemas;
import Lista.ListaPeca;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author vitao375
 */
public class FrameEletrica extends javax.swing.JFrame {

    public ListaPeca lista = new ListaPeca();
    private final String acao;
    private final String nome;

    /**
     * Creates new form FrameEletrica
     *
     * @param acao
     * @param nome
     * @param lista
     */
    public FrameEletrica(String acao, String nome, ListaPeca lista) {
        initComponents();
        this.lista = lista;
        this.setLocationRelativeTo(null);
        this.setTitle("Peças Eletricas");
        this.acao = acao;
        this.nome = nome;
        if (acao.equals("Consultar") || acao.equals("Editar")) {
            consultar();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldAmperagem = new javax.swing.JTextField();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldFabricante = new javax.swing.JTextField();
        jTextFieldVoltagem = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jComboBoxTipoSistema = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Tipo de Sistema:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Amperagem: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Valor:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nome: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Voltagem:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Quantidade");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Fabricante da Peça:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Modelo:");

        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldAmperagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldAmperagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAmperagemKeyTyped(evt);
            }
        });

        jTextFieldQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldQuantidadeKeyTyped(evt);
            }
        });

        jTextFieldModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldFabricante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldVoltagem.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldVoltagem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldVoltagemKeyTyped(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jComboBoxTipoSistema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistema de Ignição", "Sistema de Alimentação", "Sistema de Sinalização", "Outro" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldValor)
                            .addComponent(jComboBoxTipoSistema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAmperagem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(jTextFieldQuantidade)
                            .addComponent(jTextFieldFabricante)
                            .addComponent(jTextFieldVoltagem))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxTipoSistema, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAmperagem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldVoltagem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        new FrameView(lista).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (verificaPreencher()) {
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
        } else {
            switch (acao) {
                case "Incluir":
                    try {
                        Eletrica incluir = new Eletrica(jTextFieldFabricante.getText(),
                                jTextFieldModelo.getText(), Double.valueOf(jTextFieldValor.getText()),
                                Integer.parseInt(jTextFieldQuantidade.getText()), jTextFieldNome.getText(),
                                Double.valueOf(jTextFieldAmperagem.getText()),
                                Double.valueOf(jTextFieldVoltagem.getText()),
                                Sistemas.verifica(jComboBoxTipoSistema.getSelectedIndex()));
                        lista.incluir(incluir);
                        try {
                            lista.escreverArquivo();
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao escrever: " + e.getCause());
                        }
                        String[] textMessages = {"Sim", "Não"};
                        int x = JOptionPane.showOptionDialog(null, "Deseja Incluir outra Peca", "Eletrica",
                                JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE,
                                null, textMessages, null);
                        switch (x) {
                            case 0:
                                limparCampos();
                                break;
                            case 1:
                                new FrameView(lista).setVisible(true);
                                this.dispose();
                                break;
                            default:
                                new FrameView(lista).setVisible(true);
                                this.dispose();
                                break;
                        }                      
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        new FrameView(lista).setVisible(true);
                        this.dispose();
                    }

                    break;
                case "Editar":
                    try {
                        Eletrica edita = new Eletrica(jTextFieldFabricante.getText(),
                                jTextFieldModelo.getText(), Double.valueOf(jTextFieldValor.getText()),
                                Integer.parseInt(jTextFieldQuantidade.getText()), jTextFieldNome.getText(),
                                Double.valueOf(jTextFieldAmperagem.getText()),
                                Double.valueOf(jTextFieldVoltagem.getText()),
                                Sistemas.verifica(jComboBoxTipoSistema.getSelectedIndex()));
                        lista.editar(nome, edita);
                        try {
                            lista.escreverArquivo();
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao escrever: " + e.getCause());
                        }
                        new FrameView(lista).setVisible(true);
                        this.dispose();
                    } catch (IllegalArgumentException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        new FrameView(lista).setVisible(true);
                        this.dispose();
                    }

                    break;
            }
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
        soDouble(evt, jTextFieldValor.getText());
    }//GEN-LAST:event_jTextFieldValorKeyTyped

    private void jTextFieldQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldQuantidadeKeyTyped
        soNumeros(evt);
    }//GEN-LAST:event_jTextFieldQuantidadeKeyTyped

    private void jTextFieldAmperagemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAmperagemKeyTyped
        soDouble(evt, jTextFieldAmperagem.getText());
    }//GEN-LAST:event_jTextFieldAmperagemKeyTyped

    private void jTextFieldVoltagemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldVoltagemKeyTyped
        soDouble(evt, jTextFieldVoltagem.getText());
    }//GEN-LAST:event_jTextFieldVoltagemKeyTyped
    
    /**
     * Verifica se os campos foram preenchidos
     * @return false caso todos estejam preenchidos ou true caso contrário
     * 
     */
    public boolean verificaPreencher() {
        if (jTextFieldFabricante.getText() == null
                || jTextFieldModelo.getText() == null
                || jTextFieldNome.getText() == null
                || jTextFieldQuantidade.getText() == null
                || jTextFieldValor.getText() == null
                || jTextFieldAmperagem.getText() == null
                || jTextFieldVoltagem.getText() == null
                ||jTextFieldFabricante.getText().equals("")
                || jTextFieldModelo.getText().equals("")
                || jTextFieldNome.getText().equals("")
                || jTextFieldQuantidade.getText().equals("")
                || jTextFieldValor.getText().equals("")
                || jTextFieldAmperagem.getText().equals("")
                || jTextFieldVoltagem.getText().equals("")) {
            return true;
        } else {
            return false;
        }

    }
    /**
     * Prencher todos os campos e recebe como parametro PecaAuto p que indica os
     * valores a serem inseridos
     * @param p 
     */
    public void preencherCampos(PecaAuto p) {
        Eletrica e = (Eletrica) p;
        jTextFieldFabricante.setText(e.getFabricantePeca());
        jTextFieldModelo.setText(e.getModeloCarro());
        jTextFieldNome.setText(e.getNome());
        jTextFieldQuantidade.setText(String.valueOf(e.getQuantidade()));
        jTextFieldValor.setText(String.valueOf(e.getValor()));
        jTextFieldAmperagem.setText(String.valueOf(e.getAmperagem()));
        jTextFieldVoltagem.setText(String.valueOf(e.getVoltagem()));
        jComboBoxTipoSistema.setSelectedIndex(e.getSistema().getSistemas());
    }
    //apenas limpa todos os campos
    public void limparCampos() {
        jTextFieldFabricante.setText("");
        jTextFieldModelo.setText("");
        jTextFieldNome.setText("");
        jTextFieldQuantidade.setText("");
        jTextFieldValor.setText("");
        jTextFieldAmperagem.setText("");
        jTextFieldVoltagem.setText("");
    }
    //apenas desativa todos os campos
    public void desativarCampos() {
        jTextFieldFabricante.setEnabled(false);
        jTextFieldModelo.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldQuantidade.setEnabled(false);
        jTextFieldValor.setEnabled(false);
        jTextFieldAmperagem.setEnabled(false);
        jTextFieldVoltagem.setEnabled(false);
    }
    //apenas ativa todos os campos
    public void ativarCampos() {
        jTextFieldFabricante.setEnabled(true);
        jTextFieldModelo.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldQuantidade.setEnabled(true);
        jTextFieldValor.setEnabled(true);
        jTextFieldAmperagem.setEnabled(true);
        jTextFieldVoltagem.setEnabled(true);
    }
    
    /**
     * Preenche todos os campos e desativa se necessário quando acao for Consultar
     * ou editar. Também faz a pesquisa do objeto para preencher o campo.
     */
    public final void consultar() {
        Eletrica consultar = (Eletrica) lista.consultaPeca(nome);
        if (acao.equals("Consultar")) {
            desativarCampos();
            jButtonSalvar.setEnabled(false);
        }
        if (consultar == null) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Não encontrado!");
            desativarCampos();
            jButtonSalvar.setEnabled(false);
        } else {
            preencherCampos(consultar);
        }

    }
    
    /**
     * Verifica o evento para impedir qualquer coisa quenão seja número de ser inserida
     * @param evt 
     */
    public void soNumeros(java.awt.event.KeyEvent evt) {
        char aux = evt.getKeyChar();
        if (!Character.isDigit(aux)) {
            evt.consume();
        }
    }

    /**
     * Verifica o evento para impedir qualquer coisa quenão seja número de ser inserida
     * porém permite um único ponto devido ser double e recebe como parametro a String
     * text para fazer a validação
     * @param evt 
     * @param text 
     */
    public void soDouble(java.awt.event.KeyEvent evt, String text) {
        char aux = evt.getKeyChar();
        int tem = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                tem++;
                break;
            }
        }

        if (aux == '.') {
            if (tem != 0) {
                evt.consume();
            }
        } else if (!Character.isDigit(aux)) {
            evt.consume();
        }
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
            java.util.logging.Logger.getLogger(FrameEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEletrica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEletrica(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxTipoSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAmperagem;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldVoltagem;
    // End of variables declaration//GEN-END:variables
}
