package seminarski;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import java.net.InetAddress;
import java.nio.file.Paths;

public class GUI extends javax.swing.JFrame implements Funkcije{
        File folder2;
        String fold;
        static Thread server_thread = new Thread(new threads());
        static Thread connection_thread = new Thread(new connection_check());
        public enum TipPrograma {KLIJENT,SERVER};
        public static TipPrograma program;
        File ulaz=null;
        public static void copyFile(File ulaz, File izlaz) throws IOException{
         Files.copy(ulaz.toPath(), izlaz.toPath());
     }
     public static void main(String[] args) {
        server_thread.start();
        program = TipPrograma.SERVER;
        IndentityCheck ic = new IndentityCheck();
        ic.setVisible(true);
        HOST_NAME[0] = "192.168.8.108";
        HOST_NAME[1] = "192.168.200.5";
        HOST_NAME[2] = "192.168.7.107";
        HOST_NAME[3] = "192.168.7.108";
    //*****************************************************************************************//
                            //Formiranje date picker widget-a
            model.setDate(Integer.parseInt(GODINA), Integer.parseInt(MESEC), Integer.parseInt(DAN));
            model.setSelected(true);
            P.put("text.today", "Today");
            P.put("text.month", "Month");
            P.put("text.year", "Year");
            JDatePanelImpl datePanel = new JDatePanelImpl(model, P);
            JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
            datePicker.setSize(170, 30);
        
        //*****************************************************************************************//
    }
    
    public GUI() {
        initComponents();
    }@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Главни мени");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Baskerville Old Face", 1, 10)); // NOI18N
        setMinimumSize(new java.awt.Dimension(340, 240));

        jButton1.setText("Нови унос");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Прегледај све");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Копирај фајлове у пројекат");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Приоритет 1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Приоритет 2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Приоритет 3");

        jButton4.setText("Пошаљи фајлове");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Слање без енкрипције");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Слање са енкрипцијом");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem1.setText("Декриптуј фајл");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton2)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jButton1)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton3)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        String selektovanFajl=jList1.getSelectedValue();
        jFileChooser1.showOpenDialog(jFileChooser1);
        ulaz = jFileChooser1.getSelectedFile();
        String pom = null;
        if(ulaz!=null)
            pom=ulaz.getName();
        File izlaz = new File("projekti/"+selektovanFajl+"/"+ulaz.getName());
        try{
        if(izlaz.isFile()){
            int yesNo=JOptionPane.showConfirmDialog(this, 
                    "Фајл са истим именом већ постоји.", 
                    "Да ли сте сигурни да желите да га замените?",
                    JOptionPane.YES_NO_OPTION);
            if(yesNo==JOptionPane.YES_OPTION){
                izlaz.delete();
                izlaz=new File("projekti/"+selektovanFajl+"/"+pom);
                ulaz.createNewFile();
                copyFile(ulaz, izlaz);
            }
            else{
                copyFile(ulaz, izlaz);
            }}}
            catch (IOException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        ulaz=null;
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(!ROOT.isDirectory())
            ROOT.mkdir();
        fold = "projekti/" + model.getDay() + model.getMonth() + model.getYear();
        if(jRadioButton1.isSelected())
            fold += "-1";
        else if(jRadioButton2.isSelected())
            fold += "-2";
        else if(jRadioButton3.isSelected())
            fold += "-3";
        folder2 = new File(fold);
        if(!folder2.isDirectory())
            folder2.mkdir();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String[]array = Arrays.toString(ROOT.listFiles()).split(",");
        String[]array2 = new String[array.length];
        int index2 = 0;
        for(String i:array){
            int index = i.indexOf("\\");
            if(index > 0)
                array2[index2] = i.substring(index+1);
            index2 += 1;
        }   
        array2[index2 -1] = array2[index2 - 1].substring(0, (array2[index2-1]).length() - 1);
        jList1.setListData(array2);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
            jFileChooser1.setCurrentDirectory(ROOT);
            jFileChooser1.showOpenDialog(jFileChooser1);
            ulaz = jFileChooser1.getSelectedFile();
            if(!ulaz.getName().endsWith(".pdf")){
                JOptionPane.showMessageDialog(this,"Могуће је слати само pdf документа.");
                ulaz = null;
            }
            else if(ulaz.length()>10240*1024)
            {
                JOptionPane.showMessageDialog(this, "Фајл који шаљете прелази 10 MB");
                ulaz = null;
            }
            if(ulaz!=null){
                String input_Date = JOptionPane.showInputDialog("Унесите датум:");
                if(input_Date.length()==10)
            for(int i=0; i<1; i++){
                try {
                        Socket client = new Socket(HOST_NAME[i], PORT_NUMBER_SERVER);
                        program = TipPrograma.KLIJENT;
                        String ime_fajla = ulaz.getName();
                        OutputStream izlaz = client.getOutputStream();
                        PrintWriter iz = new PrintWriter(izlaz);
                        iz.println(""+ input_Date.substring(0, 8) + input_Date.charAt(9) + ime_fajla);
                        iz.flush();
                        File fajl = ulaz;
                    if(jRadioButton4.isSelected()){
                    //if(!(InetAddress.getByName(HOST_NAME[i]).isReachable(2000)))
                    //   System.out.printf("Није могуће послати поруку на: %s", HOST_NAME[i]);
                    //else{
                            InputStream in = new FileInputStream(fajl);
                            byte niz[] = new byte[(int)fajl.length()];
                            int count;
                            while ((count = in.read(niz))>0) {
                                izlaz.write(niz);
                            }
                            client.close();izlaz.close();iz.close();in.close();
                            connection_thread.start();
                        }//}
                    else if(jRadioButton5.isSelected()){
                            Encrypt.encrypt(Paths.get(fajl.getName()));
                            File crypted_file = new File("crypted_" + fajl.getName());
                            InputStream in = new FileInputStream(crypted_file);
                            byte niz[] = new byte[(int)crypted_file.length()];
                            int count;
                            while ((count = in.read(niz))>0) {
                                izlaz.write(niz);
                            }
                            client.close();izlaz.close();iz.close();in.close();
                            connection_thread.start();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                    catch (Exception ex) {
                        Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            }
            program = TipPrograma.SERVER;
    }//GEN-LAST:event_jButton4MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jFileChooser1.setCurrentDirectory(ROOT);
        jFileChooser1.showOpenDialog(jFileChooser1);
        byte[] cipher_text;
        try {
            cipher_text = Files.readAllBytes(Paths.get(jFileChooser1.getSelectedFile().getPath()));
            Encrypt.decrypt(cipher_text);
        }
        catch (Exception ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
