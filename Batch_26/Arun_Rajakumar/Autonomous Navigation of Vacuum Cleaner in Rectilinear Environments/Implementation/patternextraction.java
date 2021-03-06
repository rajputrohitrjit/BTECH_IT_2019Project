package garbagedetection;

import java.awt.Container;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.ui.RefineryUtilities;

public class patternextraction extends javax.swing.JFrame {

    /** Creates new form patternextraction */
    int c1[]={5,9,11,13,17,21,25,31,34,37,40,43,47,260,267};
    public patternextraction() {
        initComponents();
        
        try {
            File f = new File(new File("").getCanonicalPath() + "\\snapshots");
            String[] fname = f.list();
            Vector col = new Vector();
            int cnt = 1;
            int[] fmax = new int[5];
            for (int i = 0; i < 5; i++) {
                if (!fname[i].contains(".")) {
                    col.add("Cluster " + cnt);
                    cnt++;
                    File f1 = new File(new File("").getCanonicalPath() + "\\snapshots\\" + fname[i]);
                    String[] tt = f1.list();
                    int len = tt.length - 1;
                    fmax[cnt - 1] = len;

                }
            }

            int max = fmax[0];
            for (int i = 0; i < fmax.length; ++i) {
                if (fmax[i] > max) {
                    max = fmax[i];
                }
            }
            try {
            Vector c = new Vector();
            Vector r = new Vector();

            c.add("Cluster 1");
            c.add("Cluster 2");
            c.add("Cluster 3");
            
            File tf = new File("");
            File t = new File(tf.getCanonicalPath() + "\\snapshots");
            String[] flist = t.list();
            Random ran=new Random();
            for (int i = 0; i < c1.length; i++) {
                Vector r1 = new Vector();
                r1.add("<html><img src='file:///" + t.getAbsolutePath().replace("\\", "/") + "/" + c1[i] + ".jpg' width='150' height='150' /></html>");
                r1.add("<html><img src='file:///" + t.getAbsolutePath().replace("\\", "/") + "/" + c1[i] + ".jpg' width='150' height='150' /></html>");
                r1.add("<html><img src='file:///" + t.getAbsolutePath().replace("\\", "/") + "/" + c1[i] + ".jpg' width='150' height='150' /></html>");
                
                r.add(r1);
            }


            jTable1.setModel(new javax.swing.table.DefaultTableModel(r, c));
            jTable1.setRowHeight(120);
         //   jTable1.setColumnSelectionInterval(30, 30);
        } catch (Exception e) {

            e.printStackTrace();
        }





        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pattern Extraction");

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("View Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Image Pattern Classification");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final BarChartDemo demo = new BarChartDemo("Garbage Detection");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new patternextraction().setVisible(true);
            }
        });
    }*/ 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
