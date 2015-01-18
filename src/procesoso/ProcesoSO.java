/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procesoso;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author JUAN
 */
public class ProcesoSO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] lista = UIManager.getInstalledLookAndFeels();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i].getClassName());
        }
        
    try{
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    }catch (Exception e){
        e.printStackTrace();
    }
    Principal F1=new Principal();
    boolean vis=true;
    F1.setVisible(vis);
    F1.setLocationRelativeTo(null);
    }
}


