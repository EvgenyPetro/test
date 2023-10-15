package ru.petrov;

public class Main {
    public static void main(String[] args) {
//        Calculate calc = new Calculate();
//        System.out.println(calc.sum(1, 2l));
//        System.out.println(calc.div(1, 0));

//        CompareArrays compareArrays = new CompareArrays();
//        Integer[] arr1 = {1, 2, 3};
//        Integer[] arr2 = {1, 2, 3};
//        Double[] arr3 = {1.0, 2.0, 3.0};
//        Integer[] arr4 = null;
//        Integer[] arr5 = {1, 2, 3, 5};
//        System.out.println(compareArrays.compareArrays(arr1, arr3));
//        System.out.println(compareArrays.compareArrays(arr1, arr2));
//        System.out.println(compareArrays.compareArrays(arr1, arr4));
//        System.out.println(compareArrays.compareArrays(arr1, arr5));

        Pair<String, Boolean> pair1 = new Pair<>("1", true);
        Pair<String, Integer> pair2 = new Pair<>("1", 10);
        Pair<String, Class<?>> pair3 = new Pair<>("Integer", Integer.class);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}
