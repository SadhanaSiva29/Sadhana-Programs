package generics;

public class Generics1 {
        public  <T> void printArray(T[] inputArray) {
            for (T element : inputArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Generics1 generics1 = new Generics1();
            Integer[] intArray = {1, 2, 3, 4, 5};
            System.out.println("Array intArray contains:");
            generics1.printArray(intArray);
        }
    }

