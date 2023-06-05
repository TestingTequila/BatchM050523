package loops;

public class WhileLoop {

    public static void main(String[] args) {


        // Print the numbers from 1 to 10
//            int x =1;
//            while (x<=10)
//            {
//                    System.out.println(x);//1,2,3,4,5,6,7,8,9,10
//                    x++;
//            }

//        int x =1;
//        while (x<=100)
//        {
//            System.out.println(x);//1,2,3,4,5,6,7,8,9,10
//            ++x;
//        }


        // Print the numbers from 10 to 1
//        int x =10;
//        while (x>0)
//        {
//            System.out.println(x);
//            x--;
//        }


//        int x =1;
//        while (x<=10)
//        {
//            System.out.println(x);
//
//        }

//        while (true)
//        {
//            System.out.println("We are offering flat discount of 70%");
//        }

        //WAP to print the table of 2

//        int x = 1;
//        while (x <= 10) {
//            System.out.println(2 * x);//2,4, 6,8
//            x++;//5
//        }

        // Print the numbers from 1 to 10 and if you get 5...don't print anything

//        int x=1;
//        while (x<=10)
//        {
//            if(x==5)
//            {
//                System.out.println("-");
//                //break;
//            }
//            System.out.println(x);
//            x++;
//        }

        int x = 1;
        while (x <= 10) {
            if (x != 5) {
                System.out.println(x);
            } else {
                System.out.println("-");
            }
            x++;
        }
    }
}
