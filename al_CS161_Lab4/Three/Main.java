//HEADER
//Program Name: Exercise Three
//Author: Andrew Lutz
//Class: CS260 Fall 2019
//Date: 1/30/2020
//Description: Exercise three for lab  week four

class Main{

    public static void main(String[] args){


        //initialize integer equal to zero for a running total
        int n = 0;
        //loop iterates from one to 10 and less than 11 and adds
        //i to the prevous integer
        for (int i = 1; i < 11; i++){
           
            n = i + n;
           
        }
        //print sum
        System.out.print(n);
    }
}