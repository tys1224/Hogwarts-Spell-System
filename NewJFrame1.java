

import javax.swing.JFrame;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import sun.audio.*;

public class NewJFrame1 extends javax.swing.JFrame {
  
  ArrayList<Charm> ch = new ArrayList<Charm>();
  ArrayList<Curse> cu = new ArrayList<Curse>();
  ArrayList<Jinx> ji = new ArrayList<Jinx>();
  ArrayList<Healing> he = new ArrayList<Healing>();
  ArrayList<Protective> pr = new ArrayList<Protective>();

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame1() {
      fileRead();
     initComponents();
     showData1(n);
     playMusic();
     setLocationRelativeTo(null);
    }
    
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        GIFLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Next = new javax.swing.JButton();
        Previous = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setTitle("Welcome to Hogwarts!");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Parry Hotter", 0, 42)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("");
        

        jLabel3.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Description:");

        jTextArea1.setBackground(new java.awt.Color(0, 102, 153));
        jTextArea1.setFont(new java.awt.Font("微軟正黑體", 1, 34)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(5);
        jTextArea1.setRows(5);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);
        
        jLabel1.setFont(new java.awt.Font("微軟正黑體", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Choose Type:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Charm", "Curse", "Jinx", "Healing", "Protective" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Next.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Previous.setFont(new java.awt.Font("微軟正黑體", 0, 14)); // NOI18N
        Previous.setText("Back");
        Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Previous)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(GIFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(GIFLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next)
                    .addComponent(Previous))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("add4.png"))); // NOI18N
        add.setMaximumSize(new java.awt.Dimension(80, 77));
        add.setMinimumSize(new java.awt.Dimension(80, 77));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("delete5.png"))); // NOI18N
        delete.setPreferredSize(new java.awt.Dimension(7, 77));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("edit3.png"))); // NOI18N
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("search2.png"))); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        
      

        pack();
    }// </editor-fold>                        

  //顯示第一筆資料
   
   private int showData1(int n){
     
     if (n==0){
           image = null;
    try {
       url = new URL(ch.get(0).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "無法載入圖片");
       System.exit(-20);
     }
     GIFLabel.setIcon(new ImageIcon(url));
     jLabel2.setText(ch.get(i).getName());
     jTextArea1.setText(ch.get(i).getDesc());
         }
       if (n==1){
         i=0;
         image = null;
    try {
       url = new URL(cu.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "無法載入圖片");
       System.exit(-20);
     }
     GIFLabel.setIcon(new ImageIcon(url));
     jLabel2.setText(cu.get(i).getName());
     jTextArea1.setText(cu.get(i).getDesc());
         }
       if (n==2){
         i=0;
         image = null;
    try {
       url = new URL(ji.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "無法載入圖片");
       System.exit(-20);
     }
     GIFLabel.setIcon(new ImageIcon(url));
     jLabel2.setText(ji.get(i).getName());
     jTextArea1.setText(ji.get(i).getDesc());
         }
       if (n==3){
         i=0;
         image = null;
    try {
       url = new URL(he.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "無法載入圖片");
       System.exit(-20);
     }
     GIFLabel.setIcon(new ImageIcon(url));
     jLabel2.setText(he.get(i).getName());
     jTextArea1.setText(he.get(i).getDesc());
         }
       if (n==4){
         image = null;
         i=0;
    try {
       url = new URL(pr.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "無法載入圖片");
       System.exit(-20);
     }
     GIFLabel.setIcon(new ImageIcon(url));
     jLabel2.setText(pr.get(i).getName());
     jTextArea1.setText(pr.get(i).getDesc());
         }
       return 0;
       }

 //播放音樂
   private void playMusic()
   {
     try
     {
       ais = AudioSystem.getAudioInputStream(new File("themesong.wav"));
       clip = AudioSystem.getClip();
       clip.open(ais);
       clip.loop(Clip.LOOP_CONTINUOUSLY);
       Thread.sleep(1);
     }
     catch(FileNotFoundException e)
     {
       JOptionPane.showMessageDialog(null, "找不到音樂檔");
       System.exit(-9);
     }
     catch(IOException e)
     {
       JOptionPane.showMessageDialog(null, "無法載入音樂");
       System.exit(-10);
     }
     catch(Exception e)
     {
       JOptionPane.showMessageDialog(null, "例外");
       System.exit(-11);
     }
     AudioPlayer.player.start(as);
   }
    
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
       //查詢
          inputname = JOptionPane.showInputDialog("Please enter the name/number of spell you'd like to search.");
          for(j = 0 ; j < ch.size() ; j++)
          {
            if(inputname.equalsIgnoreCase(ch.get(j).getName()))
            {
              i = j;
              break;
            }
            
            else if(inputname.equalsIgnoreCase(String.valueOf(j)))
            {
              i = j;
              break;
            }
          }
          
      
       image = null;
    try {
       url = new URL(ch.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
        GIFLabel.setIcon(new ImageIcon(url));
     jLabel2.setText(ch.get(i).getName());
     jTextArea1.setText(ch.get(i).getDesc());
     } catch (IOException e) {
       JOptionPane.showMessageDialog(null, "Please try again!");
       System.exit(-20);
     }
          
          if(i == j)
          {
            JOptionPane.showMessageDialog(null, "Search Successfully!");
          }
          else
          {
            JOptionPane.showMessageDialog(null, "No data was found!\nPlease enter correct name/number.");
          }

        
    }                                      

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
      if(jComboBox1.getSelectedIndex() == 0){
      showData1(0);
       }
      if(jComboBox1.getSelectedIndex() == 1){
      showData1(1);
      }
      if(jComboBox1.getSelectedIndex() == 2){
      showData1(2);
      }
      if(jComboBox1.getSelectedIndex() == 3){
      showData1(3);
      }
      if(jComboBox1.getSelectedIndex() == 4){
      showData1(4);
      }
      
    }
   

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
         //刪除
      inputnum = JOptionPane.showInputDialog("Please enter the number of spell you'd like to delete.");
          if(jComboBox1.getSelectedIndex() == 0){
            ch.remove(Integer.parseInt(inputnum));
          }
          if(jComboBox1.getSelectedIndex() == 1){
            cu.remove(Integer.parseInt(inputnum));
          }
          if(jComboBox1.getSelectedIndex() == 2){
            ji.remove(Integer.parseInt(inputnum));
          }
          if(jComboBox1.getSelectedIndex() == 3){
            he.remove(Integer.parseInt(inputnum));
          }
          if(jComboBox1.getSelectedIndex() == 4){
            pr.remove(Integer.parseInt(inputnum));
          }
          
          fw = null;
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
          
          for(j = 0 ; j < ch.size() ; j++)
          {
            pw.println(ch.get(j).getType() + ";" + ch.get(j).getName() + ";" + ch.get(j).getDesc() + ";" + ch.get(j).getPath());
          }
          for(j = 0 ; j < ch.size() ; j++)
          {
            pw.println(cu.get(j).getType() + ";" + cu.get(j).getName() + ";" + cu.get(j).getDesc() + ";" + cu.get(j).getPath());
          }
          for(j = 0 ; j < ji.size() ; j++)
          {
            pw.println(ji.get(j).getType() + ";" + ji.get(j).getName() + ";" + ji.get(j).getDesc() + ";" + ji.get(j).getPath());
          }
          for(j = 0 ; j < he.size() ; j++)
          {
            pw.println(he.get(j).getType() + ";" + he.get(j).getName() + ";" + he.get(j).getDesc() + ";" + he.get(j).getPath());
          }
          for(j = 0 ; j < pr.size() ; j++)
          {
            pw.println(pr.get(j).getType() + ";" + pr.get(j).getName() + ";" + pr.get(j).getDesc() + ";" + pr.get(j).getPath());
          }
          pw.close();
          JOptionPane.showMessageDialog(null, "Remove Successfully!");
        }                                     

  
    private void addActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
       addtest frame = new addtest();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        CloseFrame();
      
    }                                   

    private void editActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
       editframe frame = new editframe();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        CloseFrame();
    }                                    
    
