
package worstfit;

import java.util.Arrays;
import java.util.Scanner;


public class WorstFit {

    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of partition");
        int pno=sc.nextInt();
        System.out.println("enter size of partition");
        int[] par=new int[pno];
        for(int i=0;i<pno;i++){
            par[i]=sc.nextInt();
        }
        Arrays.sort(par);
        System.out.println("enter no. of process");
        int prno=sc.nextInt();
        System.out.println("enter size of processes");
         int[] pr=new int[prno];
         for(int i=0;i<prno;i++){
            pr[i]=sc.nextInt();
        }
         int n=pno-1;
         System.out.println("partition size         process size allocated");
         for(int j=0;j<prno;j++){
             if(par[n]>= pr[j]){
                 System.out.println(par[n]+"                       "+pr[j]);
                 n--;
                }
    
            }
    }
}
