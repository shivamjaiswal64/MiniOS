import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.awt.event.MouseEvent;
/*  GO SLOW, WORK in Progress */  //version 1.06  30Dec19 02:11PM	
		
public class MiniOS extends javax.swing.JFrame {
	public MiniOS(){
		this.setUndecorated(true);
        currentTime();
        currentDate();
		initComponents();
		Image icon = Toolkit.getDefaultToolkit().getImage("icons/mos1.png");//icone do jframe
		setIconImage(icon);
	}
	
	private void initComponents() {
	
        jfc = new javax.swing.JFileChooser("C:\\Users\\SHIVAM JAISWAL\\Desktop");
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10= new javax.swing.JButton();
		jButton11= new javax.swing.JButton();
		jButton12= new javax.swing.JButton();
		jButton13= new javax.swing.JButton();
		jButton14= new javax.swing.JButton();
		jLabel1  = new javax.swing.JLabel("GUI embedded with Snake,Dice & Quiz");
		jLabel2  = new javax.swing.JLabel("~Shivam Jaiswal");
		
		Font font1 = new Font("serif",Font.BOLD + Font.ITALIC,35);
		Font font2 = new Font("serif", Font.ITALIC,30);
		
		jLabel1.setFont(font1);
		jLabel2.setFont(font2);
		jLabel1.setBounds(550,30, 900,50);  
		jLabel2.setBounds(850,70,800,50);
		jButton7.setBounds(150,33,100,100);
		jButton8.setBounds(150,166,100,100);
		jButton9.setBounds(150,299,100,100);
		jButton10.setBounds(150,432,100,100);
		jButton11.setBounds(150,566,100,100);
		jButton12.setBounds(289,33,100,100);
		jButton13.setBounds(289,166,100,100);
		jDesktopPane1.add(jLabel1);
		jDesktopPane1.add(jLabel2);
		jDesktopPane1.add(jButton7);
		jDesktopPane1.add(jButton8);
		jDesktopPane1.add(jButton9);
		jDesktopPane1.add(jButton10);
		jDesktopPane1.add(jButton11);
		jDesktopPane1.add(jButton12);
		jDesktopPane1.add(jButton13);
		
		
	    time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
		JPopupMenu p=new JPopupMenu("Pop");
		JMenuItem i1=new JMenuItem("New");
		JMenuItem i2=new JMenuItem("Open File");
		JMenuItem i3=new JMenuItem("ScreenShot");
		JMenuItem i4=new JMenuItem("Exit");
		p.add(i1); p.add(i2); p.add(i3); p.add(i4);
			
			
			

		
		
		
		jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {  
			public void mouseClicked(MouseEvent e)
			{	
			
			int x=e.getButton();

			if(x==MouseEvent.BUTTON3){
				p.show(e.getComponent(),e.getX(),e.getY());
				
			}	
			}
			     
		});
		
