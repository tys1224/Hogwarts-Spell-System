
import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import sun.audio.*;
import java.awt.*;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class editframe extends javax.swing.JFrame {

  
  ArrayList<Charm> ch = new ArrayList<Charm>();
  ArrayList<Curse> cu = new ArrayList<Curse>();
  ArrayList<Jinx> ji = new ArrayList<Jinx>();
  ArrayList<Healing> he = new ArrayList<Healing>();
  ArrayList<Protective> pr = new ArrayList<Protective>();

    public editframe() {
        add(new editback());
        initComponents();
        fileRead();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">  
      
      
        private void fileRead()
   {
     //開啟檔案
     fr = null;
     try
     {
       fr = new FileReader("data.txt");
     }
     catch(IOException e)
     {
       JOptionPane.showMessageDialog(null, "檔案開啟錯誤");
       System.exit(-1);
     }
    br = new BufferedReader(fr);
     //開啟檔案
     
     //檔案處理
     try
     {
       input = br.readLine();
       
       while(input != null)
       {
         st = new StringTokenizer(input, ";");
         temp = st.nextToken();
         if(temp.equals("Charm")){
         ch.add(new Charm(temp, st.nextToken(), st.nextToken(), st.nextToken()));
         input = br.readLine();
         }
         else if(temp.equals("Jinx")){
         ji.add(new Jinx(temp, st.nextToken(), st.nextToken(), st.nextToken()));
         input = br.readLine();
         }
         else if(temp.equals("Curse")){
         cu.add(new Curse(temp, st.nextToken(), st.nextToken(), st.nextToken()));
         input = br.readLine();
         }
         else if(temp.equals("Healing")){
         he.add(new Healing(temp, st.nextToken(), st.nextToken(), st.nextToken()));
         input = br.readLine();
         }
         else{
         pr.add(new Protective(temp, st.nextToken(), st.nextToken(), st.nextToken()));
         input = br.readLine();
         }
       }
     }
     catch(IOException e)
     {
       JOptionPane.showMessageDialog(null, "資料讀取錯誤");
       System.exit(-2);
     }
     catch(NumberFormatException e)
     {
       JOptionPane.showMessageDialog(null, "數字轉換錯誤");
       System.exit(-3);
     }
     //檔案處理
     
     //關閉檔案
     try
     {
       br.close();
     }
     catch(IOException e)
     {
       JOptionPane.showMessageDialog(null, "檔案無法關閉");
     }
     //關閉檔案
     
   }
 
      
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextArea3 = new TransparentTextArea("");
        jComboBox1 = new javax.swing.JComboBox<>();
        addbutton = new javax.swing.JButton();
        
        setUndecorated(true);
        setBackground(new Color(0, 255, 0, 0));
      

        setContentPane(new editback());
        getContentPane().setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Choose part to Change:");

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Type here");
        
        jTextArea3.setLineWrap(true);
        jTextArea3.setWrapStyleWord(true);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Type", "Description" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        addbutton.setFont(new java.awt.Font("微軟正黑體", 0, 24)); // NOI18N
        addbutton.setText("Modify");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(addbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(addbutton)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        
        pack();
    }// </editor-fold>                       
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
       if(jComboBox1.getSelectedIndex() == 0){
        jTextArea3.setText(ch.get(i).getName());
        ch.get(i).setName(jTextArea3.getText());
      }
      else if(jComboBox1.getSelectedIndex() == 1){
        jTextArea3.setText(ch.get(i).getType());
        ch.get(i).setType(jTextArea3.getText());
      }
      else if(jComboBox1.getSelectedIndex() == 2){
        jTextArea3.setText(ch.get(i).getDesc());
        ch.get(i).setDesc(jTextArea3.getText());
      }
    }                                          


    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
       //寫入資料
        //開啟檔案
     fr = null;
     try
     {
       fw = new FileWriter("data.txt");
     }
     catch(IOException e)
     {
       JOptionPane.showMessageDialog(null, "檔案開啟錯誤");
       System.exit(-1);
     }
                      PrintWriter pw = new PrintWriter(fw);
                      //開啟檔案

      if(jComboBox1.getSelectedIndex() == 0){
        ch.get(i).setName(jTextArea3.getText());
      }
      else if(jComboBox1.getSelectedIndex() == 1){
        ch.get(i).setType(jTextArea3.getText());
      }
      else if(jComboBox1.getSelectedIndex() == 2){
        ch.get(i).setDesc(jTextArea3.getText());
      }
                      
                      //寫入資料
                      for(j = 0 ; j < ch.size() ; j++)
                      {
                        pw.println(ch.get(j).getType() + ";" + ch.get(j).getName() + ";" + ch.get(j).getDesc()+ ";" + ch.get(j).getPath());
                      }
                      for(j = 0 ; j < cu.size() ; j++)
                      {
                        pw.println(cu.get(j).getType() + ";" + cu.get(j).getName() + ";" + cu.get(j).getDesc()+ ";" + cu.get(j).getPath());
                      }
                      for(j = 0 ; j < ji.size() ; j++)
                      {
                        pw.println(ji.get(j).getType() + ";" + ji.get(j).getName() + ";" + ji.get(j).getDesc()+ ";" + ji.get(j).getPath());
                      }
                      for(j = 0 ; j < he.size() ; j++)
                      {
                        pw.println(he.get(j).getType() + ";" + he.get(j).getName() + ";" + he.get(j).getDesc()+ ";" + he.get(j).getPath());
                      }
                      for(j = 0 ; j < pr.size() ; j++)
                      {
                        pw.println(pr.get(j).getType() + ";" + pr.get(j).getName() + ";" + pr.get(j).getDesc()+ ";" + pr.get(j).getPath());
                      }
                      pw.close();
                      JOptionPane.showMessageDialog(null, "Modify Successfully!");
                      
      
       NewJFrame1 frame = new NewJFrame1();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        CloseFrame();
        }                                         

    public void CloseFrame(){
    super.dispose();
}
    
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
            java.util.logging.Logger.getLogger(editframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify 
     private StringTokenizer st;
    private String temp;
    private int i, j, k, chr,n;
    private Image image;
    private URL url;
    private FileReader fr;
    private FileWriter fw;
    private BufferedReader br;
    private String input, inputname;
    private javax.swing.JButton addbutton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration                   
}