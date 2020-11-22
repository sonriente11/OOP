package com.OOP;

public class ChildClassDemo  extends ParentClassDemo{
    public static void main(String[] args) {
        ChildClassDemo cc = new ChildClassDemo();
        cc.AudioSystem();

    }
  /*  public void AudioSystem  (){                                      //if this method is created it overrides the method AudioSystem from the Parent class
        System.out.println("The code here is changed");
    }
*/
}
