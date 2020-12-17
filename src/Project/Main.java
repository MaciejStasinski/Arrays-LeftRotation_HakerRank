package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int d=3;
        List<Integer>arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int[] a = new int[arr.size()];
        for(int i=0;i<a.length;i++){
            a[i]= arr.get(i);
        }
        int[] aTemp=new int[a.length];

        for (int j=0;j<d;j++) {
            for (int i = a.length-1; i > 0; i--) {
                aTemp[i - 1] = a[i];
            }
            aTemp[a.length - 1] = a[0];

            for (int b=0;b<a.length;b++){
                 a[b]=aTemp[b];
            }
        }

        for (int q:a) {
            System.out.print(q+" ");
        }
        for (int i=0;i<a.length;i++){
            arr.set(i,a[i]);
        }
    }
}
