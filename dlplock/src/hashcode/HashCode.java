/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author Akshay L Aradhya
 */
public class HashCode {
public static String getName() {
    String str="cancel";
    JPasswordField jpf = new JPasswordField(24);
    JLabel jl = new JLabel("Please enter the Security code: ");
    Box box = Box.createHorizontalBox();
    box.add(jl);
    box.add(jpf);
    int x = JOptionPane.showConfirmDialog(null, box, "Security key entry", JOptionPane.OK_CANCEL_OPTION);

    if (x == JOptionPane.OK_OPTION) {
      return jpf.getText();
    }
    else{
        return str;
    }
    //return null;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashCode obj=new HashCode();
        obj.getName();
        // TODO code application logic here
    }
    
}
