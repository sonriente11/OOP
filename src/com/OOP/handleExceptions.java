package com.OOP;

public class handleExceptions {
//one try can be followed by multiple catch blocks
    //catch should be an immediate block after try
    public static void main(String[] args) {
        handleExceptions he = new handleExceptions();

        int a = 4;
        // 3 lines:
        // try catch mechanism

        int b = 7;
        int c = 0;
        try { //whatever you type in the try block that means that you are trying something - maybe it works, maybe it doesn't.
         // int k = b/c; //-catched my AritmeticException

            int arr[] = new int [5];
            System.out.println(arr[7]);
         //  System.out.println(k);
        }
        catch (IndexOutOfBoundsException ets) {
            System.out.println("I catched indexBound exception");

        }catch (ArithmeticException et){ //it is specific exception for arithmetic exception)
            System.out.println("I catched the Arithmetic exception");
        } catch (Exception e) { //it is generical exception and accept all types of errors
            System.out.println("I catched the error/exception!");
        }
        finally {
            //this block is executed irrespective of exception thrown or where there are no errors at all
        //it is used only when there are "try" block
            System.out.println("Delete cookies");

        }

    }
}
