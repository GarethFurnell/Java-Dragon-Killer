/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dragonkiller;

/**
 *
 * @author Gareth Furnell 11329
 */
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class DragonKiller {
    
    public static void main(String[] args) { //includes input and main/killer array
        String name = JOptionPane.showInputDialog("Enter Name and Surname: ");
        int[] arrayDragon  = new int[removeSpace(name)];
        for (int i = 0; i < arrayDragon.length; i++) {
            arrayDragon[i] = (int) randomOdd();
            
        }
        Arrays.sort(arrayDragon);
        System.out.println(name + " Your name includes");
        System.out.println(Arrays.toString(arrayDragon));
        System.out.println("random odd numbers as characters");
        
        arrayDragon = insertionSort(arrayDragon);
        System.out.println(Arrays.toString(arrayDragon));
    }
    public static int removeSpace(String name){
        name = name.replaceAll("\\s", "");
        
        return name.length();
    }

    public static int[] insertionSort(int[] arrayDragon){ //Killer function
        
        int ch = Integer.parseInt(JOptionPane.showInputDialog("Enter valid number to be killed: "));

        for (int i = 0; i < arrayDragon.length; i++) {
            if(ch == arrayDragon [i]){
                arrayDragon [i] = 0;
            }
        }
        return arrayDragon;
    }
        
          
        
    @SuppressWarnings("SuspiciousIndentAfterControlStatement") //return statement
    public static int randomOdd(){   //random odd numbers between 10 & 50
    Random rand = new Random();
        int odd = 0;
        
        while(odd % 2 == 0)
        odd = rand.nextInt(50 + 1 - 10) + 10;
        
        return odd;
    }
}
    //troubleshooting methods

     /*     //insertionSort possibility
            }else{
                JOptionPane.showMessageDialog(null, "Number not found","index search unsuccessful", JOptionPane.ERROR_MESSAGE);
                int doublecheck = Integer.parseInt(JOptionPane.showInputDialog("Enter valid number to be killed:"));

        for (int j = 0; j < arrayDragon.length; j++) {
            if(doublecheck == arrayDragon [j]){
                arrayDragon [j] = 0; 
            }
        }
        
    }
        }return arrayDragon;
    }
      */
    
            /*
        
        //odd random number possibility
        int c = 0;
        int x = 10;
          x = (int) (Math.random()*(50-10 + 1));
            x = x* 2 + 1;
            if ( x %2 != 0){
                 c = x;
            }
        */
    
    
    
    /*
    public static double random(){  // just need random odd generator to work
        
        int v;
        for (v = 9; v < 49; v++){
            
        if ( v % 2 != 0){
            //arrayDragon[i] = v;
        } 
         } 
       return random();     
        }
    */
