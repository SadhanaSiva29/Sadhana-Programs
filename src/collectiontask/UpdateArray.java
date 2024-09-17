package collectiontask;

import java.util.Scanner;

public class UpdateArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        UpdateArray updateArray = new UpdateArray();
        updateArray.updateArrayValue(1,60,numbers);
    }
    public void updateArrayValue(int index, int value, int[] array){
        for(int i = 0;i < array.length;i++){
            if(i == index)
                array[i] = value;
        }
        for( int i = 0;i<array.length;i++)
            System.out.println(array[i]);
    }

}
