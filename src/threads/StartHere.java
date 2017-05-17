/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Toolkit;
/**
 *
 * @author jibba_000
 */

public class StartHere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("this is thread t");
                    try {
                        sleep(1000);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(StartHere.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t.start();

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("this is thread t2");
                    try {
                        sleep(1000);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(StartHere.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        t2.start();
    }

}
