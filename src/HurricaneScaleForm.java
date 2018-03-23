/*
This program was made by Dylan T
It was created on March 23rd, 2018
This program shows different categories of hurricanes windspeed if the user enters a category number 1-5
 */


public class HurricaneScaleForm extends javax.swing.JFrame {
    
      
    public HurricaneScaleForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelCatagoryLevel = new javax.swing.JLabel();
        textInputCategoryLevel = new javax.swing.JTextField();
        labelCategory = new javax.swing.JLabel();
        labelWindSpeed = new javax.swing.JLabel();
        buttonSelect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Hurricane Scale");

        labelCatagoryLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCatagoryLevel.setText("Please enter a hurricane category (1-5)");

        textInputCategoryLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textInputCategoryLevelActionPerformed(evt);
            }
        });

        labelCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelCategory.setText("The wind speed is:");

        labelWindSpeed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonSelect.setText("Select");
        buttonSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCatagoryLevel)
                        .addGap(18, 18, 18)
                        .addComponent(textInputCategoryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonSelect))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCategory)
                            .addComponent(labelWindSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCatagoryLevel)
                    .addComponent(textInputCategoryLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSelect))
                .addGap(62, 62, 62)
                .addComponent(labelCategory)
                .addGap(18, 18, 18)
                .addComponent(labelWindSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textInputCategoryLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textInputCategoryLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textInputCategoryLevelActionPerformed

    private void buttonSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSelectActionPerformed
       
       int hurricane = 5; //Declares an integer called hurricane and assigns it a value of 5 
       
       hurricane = Integer.parseInt(textInputCategoryLevel.getText());// Assigns hurricane to get text from texInputCategoryLevel
       
       switch (hurricane)// switch statment from hurrican
       {
           case 1://if the user types in 1 then 
                   labelCategory.setText("The wind speed for Category One are:");// display this message
                   labelWindSpeed.setText("74-95 mph or 64-82 kt or 119-153 km/hr");// display this message

          break;// breaks case 1
           case 2://if the user types in 2 then
                   labelCategory.setText("The wind speed for Category Two are:");// display this message
                   labelWindSpeed.setText("96-110 mph or 83-95 kt or 154-177 km/hr");// display this message
               break;// breaks case 2
               case 3://if the user types in 3 then
                   labelCategory.setText("The wind speed for Category Three are:");// display this message
                   labelWindSpeed.setText("111-130 mph or 96-113 kt or 178-209 km/hr");// display this message 
                   break;// breaks case 3
                   case 4://if the user types in 4 then
                   labelCategory.setText("The wind speed for Category Four are:");// display this message
                   labelWindSpeed.setText("131-155 mph or 114-135 kt or 210-249 km/hr");// display this message 
                   break;// breaks case 4
                   case 5://if the user types in 5 then
                       
                   labelCategory.setText("The wind speed for Category Five are:");// display this message
                   labelWindSpeed.setText("greater than 155 mph or 135 kt or 249 km/hr.");// display this message 
                       
                    break;// breaks case 5
           default:// if anything other than one to five then 
              
               labelCategory.setText("That is not a category");// display this message

       }
    }//GEN-LAST:event_buttonSelectActionPerformed

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
            java.util.logging.Logger.getLogger(HurricaneScaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HurricaneScaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HurricaneScaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HurricaneScaleForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HurricaneScaleForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCatagoryLevel;
    private javax.swing.JLabel labelCategory;
    private javax.swing.JLabel labelWindSpeed;
    private javax.swing.JTextField textInputCategoryLevel;
    // End of variables declaration//GEN-END:variables
}
