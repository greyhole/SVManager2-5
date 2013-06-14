 
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Server server=new Server();
    List<String> tableList=new ArrayList<String>(800);

    public NewJFrame() {
        
        initComponents();
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List<String> name=new ArrayList<String>(1);
        name.add("Nicht Verbunden");
        int i;
        for (i=0;i<800;i++){
            tableList.add("Frei");
        }
        MyComboBoxModel combo = new MyComboBoxModel(name);
        JComboBox tableCombo = new JComboBox(combo);
        MyComboBoxModel personVerwComboLModel=combo;
        MyComboBoxModel personVerwComboRModel=combo;
        mainTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        namesubPanel = new javax.swing.JPanel();
        saveNameBtn = new javax.swing.JButton();
        femRadio = new javax.swing.JRadioButton();
        maskRadio = new javax.swing.JRadioButton();
        addNameText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        pointsubPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        roundText = new javax.swing.JTextField();
        bahnText = new javax.swing.JTextField();
        pointText = new javax.swing.JTextField();
        savePointBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        roundsubPanel = new javax.swing.JPanel();
        roundAddBtn = new javax.swing.JButton();
        roundMinBtn = new javax.swing.JButton();
        momroundLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        verwPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pointTableL = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        chPunktPunktL = new javax.swing.JTextField();
        chPunktRundeL = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        chPunktBahnL = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        chPointCheckBoxL = new javax.swing.JCheckBox();
        personVerwComboL = new javax.swing.JComboBox();
        chNameTextL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        checkChangeNameL = new javax.swing.JCheckBox();
        sortComboL = new javax.swing.JComboBox();
        delPointCheckBoxL = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        saveBtnL = new javax.swing.JButton();
        delPersCheckL = new javax.swing.JCheckBox();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        delPunktRundeL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        delPunktBahnL = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pointTableR = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        chPunktRundeR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chPunktBahnR = new javax.swing.JTextField();
        chPunktPunktR = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        saveBtnR = new javax.swing.JButton();
        delPersCheckR = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        chPointCheckBoxR = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        checkChangeNameR = new javax.swing.JCheckBox();
        chNameTextR = new javax.swing.JTextField();
        personVerwComboR = new javax.swing.JComboBox();
        sortComboR = new javax.swing.JComboBox();
        delPointCheckBoxR = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        delPunktRundeR = new javax.swing.JTextField();
        delPunktBahnR = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        serverPanel = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        serverStatLabel = new javax.swing.JLabel();
        startServ = new javax.swing.JButton();
        stopServ = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        serverPortText = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        restoreBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        mainTable.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        mainTable.setModel(new MyTableModel(tableList,server));
        mainTable.setGridColor(new java.awt.Color(255, 0, 0));
        mainTable.setRowHeight(24);
        jScrollPane1.setViewportView(mainTable);
        mainTable.getColumnModel().getColumn(0).setResizable(false);
        mainTable.getColumn("Runde").setCellEditor(new CustomCellEditor(tableCombo));
        mainTable.getColumn("Bahn 1").setCellEditor(new CustomCellEditor(tableCombo));
        mainTable.getColumn("Bahn 2").setCellEditor(new CustomCellEditor(tableCombo));
        mainTable.getColumn("Bahn 3").setCellEditor(new CustomCellEditor(tableCombo));
        mainTable.getColumn("Bahn 4").setCellEditor(new CustomCellEditor(tableCombo));

        saveNameBtn.setText("Speichern");
        saveNameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNameBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(femRadio);
        femRadio.setText("weiblich");

        buttonGroup1.add(maskRadio);
        maskRadio.setSelected(true);
        maskRadio.setText("männlich");

        jLabel1.setText("Name:");

        nameLabel1.setText("Namen hinzufügen");

        javax.swing.GroupLayout namesubPanelLayout = new javax.swing.GroupLayout(namesubPanel);
        namesubPanel.setLayout(namesubPanelLayout);
        namesubPanelLayout.setHorizontalGroup(
            namesubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namesubPanelLayout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(saveNameBtn)
                .addGap(32, 32, 32))
            .addGroup(namesubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(namesubPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(namesubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nameLabel1)
                        .addGroup(namesubPanelLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(femRadio)
                        .addComponent(maskRadio))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        namesubPanelLayout.setVerticalGroup(
            namesubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namesubPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveNameBtn)
                .addContainerGap())
            .addGroup(namesubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(namesubPanelLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(nameLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(namesubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(addNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(maskRadio)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(femRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE)))
        );

        jLabel2.setText("Punkte hinzufügen");

        jLabel3.setText("Runde:");

        jLabel4.setText("Bahn:");

        jLabel5.setText("Punkte:");

        savePointBtn.setText("Speichern");
        savePointBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePointBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pointsubPanelLayout = new javax.swing.GroupLayout(pointsubPanel);
        pointsubPanel.setLayout(pointsubPanelLayout);
        pointsubPanelLayout.setHorizontalGroup(
            pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointsubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(pointsubPanelLayout.createSequentialGroup()
                        .addGroup(pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bahnText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pointText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roundText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39)
                .addComponent(savePointBtn)
                .addContainerGap())
        );
        pointsubPanelLayout.setVerticalGroup(
            pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pointsubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(roundText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pointsubPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(bahnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(savePointBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pointsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(pointText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        roundAddBtn.setText("Runde vor");
        roundAddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundAddBtnActionPerformed(evt);
            }
        });

        roundMinBtn.setText("Runde zurück");
        roundMinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundMinBtnActionPerformed(evt);
            }
        });

        momroundLabel.setText("Momentane Runde: 1");

        javax.swing.GroupLayout roundsubPanelLayout = new javax.swing.GroupLayout(roundsubPanel);
        roundsubPanel.setLayout(roundsubPanelLayout);
        roundsubPanelLayout.setHorizontalGroup(
            roundsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(momroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(roundsubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundMinBtn)
                    .addComponent(roundAddBtn))
                .addContainerGap(586, Short.MAX_VALUE))
        );
        roundsubPanelLayout.setVerticalGroup(
            roundsubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundsubPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(momroundLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundAddBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundMinBtn)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(namesubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pointsubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roundsubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(namesubPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pointsubPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(roundsubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hauptfenster", mainPanel);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pointTableL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Runde", "Bahn", "Punkte"
            }
        ));
        jScrollPane2.setViewportView(pointTableL);

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setVisible(false);

        jLabel15.setText("Punkt bearbeiten:");

        jLabel16.setText("Runde:");

        jLabel17.setText("Wert:");

        jLabel6.setText("Bahn:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chPunktBahnL, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(chPunktRundeL)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(chPunktPunktL, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(chPunktRundeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(chPunktBahnL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(chPunktPunktL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chPointCheckBoxL.setText("Punkte bearbeiten:");
        chPointCheckBoxL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPointCheckBoxLActionPerformed(evt);
            }
        });
        jPanel5.add(chPointCheckBoxL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 16));

        personVerwComboL.setModel(personVerwComboLModel
        );
        personVerwComboL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personVerwComboLActionPerformed(evt);
            }
        });
        jPanel5.add(personVerwComboL, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 12, 202, -1));

        chNameTextL.setEditable(false);
        
        jPanel5.add(chNameTextL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 49, 205, -1));

        jLabel9.setText("Person auswählen:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel12.setText("Punkte:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        checkChangeNameL.setText("Namen ändern:");
        checkChangeNameL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkChangeNameLActionPerformed(evt);
            }
        });
        jPanel5.add(checkChangeNameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, -1, -1));

        sortComboL.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Runde", "Bahn", "Punkte" }));
        sortComboL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboLActionPerformed(evt);
            }
        });
        jPanel5.add(sortComboL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 137, -1));

        delPointCheckBoxL.setText("Punkte löschen");
        delPointCheckBoxL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delPointCheckBoxLActionPerformed(evt);
            }
        });
        jPanel5.add(delPointCheckBoxL, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, 20));

        saveBtnL.setText("Speichern");
        saveBtnL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnLActionPerformed(evt);
            }
        });

        delPersCheckL.setText("Person löschen");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(delPersCheckL)
                        .addComponent(saveBtnL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(delPersCheckL)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saveBtnL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel12.setVisible(false);

        jLabel18.setText("Punkt löschen:");

        jLabel19.setText("Runde:");

        jLabel7.setText("Bahn:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delPunktBahnL, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(delPunktRundeL))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(delPunktRundeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(delPunktBahnL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pointTableR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Runde", "Bahn", "Punkte"
            }
        ));
        jScrollPane3.setViewportView(pointTableR);

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel6.setVisible(false);

        jLabel21.setText("Punkt bearbeiten:");

        jLabel23.setText("Runde:");

        jLabel8.setText("Bahn:");

        jLabel13.setText("Wert:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chPunktPunktR)
                            .addComponent(chPunktBahnR)
                            .addComponent(chPunktRundeR))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(chPunktPunktR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chPunktRundeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chPunktBahnR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveBtnR.setText("Speichern");
        saveBtnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnRActionPerformed(evt);
            }
        });

        delPersCheckR.setText("Person löschen");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(saveBtnR, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(delPersCheckR)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delPersCheckR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveBtnR, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chPointCheckBoxR.setText("Punkte bearbeiten:");
        chPointCheckBoxR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chPointCheckBoxRActionPerformed(evt);
            }
        });
        jPanel7.add(chPointCheckBoxR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 20));

        jLabel14.setText("Punkte:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, -1, -1));

        jLabel10.setText("Person auswählen:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 17, -1, -1));

        checkChangeNameR.setText("Namen ändern:");
        checkChangeNameR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkChangeNameRActionPerformed(evt);
            }
        });
        jPanel7.add(checkChangeNameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, -1, -1));

        chNameTextR.setEditable(false);
        jPanel7.add(chNameTextR, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 55, 216, -1));

        personVerwComboR.setModel(personVerwComboRModel);
        personVerwComboR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personVerwComboRActionPerformed(evt);
            }
        });
        jPanel7.add(personVerwComboR, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 12, 216, -1));

        sortComboR.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Runde", "Bahn", "Punkte" }));
        sortComboR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboRActionPerformed(evt);
            }
        });
        jPanel7.add(sortComboR, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 94, 147, -1));

        delPointCheckBoxR.setText("Punkte löschen:");
        delPointCheckBoxR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delPointCheckBoxRActionPerformed(evt);
            }
        });
        jPanel7.add(delPointCheckBoxR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel13.setVisible(false);

        jLabel20.setText("Punkt löschen:");

        jLabel24.setText("Runde:");

        jLabel25.setText("Bahn:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delPunktRundeR)
                            .addComponent(delPunktBahnR))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(delPunktRundeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delPunktBahnR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout verwPanelLayout = new javax.swing.GroupLayout(verwPanel);
        verwPanel.setLayout(verwPanelLayout);
        verwPanelLayout.setHorizontalGroup(
            verwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verwPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(459, Short.MAX_VALUE))
        );
        verwPanelLayout.setVerticalGroup(
            verwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Verwaltung", verwPanel);

        jLabel11.setText("Serverstatus:");

        serverStatLabel.setForeground(new java.awt.Color(255, 0, 0));
        serverStatLabel.setText("Offline");

        startServ.setText("Server Starten");
        startServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startServActionPerformed(evt);
            }
        });

        stopServ.setText("Server Stoppen");
        stopServ.setEnabled(false);
        stopServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopServActionPerformed(evt);
            }
        });

        jLabel27.setText("Server-IP:");

        jLabel28.setText("Server-Hostname:");

        try{
            String sip=InetAddress.getLocalHost().getHostAddress();
            jLabel29.setText(sip);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        try{
            String sname=InetAddress.getLocalHost().getHostName();
            jLabel30.setText(sname);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        jLabel31.setText("Server-Port:");

        serverPortText.setText("3333");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serverStatLabel))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(startServ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stopServ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel29))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(serverPortText, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))))))
                .addContainerGap(118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(serverStatLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(startServ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopServ))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(serverPortText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitBtn.setText("Beenden");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Speichern");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        restoreBtn.setText("Laden");
        restoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restoreBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(restoreBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(restoreBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout serverPanelLayout = new javax.swing.GroupLayout(serverPanel);
        serverPanel.setLayout(serverPanelLayout);
        serverPanelLayout.setHorizontalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverPanelLayout.createSequentialGroup()
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(671, Short.MAX_VALUE))
        );
        serverPanelLayout.setVerticalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverPanelLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Server/Exit", serverPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTabbedPane1)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void chPointCheckBoxLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPointCheckBoxLActionPerformed
if (chPointCheckBoxL.isSelected()==true) { jPanel4.setVisible(true);}
else jPanel4.setVisible(false);
}//GEN-LAST:event_chPointCheckBoxLActionPerformed

private void chPointCheckBoxRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chPointCheckBoxRActionPerformed
if (chPointCheckBoxR.isSelected()==true) { jPanel6.setVisible(true);}
else jPanel6.setVisible(false);
}//GEN-LAST:event_chPointCheckBoxRActionPerformed

