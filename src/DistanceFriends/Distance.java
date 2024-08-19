package DistanceFriends;
import java.util.Scanner;
public class Distance {
    int a=1;
    int b=3;
    int c=5;
    int d=7;
    int e=9;
    public int difference(int distance1, int distance2) {
            if (distance1 <= distance2) {
                return distance2 - distance1;
            } else {
                return distance1 - distance2;
            }
        }
    public int nameSwitch(String name){
        int distances = 0;
        switch (name) {
            case "a":
                distances=this.a;
                break;
            case "b":
                distances=this.b;
                break;
            case "c":
                distances=this.c;
                break;
            case "d":
                distances=this.d;
                break;
            case "e":
                distances=this.e;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        return distances;
    }
    public static void main(String[] args) {
        Distance distance=new Distance();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the starting point and end point:");
        String start= scanner.nextLine();
        String end=scanner.nextLine();
            int distance1 = distance.nameSwitch(start);
            int distance2 = distance.nameSwitch(end);
            if(distance1!=0 && distance2!=0)
                System.out.println(distance.difference(distance1, distance2));
    }
}