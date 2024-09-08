import java.util.ArrayList;

public class evod {

    public static void main(String args[]){

        int a[]={8,7,6,5,9,4,3,2,1};

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i=0;i<a.length;i++){

            if(a[i]%2==0){

                al1.add(a[i]);
            }
            else{

                al2.add(a[i]);
            }
        }
        

        int total =0;
        System.out.println("even numbers are:");
        for(int no:al1){
            
            total = total+no;
            System.out.print(no+" ");
        }
        System.out.println("\n");
        System.out.println("total numbers are :"+al1.size());
        System.out.println("The sum of even numbers are:"+total);
        System.out.println("\n");
        
        
        int total1=0;
        System.out.println("odd numbers are:");
        for(int no:al2){
            total1 = total1+no;
            System.out.print(no+" ");

        }
        System.out.println("\n");
        System.out.println("total numbers are :"+al2.size());
        System.out.println("The sum of odd numbers are:"+total1);
        
    }
}
