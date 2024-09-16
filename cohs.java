import java.util.*;

public class cohs {

    public static void main(String args[]){

        int a[]={1,2,5,4,3,6,7};
        int b[]={3,6,7,9,8,1,6};

        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for(int no:a){

            hs.add(no);
        }

        for(int no:b){

            hs1.add(no);
        }

        for(int no:hs1){

            boolean c = hs.add(no);
            if(c==false){

                System.out.println(no);
            }
        }


    }

    
}