		i1.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton3ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		
		i2.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				int x=jfc.showSaveDialog(null);		//showOpenDialog(null);
													//showSaveDialog(null)
				if(x==JFileChooser.APPROVE_OPTION)
				{
					File f=jfc.getSelectedFile();
					String s=jfc.getName(f);
					System.out.println(s);
				}
				if(x==JFileChooser.CANCEL_OPTION){
					System.out.println("File chooser cancelled");
				}
			}
	    });
		
		i3.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
				i3ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
			}
		});
		
		i4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               System.out.println("Window closed by Exit popup");
			   System.exit(0);
            }
        });

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniOS");
        setName("MiniOS"); // NOI18N
	   setSize(new java.awt.Dimension(966, 777));//setSize(new java.awt.Dimension(266, 777));
		
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calc.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton1ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
                jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calc.png")));
            }           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calc96.png")));
					jButton1.setToolTipText("Calculator");
            }
		});			
		
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cmd.png")));
		jButton2.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton2ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cmd.png"))); 
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cmd96.png")));
					jButton2.setToolTipText("Commond Prompt");
            }
		});				 
		
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notepad1.png")));
		jButton3.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton3ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notepad1.png")));
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notepad96.png")));
					jButton3.setToolTipText("Notepad");
            }
		});
		
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SnakeGreen.png"))); 
		jButton4.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton4ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SnakeGreen72.png"))); 
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SnakeGreen96.png")));
					jButton4.setToolTipText("Snake Game");
            }
		});
		
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Firefox64.png"))); 
		jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){              
			try{
			 jButton5ActionPerformed(evt);
            }catch(IOException ioe){System.out.println(ioe);}
			}
        });
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Firefox64.png"))); 
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/firefox96.png")));
					jButton5.setToolTipText("Firefox");
            }
		});
		
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power48.png"))); 
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton6ActionPerformed(evt);
            }
        });
		
		jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excel.png"))); 
		jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				try{
				jButton7ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
            }
        });
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excel.png")));  
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/excel96.png")));
				jButton7.setToolTipText("Excel");	
            }
		});
		
		jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Dialler72.png")));
		jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				try{
				jButton8ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
            }
        });
		jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Dialler72.png")));
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Dialler.png")));
					jButton8.setToolTipText("Dialler");
            }
		});

		jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sublime72.png")));
		jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				try{
				jButton9ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
            }
        });
		jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sublime72.png")));
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sublime.png")));
					jButton9.setToolTipText("Sublime Text3");
            }
		});		
		
		jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vlc72.png")));
		jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				try{
				jButton10ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
            }
        });
		jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vlc72.png")));
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vlc.png")));
					jButton10.setToolTipText("VLC Player");
            }
		});
		
		jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz.png")));
		jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				try{
				jButton11ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
            }
        });
		jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz.png")));
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                    jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quiz128.png")));
					jButton11.setToolTipText("Johri Window Quiz");
            }
		});
		jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help-.png")));
		jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				try{
				jButton10ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
            }
        });
		jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help-.png")));
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/help-128.png")));
				jButton12.setToolTipText("Help");
            }
		});
		
		jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dice72.png")));
		jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
				try{
				jButton13ActionPerformed(evt);
				}catch(IOException ioe){System.out.println(ioe);}
            }
        });
		jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseExited(java.awt.event.MouseEvent arg0) { 
				jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dice72.png")));
			}           
            @Override
            public void mouseEntered(java.awt.event.MouseEvent arg0) {
                jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dice96.png")));
				jButton13.setToolTipText("Dice");
            }
		});
		
		date.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
		time.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
		
		jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
		jDesktopPane1.setLayer(time, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(date, javax.swing.JLayeredPane.DEFAULT_LAYER);
		
		javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 617, Short.MAX_VALUE)
					/*	.addComponent(processList, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(512, 512, 512)
					*/	.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
						
					.addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
							)
                        .addGap(0, 0, Short.MAX_VALUE))))	
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1255, 1255, 1255))))	
		 
		);
		
		jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(33, 33, 33)
                //.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33,33)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)			
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
		);
		
		 javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 73, Short.MAX_VALUE))
        );

		 pack();
	}
	Runtime r = Runtime.getRuntime();
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton1ActionPerformed
			try{	
				r.exec("java Calc2");
				try{
					Thread.sleep(3000);
				}catch(Exception e){System.out.println(e);}
				r.exec("calc.exe");
				System.out.println("calculator open via jb1");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton2ActionPerformed
			try{
				r.exec("cmd.exe /c start"); 
			//	r.exec("C:\\Windows\System32\\WindowsPowerShell\\v1.0\\powershell.exe");// Unable to run powershell :-(
				System.out.println("cmd open via jb2");
			}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton3ActionPerformed
			try{
				r.exec("notepad.exe");
				System.out.println("notepad open via jb3");	
			}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton4ActionPerformed
			try{	r.exec("java -jar Snake.jar"); System.out.println("Welcome To Snake Game");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton5ActionPerformed
	//	Runtime r = Runtime.getRuntime();
		try{	r.exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");System.out.println("firefox open via jb5"); }
		catch(IOException ioe){	System.out.println(ioe); } 
    }
	
	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {					//GEN-FIRST:event_jButton6ActionPerformed
        System.out.println("Window closed by power button");
		System.exit(0);
    }
	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton7ActionPerformed
			try{	
			 r.exec("C:\\Program Files\\Microsoft Office\\Office12\\EXCEL.exe");
			 System.out.println("excel open via jb7");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton8ActionPerformed
			try{	r.exec("C:\\Windows\\System32\\dialer.exe"); System.out.println("Dailer via jb8");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton9ActionPerformed
			try{	r.exec("C:\\Program Files\\Sublime Text 3\\sublime_text"); System.out.println("SublimeText via jb9");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton10ActionPerformed
			try{	r.exec("C:\\Program Files\\VideoLAN\\VLC\\vlc.exe"); System.out.println("VLC Media Player open via jb10");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton11ActionPerformed
			r.exec("java JW"); System.out.println("Johri Window QUIZ via jb11");
	}
	
	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton13ActionPerformed
			r.exec("java Game1"); System.out.println("random Dice via jb13");
	}
	private void i3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException{
			try{
				r.exec("C:\\Windows\\System32\\SnippingTool.exe");
				System.out.println("Screenshot open via i3");	
			}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	
		public static void currentDate(){
			System.out.println("Current date");
			Date d = new Date();
			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy  EEE");
			String strDate= s.format(d);  
			System.out.println(strDate); 
			
			java.awt.event.ActionListener timerListener = new java.awt.event.ActionListener(){
				public void actionPerformed(java.awt.event.ActionEvent e)
				{           
					date.setText(strDate);
				}
			};
			new javax.swing.Timer(1000, timerListener).start();	
		}
		
		public static void currentTime(){
			final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss a");
			java.awt.event.ActionListener timerListener = new java.awt.event.ActionListener()
			{
				public void actionPerformed(java.awt.event.ActionEvent e)
				{
                Date d = new Date();
                String t = timeFormat.format(d);
                time.setText(t);				
				}
			};	
			new javax.swing.Timer(1000, timerListener).start(); 
		}
	
		

       
	public static void main(String a[]){
		 try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
				//     javax.swing.UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
                    break;
                }
            }
        } catch(Exception e){
			System.out.println(e);
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniOS().setVisible(true);
			   
            }
        });
	
	}
    private static javax.swing.JLabel date;
    private javax.swing.JFileChooser jfc;
    private javax.swing.JButton jButton11,jButton12,jButton13;
    private javax.swing.JButton jButton1,jButton2,jButton14;
    private javax.swing.JButton jButton3,jButton4,jButton5,jButton6;
    private javax.swing.JButton jButton7,jButton8,jButton9,jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JLabel time;
    private static javax.swing.JDesktopPane jDesktopPane1;	
}
