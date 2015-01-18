/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package procesoso;

/**
 *
 * @author JUAN
 */
import java.io.File;

import javax.swing.JFileChooser;

public class Main {

  public static void main(String[] a) {
    JFileChooser fileChooser = new JFileChooser(".");
    int status = fileChooser.showOpenDialog(null);

    if (status == JFileChooser.APPROVE_OPTION) {
      File selectedFile = fileChooser.getSelectedFile();
      System.out.println(selectedFile.getParent());
      System.out.println(selectedFile.getName());
      System.out.println(selectedFile.length());
      System.out.println(selectedFile.getUsableSpace());
      System.out.println(selectedFile.getTotalSpace());
      System.out.println(selectedFile.getFreeSpace());
      System.out.println(selectedFile.getTotalSpace()-selectedFile.getUsableSpace());
    } else if (status == JFileChooser.CANCEL_OPTION) {
      System.out.println("canceled");
    }
  }

}
