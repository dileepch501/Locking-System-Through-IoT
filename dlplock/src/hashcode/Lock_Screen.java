/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Akshay L Aradhya
 * https://github.com/DollarAkshay/Hexagonal-Lock-Screen
 * 
 */
public class Lock_Screen extends javax.swing.JFrame {

    /**
     * Creates new form Lock_Screen
     */
    public Lock_Screen() {
        
        initComponents();
        
        Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        Time_Display.setText(sdf.format(cal.getTime()));
        Pattern_Set.doClick();
        dp.setSize(450, 750);
        dp.setBackground(Color.black);
        Screen.add(dp,0);
    }
    
    public boolean isInsideHexagon(float x0, float y0, float d, float x, float y) {
        
        float dx = Math.abs(x - x0)/d;
        float dy = Math.abs(y - y0)/d;
        float a = (float) (0.25 * Math.sqrt(3.0));
        return (dy <= a) && (a*dx + 0.25*dy <= 0.5*a);
        
    }
    
    int getHexAt(int x,int y){
        
        for (int i = 0; i < dp.n_hex; i++) {
            if(isInsideHexagon(x,y,dp.hex_side*2,dp.hex_x[i],dp.hex_y[i]))
                return i;
        }
        return -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Screen = new javax.swing.JPanel();
        Screen_Off = new javax.swing.JLabel();
        Time_Display = new javax.swing.JLabel();
        Notif = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();
        Lock_Button = new javax.swing.JButton();
        Pattern_Set = new javax.swing.JToggleButton();
        Level_Slider = new javax.swing.JSlider();
        Sub_head_2 = new javax.swing.JLabel();
        Length_Slider = new javax.swing.JSlider();
        Border_Toggle = new javax.swing.JToggleButton();
        Sub_head_3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Screen.setBackground(new java.awt.Color(0, 5, 5));
        Screen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Screen.setOpaque(false);
        Screen.setPreferredSize(new java.awt.Dimension(450, 750));
        Screen.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ScreenMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ScreenMouseMoved(evt);
            }
        });
        Screen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ScreenMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ScreenMouseReleased(evt);
            }
        });
        Screen.setLayout(null);

        Screen_Off.setBackground(new java.awt.Color(0, 0, 0));
        Screen_Off.setOpaque(true);
        Screen_Off.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Screen_OffMouseReleased(evt);
            }
        });
        Screen.add(Screen_Off);
        Screen_Off.setBounds(0, 0, 450, 0);

        Time_Display.setForeground(new java.awt.Color(255, 255, 255));
        Time_Display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Time_Display.setText("12:00");
        Screen.add(Time_Display);
        Time_Display.setBounds(401, 0, 50, 20);

        Notif.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Notif.setToolTipText("");
        Screen.add(Notif);
        Notif.setBounds(0, 0, 0, 20);
        Screen.add(Wallpaper);
        Wallpaper.setBounds(0, 0, 450, 750);

        getContentPane().add(Screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 32, -1, -1));

        Lock_Button.setBackground(new java.awt.Color(255, 255, 255));
        Lock_Button.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        Lock_Button.setText("LOCK");
        Lock_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lock_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(Lock_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 155, 68));

        Pattern_Set.setBackground(new java.awt.Color(255, 255, 255));
        Pattern_Set.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        Pattern_Set.setSelected(true);
        Pattern_Set.setText("Set Pattern");
        Pattern_Set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pattern_SetActionPerformed(evt);
            }
        });
        getContentPane().add(Pattern_Set, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 184, 64));

        Level_Slider.setMajorTickSpacing(1);
        Level_Slider.setMaximum(7);
        Level_Slider.setMinimum(1);
        Level_Slider.setPaintLabels(true);
        Level_Slider.setPaintTicks(true);
        Level_Slider.setSnapToTicks(true);
        Level_Slider.setValue(4);
        Level_Slider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Level_SliderMouseReleased(evt);
            }
        });
        getContentPane().add(Level_Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 430, 61));

        Sub_head_2.setFont(new java.awt.Font("Prestige Elite Std", 0, 24)); // NOI18N
        Sub_head_2.setText("Hexagon Length :");
        getContentPane().add(Sub_head_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 270, 40));

        Length_Slider.setMajorTickSpacing(10);
        Length_Slider.setMaximum(50);
        Length_Slider.setMinimum(10);
        Length_Slider.setMinorTickSpacing(5);
        Length_Slider.setPaintLabels(true);
        Length_Slider.setPaintTicks(true);
        Length_Slider.setSnapToTicks(true);
        Length_Slider.setToolTipText("");
        Length_Slider.setValue(30);
        Length_Slider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Length_SliderMouseReleased(evt);
            }
        });
        getContentPane().add(Length_Slider, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 430, 61));

        Border_Toggle.setBackground(new java.awt.Color(255, 255, 255));
        Border_Toggle.setFont(new java.awt.Font("Hobo Std", 0, 24)); // NOI18N
        Border_Toggle.setText("Borderless");
        Border_Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Border_ToggleActionPerformed(evt);
            }
        });
        getContentPane().add(Border_Toggle, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 184, 64));

        Sub_head_3.setFont(new java.awt.Font("Prestige Elite Std", 0, 24)); // NOI18N
        Sub_head_3.setText("No. of Levels :");
        getContentPane().add(Sub_head_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 220, 40));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 0, 150)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 14, 5));
        jLabel1.setText("UR2D");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 620, -1, -1));

        Background.setBackground(new java.awt.Color(0, 51, 102));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/copy2.jpg"))); // NOI18N
        Background.setOpaque(true);
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private DrawPattern dp = new DrawPattern();
    int prev_dot;
    int check_pattern[] = new int[1000];
    int set_pattern[] = new int[1000];
    int check_dots=0,set_dots=0;
    String security_code="ur2dil";
    String code[]=new String[10];
    
     HashCode hc=new HashCode();
    FileInputStream fi;
     FileOutputStream fo;
     final GpioController gpio = GpioFactory.getInstance();
     final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "PinLED");

    
    private void ScreenMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScreenMouseMoved
    
    }//GEN-LAST:event_ScreenMouseMoved

    private void ScreenMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScreenMouseDragged
    if(dp.size().height>0){
        int h = getHexAt(evt.getX(),evt.getY());
        if(prev_dot!=h && h!=-1 && dp.hex_selected[h]!=true){
            if(Pattern_Set.isSelected()){
               
              set_pattern[set_dots++]=h;
               
            }
            else
            check_pattern[check_dots++]=h;
            prev_dot=h;
            dp.hex_selected[h]=true;
        }
        repaint();
    }
    }//GEN-LAST:event_ScreenMouseDragged

    @SuppressWarnings("empty-statement")
    private void ScreenMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScreenMouseReleased
