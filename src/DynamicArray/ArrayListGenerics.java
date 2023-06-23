package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList();
        numList.add(100);
        numList.add(200);
        numList.add(300);
        numList.add(400);
        numList.add(500);
        numList.add(100);
        numList.add(100);

        System.out.println(numList);

        for(Integer num : numList)
        {
            System.out.println(num);
        }

        ArrayList<String> empName = new ArrayList();
        empName.add("Jason");
        empName.add("Roger");
        empName.add("Lee");
        empName.add("Kerrie");

        System.out.println(empName.get(2));


    }
}
