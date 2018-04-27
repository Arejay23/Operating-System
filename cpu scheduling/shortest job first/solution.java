package sjf;

import java.util.*;

public class Sjf {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of process");
        int n=sc.nextInt();
        String[] jobs=new String[n];
        int[] bt=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter job name");
            jobs[i]=sc.next();
            System.out.println("enter burst time");
            bt[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(bt[j]>bt[j+1]){
                   int temp=bt[j];
                   String tempname=jobs[j];
                   bt[j]=bt[j+1];
                   jobs[j]=jobs[j+1];
                   bt[j+1]=temp;
                   jobs[j+1]=tempname;
                }
            }
        }
        int ans=0;
        int[] ct=new int[n];
        for(int j=0;j<n;j++){
            ans=ans+bt[j];
            ct[j]=ans;
        }
        int[] wt=new int[n];
        for(int j=0;j<n;j++){
            wt[j]=ct[j]-bt[j];
        }
        System.out.println("***********************************************");
        System.out.println("FCFS with same arrival time i.e. 0");
        System.out.println("Jobs_name  AT BT CT TAT WT");
        for(int i=0;i<n;i++){
            System.out.print(jobs[i]+"         "+"0 "+bt[i]+"  "+ct[i]+"  "+ct[i]+"   "+wt[i]);
            System.out.println();
    }
}
}
