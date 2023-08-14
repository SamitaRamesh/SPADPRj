/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainlibrary;

import javax.swing.JOptionPane;
import static mainlibrary.LibrarianSuccess.ThisLogined;

/**
 *
 * @author bikash
 */
public class BookForm extends javax.swing.JFrame {

    /**
     * Creates new form BookForm
     */
    public BookForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BookName = new javax.swing.JTextField();
        Publisher = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        Row = new javax.swing.JTextField();
        Shelf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Genre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setText("Book Name");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setText("Publisher");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Author");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel5.setText("Book Pos");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel6.setText("Shelf");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel7.setText("Row");

        BookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameActionPerformed(evt);
            }
        });

        Publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublisherActionPerformed(evt);
            }
        });

        Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorActionPerformed(evt);
            }
        });

        Row.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RowActionPerformed(evt);
            }
        });

        Shelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShelfActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jButton1.setText("ADD BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel2.setText("Genre");

        Genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(34, 34, 34))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(52, 52, 52)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(75, 75, 75))
                                    .addComponent(jLabel2))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Author, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(Publisher, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addComponent(BookName, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Row, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Shelf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(Shelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Row, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(57, 57, 57))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameActionPerformed

    private void PublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PublisherActionPerformed

    private void AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorActionPerformed

    private void RowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RowActionPerformed

    private void ShelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShelfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ThisLogined.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    @SuppressWarnings({"empty-/*statement*/", "empty-statement"})
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String BookN = BookName.getText();
        String AuthorN = Author.getText();
        String PublisherN = Publisher.getText();
        String ShelfN = Shelf.getText();
        String RowN = Row.getText();
        String GenreN = Genre.getText();

        if (BookDao.PublisherValidate(PublisherN)) {

        } else {
            if (BookDao.AddPublisher(PublisherN) != 0) {
                ; JOptionPane.showMessageDialog(BookForm.this, "Sorry, Publisher can't be added!","Publisher Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        if (BookDao.SaveBook(BookN, AuthorN, PublisherN, ShelfN, RowN, GenreN) != 0) {
            JOptionPane.showMessageDialog(BookForm.this, "The Book is added!", "Book Added!", JOptionPane.ERROR_MESSAGE);
            BookName.setText("");
            Author.setText("");
            Publisher.setText("");
            Shelf.setText("");
            Row.setText("");
            Genre.setText("");
        } else {
            JOptionPane.showMessageDialog(BookForm.this, "The Book is not added!", "Adding Book Error!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void GenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenreActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BookForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField BookName;
    private javax.swing.JTextField Genre;
    private javax.swing.JTextField Publisher;
    private javax.swing.JTextField Row;
    private javax.swing.JTextField Shelf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
