package customarraylist;

import java.util.Arrays;

public class CustomArrayList {
    private int[] dynamicArray;
    private int size;

    CustomArrayList() {
        dynamicArray = new int[10];
        size = 0;
    }

    CustomArrayList(int initialSize) {
        dynamicArray = new int[initialSize];
        size = 0;
    }

    public void add(int number) {
        if (size == dynamicArray.length) {
            dynamicArray = Arrays.copyOf(dynamicArray, 2 * dynamicArray.length);
        }
        dynamicArray[size] = number;
        size++;
    }

    public void add(int index, int number) {
        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }
        if (size == dynamicArray.length) {
            int[] temporalArray = new int[dynamicArray.length * 2];
            for (int i = 0; i < size; i++) {
                temporalArray[i] = dynamicArray[i];
            }
            dynamicArray = temporalArray;
        }
        for (int i = size; i > index; i--) {
            dynamicArray[i] = dynamicArray[i - 1];
        }
        dynamicArray[index] = number;
        size++;
    }

    public int get(int index) {
        return dynamicArray[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isIn(int x) {
        for (int i = 0; i < size; i++) {
            if (dynamicArray[i] == x) {
                return true;
            }
        }
        return false;
    }

    public int find(int x) {
        for (int i = 0; i < size; i++) {
            if (dynamicArray[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void remove(int x) {
        for (int i = 0; i < size; i++) {
            if (dynamicArray[i] == x) {
                for (int j = i; j < size - 1; j++) {
                    dynamicArray[j] = dynamicArray[j + 1];
                }
                dynamicArray[size - 1] = 0;
                break;
            }
        }
        size--;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%d | ", get(i));
        }
        System.out.println();
    }

}
