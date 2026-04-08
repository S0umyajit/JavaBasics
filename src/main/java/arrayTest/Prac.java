package arrayTest;

import java.util.Arrays;

public class Prac {
    public static void main(String[] args) {
        int a[]=new int[3];
        a[0]=12;
        a[1]=1;
        a[2]=14;
//        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int b[][]=new int[][]
                {
                {10,50},
                {10,20}
                 };
        Arrays.sort(b,(x,y)->{
            if(x[0]==y[0]){
                return Integer.compare(x[1],y[1]);
            }
            else {
                return Integer.compare(x[0], y[0]);
            }
        });
        System.out.println(Arrays.deepToString(b));
    }
}
