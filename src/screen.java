/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class screen {
      public static void main(String args[]) {
        
          Splash Splash = new Splash();
          Splash.setVisible(true);
          try{ 
              for (int i=0; i<=100;i++){
                   Thread.sleep(70);
                   Splash.loadingbar.setValue(i);
              
              }
          }
              catch(Exception e){
                      
              }
          }  
}
