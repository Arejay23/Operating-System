package pagereplacementalgo;

import java.util.*;

public class Pagereplacementalgo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n=sc.nextInt();
        System.out.println("Enter the size memory referce string");
        int m=sc.nextInt();
        System.out.println("Enter the squence");
        int[] seq=new int[m];
        for(int i=0;i<m;i++){
            seq[i]=sc.nextInt();
        }
        LinkedList<Integer> li=new LinkedList<>();
        int pagefault=0;
        int k=0;
        for(int i=0;i<m;i++){
            int x=k%n;
            if(!li.contains(seq[i])){
                pagefault++;
                k++;
                if(i>=n){
                    li.set(x,seq[i]);
                }
                else{
                    li.add(seq[i]);
                }
            }
        }
        System.out.println("No. of page fault = "+pagefault);
        
        
    }
    
}
