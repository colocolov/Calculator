package pkg16_bigcalculate;

public class Calculator extends javax.swing.JFrame {

    Double value1, value2, result, valueZero, tempValue;
    String strPoint, tempNumber1;
    char operation, operationFirst;
    boolean point, ravno, action;

    public Calculator() {
        initComponents();
        monitor.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        val1 = new javax.swing.JButton();
        val4 = new javax.swing.JButton();
        val2 = new javax.swing.JButton();
        val3 = new javax.swing.JButton();
        val6 = new javax.swing.JButton();
        val5 = new javax.swing.JButton();
        val0 = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        val7 = new javax.swing.JButton();
        val8 = new javax.swing.JButton();
        val9 = new javax.swing.JButton();
        btnRavno = new javax.swing.JButton();
        btnDelenie = new javax.swing.JButton();
        btnUmnojenie = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        procent = new javax.swing.JButton();
        cleanAll = new javax.swing.JButton();
        monitor = new javax.swing.JTextField();
        monitorSecond = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        val1.setText("1");
        val1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val1ActionPerformed(evt);
            }
        });

        val4.setText("4");
        val4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val4ActionPerformed(evt);
            }
        });

        val2.setText("2");
        val2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val2ActionPerformed(evt);
            }
        });

        val3.setText("3");
        val3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val3ActionPerformed(evt);
            }
        });

        val6.setText("6");
        val6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val6ActionPerformed(evt);
            }
        });

        val5.setText("5");
        val5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val5ActionPerformed(evt);
            }
        });

        val0.setText("0");
        val0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val0ActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });

        val7.setText("7");
        val7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val7ActionPerformed(evt);
            }
        });

        val8.setText("8");
        val8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val8ActionPerformed(evt);
            }
        });

        val9.setText("9");
        val9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                val9ActionPerformed(evt);
            }
        });

        btnRavno.setText("=");
        btnRavno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRavnoActionPerformed(evt);
            }
        });

        btnDelenie.setText("/");
        btnDelenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelenieActionPerformed(evt);
            }
        });

        btnUmnojenie.setText("*");
        btnUmnojenie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmnojenieActionPerformed(evt);
            }
        });

        jButton2.setText("+-");

        procent.setText("%");
        procent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procentActionPerformed(evt);
            }
        });

        cleanAll.setText("C");
        cleanAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanAllActionPerformed(evt);
            }
        });

        monitor.setEditable(false);

        monitorSecond.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(monitorSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(val0, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(btnRavno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(val4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(val1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cleanAll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(procent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(val8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(val9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(val5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(val6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(val2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(val3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(val7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnUmnojenie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelenie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monitorSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUmnojenie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procent, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(val7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelenie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(val4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(val1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(val6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(val5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(val0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRavno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void val1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val1ActionPerformed
        // Ввод числа 1:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("1");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "1");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "1");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("1");
                }
            }
        }
    }//GEN-LAST:event_val1ActionPerformed

    private void val2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val2ActionPerformed
        // Ввод числа 2:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("2");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "2");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "2");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("2");
                }
            }
        }
    }//GEN-LAST:event_val2ActionPerformed
	
	private void val3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val3ActionPerformed
        // Ввод числа 3:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("3");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "3");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "3");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("3");
                }
            }
        }
    }//GEN-LAST:event_val3ActionPerformed

    private void val4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val4ActionPerformed
        // Ввод числа 4:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("4");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "4");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "4");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("4");
                }
            }
        }
    }//GEN-LAST:event_val4ActionPerformed

    private void val5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val5ActionPerformed
        // Ввод числа 5:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("5");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "5");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "5");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("5");
                }
            }
        }
    }//GEN-LAST:event_val5ActionPerformed

    private void val6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val6ActionPerformed
        // Ввод числа 6:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("6");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "6");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "6");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("6");
                }
            }
        }
    }//GEN-LAST:event_val6ActionPerformed

    private void val7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val7ActionPerformed
        // Ввод числа 7:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("7");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "7");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "7");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("7");
                }
            }
        }
    }//GEN-LAST:event_val7ActionPerformed

    private void val8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val8ActionPerformed
        // Ввод числа 8:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("8");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "8");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "8");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("8");
                }
            }
        }
    }//GEN-LAST:event_val8ActionPerformed

    private void val9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val9ActionPerformed
        // Ввод числа 9:
        if (ravno || action) {
            monitor.setText("");
        }        
        if (monitor.getText().isEmpty()) {
            monitor.setText("9");
            tempValue = Double.parseDouble(monitor.getText());
        } else {
            if (point == true) {
                monitor.setText(monitor.getText() + "9");
                tempValue = Double.parseDouble(monitor.getText());
            } else {
                valueZero = Double.parseDouble(monitor.getText());
                if (valueZero != 0) {
                    monitor.setText(monitor.getText() + "9");
                    tempValue = Double.parseDouble(monitor.getText());
                } else {
                    monitor.setText("9");
                }
            }
        }
    }//GEN-LAST:event_val9ActionPerformed

    private void val0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_val0ActionPerformed
        // Ввод числа 0:
        if(monitor.getText().isEmpty()){
            monitor.setText("0");
            tempValue = Double.parseDouble(monitor.getText());
        }else{
            valueZero = Double.parseDouble(monitor.getText());
            if(valueZero != 0){
                monitor.setText(monitor.getText() + "0");
                tempValue = Double.parseDouble(monitor.getText());
            }
        }
    }//GEN-LAST:event_val0ActionPerformed
	
	private void btnRavnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRavnoActionPerformed
        // Подсчет результата. Кнопка РАВНО:
//        if(monitor.getText().isEmpty()){ 
//            monitor.setText("0"); 
//        else{  // если есть значение
            switch (this.operation) {
               case '+': {
                   value2 = Double.parseDouble(monitor.getText());
                   result = result + value2;
                   monitor.setText("");
                   monitorSecond.setText("");
                   monitor.setText(String.valueOf(result));
                   break;
               }
               case '-': {
                   value2 = Double.parseDouble(monitor.getText());
                   result = result - value2;
                   monitor.setText("");
                   monitorSecond.setText("");
                   monitor.setText(String.valueOf(result));
                   break;
               }
               case '*': {
                   value2 = Double.parseDouble(monitor.getText());
                   result = result * value2;
                   monitor.setText("");
                   monitorSecond.setText("");
                   monitor.setText(String.valueOf(result));
                   break;
               }
               case '/': {
                   if (Double.parseDouble(monitor.getText()) == 0){
                        monitorSecond.setText("Делить на ноль нельзя!");
                        monitor.setText("");
                        result = 0D;
                        tempNumber1 = "";
                        value1 = 0D;
                    }else{
                        value2 = Double.parseDouble(monitor.getText());
                        result = result / value2;
                        monitor.setText("");
                        monitorSecond.setText("");
                        monitor.setText(String.valueOf(result));
                   }
                   break;
               }
               case '%': {
                    monitor.setText("");
                    monitorSecond.setText("");
                    monitor.setText(String.valueOf(result));
                   break;
               }
            }
      //  }
        ravno = true;        
    }//GEN-LAST:event_btnRavnoActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // Кнопка СЛОЖЕНИЕ чисел:                    
        if(!monitor.getText().isEmpty()){
            tempNumber1 = monitor.getText();
                if(!monitorSecond.getText().isEmpty()){ //если он не пустой
                    monitorSecond.setText(monitorSecond.getText()+ "+" + tempNumber1);
                    result = result + Double.parseDouble(tempNumber1);
                    monitor.setText(String.valueOf(result));
                }else{              // если пустой
                    value1 = Double.parseDouble(tempNumber1);
                    result = value1;
                    monitorSecond.setText(tempNumber1);
                    monitor.setText("");
                    this.value1 = 0D;
                }        
        }
        //monitor.setText("");
        this.operation = '+';
        point = false;
        action = true;
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // Кнопка ВЫЧИТАНИЕ чисел:
                    
        if(!monitor.getText().isEmpty()){ //если он не пустой
       
        tempNumber1 = monitor.getText();
        
        //double num = num + Double.parseDouble(val1);
            if(!monitorSecond.getText().isEmpty()){ //если он не пустой
                monitorSecond.setText(monitorSecond.getText()+ "-" + tempNumber1);
                result = result - Double.parseDouble(tempNumber1);
//                monitorSecond.setText("=" + String.valueOf(result));
                monitorSecond.setText(monitorSecond.getText()+ "=" + String.valueOf(result));
                
            }else{              // если пустой
                //tempNumber2 = monitor.getText();
                value1 = Double.parseDouble(tempNumber1);
                result = value1;
                monitorSecond.setText(tempNumber1);
                monitor.setText("");
                this.value1 = 0D;
            }
        //calculate('+');
        }
        monitor.setText("");
        this.operation = '-';

        
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnUmnojenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmnojenieActionPerformed
        // Кнопка УМНОЖЕНИЕ чисел:
         if(!monitor.getText().isEmpty()){ //если он не пустой
       
        tempNumber1 = monitor.getText();
        
        //double num = num + Double.parseDouble(val1);
            if(!monitorSecond.getText().isEmpty()){ //если он не пустой
                monitorSecond.setText(monitorSecond.getText()+ "*" + tempNumber1);
                result = result * Double.parseDouble(tempNumber1);
//                monitorSecond.setText("=" + String.valueOf(result));
                monitorSecond.setText(monitorSecond.getText()+ "=" + String.valueOf(result));
                
            }else{              // если пустой
                //tempNumber2 = monitor.getText();
                value1 = Double.parseDouble(tempNumber1);
                result = value1;
                monitorSecond.setText(tempNumber1);
                monitor.setText("");
                this.value1 = 0D;
            }
        //calculate('+');
        }
        monitor.setText("");
        this.operation = '*';
    }//GEN-LAST:event_btnUmnojenieActionPerformed
	
	private void btnDelenieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelenieActionPerformed
        // Кнопка ДЕЛЕНИЕ чисел:
        if(!monitor.getText().isEmpty()){ //если он не пустой
       
        tempNumber1 = monitor.getText();
        
        //double num = num + Double.parseDouble(val1);
            if(!monitorSecond.getText().isEmpty()){ //если он не пустой
                monitorSecond.setText(monitorSecond.getText()+ "/" + tempNumber1);
                    if (Double.parseDouble(tempNumber1) == 0){
                        monitorSecond.setText("Делить на ноль нельзя!");
                        monitor.setText("");
                        result = 0D;
                        tempNumber1 = "";
                        value1 = 0D;
                    }else{
                        result = result / Double.parseDouble(tempNumber1);
                        monitorSecond.setText(monitorSecond.getText()+ "=" + String.valueOf(result));
                    }
                
            }else{              // если пустой
                //tempNumber2 = monitor.getText();
                value1 = Double.parseDouble(tempNumber1);
                result = value1;
                monitorSecond.setText(tempNumber1);
                monitor.setText("");
                this.value1 = 0D;
            }
        
        }
        monitor.setText("");
        this.operation = '/';
        
        
        
    }//GEN-LAST:event_btnDelenieActionPerformed
	
	private void cleanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanAllActionPerformed
        // Кнопка С (очистка)
        monitor.setText("0");
        monitorSecond.setText("");
        this.operation = 0;
        value1 = 0D; 
        value2 = 0D; 
        result = 0D; 
        valueZero = 0D;
        point = false;
        ravno = false;
        action = false;
        // ПРИСВОИТЬ ВСЕМ ПЕРЕМЕННЫМ ЗНАЧЕНИЕ НОЛЬ
    }//GEN-LAST:event_cleanAllActionPerformed
	
	private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointActionPerformed
        // ДРОБНАЯ ЧАСТЬ:
        //point = false;
        if (point == false){   
            if(monitor.getText().isEmpty()){
                monitor.setText("0.");
                strPoint = monitor.getText();
            }else{
                valueZero = Double.parseDouble(monitor.getText());
                if(valueZero != 0){
                    monitor.setText(monitor.getText() + ".");
                    strPoint = monitor.getText();
                }
            else monitor.setText("0.");
            strPoint = monitor.getText();
            }    
        this.point = true;
        }
    }//GEN-LAST:event_btnPointActionPerformed

    private void procentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procentActionPerformed
        // Кнопка ПРОЦЕНТ от числа:
       this.operationFirst = this.operation;
         if(!monitor.getText().isEmpty()){ //если он не пустой
            tempNumber1 = monitor.getText();
            if(!action){
                //result = 1.1;
                monitor.setText("0");              
            }else{
               this.value1 = (Double.parseDouble(tempNumber1) / 100) * result;
                String tempOperation = String.valueOf(this.operation);

                switch (this.operationFirst) {
                    case '+': {
                        result = this.result + this.value1;
                        break;
                    }
                    case '-': {
                        result = this.result - this.value1;
                        break;
                    }
                    case '*': {
                        result = this.result * this.value1;
                        break;
                    }
                    case '/': {
                        result = this.result / this.value1;
                        break;
                    }

                }
            monitorSecond.setText(monitorSecond.getText()+ tempOperation + value1); 
            }
            
        }
        monitor.setText(String.valueOf(result));
        this.operation = '%';     
    }//GEN-LAST:event_procentActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }
    
    //private Double result2 = null;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelenie;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnRavno;
    private javax.swing.JButton btnUmnojenie;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cleanAll;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField monitor;
    private javax.swing.JTextField monitorSecond;
    private javax.swing.JButton procent;
    private javax.swing.JButton val0;
    private javax.swing.JButton val1;
    private javax.swing.JButton val2;
    private javax.swing.JButton val3;
    private javax.swing.JButton val4;
    private javax.swing.JButton val5;
    private javax.swing.JButton val6;
    private javax.swing.JButton val7;
    private javax.swing.JButton val8;
    private javax.swing.JButton val9;
    // End of variables declaration//GEN-END:variables
}