public void CloseFrame(){
    super.dispose();
    clip.close();
}
    private void PreviousActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
       if(jComboBox1.getSelectedIndex() == 0){
      if(i != 0)
        {
          i = i - 1;
          image = null;
    try {
       url = new URL(ch.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(ch.get(i).getName());
            jTextArea1.setText(ch.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 0)
        {
            i = 6-1;
          image = null;
    try {
       url = new URL(cu.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(cu.get(i).getName());
            jTextArea1.setText(cu.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
          }
        }
       if(jComboBox1.getSelectedIndex() == 1){
      if(i != 0)
        {
          i = i - 1;
          image = null;
    try {
       url = new URL(cu.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(cu.get(i).getName());
            jTextArea1.setText(cu.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 0)
        {
          i = 6-1;
          image = null;
    try {
       url = new URL(cu.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(cu.get(i).getName());
            jTextArea1.setText(cu.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
      }
       if(jComboBox1.getSelectedIndex() == 2){
      if(i != 0)
        {
          i = i - 1;
          image = null;
    try {
       url = new URL(ji.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(ji.get(i).getName());
            jTextArea1.setText(ji.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 0)
        {
          i = 3-1;
          image = null;
    try {
       url = new URL(ji.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(ji.get(i).getName());
            jTextArea1.setText(ji.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
      }
       if(jComboBox1.getSelectedIndex() == 3){
      if(i != 0)
        {
          i = i - 1;
          image = null;
    try {
       url = new URL(he.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(he.get(i).getName());
            jTextArea1.setText(he.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 0)
        {
          i = 3-1;
          image = null;
    try {
       url = new URL(he.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(he.get(i).getName());
            jTextArea1.setText(he.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
      }
       if(jComboBox1.getSelectedIndex() == 4){
      if(i != 0)
        {
          i = i - 1;
          image = null;
    try {
       url = new URL(pr.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(pr.get(i).getName());
            jTextArea1.setText(pr.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 0)
        {
          i = 3-1;
          image = null;
    try {
       url = new URL(pr.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(pr.get(i).getName());
            jTextArea1.setText(pr.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
      }
    }                                       

      public void NextActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex() == 0){
        if(i < 11-1)
        {
          i = i + 1;
          image = null;
    try {
       url = new URL(ch.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
     GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(ch.get(i).getName());
            jTextArea1.setText(ch.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 11-1)
        {
           i = 0;
          image = null;
    try {
       url = new URL(cu.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(cu.get(i).getName());
            jTextArea1.setText(cu.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
          }
        }
        if(jComboBox1.getSelectedIndex() == 1){
        if(i < 6-1)
        {
          i = i + 1;
          image = null;
    try {
       url = new URL(cu.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(cu.get(i).getName());
            jTextArea1.setText(cu.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 6-1)
        {
          i = 0;
          image = null;
    try {
       url = new URL(cu.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(cu.get(i).getName());
            jTextArea1.setText(cu.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        }
        if(jComboBox1.getSelectedIndex() == 2){
        if(i < 3-1)
        {
          i = i + 1;
          image = null;
    try {
       url = new URL(ji.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
jLabel2.setText(ji.get(i).getName());
            jTextArea1.setText(ji.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 3-1)
        {
          i = 0;
          image = null;
    try {
       url = new URL(ji.get(i).getPath());
      ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(ji.get(i).getName());
            jTextArea1.setText(ji.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        }
        if(jComboBox1.getSelectedIndex() == 3){
        if(i < 3-1)
        {
          i = i + 1;
          image = null;
    try {
       url = new URL(he.get(i).getPath());
      ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(he.get(i).getName());
            jTextArea1.setText(he.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 3-1)
        {
          i = 0;
          image = null;
    try {
       url = new URL(he.get(i).getPath());
     ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(he.get(i).getName());
            jTextArea1.setText(he.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        }
        if(jComboBox1.getSelectedIndex() == 4){
        if(i < 3-1)
        {
          i = i + 1;
          image = null;
    try {
       url = new URL(pr.get(i).getPath());
      ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(pr.get(i).getName());
            jTextArea1.setText(pr.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
        else if(i == 3-1)
        {
          i = 0;
          image = null;
    try {
       url = new URL(pr.get(i).getPath());
       ImageIcon image = new ImageIcon(url); // load image direct from URL
GIFLabel.setIcon(new ImageIcon(url));
            jLabel2.setText(pr.get(i).getName());
            jTextArea1.setText(pr.get(i).getDesc());
          } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please try again.");
          }
        }
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify   
    private int i, j, k, chr,n;
    private Image image;
    private URL url;
    private FileReader fr;
    private FileWriter fw;
    private BufferedReader br;
    private String input, inputname;
    private AudioStream as;
    private Clip clip;
    private AudioInputStream ais;
    private int imgWidth;
    private int imgHeight;
    private int reImgWidth;
    private int reImgHeight;
    private StringTokenizer st;
    private String temp;
    private String inputnum,inputtype;
    private javax.swing.JLabel GIFLabel;
    private javax.swing.JButton Next;
    private javax.swing.JButton Previous;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton search;
    // End of variables declaration                   
}