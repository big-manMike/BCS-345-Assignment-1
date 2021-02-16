/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcs.pkg345.assignment.pkg1;

/**
 *
 * @author Michael
 */
public class BCS345Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This for loop starts at i=0 and repeats itself until i=100 
        for(int i=0; i<=100;i++)
        {
            //This if statement checks if i is even
            if(i%2==0)
            {
                //If i is even then this print statement will print i and make a new line
                System.out.println(i);
            }
        }
    }
    
}
