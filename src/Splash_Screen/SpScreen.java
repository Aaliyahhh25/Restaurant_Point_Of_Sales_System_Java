
package Splash_Screen;

public class SpScreen {
    public static void main(String[] args) {
     SplashScreen splash = new SplashScreen();
     splash.setVisible(true);
       try{
           for(int i=0;i<=100;i++)
           {
           Thread.sleep(20);
           SplashScreen.jProgressBar2.setValue(i);
           
           }
           new SecondFrame().setVisible(true);
           
       
       }catch(Exception e){
           
       }
     
    }
}
