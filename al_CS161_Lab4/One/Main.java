//HEADER
//Program Name: Exercise One
//Author: Andrew Lutz
//Class: CS260 Fall 2019
//Date: 1/30/2020
//Description: Exercise one for lab week four



class Main{

    public static void main(String[] args){
       

        //for loop
        System.out.print("for: ");
        for (int i = 1; i < 11; i++){
           
            System.out.print(i + " ");
            
        }
        //space between the lines
         System.out.println("");
        
         //while loop
         System.out.print("while: ");
         int i = 0;
         while( i < 10 ){
            i = i + 1;
            
            System.out.print(i + " ");

         }
         //space between lines
         System.out.println("");

         //do...while loop
         System.out.print("do...while: ");
         int n = 0;
         do{
             n = n + 1;
             System.out.print(n + " ");
         }
         while(n < 10);
        
       


    }

}

