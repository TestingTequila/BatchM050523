package arrays;

import java.util.Arrays;

public class StaticArray {

    public static void main(String[] args) {
        //1. Static Array
        //1,2,3,4,5,6,7,8,9,10
        // dataType[] arrayName = {value1, value2, value3, value4.........valueN};
        int[] numbers = {23, 24, 13, 74, 85, 66, 27, 8, 91, 100};
        System.out.println(Arrays.toString(numbers));

//        int x=0;
//        while (x<numbers.length)
//        {
//            System.out.println(numbers[x]);
//            x++;
//        }

//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

//        for(int num : numbers)
//        {
//            System.out.println(num);
//        }

        // Group of Something
        // Arrays
        // Loops

        // Blaise, Hamzi, Jeremy, sana, Zuhoor, Tashi


        // dataType[] arrayName = {value1, value2, value3, value4.........valueN};

        String[] students = {"Blaise", "Hamzi", "Jeremy", "Sana", "Zuhoor", "Tashi"};
//        for(String stud: students)
//        {
//            System.out.println(stud);
//        }

        // 10 integer numbers

        // dataType[] nameOfArray= new dataTYpe[numberOfItemsYouWantToStore];
        int[] integerNumbers = new int[10];

        integerNumbers[0] = 43;
        integerNumbers[3] = 134;
        integerNumbers[1] = 1134;

        System.out.println(Arrays.toString(integerNumbers));

        for (int in : integerNumbers) {
            System.out.println(in);
        }

        // My every batch will have 10 students
        String[] batch = new String[10];
        batch[0] = "Asad";
        batch[1] = "Sanaa";
        batch[2] = "Murtaza";
        batch[3] = "Jeremy";
        batch[4] = "Hamzi";

        batch[5] = "Sayed";
        batch[6] = "Tashi";

        // Ashish, 30, India, Software Engineer, False, 69.34

        Object[] myInfo = new Object[6];
        myInfo[0] = "Ashish";
        myInfo[1] = 30;
        myInfo[2] = "India";
        myInfo[3] = "SE";
        myInfo[4] = false;
        myInfo[5] = 69.34;

        //System.out.println(Arrays.toString(myInfo));

        for (Object info : myInfo) {
            System.out.print(info + ",");
        }


        String[] myMenu = {"Home", "Gift Certificates", "Brands", "Blogs", "Contact Us"};

        for (String menu : myMenu)
        {
            if(menu.equals("Brands"))
            {
                // Click on Brands tab
            }
        }

        // booking for a movie ticket: Number of seats, Flight, Months, DAys of the week
    }
}
