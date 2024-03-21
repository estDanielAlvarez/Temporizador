import java.awt.Image;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
public class Race extends javax.swing.JFrame {
TimerTask timertask;
Timer timer;
Random random;
    public Race(){
        
        initComponents();
        
        this.setLocationRelativeTo(this);
        
        SetImageLabel(carro1,"src/Imagenes/c1.png");
        SetImageLabel(carro2,"src/Imagenes/c2.png");
        SetImageLabel(carro3,"src/Imagenes/c3.png");
        SetImageLabel(carro4,"src/Imagenes/c4.png");
        SetImageLabel(carro5,"src/Imagenes/c5.png");
        SetImageLabel(carro6,"src/Imagenes/c6.png");
        SetImageLabel(carro7,"src/Imagenes/c7.png");
        SetImageLabel(carro8,"src/Imagenes/c8.png");
        SetImageLabel(carro9,"src/Imagenes/c9.png");
        SetImageLabel(carro10,"src/Imagenes/c10.png");
        SetImageLabel(carro11,"src/Imagenes/meta.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        carro11 = new javax.swing.JLabel();
        texto2 = new javax.swing.JTextField();
        slider = new javax.swing.JSlider();
        carro1 = new javax.swing.JLabel();
        carro2 = new javax.swing.JLabel();
        carro3 = new javax.swing.JLabel();
        carro4 = new javax.swing.JLabel();
        carro5 = new javax.swing.JLabel();
        carro6 = new javax.swing.JLabel();
        carro7 = new javax.swing.JLabel();
        carro8 = new javax.swing.JLabel();
        carro9 = new javax.swing.JLabel();
        carro10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton5.setText("Carro1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(556, 556, 556)
                .addComponent(carro11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(carro11, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addComponent(texto2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carro10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(carro1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(carro9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carro10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Botón Start
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

timer = new Timer();
random = new Random();
timertask = new TimerTask() {
int c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;
long s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
long e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
int []tiempo = new int[10];
int[][] tiemposCarros = new int[10][2];
int[] ordenCarros = new int[10];
public void run() {
int n1=(int)random.nextInt()/100000000;
int n2=(int)random.nextInt()/100000000;
int n3=(int)random.nextInt()/100000000;
int n4=(int)random.nextInt()/100000000;
int n5=(int)random.nextInt()/100000000;
int n6=(int)random.nextInt()/100000000;
int n7=(int)random.nextInt()/100000000;
int n8=(int)random.nextInt()/100000000;
int n9=(int)random.nextInt()/100000000;
int n10 = (int)random.nextInt()/100000000;
if(n1>0){
c1 = c1 + n1;
s1 = System.currentTimeMillis();}
if(n2>0){
c2 = c2 + n2;
s2 = System.currentTimeMillis();}
if(n3>0){
c3 = c3 + n3;
s3 = System.currentTimeMillis();}
if(n4>0){
c4 = c4 + n4;
s4 = System.currentTimeMillis();}
if(n5>0){
c5 = c5 + n5;
s5 = System.currentTimeMillis();}
if(n6>0){
c6 = c6 + n6;
s6 = System.currentTimeMillis();}
if(n7>0){
c7 = c7 + n7;
s7 = System.currentTimeMillis();}
if(n8>0){
c8 = c8 + n8;
s8 = System.currentTimeMillis();}
if(n9>0){
c9 = c9 + n9;
s9 = System.currentTimeMillis();}
if(n10>0){
c10= c10 + n10;
s10 = System.currentTimeMillis();}
carro1.setLocation(c1,carro1.getY());
carro2.setLocation(c2,carro2.getY());
carro3.setLocation(c3,carro3.getY());
carro4.setLocation(c4,carro4.getY());
carro5.setLocation(c5,carro5.getY());
carro6.setLocation(c6,carro6.getY());
carro7.setLocation(c7,carro7.getY());
carro8.setLocation(c8,carro8.getY());
carro9.setLocation(c9,carro9.getY());
carro10.setLocation(c10,carro10.getY());
///Aqui voy guardando la lista a partir de que lleguen , para luego ordenar
if((carro1.getX()) >= (carro11.getX()+150)){
    carro1.setLocation(carro11.getX()+150,carro1.getY());
    c1 = carro1.getX();
    e1 = System.currentTimeMillis();
    tiempo[0]=(int) (e1-s1);
    tiemposCarros[0][0] = 1; // Número de carro
    tiemposCarros[0][1] = tiempo[0]; // Tiempo asociado
}
if((carro2.getX()) >= (carro11.getX()+150)){
    carro2.setLocation(carro11.getX()+150,carro2.getY());
    c2 = carro2.getX();
    e2 = System.currentTimeMillis();
    tiempo[1]=(int) (e2-s2);
    tiemposCarros[1][0] = 2;
    tiemposCarros[1][1] = tiempo[1];
}
if((carro3.getX()) >= (carro11.getX()+150)){
    carro3.setLocation(carro11.getX()+150,carro3.getY());
    c3 = carro3.getX();
    e3 = System.currentTimeMillis();
    tiempo[2]=(int) (e3-s3);
    tiemposCarros[2][0] = 3;
    tiemposCarros[2][1] = tiempo[2];
}
if((carro4.getX()) >= (carro11.getX()+150)){
    carro4.setLocation(carro11.getX()+150,carro4.getY());
    c4 = carro4.getX();
    e4 = System.currentTimeMillis();
    tiempo[3]=(int) (e4-s4);
    tiemposCarros[3][0] = 4;
    tiemposCarros[3][1] = tiempo[3];
}
if((carro5.getX()) >= (carro11.getX()+150)){
    carro5.setLocation(carro11.getX()+150,carro5.getY());
    c5 = carro5.getX();
    e5 = System.currentTimeMillis();
    tiempo[4]=(int) (e5-s5);
    tiemposCarros[4][0] = 5;
    tiemposCarros[4][1] = tiempo[4];
}
if((carro6.getX()) >= (carro11.getX()+150)){
    carro6.setLocation(carro11.getX()+150,carro6.getY());
    c6 = carro6.getX();
    e6 = System.currentTimeMillis();
    tiempo[5]=(int) (e6-s6);
    tiemposCarros[5][0] = 6;
    tiemposCarros[5][1] = tiempo[5];
}
if((carro7.getX()) >= (carro11.getX()+150)){
    carro7.setLocation(carro11.getX()+150,carro7.getY());
    c7 = carro7.getX();
    e7 = System.currentTimeMillis();
    tiempo[6]=(int) (e7-s7);
    tiemposCarros[6][0] = 7;
    tiemposCarros[6][1] = tiempo[6];
}
if((carro8.getX()) >= (carro11.getX()+150)){
    carro8.setLocation(carro11.getX()+150,carro8.getY());
    c8 = carro8.getX();
    e8 = System.currentTimeMillis();
    tiempo[7]=(int) (e8-s8);
    tiemposCarros[7][0] = 8;
    tiemposCarros[7][1] = tiempo[7];
}
if((carro9.getX()) >= (carro11.getX()+150)){
    carro9.setLocation(carro11.getX()+150,carro9.getY());
    c9 = carro9.getX();
    e9 = System.currentTimeMillis();
    tiempo[8]=(int) (e9-s9);
    tiemposCarros[8][0] = 9;
    tiemposCarros[8][1] = tiempo[8];
}
if((carro10.getX()) >= (carro11.getX()+150)){
    carro10.setLocation(carro11.getX()+150,carro10.getY());
    c10 = carro10.getX();
    e10 = System.currentTimeMillis();
    tiempo[9]=(int) (e10-s10);
    tiemposCarros[9][0] = 10;
    tiemposCarros[9][1] = tiempo[9];
}

// Crear un arreglo para almacenar los índices de los carros
        for (int i = 0; i < tiempo.length; i++) {
            ordenCarros[i] = i;
        }

        for (int i = 0; i < tiemposCarros.length - 1; i++) {
    for (int j = 0; j < tiemposCarros.length - i - 1; j++) {
        if (tiemposCarros[j][1] > tiemposCarros[j + 1][1]) {
            // Intercambiar los elementos (número de carro y tiempo)
            int tempNumeroCarro = tiemposCarros[j][0];
            int tempTiempo = tiemposCarros[j][1];
            tiemposCarros[j][0] = tiemposCarros[j + 1][0];
            tiemposCarros[j][1] = tiemposCarros[j + 1][1];
            tiemposCarros[j + 1][0] = tempNumeroCarro;
            tiemposCarros[j + 1][1] = tempTiempo;
        }
    }
}

        // Obtener el número de carro del primer lugar
int carroPrimerLugar = tiemposCarros[0][0];

// Establecer el texto en el JTextField "texto2" para mostrar el carro en primer lugar
texto2.setText("Carro " + carroPrimerLugar + " - Primer Lugar");

}
};

timer.scheduleAtFixedRate(timertask, 0, 100);

    }//GEN-LAST:event_jButton1ActionPerformed
//Botón Stop
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        timertask.cancel();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStateChanged
    //    timer.setDelay(slider.getValue());
    }//GEN-LAST:event_sliderStateChanged

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
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Race.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Race().setVisible(true);
            }
        });
    }
    private void SetImageLabel(JLabel labelName,String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(),labelName.getHeight(),Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carro1;
    private javax.swing.JLabel carro10;
    private javax.swing.JLabel carro11;
    private javax.swing.JLabel carro2;
    private javax.swing.JLabel carro3;
    private javax.swing.JLabel carro4;
    private javax.swing.JLabel carro5;
    private javax.swing.JLabel carro6;
    private javax.swing.JLabel carro7;
    private javax.swing.JLabel carro8;
    private javax.swing.JLabel carro9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider slider;
    private javax.swing.JTextField texto2;
    // End of variables declaration//GEN-END:variables
}
