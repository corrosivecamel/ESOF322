package com.company;

public class Lisp {
    public int max;


    public static void main(String[] args) {
        new Lisp().run();
    }


    public void run(){
        int i = 0;
        int[] intArray = new int[]{ 1, 2, 3, 4, 5, -6, -7, 8, 9, 10};
        while ( i < 10 ) {
            highestSum(intArray);
            i = i+1;
        }
        System.out.println(" "+ max);
    }


    public void highestSum (int[] list)
    {
        int tempMax = 0;
        int i = 0;
        int[] restArr;
        //int temp = 0;
        while(i < list.length)//iterate through temp array and add values
        {//temp values and check every time if larger than max
            tempMax = tempMax + list[i]; //add list value to temporary
            if(tempMax > max)
            {
                max = tempMax;
            }
            i++;
        }
        if(list.length>=1)
        {
            restArr = new int[list.length - 1]; //make rest = list and recursive call
            for(int a = 0 ; a < list.length-1 ; a++)
                {
                     restArr[a] = list[a+1];
                }
            highestSum(restArr);
        }
    } // find the highest value of adding adjacent values
}

