/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Shawn
 */
public class JavaTimer {

    /**
     * @param args the command line arguments
     */
    private int secondsPassed;
    private int secondslossed;
    private Timer myTimer;
    private TimerTask task = new TimerTask() {

        @Override
        public void run() {          
            secondsPassed++;
            System.out.println("Seconds Passed: " + secondsPassed);    
//            while (secondsPassed > 9 ) { 
//               stop();
//            }
            
        }
    };
    
     private TimerTask taskTwo = new TimerTask() {

        @Override
        public void run() {          
            secondslossed--;
            System.out.println("Seconds Lossed: " + secondslossed);    
            while (secondslossed <= 0 ) { 
               stop();
            }
            
        }
    };
    

    public void start() { 
        myTimer = new Timer();
        myTimer.schedule(task, 1000, 1000); //Seconds
//        myTimer.schedule(task, 60000, 60000); // Minutes
//        myTimer.schedule(task, 3600000, 3600000); // Hours
    }
    
    public void startTimer() { 
        myTimer = new Timer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seconds:");    
        secondslossed = scanner.nextInt();
        
        myTimer.schedule(taskTwo, 1000, 1000); //Seconds
//        myTimer.schedule(task, 60000, 60000); // Minutes
//        myTimer.schedule(task, 3600000, 3600000); // Hours
    }
    
     public void stop() {       
        System.exit(0);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        JavaTimer timer = new JavaTimer();    
//        while (timer.secondsPassed < 11 ) {            
//           timer.start(); 
        timer.startTimer();
//        }
//          timer.stop();
        
    }

}
