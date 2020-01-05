/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author prakash
 */
public class SplashScreen {
    public static void main(String args[]) throws InterruptedException{
        int i;
         splash n = new splash();
         n.setVisible(true);
        for(i=0;i<=100;i++){
            Thread.sleep(40);
            n.progresvalue.setText(Integer.toString(i)+"%");
            n.progressbar.setValue(i);
            if(i==99){
            n.setVisible(false);
            homepage h = new homepage();
            h.setVisible(true);
        }
        }
        
    }
    
}
