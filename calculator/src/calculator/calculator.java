
package calculator;

public class calculator extends javax.swing.JFrame {

   
    double firstnum;
    double secondnum;
    double result;
    String operation;
     
    public calculator() {
        initComponents();
    }

    
   
                          
    private void initComponents() {

        display = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btnmul = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnlog = new javax.swing.JButton();
        btnln = new javax.swing.JButton();
        btnplusminus = new javax.swing.JButton();
        btnroot = new javax.swing.JButton();
        btnpowtwo = new javax.swing.JButton();
        btnpow = new javax.swing.JButton();
        btnsin = new javax.swing.JButton();
        btncos = new javax.swing.JButton();
        btntan = new javax.swing.JButton();
        btnpercent = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setForeground(java.awt.Color.RED);

        display.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.setBorder(new javax.swing.border.MatteBorder(null));

        btn1.setFont(new java.awt.Font("Arial Black", 1, 10));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Arial Black", 1, 10));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn10.setText("0");
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setFont(new java.awt.Font("Arial Black", 1, 10)); 
        btn11.setText(".");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setFont(new java.awt.Font("Arial Black", 1, 12)); 
        btn12.setText("C");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Arial", 1, 18)); 
        btnadd.setText("+");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnsub.setFont(new java.awt.Font("Arial", 1, 18)); 
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });

        btnmul.setFont(new java.awt.Font("Arial", 1, 18)); 
        btnmul.setText("*");
        btnmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmulActionPerformed(evt);
            }
        });

        btnequal.setFont(new java.awt.Font("Arial Black", 1, 18)); 
        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });

        btndiv.setFont(new java.awt.Font("Arial", 1, 18)); 
        btndiv.setText("/");
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("CALCULATOR");

        btnlog.setFont(new java.awt.Font("Arial", 1, 11)); 
        btnlog.setText("log");
        btnlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogActionPerformed(evt);
            }
        });

        btnln.setFont(new java.awt.Font("Arial", 1, 11)); 
        btnln.setText("ln");
        btnln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlnActionPerformed(evt);
            }
        });

        btnplusminus.setFont(new java.awt.Font("Arial Black", 1, 18)); 
        btnplusminus.setText("+/-");
        btnplusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusminusActionPerformed(evt);
            }
        });

        btnroot.setFont(new java.awt.Font("Arial", 1, 12)); 
        btnroot.setText("root ");
        btnroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrootActionPerformed(evt);
            }
        });

        btnpowtwo.setFont(new java.awt.Font("Arial", 1, 11)); 
        btnpowtwo.setText("x^2");
        btnpowtwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpowtwoActionPerformed(evt);
            }
        });

        btnpow.setFont(new java.awt.Font("Arial", 1, 11)); 
        btnpow.setText("x^y");
        btnpow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpowActionPerformed(evt);
            }
        });

        btnsin.setFont(new java.awt.Font("Arial", 1, 11)); 
        btnsin.setText("sin");
        btnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinActionPerformed(evt);
            }
        });

        btncos.setFont(new java.awt.Font("Arial", 1, 11)); 
        btncos.setText("cos");
        btncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });

        btntan.setFont(new java.awt.Font("Arial", 1, 11)); 
        btntan.setText("tan");
        btntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanActionPerformed(evt);
            }
        });

        btnpercent.setFont(new java.awt.Font("Arial", 1, 11)); 
        btnpercent.setText("%");
        btnpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpercentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnpow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnpowtwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnpercent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btncos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(btntan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnsin)
                                .addGap(4, 4, 4)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn9))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn6))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btn3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn12)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnadd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnsub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(btnplusminus)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnroot))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btncos, btnln, btnlog, btnpercent, btnpow, btnpowtwo, btnsin, btntan});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(display, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnln, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpowtwo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlog, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(btncos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btntan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpow, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpercent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsub, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmul, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndiv, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnroot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btncos, btnln, btnlog, btnpercent, btnpow, btnpowtwo, btnsin, btntan});

        pack();
    }// </editor-fold>                        

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
        String takein;
        takein=display.getText()+ btn1.getText();
        display.setText(takein);
        
        
    }                                    

    
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn2.getText();
        display.setText(takein);        
    }                                    

    
    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn3.getText();
        display.setText(takein);        
    }                                    

    
    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn4.getText();
        display.setText(takein);        
    }                                    

    
    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn5.getText();
        display.setText(takein);        
    }                                    

    
    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn6.getText();
        display.setText(takein);        
    }                                    

    
    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn7.getText();
        display.setText(takein);        
    }                                    

    
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn8.getText();
        display.setText(takein);        
    }                                    

    
    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        String takein;
        takein=display.getText()+ btn9.getText();
        display.setText(takein);        
    }                                    

    
    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {                                      
       String takein;
        takein=display.getText()+ btn10.getText();
        display.setText(takein);       
    }                                     

    
    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {                                      
    display.setText("");
    }                                     

    
    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String takein;
        takein=display.getText()+ btn11.getText();
        display.setText(takein); 
    }                                     

    
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {                                       
        firstnum=Double.parseDouble(display.getText()); 
        display.setText("");
        operation="+";
    }                                      

    
    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {                                       
        firstnum=Double.parseDouble(display.getText()); 
        display.setText("");
        operation="-";
            
    }                                      

    
    private void btnmulActionPerformed(java.awt.event.ActionEvent evt) {                                       
        firstnum=Double.parseDouble(display.getText()); 
        display.setText("");
        operation="*";
    
    }                                      

    
    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {                                       
        firstnum=Double.parseDouble(display.getText()); 
        display.setText("");
        operation="/";
    
    }                                      

    
    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String answer;
        secondnum=Double.parseDouble(display.getText());
        switch(operation)
        {
            case "+":
                result= firstnum + secondnum;
                answer=String.format("%.0f", result);
                display.setText(answer);                
                break;
                
            case "-":
                result= firstnum - secondnum;
                answer=String.format("%.0f", result);
                display.setText(answer);    
                break;
                
            case "*":
                result= firstnum * secondnum;
                answer=String.format("%.0f", result);
                display.setText(answer);    
                break;
                
            case "/":
                if(secondnum==0)
                {
                    display.setText("err");      
                }
                result= firstnum / secondnum;
                answer=String.format("%.0f", result);
                display.setText(answer);    
                break;
                
                
                case "pow":
                result= Math.pow(firstnum,secondnum);
                answer=String.format("%.0f", result);
                display.setText(answer);    
                break;
                    

        }
        
                
    }                                        

    
    private void btnlogActionPerformed(java.awt.event.ActionEvent evt) {                                       
       double op=(Double.parseDouble(String.valueOf(display.getText())));
       double r=Math.log10(op);
       display.setText(String.valueOf(r));  
    }                                      

    
    private void btnlnActionPerformed(java.awt.event.ActionEvent evt) {                                      
        double op=(Double.parseDouble(String.valueOf(display.getText())));
       double r= Math.log10(op)/Math.log10(2);
       display.setText(String.valueOf(r));
    }                                     

    
    private void btnplusminusActionPerformed(java.awt.event.ActionEvent evt) {                                             
    
       double op=(Double.parseDouble(String.valueOf(display.getText())));
       op= op *(-1);
       display.setText(String.valueOf(op));
    }                                            

    
    private void btnrootActionPerformed(java.awt.event.ActionEvent evt) {                                        
       double op=(Double.parseDouble(String.valueOf(display.getText())));
       double r= Math.sqrt(op);
       display.setText(String.valueOf(r));
    }                                       

    
    private void btnpowtwoActionPerformed(java.awt.event.ActionEvent evt) {                                          
      double op=(Double.parseDouble(String.valueOf(display.getText())));
       double r= Math.pow(op,2);
       display.setText(String.valueOf(r));
    }                                         

    
    private void btnpowActionPerformed(java.awt.event.ActionEvent evt) {                                       
      firstnum=Double.parseDouble(display.getText()); 
        display.setText("");
        operation="pow";
    }                                      

    
    private void btnsinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double op=(Double.parseDouble(String.valueOf(display.getText())));
        double radian=Math.toRadians(op);
        double r= Math.sin(radian);
       display.setText(String.valueOf(r));
    }                                      

    
    private void btncosActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double op=(Double.parseDouble(String.valueOf(display.getText())));
        double rad=Math.toRadians(op);
        double r= Math.cos(rad);
        display.setText(String.valueOf(r));
    }                                      

    
    private void btntanActionPerformed(java.awt.event.ActionEvent evt) {                                       
        double op=(Double.parseDouble(String.valueOf(display.getText())));
       double radian=Math.toRadians(op);
        double r= Math.tan(radian);
       display.setText(String.valueOf(r));
    }                                      

    
    private void btnpercentActionPerformed(java.awt.event.ActionEvent evt) {                                           
       double op=(Double.parseDouble(String.valueOf(display.getText())));
       double r= op/100;
       display.setText(String.valueOf(r)+"%");
    }                                          

    public static void main(String args[]) {
       
       
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncos;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnln;
    private javax.swing.JButton btnlog;
    private javax.swing.JButton btnmul;
    private javax.swing.JButton btnpercent;
    private javax.swing.JButton btnplusminus;
    private javax.swing.JButton btnpow;
    private javax.swing.JButton btnpowtwo;
    private javax.swing.JButton btnroot;
    private javax.swing.JButton btnsin;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton btntan;
    private javax.swing.JTextField display;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
	
