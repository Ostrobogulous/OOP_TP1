package customarraylist;

public class Runner {
    public static void checkExistence(CustomArrayList arr, int number) {
        System.out.println(number + " exist in the Array: " + arr.isIn(number));
    }

    public static void checkEmpty(CustomArrayList arr) {
        System.out.println("Array is empty: " + arr.isEmpty());
    }

    public static void findIndex(CustomArrayList arr, int number) {
        System.out.println("Index of " + number + ": " + arr.find(number));
    }

    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList(4);
        checkEmpty(arr);
        arr.add(4);
        arr.add(9);
        arr.add(7);
        arr.add(5);
        arr.add(22);
        arr.add(10);
        arr.show();
        checkEmpty(arr);
        arr.add(2, 2);
        arr.show();
        arr.remove(5);
        arr.show();
        findIndex(arr, 7);
        checkExistence(arr, 73);
        findIndex(arr, 73);
        checkExistence(arr, 22);
    }
}