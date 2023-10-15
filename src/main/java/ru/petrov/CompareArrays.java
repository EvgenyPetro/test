package ru.petrov;

public class CompareArrays {

    public <T, V> boolean compareArrays(T[] arr1, V[] arr2) {
        Class<?> aClass;
        Class<?> bClass;

        if (arr1 == null || arr2 == null) {
            return false;
        }
        aClass = getType(arr1);
        bClass = getType(arr2);
        if (!aClass.equals(bClass)) {
            return false;
        }
        return arr1.length == arr2.length;
    }

    private <T> Class<?> getType(T[] arr) {
        if (arr != null && arr.length != 0) {
            return arr.getClass();
        }
        return null;
    }
}
