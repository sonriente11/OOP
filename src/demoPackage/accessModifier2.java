package demoPackage;

import com.OOP.accessModifiers;

public class accessModifier2 extends accessModifiers {
    public static void main(String[] args) {
        accessModifiers am = new accessModifiers();
        System.out.println(am.iAmPublic);
        am.abcPublic();
        accessModifier2 am2 = new accessModifier2();
        am2.abcProtected();
    }
}
