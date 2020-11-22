package com.OOP;

public class arraysExercise
{
    public static void main(String[] args) {
        int newMatrix [][] = new int[3][3];
newMatrix[0][0] = 2;
newMatrix[0][1] = 4;
newMatrix[0][2] = 5;
newMatrix[1][0] = 3;
newMatrix[1][1] = 4;
newMatrix[1][2] = 7;
newMatrix[2][0] = 5;
newMatrix[2][1] = 2;
newMatrix[2][2] = 1;
int minValue = Integer.MAX_VALUE;
int column = 0;
int columnMaxValue = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3 ; j++) {
              if (minValue > newMatrix[i][j]) {
                  minValue = newMatrix[i][j];
                  column = j;
              };
            }

        }
      //  System.out.println("column is" + column);
       // System.out.println(minValue +" min value");
        for (int i = 0; i <3 ; i++) {
            if (newMatrix[i][column]>columnMaxValue){
                columnMaxValue=newMatrix[i][column];
            }

        }
        System.out.println("Max value in the column with the smallest number is " + columnMaxValue);

    }
}
