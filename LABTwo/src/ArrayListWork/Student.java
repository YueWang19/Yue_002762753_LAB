/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayListWork;

/**
 *
 * @author Yue
 */
public class Student {
    int[] gradeRecord = new int[6];

     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int[] gradeRecord ={1,2,3,4,5,6};
       System.out.println("The original array is: ");
       for(int y = 0; y < gradeRecord.length; y++){
           System.out.println(gradeRecord[y]);
       }
       
       
       for(int i = 0; i< gradeRecord.length;i++){
           if(i % 2 ==0){
               gradeRecord[i]= gradeRecord[i] * 2;
           } else {
               gradeRecord[i] = gradeRecord[i] * 3;
           }
       }
       
       
       System.out.println("The new array after caculation is: ");
       for(int n = 0; n < gradeRecord.length; n++){
           System.out.println(gradeRecord[n]);
       }
       
        
        
     
        
        
   
        
        
    }
    
    
    
}