int j=0,k=0;
        if(dp.size().height>0){
        int h = getHexAt(evt.getX(),evt.getY());
   
        if(Pattern_Set.isSelected()==true){
           
            if(code[0].equals(security_code)){
                try {
                    fo=new FileOutputStream("/home/pi/Hexagonal/code/lock.txt");
               
            //Debug.setText("Pattern is Set ");
            for (int i = 0; i < set_dots; i++) {
              //  Debug.append(set_pattern[i]+",");
              fo.write(set_pattern[i]);
              System.out.print(set_pattern[i]);
            }
             } catch (Exception ex) {
                    Logger.getLogger(Lock_Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
            JOptionPane.showMessageDialog(null,"Your Pattern has been set.");
            Pattern_Set.doClick();
           
            }
           
            else{
                
                //dp.theme = new Color(255,204,0);
               repaint(); 
               dp.check=true;
                try {
                    set_dots=0;
                    fi=new FileInputStream("/home/pi/Hexagonal/code/lock.txt");
                    while(fi.available()>0){
                        set_pattern[j]=fi.read();
                        j++;
                        set_dots++;
                        System.out.print(set_dots);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Lock_Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
            boolean correct = true;
            if(set_dots==check_dots){
                for (int i = 0; i < check_dots; i++) {   
                    
                    if(set_pattern[i]!=check_pattern[i]){
                        correct=false;
                        break;
                    }   
                }
            }
             else
                correct = false;
            
            if(correct){
                
                dp.setSize(0,0);
                pin.high();
                   try {
                       Thread.sleep(1000);
                       pin.low();
                       Lock_Button.doClick();
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Lock_Screen.class.getName()).log(Level.SEVERE, null, ex);
                   }
                
            }
            else{
                JOptionPane.showMessageDialog(null,"Your Pattern is Incorrect");
            }
            }
            
        }
        else{
            dp.check=true;
             try {
                 set_dots=0;
                    fi=new FileInputStream("/home/pi/Hexagonal/code/lock.txt");
                    while(fi.available()>0){
                        set_pattern[k]=fi.read();
                        k++;
                        set_dots++;
                        System.out.println(set_dots);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(Lock_Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
            boolean correct = true;
            if(set_dots==check_dots){
                for (int i = 0; i < check_dots; i++) {
                    if(set_pattern[i]!=check_pattern[i]){
                        correct=false;
                        break;
                    }   
                }
            }
            else
                correct = false;
            
            if(correct){
                
                dp.setSize(0,0);
                pin.high();
                try {
                    Thread.sleep(1000);
                    pin.low();
                    Lock_Button.doClick();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Lock_Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Your Pattern is Incorrect");
            }
        }
        
        
        
        for (int i = 0; i < dp.n_hex; i++) {
            dp.hex_selected[i]=false;
        }
        repaint();
}
    }//GEN-LAST:event_ScreenMouseReleased

    private void ScreenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScreenMousePressed

        if(dp.size().height>0){
        int h = getHexAt(evt.getX(),evt.getY());
        if(h!=-1){
            dp.hex_selected[h]=true;
            if(Pattern_Set.isSelected()){
                int i=100;
                while(--i>=0) set_pattern[i]=-1;
                dp.check=false;
                set_dots=0;
                set_pattern[set_dots++]=h;
            }
            else{
                dp.check=true;
                check_dots=0;
                check_pattern[check_dots++]=h;
            }
            prev_dot=h;
        }
        else
            JOptionPane.showMessageDialog(null,"Please draw on hexagons");
        repaint();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_ScreenMousePressed

    private void Pattern_SetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pattern_SetActionPerformed
        if(dp.size().height>0){
            if(Pattern_Set.isSelected()){
      
                ProcessBuilder pb = new ProcessBuilder("/bin/sh", "/home/pi/Desktop/keyboard.sh");
                //pb.directory(new File("/home/pi/Desktop/"));
                try {
                    // redirect stdout, stderr, etc
                    Process p = pb.start();
                    //Thread.sleep(100);
                    //p.destroy();
                } catch (Exception ex) {
                    Logger.getLogger(Lock_Screen.class.getName()).log(Level.SEVERE, null, ex);
                }
                //String check_security_code= JOptionPane.showInputDialog("Please enter Security key... ");
                //String sysroot = System.getenv("SytemRoot");
               String check_security_code=hc.getName();
               //p.destroy();
                code[0]=check_security_code;
                if(check_security_code!="cancel"){
                if(code[0].equals(security_code)){
                
                Pattern_Set.setBackground(new Color(0,220,20));
                Pattern_Set.setText("Set new ");
       
                }
                else
                {
                    //JOptionPane.showMessageDialog(null,"Entered security key is in valid..?");
                   JOptionPane.showMessageDialog(null, "Entered security key is in valid..?", "Error", JOptionPane.ERROR_MESSAGE);
                 
                }
               }
               else{
                   Lock_Button.doClick();
               }
            }
            else{
            
                Pattern_Set.setBackground(new Color(0,102,255));
                Pattern_Set.setText("Set Pattern");
            }
        }
        
    }//GEN-LAST:event_Pattern_SetActionPerformed

    private void Lock_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lock_ButtonActionPerformed
        
        Screen_Off.setSize(450,750);
        
    }//GEN-LAST:event_Lock_ButtonActionPerformed

    private void Level_SliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Level_SliderMouseReleased
    dp.levels = Level_Slider.getValue();
    repaint();

    }//GEN-LAST:event_Level_SliderMouseReleased

    private void Length_SliderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Length_SliderMouseReleased
      dp.hex_side = Length_Slider.getValue();
      repaint();

    }//GEN-LAST:event_Length_SliderMouseReleased

    private void Screen_OffMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Screen_OffMouseReleased

        Screen_Off.setSize(0,0);
        dp.setSize(450,750);
        
    }//GEN-LAST:event_Screen_OffMouseReleased

    private void Border_ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Border_ToggleActionPerformed
        
        if(Border_Toggle.isSelected()){
            Border_Toggle.setBackground(new Color(0,220,20));
            Border_Toggle.setText("Border");
            dp.border=false;
        }
        else{
            Border_Toggle.setBackground(new Color(0,102,255));
            Border_Toggle.setText("Borderless");
            dp.border=true;
        }
        repaint();
        
    }//GEN-LAST:event_Border_ToggleActionPerformed
    
    
    
    

    
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
            java.util.logging.Logger.getLogger(Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lock_Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lock_Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JToggleButton Border_Toggle;
    private javax.swing.JSlider Length_Slider;
    private javax.swing.JSlider Level_Slider;
    private javax.swing.JButton Lock_Button;
    private javax.swing.JLabel Notif;
    private javax.swing.JToggleButton Pattern_Set;
    private javax.swing.JPanel Screen;
    private javax.swing.JLabel Screen_Off;
    private javax.swing.JLabel Sub_head_2;
    private javax.swing.JLabel Sub_head_3;
    private javax.swing.JLabel Time_Display;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