private void checkChangeNameLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkChangeNameLActionPerformed
if (checkChangeNameL.isSelected()==true) {
    chNameTextL.setEditable(true);
}
else chNameTextL.setEditable(false);    
}//GEN-LAST:event_checkChangeNameLActionPerformed

private void checkChangeNameRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkChangeNameRActionPerformed
if (checkChangeNameR.isSelected()==true) 
    chNameTextR.setEditable(true);
else chNameTextR.setEditable(false);
}//GEN-LAST:event_checkChangeNameRActionPerformed
public void updateModel(){
 MyComboBoxModel combo = new MyComboBoxModel(server.getNamen());
 MyComboBoxModel personVerwComboLModel=new MyComboBoxModel(server.getNamen());
 MyComboBoxModel personVerwComboRModel=new MyComboBoxModel(server.getNamen());
 JComboBox tableCombo = new JComboBox(combo);
 mainTable.getColumn("Runde").setCellEditor(new CustomCellEditor(tableCombo));
 mainTable.getColumn("Bahn 1").setCellEditor(new CustomCellEditor(tableCombo));
 mainTable.getColumn("Bahn 2").setCellEditor(new CustomCellEditor(tableCombo));
 mainTable.getColumn("Bahn 3").setCellEditor(new CustomCellEditor(tableCombo));
 mainTable.getColumn("Bahn 4").setCellEditor(new CustomCellEditor(tableCombo));
 personVerwComboL.setModel(personVerwComboLModel);
 personVerwComboR.setModel(personVerwComboRModel);
}
    private void startServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startServActionPerformed
    serverStatLabel.setText("Online");
    startServ.setEnabled(false);
    stopServ.setEnabled(true);
    int tmp=Integer.parseInt(serverPortText.getText());
    server.setServer(this,tmp);
    server.start();
    jPanel10.repaint();
    updateModel();
    }//GEN-LAST:event_startServActionPerformed

    private void stopServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopServActionPerformed
        server.stopIt();
        serverStatLabel.setText("Offline");
        startServ.setEnabled(true);
        stopServ.setEnabled(false);
        jPanel10.repaint();
        server.serialOs();
        server=new Server();
    }//GEN-LAST:event_stopServActionPerformed

    private void delPointCheckBoxLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delPointCheckBoxLActionPerformed
    if (delPointCheckBoxL.isSelected()==true) { jPanel12.setVisible(true);}
    else jPanel12.setVisible(false);
    }//GEN-LAST:event_delPointCheckBoxLActionPerformed

    private void delPointCheckBoxRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delPointCheckBoxRActionPerformed
    if (delPointCheckBoxR.isSelected()==true) { jPanel13.setVisible(true);}
    else jPanel13.setVisible(false);
    }//GEN-LAST:event_delPointCheckBoxRActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
    	server.serialOs();
    	System.exit( 0 );
    }//GEN-LAST:event_exitBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
    	server.serialOs();
    }//GEN-LAST:event_saveBtnActionPerformed

    private void personVerwComboRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personVerwComboRActionPerformed
        String name=(String)personVerwComboR.getSelectedItem();
        int id;
        if (sortComboR.getSelectedItem().equals("Punkte"))id=0;
        else if (sortComboR.getSelectedItem().equals("Bahn"))id=1;
        else id=2;
        pointTableR.setModel(server.getVerwaltungPunkteModel(name, id));
    }//GEN-LAST:event_personVerwComboRActionPerformed

    private void personVerwComboLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personVerwComboLActionPerformed
        String name=(String)personVerwComboL.getSelectedItem();
        int id;
        if (sortComboL.getSelectedItem().equals("Punkte"))id=0;
        else if (sortComboL.getSelectedItem().equals("Bahn"))id=1;
        else id=2;
        pointTableL.setModel(server.getVerwaltungPunkteModel(name, id));
        
    }//GEN-LAST:event_personVerwComboLActionPerformed
    
    private void saveNameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNameBtnActionPerformed
    	List<String> namen=server.getNamen();
    	String name=addNameText.getText();
    	for (String tmp:namen){
            
    		if (tmp.equals(name)){
                JOptionPane.showMessageDialog(this,
                  "Dieser Name ist schon Vorhanden",
                  "Fehler",
                      JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
    	server.addPerson(name,maskRadio.isSelected());
        addNameText.setText("");
        maskRadio.setSelected(true);
        server.serialOs();
    }//GEN-LAST:event_saveNameBtnActionPerformed

    private void savePointBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePointBtnActionPerformed
        if (pointText.getText().equals("")||roundText.getText().equals("")||bahnText.getText().equals(""))return;
    	boolean wahl=true;
    	int punkt=Integer.parseInt(pointText.getText());
        int runde=Integer.parseInt(roundText.getText());
        int bahn=Integer.parseInt(bahnText.getText());
        if (punkt<0||punkt>50||bahn<1||bahn>4||runde<1||runde>200){
        	JOptionPane.showMessageDialog(this,
                    "Falsche Werte eingetragen!",
                    "Fehler",
                        JOptionPane.ERROR_MESSAGE);
                  return;
        }
        pointText.setText("");
        roundText.setText("");
        bahnText.setText("");
        if (server.getIndex((runde-1)*4+bahn-1).getPerson().equals("Frei")){
        	Object[] options = {"Ja",
            "Nein"};
        	int n = JOptionPane.showOptionDialog(this,
        			"Auf diesem Slot ist noch kein Schütze eingetragen!\n Trotzdem speichern?",
        			"Achtung!",
        			JOptionPane.YES_NO_OPTION,
        			JOptionPane.ERROR_MESSAGE,
        			null,     //do not use a custom Icon
        			options,  //the titles of buttons
        			options[1]); //default button title
        			if (n==1)return;
        
        }
        if (server.getIndex((runde-1)*4+bahn-1).getPunkt()!=-1){
        	Object[] options = {"Ja",
            "Nein"};
        	int n = JOptionPane.showOptionDialog(this,
        			"Für diesen Slot ist bereits eine Wertung vergeben! Trotzdem speichern?",
        			"Achtung!",
        			JOptionPane.YES_NO_OPTION,
        			JOptionPane.ERROR_MESSAGE,
        			null,     //do not use a custom Icon
        			options,  //the titles of buttons
        			options[1]); //default button title
        			if (n==1)return;
        }
       
        server.addPunkt(punkt,runde-1,bahn-1);
        server.sendErg();
        server.serialOs();
       
    }//GEN-LAST:event_savePointBtnActionPerformed

    private void roundAddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundAddBtnActionPerformed
        roundAddBtn.setEnabled(false);
        server.addRunde();
        roundAddBtn.setEnabled(true);
    }//GEN-LAST:event_roundAddBtnActionPerformed

    private void roundMinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundMinBtnActionPerformed
        roundMinBtn.setEnabled(false);
        server.remRunde();
        roundMinBtn.setEnabled(true);
    }//GEN-LAST:event_roundMinBtnActionPerformed

    private void saveBtnLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnLActionPerformed
    	Object[] options = {"Ja",
        "Nein"};
    	int n = JOptionPane.showOptionDialog(this,
    			"Wollen Sie mit der Operation wirklich fortfahren?",
    			"Achtung!",
    			JOptionPane.YES_NO_OPTION,
    			JOptionPane.ERROR_MESSAGE,
    			null,     //do not use a custom Icon
    			options,  //the titles of buttons
    			options[1]); //default button title
    			if (n==1)return;
              
    	boolean chname=checkChangeNameL.isSelected();
        boolean chpoint=chPointCheckBoxL.isSelected();
        boolean delpoint=delPointCheckBoxL.isSelected();
        boolean delPers=delPersCheckL.isSelected();
        String chpunktT=chPunktPunktL.getText();
        String chrundeT=chPunktRundeL.getText();
        String chbahnT=chPunktBahnL.getText();
        String delrundeT=delPunktRundeL.getText();
        String delbahnT=delPunktBahnL.getText();
        
        if (chname){
        	List<String> namen=server.getNamen();
        	String name=chNameTextL.getText();
        	for (String tmp:namen){
                
        		if (tmp.equals(name)){
                    JOptionPane.showMessageDialog(this,
                      "Dieser Name ist schon Vorhanden",
                      "Fehler",
                          JOptionPane.ERROR_MESSAGE);
                    return;
                }
        	}
        	server.chName((String)personVerwComboL.getSelectedItem(),chNameTextL.getText());
        }
        if (chpoint&&!(chpunktT.equals(""))&&!(chrundeT.equals(""))&&!(chbahnT.equals(""))){
        	
        	int chpunkt=Integer.parseInt(chPunktPunktL.getText());
            int chrunde=Integer.parseInt(chPunktRundeL.getText())-1;
            int chbahn=Integer.parseInt(chPunktBahnL.getText())-1;
        	if (chpunkt<0||chpunkt>50||chbahn<0||chbahn>3||chrunde<0||chrunde>199){
            	JOptionPane.showMessageDialog(this,
                        "Falsche Werte eingetragen!",
                        "Fehler",
                            JOptionPane.ERROR_MESSAGE);
                      return;
            }
        	else server.addPunkt(chpunkt, chrunde,chbahn);
        }
        if (delpoint&&!(delrundeT.equals(""))&&!(delbahnT.equals(""))){
        	int delrunde=Integer.parseInt(delPunktRundeL.getText())-1;
            int delbahn=Integer.parseInt(delPunktBahnL.getText())-1;
        	if (delbahn<0||delbahn>3||delrunde<0||delrunde>199){
            	JOptionPane.showMessageDialog(this,
                        "Falsche Werte eingetragen!",
                        "Fehler",
                            JOptionPane.ERROR_MESSAGE);
                      return;
            }
        	else server.addPunkt(-1, delrunde,delbahn );
        }
        if (delPers)server.delPerson((String)personVerwComboL.getSelectedItem());
        server.serialOs();
   
    }//GEN-LAST:event_saveBtnLActionPerformed

    private void saveBtnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnRActionPerformed
    	Object[] options = {"Ja",
        "Nein"};
    	int n = JOptionPane.showOptionDialog(this,
    			"Wollen Sie mit der Operation wirklich fortfahren?",
    			"Achtung!",
    			JOptionPane.YES_NO_OPTION,
    			JOptionPane.ERROR_MESSAGE,
    			null,     //do not use a custom Icon
    			options,  //the titles of buttons
    			options[1]); //default button title
    			if (n==1)return;
              
    	boolean chname=checkChangeNameR.isSelected();
        boolean chpoint=chPointCheckBoxR.isSelected();
        boolean delpoint=delPointCheckBoxR.isSelected();
        boolean delPers=delPersCheckR.isSelected();
        String chpunktT=chPunktPunktR.getText();
        String chrundeT=chPunktRundeR.getText();
        String chbahnT=chPunktBahnR.getText();
        String delrundeT=delPunktRundeR.getText();
        String delbahnT=delPunktBahnR.getText();

        
        
        
        if (chname){
        	List<String> namen=server.getNamen();
        	String name=chNameTextR.getText();
        	for (String tmp:namen){
               
        		if (tmp.equals(name)){
                    JOptionPane.showMessageDialog(this,
                      "Dieser Name ist schon Vorhanden",
                      "Fehler",
                          JOptionPane.ERROR_MESSAGE);
                    return;
                }
        	}
        	server.chName((String)personVerwComboR.getSelectedItem(),chNameTextR.getText());
        }
        if (chpoint&&!(chpunktT.equals(""))&&!(chrundeT.equals(""))&&!(chbahnT.equals(""))){
        	int chpunkt=Integer.parseInt(chPunktPunktR.getText());
            int chrunde=Integer.parseInt(chPunktRundeR.getText())-1;
            int chbahn=Integer.parseInt(chPunktBahnR.getText())-1;
        	if (chpunkt<0||chpunkt>50||chbahn<0||chbahn>3||chrunde<0||chrunde>199){
            	JOptionPane.showMessageDialog(this,
                        "Falsche Werte eingetragen!",
                        "Fehler",
                            JOptionPane.ERROR_MESSAGE);
                      return;
            }
        	else server.addPunkt(chpunkt, chrunde,chbahn);
        }
        if (delpoint&&!(delrundeT.equals(""))&&!(delbahnT.equals(""))){
        	int delrunde=Integer.parseInt(delPunktRundeR.getText())-1;
            int delbahn=Integer.parseInt(delPunktBahnR.getText())-1;
        	if (delbahn<0||delbahn>3||delrunde<0||delrunde>199){
            	JOptionPane.showMessageDialog(this,
                        "Falsche Werte eingetragen!",
                        "Fehler",
                            JOptionPane.ERROR_MESSAGE);
                      return;
            }
        	else server.addPunkt(-1, delrunde,delbahn );
        }
        if (delPers)server.delPerson((String)personVerwComboR.getSelectedItem());
        server.serialOs();
    }//GEN-LAST:event_saveBtnRActionPerformed
    
    private void restoreBtnActionPerformed(java.awt.event.ActionEvent evt) {
    	server.laden();
    }
    private void sortComboRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboRActionPerformed
        
        String name=(String)personVerwComboR.getSelectedItem();
        int id;
        if (sortComboR.getSelectedItem().equals("Punkte"))id=0;
        else if (sortComboR.getSelectedItem().equals("Bahn"))id=1;
        else id=2;
        pointTableR.setModel(server.getVerwaltungPunkteModel(name, id));
    }//GEN-LAST:event_sortComboRActionPerformed

    private void sortComboLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboLActionPerformed
        String name=(String)personVerwComboL.getSelectedItem();
        int id;
        if (sortComboL.getSelectedItem().equals("Punkte"))id=0;
        else if (sortComboL.getSelectedItem().equals("Bahn"))id=1;
        else id=2;
        pointTableL.setModel(server.getVerwaltungPunkteModel(name, id));
    }//GEN-LAST:event_sortComboLActionPerformed
    
    public void chMainTable(List<String> list){
        this.mainTable.setModel(new MyTableModel(list,server));
        this.updateModel();
    }
    public void setRoundLabel(int runde){
    	this.momroundLabel.setText("Momentane Runde: "+runde);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    	try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addNameText;
    private javax.swing.JTextField bahnText;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField chNameTextL;
    private javax.swing.JTextField chNameTextR;
    private javax.swing.JCheckBox chPointCheckBoxL;
    private javax.swing.JCheckBox chPointCheckBoxR;
    private javax.swing.JTextField chPunktBahnL;
    private javax.swing.JTextField chPunktBahnR;
    private javax.swing.JTextField chPunktPunktL;
    private javax.swing.JTextField chPunktPunktR;
    private javax.swing.JTextField chPunktRundeL;
    private javax.swing.JTextField chPunktRundeR;
    private javax.swing.JCheckBox checkChangeNameL;
    private javax.swing.JCheckBox checkChangeNameR;
    private javax.swing.JCheckBox delPersCheckL;
    private javax.swing.JCheckBox delPersCheckR;
    private javax.swing.JCheckBox delPointCheckBoxL;
    private javax.swing.JCheckBox delPointCheckBoxR;
    private javax.swing.JTextField delPunktBahnR;
    private javax.swing.JTextField delPunktRundeR;
    private javax.swing.JButton exitBtn;
    private javax.swing.JRadioButton femRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField delPunktRundeL;
    private javax.swing.JTextField delPunktBahnL;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable mainTable;
    private javax.swing.JRadioButton maskRadio;
    private javax.swing.JLabel momroundLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JPanel namesubPanel;
    private javax.swing.JComboBox personVerwComboL;
    private javax.swing.JComboBox personVerwComboR;
    private javax.swing.JTable pointTableL;
    private javax.swing.JTable pointTableR;
    private javax.swing.JTextField pointText;
    private javax.swing.JPanel pointsubPanel;
    private javax.swing.JButton restoreBtn;
    private javax.swing.JButton roundAddBtn;
    private javax.swing.JButton roundMinBtn;
    private javax.swing.JTextField roundText;
    private javax.swing.JPanel roundsubPanel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton saveBtnL;
    private javax.swing.JButton saveBtnR;
    private javax.swing.JButton saveNameBtn;
    private javax.swing.JButton savePointBtn;
    private javax.swing.JPanel serverPanel;
    private javax.swing.JTextField serverPortText;
    private javax.swing.JLabel serverStatLabel;
    private javax.swing.JComboBox sortComboL;
    private javax.swing.JComboBox sortComboR;
    private javax.swing.JButton startServ;
    private javax.swing.JButton stopServ;
    private javax.swing.JPanel verwPanel;
    // End of variables declaration//GEN-END:variables
}
