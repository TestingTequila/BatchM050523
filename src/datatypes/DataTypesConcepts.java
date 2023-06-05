package datatypes;

public class DataTypesConcepts {


    public static void main(String[] args) {


        byte x = 10;
        byte y = 127;

        //System.out.println(x + y);

        //What are variables?
        // It's like a Jar, Box, Container which is made or used to contain, store or hold something

        // How to create variables

        //1. dataType variableName = value;

        //2. dataType variableName;
        //   variableName = value;

        // What are dataTypes?
        // Two types of DataTypes
        //1. Primitive Data Type
        //Occupies Fixed memory/Space
        //Does not need object ot use primitive data types
        // Numeric
        //1. Integral
        // Integer : byte, short, int, long
        // Floating-point: float, double

        //2. Character : char
        // Boolean: bool


        //2. Non-Primitive Data Type
        //Does not occupy Fixed memory/Space
        // We need object to use Non-primitive data types

        // DataTypes: byte, short, int, long, float, double, char, boolean

        //1. dataType variableName = value;
        //1 byte = 8 bits
        byte num1 = 10;
        short num = 128;
        int num3 = 32768;
        long num4 = 2147483648l;
        float num5 = 12.34242224f;
        double num6 = 144.564564;
        boolean check = true;
        boolean myCheck = false;
        short x1 = 127;
        short x2 = 20;

        //System.out.println(num1 + "/" + num+ "/" + num3 + "/" + num4+ "/" + num5 + "/" + num6);

        //short sum =x1+x2;

        byte age = 30;

        char x3 = '1'; // 97
        System.out.println((int) x3);

        char x4 = 'b'; // 98
        //System.out.println(x3 + x4); // 195
        System.out.println(x3 + "" + x4);

        // If we perform any operations on char data type this will give you the ASCII table values

        char m = 'y';
        char m1 = 'n';

        long mobileNumber = 8860418225l;
        long ssn = 1234567812345678l;
        long ccNumber = 1324432164358764l;

        long distEm = 24342424223432324l;
        Boolean myBool = false;

        //Primitive data Type:  int, double, char, boolean
        // Non-Primitive data Type : String
        String myFirstName = "Ashish";

        String myLastName = "Mishra";

//        String fullName=myFirstName+myLastName; // Concatenation
//        System.out.println(fullName);

        int a = 100;
        int b = 200;
        //System.out.println(myFirstName+myLastName + a +b); AshishMishra100200
        //System.out.println(a + b + myFirstName + myLastName);300AshishMishra
        System.out.println(a + b + myFirstName + myLastName + a + b); //300AshishMishra100200

        float dec = 12.75f;
        System.out.println(dec++);//12.75
        System.out.println(++dec);//

        double x11 = 12.75;
        double x22 = x1++;
        System.out.println(x11);//13.75
        System.out.println(x22);//12.75


        //1. dataType variableName = value;
        int x112 = 10;


        //2. dataType variableName;
        //   variableName = value;

        int num11;
        num11=123;





    }


}
