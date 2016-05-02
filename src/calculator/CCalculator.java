package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class CCalculator extends javax.swing.JFrame {

    int prated;
    int equwat = 0;

    public CCalculator() {

        initComponents();
        //getContentPane().setBackground(new Color(155, 219, 195));
        getContentPane().setBackground(new Color(164, 225, 255));
        pratedTextField.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dirbuttonGroup = new javax.swing.ButtonGroup();
        pcorbuttonGroup = new javax.swing.ButtonGroup();
        lampsbuttonGroup = new javax.swing.ButtonGroup();
        classLabel = new javax.swing.JLabel();
        kindLampPanel = new javax.swing.JPanel();
        CFLRadioButton = new javax.swing.JRadioButton();
        HalogenRadioButton = new javax.swing.JRadioButton();
        LEDRadioButton = new javax.swing.JRadioButton();
        wattageLumenPanel = new javax.swing.JPanel();
        pratedLabel = new javax.swing.JLabel();
        pratedTextField = new javax.swing.JTextField();
        WLabel = new javax.swing.JLabel();
        lumenTextField = new javax.swing.JTextField();
        lmLabel = new javax.swing.JLabel();
        lumenLabel = new javax.swing.JLabel();
        angleShapeLlmfPanel = new javax.swing.JPanel();
        angleLabel = new javax.swing.JLabel();
        angleFormattedTextField = new javax.swing.JFormattedTextField();
        angleLabel1 = new javax.swing.JLabel();
        shapeLabel = new javax.swing.JLabel();
        shapeComboBox = new javax.swing.JComboBox();
        llmfLabel = new javax.swing.JLabel();
        llmfFormattedTextField = new javax.swing.JFormattedTextField();
        dirNondirjPanel = new javax.swing.JPanel();
        dirRadioButton = new javax.swing.JRadioButton();
        ndirRadioButton = new javax.swing.JRadioButton();
        controlGearPanel = new javax.swing.JPanel();
        noRadioButton = new javax.swing.JRadioButton();
        extComboBox = new WideComboBox();
        yesRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        outputPanel = new javax.swing.JPanel();
        PcorLabel1 = new javax.swing.JLabel();
        PcorLabel2 = new javax.swing.JLabel();
        PcorLabel = new javax.swing.JLabel();
        PrefLabel1 = new javax.swing.JLabel();
        PrefLabel2 = new javax.swing.JLabel();
        PrefLabel = new javax.swing.JLabel();
        EeiLabel1 = new javax.swing.JLabel();
        EeiLabel2 = new javax.swing.JLabel();
        EeiLabel = new javax.swing.JLabel();
        EquLabel = new javax.swing.JLabel();
        EquLabel1 = new javax.swing.JLabel();
        specialPurposejPanel = new javax.swing.JPanel();
        specialPurposejLabel = new javax.swing.JLabel();
        coordinatesjLabel = new javax.swing.JLabel();
        xjLabel = new javax.swing.JLabel();
        xjFormattedTextField = new javax.swing.JFormattedTextField();
        xResultjLabel = new javax.swing.JLabel();
        yjLabel = new javax.swing.JLabel();
        yjFormattedTextField = new javax.swing.JFormattedTextField();
        yResultjLabel = new javax.swing.JLabel();
        resultjLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Class Calculator  (UE) 874/2012");
        setBackground(new java.awt.Color(99, 153, 140));
        setBounds(new java.awt.Rectangle(200, 200, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage("eei.jpg"));
        setPreferredSize(new java.awt.Dimension(485, 610));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        classLabel.setBackground(new java.awt.Color(164, 225, 255));
        classLabel.setFont(new java.awt.Font("Calibri", 1, 90)); // NOI18N
        classLabel.setForeground(new java.awt.Color(255, 255, 255));
        classLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        classLabel.setOpaque(true);
        classLabel.setPreferredSize(new java.awt.Dimension(460, 90));
        getContentPane().add(classLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        kindLampPanel.setBackground(new java.awt.Color(199, 236, 255));
        kindLampPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        kindLampPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CFLRadioButton.setBackground(new java.awt.Color(199, 236, 255));
        lampsbuttonGroup.add(CFLRadioButton);
        CFLRadioButton.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        CFLRadioButton.setForeground(java.awt.Color.gray);
        CFLRadioButton.setText("CFL");
        CFLRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CFLRadioButtonActionPerformed(evt);
            }
        });
        kindLampPanel.add(CFLRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 5, -1, -1));

        HalogenRadioButton.setBackground(new java.awt.Color(199, 236, 255));
        lampsbuttonGroup.add(HalogenRadioButton);
        HalogenRadioButton.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        HalogenRadioButton.setForeground(java.awt.Color.gray);
        HalogenRadioButton.setText("Halogen");
        HalogenRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HalogenRadioButtonActionPerformed(evt);
            }
        });
        kindLampPanel.add(HalogenRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        LEDRadioButton.setBackground(new java.awt.Color(199, 236, 255));
        lampsbuttonGroup.add(LEDRadioButton);
        LEDRadioButton.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        LEDRadioButton.setSelected(true);
        LEDRadioButton.setText("LED");
        LEDRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEDRadioButtonActionPerformed(evt);
            }
        });
        kindLampPanel.add(LEDRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, -1, -1));

        getContentPane().add(kindLampPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 290, 35));

        wattageLumenPanel.setBackground(new java.awt.Color(199, 236, 255));
        wattageLumenPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        wattageLumenPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pratedLabel.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        pratedLabel.setText("<html>Rated power (<b>P<sub>rated</sub></b>) :</html>");
        pratedLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        wattageLumenPanel.add(pratedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, -1, 25));

        pratedTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pratedTextField.setForeground(java.awt.Color.blue);
        pratedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pratedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pratedTextFieldActionPerformed(evt);
            }
        });
        pratedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pratedTextFieldKeyPressed(evt);
            }
        });
        pratedTextField.transferFocus();
        wattageLumenPanel.add(pratedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 10, 50, -1));

        WLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        WLabel.setText("W");
        WLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        WLabel.setPreferredSize(new java.awt.Dimension(16, 28));
        wattageLumenPanel.add(WLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 10, -1, -1));

        lumenTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lumenTextField.setForeground(java.awt.Color.blue);
        lumenTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lumenTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lumenTextFieldActionPerformed(evt);
            }
        });
        wattageLumenPanel.add(lumenTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 45, 50, -1));

        lmLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lmLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lmLabel.setText("lm");
        lmLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lmLabel.setPreferredSize(new java.awt.Dimension(19, 28));
        wattageLumenPanel.add(lmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 45, -1, -1));

        lumenLabel.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        lumenLabel.setText("<html>Useful luminous flux (<b>Φ<sub>use</sub></b>) :</html>");
        lumenLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        wattageLumenPanel.add(lumenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, -1, 25));

        getContentPane().add(wattageLumenPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 80));

        angleShapeLlmfPanel.setBackground(new java.awt.Color(199, 236, 255));
        angleShapeLlmfPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        angleShapeLlmfPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        angleLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        angleLabel.setText("Beam angle:");
        angleShapeLlmfPanel.add(angleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        try {
            angleFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("***")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        angleFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        angleFormattedTextField.setText("38 ");
        angleFormattedTextField.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        angleFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angleFormattedTextFieldActionPerformed(evt);
            }
        });
        angleShapeLlmfPanel.add(angleFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 25, -1));

        angleLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        angleLabel1.setText("°");
        angleShapeLlmfPanel.add(angleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 10, 10, 20));

        shapeLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        shapeLabel.setText("Shape:");
        shapeLabel.setPreferredSize(new java.awt.Dimension(37, 22));
        angleShapeLlmfPanel.add(shapeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 40, -1));

        shapeComboBox.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        shapeComboBox.setMaximumRowCount(14);
        shapeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AR111", "MR11_GU4", "MR16_GU5_3", "PAR16", "PAR20", "PAR25", "PAR30S", "PAR36", "PAR38", "R50_NR50", "R63_NR63", "R80_NR80", "R95_NR95", "R125" }));
        shapeComboBox.setSelectedIndex(3);
        shapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeComboBoxActionPerformed(evt);
            }
        });
        angleShapeLlmfPanel.add(shapeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, -1));

        llmfLabel.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        llmfLabel.setText("LLMF:");
        llmfLabel.setToolTipText("lumen maintenance factor at the end of the nominal life");
        llmfLabel.setPreferredSize(new java.awt.Dimension(37, 22));
        angleShapeLlmfPanel.add(llmfLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 40, -1));
        llmfLabel.getAccessibleContext().setAccessibleDescription("");

        llmfFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        llmfFormattedTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        llmfFormattedTextField.setText("0.70");
        llmfFormattedTextField.setToolTipText("lumen maintenance factor at the end of the nominal life");
        llmfFormattedTextField.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        llmfFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llmfFormattedTextFieldActionPerformed(evt);
            }
        });
        angleShapeLlmfPanel.add(llmfFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 90, 40, -1));
        llmfFormattedTextField.getAccessibleContext().setAccessibleDescription("");
        NumberFormat format = NumberFormat.getNumberInstance();
        format.setGroupingUsed(false);
        format.setGroupingUsed(true);// or add the group chars to the filter
        format.setMaximumIntegerDigits(10);
        format.setMaximumFractionDigits(2);
        format.setMinimumFractionDigits(5);
        format.setRoundingMode(RoundingMode.HALF_UP);

        getContentPane().add(angleShapeLlmfPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 160, 120));

        dirNondirjPanel.setBackground(new java.awt.Color(199, 236, 255));
        dirNondirjPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dirNondirjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dirRadioButton.setBackground(new java.awt.Color(199, 236, 255));
        dirbuttonGroup.add(dirRadioButton);
        dirRadioButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        dirRadioButton.setText("directional lamps");
        dirRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirRadioButtonActionPerformed(evt);
            }
        });
        dirRadioButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dirRadioButtonKeyPressed(evt);
            }
        });
        dirNondirjPanel.add(dirRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        ndirRadioButton.setBackground(new java.awt.Color(199, 236, 255));
        dirbuttonGroup.add(ndirRadioButton);
        ndirRadioButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ndirRadioButton.setForeground(java.awt.Color.gray);
        ndirRadioButton.setText("non-directional lamps");
        ndirRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ndirRadioButtonActionPerformed(evt);
            }
        });
        dirNondirjPanel.add(ndirRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 5, -1, -1));

        getContentPane().add(dirNondirjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 460, 35));

        controlGearPanel.setBackground(new java.awt.Color(199, 236, 255));
        controlGearPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        controlGearPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        noRadioButton.setBackground(new java.awt.Color(199, 236, 255));
        pcorbuttonGroup.add(noRadioButton);
        noRadioButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        noRadioButton.setSelected(true);
        noRadioButton.setText("No");
        noRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        noRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        noRadioButton.setPreferredSize(new java.awt.Dimension(48, 20));
        noRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noRadioButtonActionPerformed(evt);
            }
        });
        controlGearPanel.add(noRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        extComboBox.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        extComboBox.setMaximumRowCount(6);
        extComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lamps operating on external halogen control gear", "Lamps operating on external LED control gear", "Fluorescent lamps of 16mm diameter (T5 lamps) and 4-pin single capped fluorescent lamps operating on external fluorescent lamp control gear", "Other lamps operating on external fluorescent lamp control gear", "Lamps operating on external high-intensity discharge lamp control gear", "Lamps operating on external low pressure sodium lamp control gear" }));
        extComboBox.setToolTipText("");
        extComboBox.setEnabled(false);
        extComboBox.setMaximumSize(new java.awt.Dimension(400, 32767));
        extComboBox.setMinimumSize(new java.awt.Dimension(400, 22));
        extComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extComboBoxActionPerformed(evt);
            }
        });
        controlGearPanel.add(extComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 390, 20));

        yesRadioButton.setBackground(new java.awt.Color(199, 236, 255));
        pcorbuttonGroup.add(yesRadioButton);
        yesRadioButton.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        yesRadioButton.setForeground(java.awt.Color.gray);
        yesRadioButton.setText("Yes");
        yesRadioButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yesRadioButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        yesRadioButton.setPreferredSize(new java.awt.Dimension(48, 20));
        yesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesRadioButtonActionPerformed(evt);
            }
        });
        controlGearPanel.add(yesRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Lamps with external control gear:");
        controlGearPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 10, -1, -1));

        getContentPane().add(controlGearPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 175, 460, 80));

        outputPanel.setBackground(new java.awt.Color(66, 91, 127));
        outputPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        outputPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PcorLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PcorLabel1.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(PcorLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        PcorLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PcorLabel2.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(PcorLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 10, -1, -1));

        PcorLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PcorLabel.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(PcorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        PrefLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PrefLabel1.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(PrefLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 25, -1, -1));

        PrefLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PrefLabel2.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(PrefLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 25, -1, -1));

        PrefLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PrefLabel.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(PrefLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 25, -1, -1));

        EeiLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        EeiLabel1.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(EeiLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        EeiLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        EeiLabel2.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(EeiLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 40, -1, -1));

        EeiLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        EeiLabel.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(EeiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        EquLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        EquLabel.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(EquLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        EquLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        EquLabel1.setForeground(new java.awt.Color(255, 255, 255));
        outputPanel.add(EquLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 70, -1, -1));

        getContentPane().add(outputPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 460, 100));

        specialPurposejPanel.setBackground(new java.awt.Color(199, 236, 255));
        specialPurposejPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        specialPurposejPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        specialPurposejLabel.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        specialPurposejLabel.setText("Special purpose:");
        specialPurposejPanel.add(specialPurposejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        coordinatesjLabel.setText("Chromaticity coordinates:");
        specialPurposejPanel.add(coordinatesjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 25, -1, -1));

        xjLabel.setText("x:");
        xjLabel.setPreferredSize(new java.awt.Dimension(10, 20));
        specialPurposejPanel.add(xjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 15, -1, -1));

        xjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.####"))));
        xjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xjFormattedTextFieldActionPerformed(evt);
            }
        });
        xjFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xjFormattedTextFieldKeyPressed(evt);
            }
        });
        specialPurposejPanel.add(xjFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 15, 50, -1));
        specialPurposejPanel.add(xResultjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 15, -1, 20));

        yjLabel.setText("y:");
        yjLabel.setPreferredSize(new java.awt.Dimension(10, 20));
        specialPurposejPanel.add(yjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 35, -1, -1));

        yjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.####"))));
        yjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yjFormattedTextFieldActionPerformed(evt);
            }
        });
        yjFormattedTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yjFormattedTextFieldKeyPressed(evt);
            }
        });
        specialPurposejPanel.add(yjFormattedTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 35, 50, -1));
        specialPurposejPanel.add(yResultjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, -1, 20));
        specialPurposejPanel.add(resultjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        getContentPane().add(specialPurposejPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 460, 80));

        getAccessibleContext().setAccessibleDescription("Cable Calculator");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    }//GEN-LAST:event_formComponentShown

    private void lumenTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lumenTextFieldActionPerformed
        Calculation(1);
    }//GEN-LAST:event_lumenTextFieldActionPerformed

    private void pratedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pratedTextFieldActionPerformed
        Calculation(1);
    }//GEN-LAST:event_pratedTextFieldActionPerformed

    private void pratedTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pratedTextFieldKeyPressed
        pratedTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pratedTextField.transferFocus();
            }
        });
    }//GEN-LAST:event_pratedTextFieldKeyPressed

    private void ndirRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ndirRadioButtonActionPerformed
        dirRadioButton.setFont(new Font(dirRadioButton.getFont().getName(), Font.PLAIN, dirRadioButton.getFont().getSize()));
        dirRadioButton.setForeground(Color.GRAY);
        ndirRadioButton.setFont(new Font(ndirRadioButton.getFont().getName(), Font.BOLD, ndirRadioButton.getFont().getSize()));
        ndirRadioButton.setForeground(Color.BLACK);
        if (!noRadioButton.isSelected()) {
            noRadioButton.doClick();
        }
        Calculation(1);
    }//GEN-LAST:event_ndirRadioButtonActionPerformed

    private void dirRadioButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dirRadioButtonKeyPressed
    }//GEN-LAST:event_dirRadioButtonKeyPressed

    private void dirRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirRadioButtonActionPerformed
        dirRadioButton.setFont(new Font(dirRadioButton.getFont().getName(), Font.BOLD, dirRadioButton.getFont().getSize()));
        dirRadioButton.setForeground(Color.BLACK);
        ndirRadioButton.setFont(new Font(ndirRadioButton.getFont().getName(), Font.PLAIN, ndirRadioButton.getFont().getSize()));
        ndirRadioButton.setForeground(Color.GRAY);
        if (!noRadioButton.isSelected()) {
            noRadioButton.doClick();
        }
        Calculation(1);
    }//GEN-LAST:event_dirRadioButtonActionPerformed

    private void noRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noRadioButtonActionPerformed
        yesRadioButton.setFont(new Font(yesRadioButton.getFont().getName(), Font.PLAIN, yesRadioButton.getFont().getSize()));
        yesRadioButton.setForeground(Color.GRAY);
        noRadioButton.setFont(new Font(noRadioButton.getFont().getName(), Font.BOLD, noRadioButton.getFont().getSize()));
        noRadioButton.setForeground(Color.BLACK);
        extComboBox.setEnabled(false);
        Calculation(1);
    }//GEN-LAST:event_noRadioButtonActionPerformed

    private void LEDRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEDRadioButtonActionPerformed
        LEDRadioButton.setFont(new Font(LEDRadioButton.getFont().getName(), Font.BOLD, LEDRadioButton.getFont().getSize()));
        LEDRadioButton.setForeground(Color.BLACK);
        HalogenRadioButton.setFont(new Font(HalogenRadioButton.getFont().getName(), Font.PLAIN, HalogenRadioButton.getFont().getSize()));
        HalogenRadioButton.setForeground(Color.GRAY);
        CFLRadioButton.setFont(new Font(CFLRadioButton.getFont().getName(), Font.PLAIN, CFLRadioButton.getFont().getSize()));
        CFLRadioButton.setForeground(Color.GRAY);
        if (!noRadioButton.isSelected()) {
            noRadioButton.doClick();
        }
        Calculation(1);
    }//GEN-LAST:event_LEDRadioButtonActionPerformed

    private void HalogenRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HalogenRadioButtonActionPerformed
        LEDRadioButton.setFont(new Font(LEDRadioButton.getFont().getName(), Font.PLAIN, LEDRadioButton.getFont().getSize()));
        LEDRadioButton.setForeground(Color.GRAY);
        HalogenRadioButton.setFont(new Font(HalogenRadioButton.getFont().getName(), Font.BOLD, HalogenRadioButton.getFont().getSize()));
        HalogenRadioButton.setForeground(Color.BLACK);
        CFLRadioButton.setFont(new Font(CFLRadioButton.getFont().getName(), Font.PLAIN, CFLRadioButton.getFont().getSize()));
        CFLRadioButton.setForeground(Color.GRAY);
        if (!noRadioButton.isSelected()) {
            noRadioButton.doClick();
        }
        Calculation(1);
    }//GEN-LAST:event_HalogenRadioButtonActionPerformed

    private void CFLRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CFLRadioButtonActionPerformed
        LEDRadioButton.setFont(new Font(LEDRadioButton.getFont().getName(), Font.PLAIN, LEDRadioButton.getFont().getSize()));
        LEDRadioButton.setForeground(Color.GRAY);
        HalogenRadioButton.setFont(new Font(HalogenRadioButton.getFont().getName(), Font.PLAIN, HalogenRadioButton.getFont().getSize()));
        HalogenRadioButton.setForeground(Color.GRAY);
        CFLRadioButton.setFont(new Font(CFLRadioButton.getFont().getName(), Font.BOLD, CFLRadioButton.getFont().getSize()));
        CFLRadioButton.setForeground(Color.BLACK);
        if (!noRadioButton.isSelected()) {
            noRadioButton.doClick();
        }
        Calculation(1);
    }//GEN-LAST:event_CFLRadioButtonActionPerformed

    private void angleFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angleFormattedTextFieldActionPerformed
        if (Integer.parseInt(angleFormattedTextField.getText().replaceAll("\\s", "")) < 120) {
            dirRadioButton.doClick();
        } else {
            ndirRadioButton.doClick();
        }
    }//GEN-LAST:event_angleFormattedTextFieldActionPerformed

    private void extComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extComboBoxActionPerformed
        switch (extComboBox.getSelectedIndex()) {
            case 0:
                Calculation(1.06);
                break;
            case 1:
                Calculation(1.10);
                break;
            case 2:
                Calculation(1.10);
                break;
            case 3:
                double numerator = (0.0103 * lumen()) + (0.24 * Math.sqrt(lumen()));
                double denominator = (0.0097 * lumen()) + (0.15 * Math.sqrt(lumen()));
                double parameter = numerator / denominator;
                Calculation(parameter);
                break;
            case 4:
                Calculation(1.10);
                break;
            case 5:
                Calculation(1.15);
                break;
        }
    }//GEN-LAST:event_extComboBoxActionPerformed

    private void yesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesRadioButtonActionPerformed
        yesRadioButton.setFont(new Font(yesRadioButton.getFont().getName(), Font.BOLD, yesRadioButton.getFont().getSize()));
        yesRadioButton.setForeground(Color.BLACK);
        noRadioButton.setFont(new Font(noRadioButton.getFont().getName(), Font.PLAIN, noRadioButton.getFont().getSize()));
        noRadioButton.setForeground(Color.GRAY);
        extComboBox.setEnabled(true);
        extComboBox.showPopup();
    }//GEN-LAST:event_yesRadioButtonActionPerformed

    private void llmfFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llmfFormattedTextFieldActionPerformed
        llmfFormattedTextField.setText(llmfFormattedTextField.getText().replace(",", "."));
        if (!noRadioButton.isSelected()) {
            noRadioButton.doClick();
        }
        Calculation(1);
    }//GEN-LAST:event_llmfFormattedTextFieldActionPerformed

    private void shapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeComboBoxActionPerformed
        Calculation(1);
    }//GEN-LAST:event_shapeComboBoxActionPerformed

    private void xjFormattedTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xjFormattedTextFieldKeyPressed
        xjFormattedTextField.setText(xjFormattedTextField.getText().replace(",", "."));
        xjFormattedTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                xjFormattedTextField.transferFocus();
            }
        });
        SpecialPurpose();
    }//GEN-LAST:event_xjFormattedTextFieldKeyPressed

    private void yjFormattedTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yjFormattedTextFieldKeyPressed
        yjFormattedTextField.setText(yjFormattedTextField.getText().replace(",", "."));
    }//GEN-LAST:event_yjFormattedTextFieldKeyPressed

    private void yjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yjFormattedTextFieldActionPerformed
        SpecialPurpose();
    }//GEN-LAST:event_yjFormattedTextFieldActionPerformed

    private void xjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xjFormattedTextFieldActionPerformed
        SpecialPurpose();
    }//GEN-LAST:event_xjFormattedTextFieldActionPerformed

