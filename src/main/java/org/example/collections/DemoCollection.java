package org.example.collections;

import java.util.*;

public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<String> myFistArrayList = new ArrayList<>();
        myFistArrayList.add("Erroll");
        myFistArrayList.add("Aniket");

        List<Integer> testGenericsWithIntegerInList = new ArrayList<>();
        testGenericsWithIntegerInList.add(53);
        testGenericsWithIntegerInList.add(10);
        testGenericsWithIntegerInList.add(60);
        testGenericsWithIntegerInList.add(60);
        testGenericsWithIntegerInList.add(60);


        List<Integer> demoIntegers = List.of(5, 12, 322, 1, 23, 54, 55, 77, 345, 98);
        List<Integer> demoIntegersTwo = Arrays.asList(10, 50, 20, 60, 10);

        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        linkedList.get(3);
        testGenericsWithIntegerInList.get(3);

        demoIntegers.stream().filter(e->e>30).toArray();

        ArrayList<String> mySecondArrayList = new ArrayList<>();
        mySecondArrayList.add("T");
        mySecondArrayList.add("Sage");
        boolean b = myFistArrayList.addAll(mySecondArrayList);

        System.out.println("Before sorting " + myFistArrayList);

        Collections.sort(myFistArrayList);

        System.out.println("After sorting" + myFistArrayList);

        Collections.sort(myFistArrayList,Collections.reverseOrder());

        System.out.println("After sorting in reverse order" + myFistArrayList);

        for (int i = 0; i < myFistArrayList.size(); i++) {
            System.out.println(myFistArrayList.get(i));
        }

        for (String name : myFistArrayList) {
            System.out.println(name);
        }

        Iterator<String> iterator = myFistArrayList.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.equals("T")){
                iterator.remove();
            }
            System.out.println("I am from iterator " + next);
        }
        /*for (String name : myFistArrayList) {
            if(name.equals("T")){
                myFistArrayList.remove(name);
            }
            System.out.println(name);
        }*/


        //Demo for Map
        Map studentCityMap = new HashMap();

        studentCityMap.put("Malia","California");
        studentCityMap.put("T","USA");
        studentCityMap.put("Sage","Gorgia");
        studentCityMap.put("Erroll","SA");
        studentCityMap.put(5,"sds");





    }
}
