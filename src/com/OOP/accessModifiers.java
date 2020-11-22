package com.OOP;

public class accessModifiers {
    public static void main(String[] args) {
        accessModifiers am = new accessModifiers();
        am.abcPrivate(); //private method can be accessed only from the current class
        System.out.println(am.iAmPrivate); // private variable can be accessed only from the current class
    }

    int iAmDefault = 5; //default variable cannot be accessed out of the package
    public int iAmPublic = 6; //public variable can be accessed out of the package
    private int iAmPrivate = 7; //private variable  cannot be accessed out of the class

    //default: access method anywhere in package (check class checkAccessModifiers
    void abcDefault() { //default method cannot be accessed out of the package
        System.out.println("I am in a method with a Default modifier");
    }

    public void abcPublic() { //public method can be accessed out of the package
        System.out.println("I am in a method with a Public modifier");
    }

    private void abcPrivate() { //private method cannot be accessed out of the class
        System.out.println("I am in a method with a Private modifier");
    }

    protected void abcProtected() { //protected method cannot be accessed out  of the class from subclasses only
        // ( = classes that have extended the current class)t v
        System.out.println("I am in a method with a Protected modifier");
    }

}