//    double llmf() {
//        double llmfValue = Double.parseDouble(llmfFormattedTextField.getText().replaceAll("\\s", ""));
//        return llmfValue;
//    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CCalculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CFLRadioButton;
    private javax.swing.JLabel EeiLabel;
    private javax.swing.JLabel EeiLabel1;
    private javax.swing.JLabel EeiLabel2;
    private javax.swing.JLabel EquLabel;
    private javax.swing.JLabel EquLabel1;
    private javax.swing.JRadioButton HalogenRadioButton;
    private javax.swing.JRadioButton LEDRadioButton;
    private javax.swing.JLabel PcorLabel;
    private javax.swing.JLabel PcorLabel1;
    private javax.swing.JLabel PcorLabel2;
    private javax.swing.JLabel PrefLabel;
    private javax.swing.JLabel PrefLabel1;
    private javax.swing.JLabel PrefLabel2;
    private javax.swing.JLabel WLabel;
    private javax.swing.JFormattedTextField angleFormattedTextField;
    private javax.swing.JLabel angleLabel;
    private javax.swing.JLabel angleLabel1;
    private javax.swing.JPanel angleShapeLlmfPanel;
    private javax.swing.JLabel classLabel;
    private javax.swing.JPanel controlGearPanel;
    private javax.swing.JLabel coordinatesjLabel;
    private javax.swing.JPanel dirNondirjPanel;
    private javax.swing.JRadioButton dirRadioButton;
    private javax.swing.ButtonGroup dirbuttonGroup;
    private javax.swing.JComboBox extComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel kindLampPanel;
    private javax.swing.ButtonGroup lampsbuttonGroup;
    private javax.swing.JFormattedTextField llmfFormattedTextField;
    private javax.swing.JLabel llmfLabel;
    private javax.swing.JLabel lmLabel;
    private javax.swing.JLabel lumenLabel;
    private javax.swing.JTextField lumenTextField;
    private javax.swing.JRadioButton ndirRadioButton;
    private javax.swing.JRadioButton noRadioButton;
    private javax.swing.JPanel outputPanel;
    private javax.swing.ButtonGroup pcorbuttonGroup;
    private javax.swing.JLabel pratedLabel;
    private javax.swing.JTextField pratedTextField;
    private javax.swing.JLabel resultjLabel;
    private javax.swing.JComboBox shapeComboBox;
    private javax.swing.JLabel shapeLabel;
    private javax.swing.JLabel specialPurposejLabel;
    private javax.swing.JPanel specialPurposejPanel;
    private javax.swing.JPanel wattageLumenPanel;
    private javax.swing.JLabel xResultjLabel;
    private javax.swing.JFormattedTextField xjFormattedTextField;
    private javax.swing.JLabel xjLabel;
    private javax.swing.JLabel yResultjLabel;
    private javax.swing.JRadioButton yesRadioButton;
    private javax.swing.JFormattedTextField yjFormattedTextField;
    private javax.swing.JLabel yjLabel;
    // End of variables declaration//GEN-END:variables

    public double lumen() {
        String lumen1 = lumenTextField.getText();
        lumen1 = lumen1.replace(',', '.');
        double lumen = Double.parseDouble(lumen1);
        return lumen;
    }

    public void Calculation(double par) {
        if (!lumenTextField.getText().isEmpty() && !pratedTextField.getText().isEmpty()) {
            double lumen = lumen();

            String prated1 = pratedTextField.getText();
            prated1 = prated1.replace(',', '.');
            double prated = Double.parseDouble(prated1);

            double pcor2 = prated * par;
            pcor2 *= 100;
            double pcor1 = Math.round(pcor2);
            pcor1 /= 100;
            PcorLabel1.setText("Power corrected for control gear losses:");
            PcorLabel2.setText("<html><b>P<sub>cor</sub>= </b></html>");
            PcorLabel.setText(Double.toString(pcor1) + " W");

            PrefLabel1.setText("Reference power obtained from the useful luminous flux:");
            PrefLabel2.setText("<html><b>P<sub>ref</sub>= </b></html>");

            EeiLabel1.setText("Energy eficiency index:");
            EeiLabel2.setText("<html><b>EEI = </b></html>");

            if (ndirRadioButton.isSelected()) {
                EquLabel.setText("Claimed equivalent incandescent lamp power: ");

                if (LEDRadioButton.isSelected()) {
                    if (lumen < 136) {
                        equwat = (int) Math.round(0.1102941 * lumen);
                    } else if (lumen >= 136 && lumen < 249) {
                        equwat = (int) Math.round(0.0884956 * lumen + 2.9646018);
                    } else if (lumen >= 249 && lumen < 470) {
                        equwat = (int) Math.round(0.0678733 * lumen + 8.0995475);
                    } else if (lumen >= 470 && lumen < 806) {
                        equwat = (int) Math.round(0.0595238 * lumen + 12.02381);
                    } else if (lumen >= 806 && lumen < 1055) {
                        equwat = (int) Math.round(0.060241 * lumen + 11.445783);
                    } else if (lumen >= 1055 && lumen < 1521) {
                        equwat = (int) Math.round(0.0536481 * lumen + 18.401288);
                    } else if (lumen >= 1521 && lumen < 2452) {
                        equwat = (int) Math.round(0.0537057 * lumen + 18.313641);
                    } else if (lumen >= 2452) {
                        equwat = (int) Math.round(0.05 * lumen + 27.4);
                    }
                    EquLabel1.setText(Integer.toString(equwat) + " W");
                } else if (HalogenRadioButton.isSelected()) {
                    if (lumen < 119) {
                        equwat = (int) Math.round(0.12605 * lumen);
                    } else if (lumen >= 119 && lumen < 217) {
                        equwat = (int) Math.round(0.102041 * lumen + 2.857143);
                    } else if (lumen >= 217 && lumen < 410) {
                        equwat = (int) Math.round(0.07772 * lumen + 8.134715);
                    } else if (lumen >= 410 && lumen < 702) {
                        equwat = (int) Math.round(0.068493 * lumen + 11.91781);
                    } else if (lumen >= 702 && lumen < 920) {
                        equwat = (int) Math.round(0.068807 * lumen + 11.69725);
                    } else if (lumen >= 920 && lumen < 1326) {
                        equwat = (int) Math.round(0.061576 * lumen + 18.34975);
                    } else if (lumen >= 1326 && lumen < 2137) {
                        equwat = (int) Math.round(0.061652 * lumen + 18.24908);
                    } else if (lumen >= 2137) {
                        equwat = (int) Math.round(0.057339 * lumen + 27.4656);
                    }
                    EquLabel1.setText(Integer.toString(equwat) + " W");
                } else if (CFLRadioButton.isSelected()) {
                    if (lumen < 125) {
                        equwat = (int) Math.round(0.12 * lumen);
                    } else if (lumen >= 125 && lumen < 229) {
                        equwat = (int) Math.round(0.096154 * lumen + 2.980769);
                    } else if (lumen >= 229 && lumen < 432) {
                        equwat = (int) Math.round(0.073892 * lumen + 8.078818);
                    } else if (lumen >= 432 && lumen < 741) {
                        equwat = (int) Math.round(0.064725 * lumen + 12.03883);
                    } else if (lumen >= 741 && lumen < 970) {
                        equwat = (int) Math.round(0.065502 * lumen + 11.46288);
                    } else if (lumen >= 970 && lumen < 1398) {
                        equwat = (int) Math.round(0.058411 * lumen + 18.34112);
                    } else if (lumen >= 1398 && lumen < 2253) {
                        equwat = (int) Math.round(0.05848 * lumen + 18.24561);
                    } else if (lumen >= 2253) {
                        equwat = (int) Math.round(0.054407 * lumen + 27.42111);
                    }
                    EquLabel1.setText(Integer.toString(equwat) + " W");
                }
                if (lumen >= 1300) {
                    double pref1 = 0.07341 * lumen;
                    double pref = Math.round(pref1 * 100);
                    pref /= 100;
                    PrefLabel.setText(Double.toString(pref) + " W");

                    double eei1 = prated * par / pref;
                    double eei = Math.round(eei1 * 1000);
                    eei /= 1000;
                    EeiLabel.setText(Double.toString(eei));

                    nDirClass(eei);
                } else {
                    double pref1 = 0.88 * Math.sqrt(lumen) + 0.049 * lumen;
                    double pref = Math.round(pref1 * 100);
                    pref /= 100;
                    PrefLabel.setText(Double.toString(pref) + " W");

                    double eei1 = prated * par / pref;
                    double eei = Math.round(eei1 * 1000);
                    eei /= 1000;
                    EeiLabel.setText(Double.toString(eei));

                    nDirClass(eei);
                }
            } else {
                EquLabel.setText("Claimed equivalent lamp power: ");
                double corrfactorLED = 1.00;
                double corrfactor = 1.00;
                int beamAngle = Integer.parseInt(angleFormattedTextField.getText().replaceAll("\\s", ""));
                double llmfValue = Double.parseDouble(llmfFormattedTextField.getText().replaceAll("\\s", "").replace(",", "."));

                if (LEDRadioButton.isSelected()) {
                    corrfactor = (new Table7().corrfactorLED(llmfValue)) * (new Table8().corrfactorLED(beamAngle));
                } else if (CFLRadioButton.isSelected()) {
                    corrfactor = new Table7().corrfactorCFL();
                } else if (HalogenRadioButton.isSelected()) {
                    corrfactor = new Table7().corrfactorHAL();
                }

                Class[] paramTypes = new Class[1];
                paramTypes[0] = double.class;
                try {
                    Method method = getClass().getDeclaredMethod(shapeComboBox.getSelectedItem().toString(), paramTypes);
                    method.invoke(this, corrfactor);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                if (lumen >= 1300) {
                    double pref1 = 0.07341 * lumen;
                    double pref = Math.round(pref1 * 100);
                    pref /= 100;
                    PrefLabel.setText(Double.toString(pref) + " W");

                    double eei1 = prated * par / pref;
                    double eei = Math.round(eei1 * 1000);
                    eei /= 1000;
                    EeiLabel.setText(Double.toString(eei));

                    dirClass(eei);
                } else {
                    double pref1 = 0.88 * Math.sqrt(lumen) + 0.049 * lumen;
                    double pref = Math.round(pref1 * 100);
                    pref /= 100;
                    PrefLabel.setText(Double.toString(pref) + " W");

                    double eei1 = prated * par / pref;
                    double eei = Math.round(eei1 * 1000);
                    eei /= 1000;
                    EeiLabel.setText(Double.toString(eei));

                    dirClass(eei);
                }
            }
        }
    }

    public void nDirClass(double eei) {
        if (eei <= 0.11) {
            classAplusplus();
        } else if (eei > 0.11 && eei <= 0.17) {
            classAplus();
        } else if (eei > 0.17 && eei <= 0.24) {
            classA();
        } else if (eei > 0.24 && eei <= 0.60) {
            classB();
        } else if (eei > 0.60 && eei <= 0.80) {
            classC();
        } else if (eei > 0.80 && eei <= 0.95) {
            classD();
        } else {
            classE();
        }
    }

    public void dirClass(double eei) {
        if (eei <= 0.13) {
            classAplusplus();
        } else if (eei > 0.13 && eei <= 0.18) {
            classAplus();
        } else if (eei > 0.18 && eei <= 0.40) {
            classA();
        } else if (eei > 0.40 && eei <= 0.95) {
            classB();
        } else if (eei > 0.95 && eei <= 1.20) {
            classC();
        } else if (eei > 1.20 && eei <= 1.75) {
            classD();
        } else {
            classE();
        }
    }

    public int maxWidth = 460;

    public void classAplusplus() {
        classLabel.setPreferredSize(new Dimension((int) (maxWidth * 0.4), classLabel.getHeight()));
        classLabel.setText(" A++");
        classLabel.setBackground(new java.awt.Color(0, 255, 0));
    }

    public void classAplus() {
        classLabel.setPreferredSize(new Dimension((int) (maxWidth * 0.5), classLabel.getHeight()));
        classLabel.setText(" A+");
        classLabel.setBackground(new java.awt.Color(75, 255, 0));
    }

    public void classA() {
        classLabel.setPreferredSize(new Dimension((int) (maxWidth * 0.6), classLabel.getHeight()));
        classLabel.setText(" A");
        classLabel.setBackground(new java.awt.Color(179, 255, 0));
    }

    public void classB() {
        classLabel.setPreferredSize(new Dimension((int) (maxWidth * 0.7), classLabel.getHeight()));
        classLabel.setText(" B");
        classLabel.setBackground(new java.awt.Color(255, 255, 0));
    }

    public void classC() {
        classLabel.setPreferredSize(new Dimension((int) (maxWidth * 0.8), classLabel.getHeight()));
        classLabel.setText(" C");
        classLabel.setBackground(new java.awt.Color(255, 179, 0));
    }

    public void classD() {
        classLabel.setPreferredSize(new Dimension((int) (maxWidth * 0.9), classLabel.getHeight()));
        classLabel.setText(" D");
        classLabel.setBackground(new java.awt.Color(255, 75, 0));
    }

    public void classE() {
        classLabel.setPreferredSize(new Dimension((int) (maxWidth), classLabel.getHeight()));
        classLabel.setText(" E");
        classLabel.setBackground(new java.awt.Color(255, 0, 0));
    }

    public void equivalentDir(double[] p, double[] lm) {
        for (int i = 0; i < p.length; i += 1) {
            if (lumen() >= lm[i] && lumen() < lm[i + 1]) {
                if (i == 0) {
                    equwat = (int) Math.round(((p[i + 2] - p[i + 1]) / (lm[i + 2] - lm[i + 1])) * lumen() + (p[i + 1] - (p[i + 2] - p[i + 1]) / (lm[i + 2] - lm[i + 1]) * lm[i + 1]));
                } else if (i == p.length - 2) {
                    equwat = (int) Math.round(((p[i] - p[i - 1]) / (lm[i] - lm[i - 1])) * lumen() + (p[i - 1] - (p[i] - p[i - 1]) / (lm[i] - lm[i - 1]) * lm[i - 1]));
                } else {
                    equwat = (int) Math.round(((p[i + 1] - p[i]) / (lm[i + 1] - lm[i])) * lumen() + (p[i] - (p[i + 1] - p[i]) / (lm[i + 1] - lm[i]) * lm[i]));
                }
            }
        }
        EquLabel1.setText(equwat + " W");
    }

    public void AR111(double corrFactor) {
        double[] p = {0, 35, 50, 75, 100, 1000000};
        double[] lm = {0, 250 * corrFactor, 390 * corrFactor, 640 * corrFactor, 785 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void MR11_GU4(double corrFactor) {
        double[] p = {0, 20, 35, 1000000};
        double[] lm = {0, 160 * corrFactor, 300 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void MR16_GU5_3(double corrFactor) {
        double[] p = {0, 20, 35, 50, 1000000};
        double[] lm = {0, 180 * corrFactor, 300 * corrFactor, 540 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void PAR16(double corrFactor) {
        double[] p = {0, 20, 25, 35, 50, 1000000};
        double[] lm = {0, 90 * corrFactor, 125 * corrFactor, 200 * corrFactor, 300 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void PAR20(double corrFactor) {
        double[] p = {0, 35, 50, 75, 1000000};
        double[] lm = {0, 200 * corrFactor, 300 * corrFactor, 500 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void PAR25(double corrFactor) {
        double[] p = {0, 50, 75, 1000000};
        double[] lm = {0, 350 * corrFactor, 550 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void PAR30S(double corrFactor) {
        double[] p = {0, 50, 75, 100, 1000000};
        double[] lm = {0, 350 * corrFactor, 550 * corrFactor, 750 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void PAR36(double corrFactor) {
        double[] p = {0, 50, 75, 100, 1000000};
        double[] lm = {0, 350 * corrFactor, 550 * corrFactor, 720 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void PAR38(double corrFactor) {
        double[] p = {0, 60, 75, 80, 100, 120, 1000000};
        double[] lm = {0, 400 * corrFactor, 555 * corrFactor, 600 * corrFactor, 760 * corrFactor, 900 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void R50_NR50(double corrFactor) {
        double[] p = {0, 25, 40, 1000000};
        double[] lm = {0, 90 * corrFactor, 170 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void R63_NR63(double corrFactor) {
        double[] p = {0, 40, 60, 1000000};
        double[] lm = {0, 180 * corrFactor, 300 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void R80_NR80(double corrFactor) {
        double[] p = {0, 60, 75, 100, 1000000};
        double[] lm = {0, 300 * corrFactor, 350 * corrFactor, 580 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void R95_NR95(double corrFactor) {
        double[] p = {0, 75, 100, 1000000};
        double[] lm = {0, 350 * corrFactor, 540 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    public void R125(double corrFactor) {
        double[] p = {0, 100, 150, 1000000};
        double[] lm = {0, 580 * corrFactor, 1000 * corrFactor, 1000000};
        equivalentDir(p, lm);
    }

    private void SpecialPurpose() {
        int ax = 0;
        int ay = 0;
        if (isDouble(xjFormattedTextField.getText())) {
            double x = Double.parseDouble(xjFormattedTextField.getText());
            if (x >= 0.270 && x <= 0.530) {
                xResultjLabel.setForeground(Color.red);
                xResultjLabel.setText("0.270  ≤ x ≤ 0.530");
                ax = 1;
            } else if (x < 0.270) {
                xResultjLabel.setForeground(new Color(0, 102, 0));
                xResultjLabel.setText("x < 0.270");
            } else if (x > 0.530) {
                xResultjLabel.setForeground(new Color(0, 102, 0));
                xResultjLabel.setText("x > 0.530");
            }
            double minY = Math.round((-2.3172 * Math.pow(x, 2) + (2.3653 * x) - 0.2199) * 10000.0) / 10000.0;
            double maxY = Math.round((-2.3172 * Math.pow(x, 2) + (2.3653 * x) - 0.1595) * 10000.0) / 10000.0;
            if (isDouble(yjFormattedTextField.getText())) {
                double y = Double.parseDouble(yjFormattedTextField.getText());
                if (y >= minY && y <= maxY) {
                    yResultjLabel.setForeground(Color.red);
                    yResultjLabel.setText(minY + "  ≤ y ≤ " + maxY);
                    ay = 1;
                } else if (y < minY) {
                    yResultjLabel.setForeground(new Color(0, 102, 0));
                    yResultjLabel.setText("y < " + minY);
                } else if (y > maxY) {
                    yResultjLabel.setForeground(new Color(0, 102, 0));
                    yResultjLabel.setText("y > " + maxY);
                }
            } else {
                yResultjLabel.setForeground(Color.red);
                yResultjLabel.setText("Type correct value in y");
                ay = 1;
            }
        } else {
            xResultjLabel.setForeground(Color.red);
            xResultjLabel.setText("Type correct value in x");
            ax = 1;
        }
        if (ax == 0 && ay == 0) {
            resultjLabel.setForeground(new Color(0, 102, 0));
            resultjLabel.setText("Not suitable for household room illumination");
        } else {
            resultjLabel.setText(null);
        }
    }

    boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
