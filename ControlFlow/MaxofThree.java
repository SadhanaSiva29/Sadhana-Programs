package ControlFlow;
import java.util.Scanner;
public class MaxofThree {
    public void printMax(int a,int[] array){
        System.out.println("Maximum element:"+array[a]);
    }
    public static void main(String[] args) {
        int[] array={42,445547,784857,145142,78442};
        MaxofThree m=new MaxofThree();
        int t;
        int i;
        int j;
        for(i=0;i< array.length;i++){
            for(j=0;j< array.length;j++){
                if(array[i]<array[j]) {
                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        m.printMax(array.length-1,array);
        m.printMax(array.length-2,array);
        m.printMax(array.length-3,array);
    }
}
