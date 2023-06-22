package StringConcepts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringManipulation {

    public static void main(String[] args) {
        int i = 10;
        String str = "Hi this is my java code and i am so happy";

        //length
        System.out.println(str.length());

        //charAt
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(15));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(40));

        //System.out.println(str.charAt(41));

        // index Of
        System.out.println(str.indexOf('H'));

        System.out.println(str.indexOf("java"));

        String m1 = "Welcome null";


        if (m1.indexOf("admin") == 8) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Login for admin failed");
        }

        // trim
        String p = "   Hello World   ";

        System.out.println(p.trim());

        //replace

        String p1 = "  Hello World Ashish  ";
        System.out.println(p1.replace(" ", ""));

        String dob = "25-12-1994"; // 25/12-1994;

        System.out.println(dob.replace("-", "/"));

        String mesg = "I Love Java";
        System.out.println(mesg.replace("Love", "Hate"));

        String s1 = "Hello Selenium";
        String s2 = "Hello selenium";

        System.out.println(s1.equals(s2)); //True,False
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        //contains

        String tq = "Welcome to Janbask training";
        System.out.println(tq.contains("Janbask"));

        System.out.println(m1.contains("admin")); //false

        // split
        String lang = "JAVA PYTHON RUBY DOTNET CSHARP";
        System.out.println(lang.length());
        String[] l = lang.split(" ");
        System.out.println(l.length);
        System.out.println(Arrays.toString(l));
    }
}
