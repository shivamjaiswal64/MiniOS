import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.awt.*;
import java.awt.event.MouseEvent;
/*  GO SLOW, WORK in Progress */  //version 1.04  26Nov19 04:25AM	
		
public class MiniOS extends javax.swing.JFrame {
	public MiniOS(){
		this.setUndecorated(true);
        currentTime();
        currentDate();
		initComponents();
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
				if(x==JFileChooser.CANCEL_OPTION)
				{
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
		
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cmd.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton2ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notepad1.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton3ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SnakeGreen.png"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt){
				try{
					jButton4ActionPerformed(evt);
				}catch(IOException ioe){ System.out.println(ioe);}
			}
		});
		
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Firefox96.png"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt){              
			try{
			 jButton5ActionPerformed(evt);
            }catch(IOException ioe){System.out.println(ioe);}
			}
        });
		
		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/power.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton6ActionPerformed(evt);
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
						.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
					.addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
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
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton6ActionPerformed
			try{	r.exec("calc.exe"); System.out.println("calculator open via jb1");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton6ActionPerformed
			try{
				r.exec("cmd.exe /c start"); 
			//	r.exec("C:\\Windows\System32\\WindowsPowerShell\\v1.0\\powershell.exe");// Unable to run powershell :-(
				System.out.println("cmd open via jb2");
			}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton6ActionPerformed
			try{
				r.exec("notepad.exe");
				System.out.println("notepad open via jb3");	
			}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton6ActionPerformed
			try{	r.exec("java -jar Snake.jar"); System.out.println("Snake Game open via jb4");}
		catch(IOException ioe){	System.out.println(ioe); } 
	}
	
	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {//GEN-FIRST:event_jButton6ActionPerformed
	//	Runtime r = Runtime.getRuntime();
		try{	r.exec("C:\\Program Files\\Mozilla Firefox\\firefox.exe");System.out.println("firefox open via jb5"); }
		catch(IOException ioe){	System.out.println(ioe); } 
    }
	
	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.out.println("Window closed by power button");
		System.exit(0);
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
               MiniOS mos = new MiniOS();
			   mos.setVisible(true);
            }
        });
	
	}
	
	
	// Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel date;
    private javax.swing.JFileChooser jfc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
	private static javax.swing.JLabel time;
    private static javax.swing.JDesktopPane jDesktopPane1;
	
}
