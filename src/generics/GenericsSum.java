package generics;

public class GenericsSum {
    public  <T extends Number> double print(T number1, T number2)
    {
      return number1.doubleValue()+number2.doubleValue();
    }

    public static void main(String[] args) {
        GenericsSum genericsSum = new GenericsSum();
        int number1=10;
        int number2=20;
        System.out.println("Array intArray contains:");
        System.out.println(genericsSum.print(number1,number2));
    }
}
