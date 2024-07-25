package ControlFlow;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array={42,445547,784857,145142,78442};
        int t;
        int i;
        int j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(array[i]<array[j]) {
                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        System.out.println("Maximum element:"+array[4]);
        System.out.println("Minimum element: "+array[0]);
    }
}
