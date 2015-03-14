/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.daoinformati.martinsjavatestsnumbertwo.part1;

/**
 * @author MartinStern
 */
public class SayNothingToTheWorld {
    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    String testString;
    public static void main(String attr[]) {
        System.err.println("ha ha ");
        System.out.println("und das hier kommt aus IDEA von IntelliJ");
        // echt schräg so was
        SayNothingToTheWorld me = new SayNothingToTheWorld();
        me.setTestString("bla bla bla ....");
        System.out.println("und was steht nun drin: " + me.getTestString());
        System.out.println(me.toString());
    }

    @Override
    public String toString() {
        return "SayNothingToTheWorld{" +
                "testString='" + testString + '\'' +
                '}';
    }
}
