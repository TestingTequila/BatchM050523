package StringConcepts;

import javax.sound.midi.Soundbank;

public class StringConcept {

    public static void main(String[] args) {

        // String literals
        String str = "Selenium";
        String str1 = "Selenium";

        String str2 = "selenium";

        System.out.println(str == str1);
        System.out.println(str.equals(str1));

        // String object with new Keyword

        System.out.println("=====================================");

        String s1 = new String("testing"); //2
        String s2 = new String("testing"); //1
        String s3 = "testing"; //0
        String s4 = "testing"; //0

        System.out.println(s3 == s4); //true
        System.out.println(s1 == s2); //false-It compares the object
        System.out.println(s1.equals(s2)); // true- It compares the values of the objects
        System.out.println(s1 == s3);// false
        System.out.println(s3 == s4); // true
        System.out.println(s1.equals(s3)); //true

        String s5 = "Testing";
        System.out.println(s5.length()); //7

        s5 = null;
        //System.out.println(s5.length());


//        int i = 10;
//        i = 20;
//        i = 30;
//
//        System.out.println(i);


        String s6 ="Ashish";
        s6="Sana";
        System.out.println(s6);

    }


}
