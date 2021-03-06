/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on 19 Mar 12, 11:21:30
 */
package fingerextractor;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.Table;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Deni Setiawan
 */
public class MainWindow extends javax.swing.JFrame {

    private String monthName[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    private String monthValue[] = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};

    private int getMonthIndex(String name) {
        int i = 0;
        for (String month : monthName) {
            if (name.equals(month)) {
                break;
            }
            i++;
        }
        return i;
    }

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
        String currentyear = Utility.getDefault().toText(new Date(), "yyyy");
        yearText.setText(currentyear);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        yearText = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finger Extractor");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Konfigurasi"));

        jLabel1.setText("Finger Database : ");

        browseButton.setText("...");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Bulan : ");

        monthBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        jLabel3.setText("Tahun : ");

        startButton.setText("Mulai");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Tutup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(locationText, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseButton))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(yearText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(monthBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(jButton1))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (locationText.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Tolong isi Path ke finger database");
            return;
        }

        File database = new File(locationText.getText());
        if (!database.exists()) {
            JOptionPane.showMessageDialog(this, "lokasi file tidak ditemukan");
            return;
        }

        if (!database.isFile()) {
            JOptionPane.showMessageDialog(this, "lokasi file tidak sesuai");
            return;
        }
        String filter = yearText.getText() + "-" + monthValue[getMonthIndex(monthBox.getSelectedItem().toString())];
        try {
            Table table = Database.open(database).getTable("PersonalLog");
            List<String[]> header = new ArrayList<String[]>();
            header.add(new String[]{"FingerId", "Checkin UTC", "Checkin Note", "Checkin Offset", "Checkin User", "FingerId", "Checkout UTC", "Checkout Note", "Checkout Offset", "Checkout User", "INFO"});
            List<String[]> checkins = new ArrayList<String[]>();
            for (Map<String, Object> row : table) {
                Date dateLog = (Date) row.get("DateLog");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                String year = sdf.format(dateLog);
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                String strdate = sdf.format(dateLog);

                Object fingerid = row.get("FingerPrintID");
                Object functionkey = row.get("FunctionKey");
                Object timeLog = row.get("TimeLog") + ":00";
                String punchinstr = strdate + " " + timeLog;
                Date usertime = Utility.getDefault().toDate(punchinstr, "yyyy-MM-dd HH:mm:ss");
                Date utctime = Utility.getDefault().addDate(usertime, -7, "h");
                String data[] = new String[5];
                if (year.equals(filter) && functionkey.equals(0) && fingerid.toString().length() <= 2) {
                    data[0] = fingerid.toString();
                    data[1] = Utility.getDefault().toText(utctime, "yyyy-MM-dd HH:mm:ss");
                    data[2] = "-";
                    data[3] = "7";
                    data[4] = Utility.getDefault().toText(usertime, "yyyy-MM-dd HH:mm:ss");
                    checkins.add(data);
                }
            }

            List<String[]> checkouts = new ArrayList<String[]>();
            for (Map<String, Object> row : table) {
                Date dateLog = (Date) row.get("DateLog");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
                String year = sdf.format(dateLog);
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                String strdate = sdf.format(dateLog);

                Object fingerid = row.get("FingerPrintID");
                Object functionkey = row.get("FunctionKey");
                Object timeLog = row.get("TimeLog") + ":00";
                String punchinstr = strdate + " " + timeLog;
                Date usertime = Utility.getDefault().toDate(punchinstr, "yyyy-MM-dd HH:mm:ss");
                Date utctime = Utility.getDefault().addDate(usertime, -7, "h");
                String data[] = new String[6];
                if (year.equals(filter) && functionkey.equals(1) && fingerid.toString().length() <= 2) {
                    data[0] = fingerid.toString();
                    data[1] = Utility.getDefault().toText(utctime, "yyyy-MM-dd HH:mm:ss");
                    data[2] = "-";
                    data[3] = "7";
                    data[4] = Utility.getDefault().toText(usertime, "yyyy-MM-dd HH:mm:ss");
                    data[5] = "PUNCHED OUT";
                    checkouts.add(data);
                }
            }

            String defdata[] = new String[6];
            defdata[0] = "";
            defdata[1] = "";
            defdata[2] = "";
            defdata[3] = "";
            defdata[4] = "";
            defdata[5] = "PUNCHED IN";

            List<String[]> merged = new ArrayList<String[]>();
            for (String[] checkin : checkins) {
                for (String[] checkout : checkouts) {
                    if (checkin[0].equals(checkout[0])) {
                        merged.add(Utility.getDefault().merge(checkin, checkout));
                        break;
                    } else {
                        merged.add(Utility.getDefault().merge(checkin, defdata));
                        break;
                    }
                }
            }
//            header.addAll(merged);
            String csvfile = monthBox.getSelectedItem().toString() + "_" + yearText.getText();
            generateCsvFile(csvfile, merged, ',');
            JOptionPane.showMessageDialog(this, "File " + csvfile + " telah berhasil dibuat");
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void generateCsvFile(String sFileName, List<String[]> list, char delimiter) {
        try {
            FileWriter writer = new FileWriter(sFileName + Utility.getDefault().toText(new Date(), "HHmmssS") +  ".csv");
            int counter = 0;
            for (String[] strings : list) {
                int length = strings.length;
                for (int i = 0; i < length; i++) {
                    if (i != 5) {
                        writer.append("\"");
                        writer.append(strings[i]);
                        writer.append("\"");

                        if (i < (length - 1)) {
                            writer.append(delimiter);
                        }
                    }

                }
                writer.append('\n');
                if (counter == 100) {
                    writer.flush();
                    writer.close();
                    writer = new FileWriter(sFileName + Utility.getDefault().toText(new Date(), "HHmmssS") +  ".csv");
                    counter = 0;
                    continue;
                }
                counter++;
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogType(JFileChooser.OPEN_DIALOG);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileFilter(new FileNameExtensionFilter("Access Database", "mdb"));
        int returnval = chooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION) {
            File dir = chooser.getSelectedFile();
            locationText.setText(dir.getAbsolutePath());
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField locationText;
    private javax.swing.JComboBox monthBox;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
