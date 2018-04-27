package priority;

import java.util.Scanner;

public class Priority {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of process");
        int n=sc.nextInt();
        String[] jobs=new String[n];
        int[] bt=new int[n];
        int[] p=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter job name");
            jobs[i]=sc.next();
            System.out.println("enter burst time");
            bt[i]=sc.nextInt();
            System.out.println("enter priority");
            p[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(p[j]>p[j+1]){
                    int tempp=p[j];
                   int temp=bt[j];
                   String tempname=jobs[j];
                   p[j]=p[j+1];
                   bt[j]=bt[j+1];
                   jobs[j]=jobs[j+1];
                   p[j+1]=tempp;
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
        System.out.println("Priority sheduling with minimum no. as higher priority");
        System.out.println("Jobs_name  Priority AT BT CT TAT WT");
        for(int i=0;i<n;i++){
            System.out.print(jobs[i]+"          "+p[i]+"        0  "+bt[i]+"  "+ct[i]+"  "+ct[i]+"   "+wt[i]);
            System.out.println();
    }
    
}
}
