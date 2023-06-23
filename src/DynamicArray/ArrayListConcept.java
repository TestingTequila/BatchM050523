package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {

        // ArrayList just like arrays is an ordered based collection
        // ArrayList just like arrays can hold duplicate values

        ArrayList ar = new ArrayList();

        System.out.println(ar.size());

        ar.add(100);
        ar.add(200);
        ar.add(300);
        System.out.println(ar.size());

        ar.add(400);
        ar.add(500);

//        System.out.println(ar.size());

        //System.out.println(ar.get(2));
       // System.out.println(ar.get(4));

       // System.out.println(ar.get(5));IOBE
        ar.remove(3);

        System.out.println(ar.size());
//        System.out.println(ar.get(4));

//        System.out.println(ar);
//
//        for(int i=0; i <ar.size(); i++)
//        {
//            System.out.println(ar.get(i));
//        }

        System.out.println("=============================================");
        ArrayList empData = new ArrayList();
        empData.add("Ashish");
        empData.add("Delhi");
        empData.add('M');
        empData.add(29);
        empData.add(true);

        System.out.println(empData);
        System.out.println(empData.size());
        System.out.println(empData.get(2));

        for(Object emp : empData)
        {
            System.out.println(emp);
        }




    }

}
