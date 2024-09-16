import java.util.HashSet;

public class common {

    public static void main(String args[]){

        int a[]={1,2,5,6,8,9};
        int b[]={7,5,4,3,2,1};

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<a.length;i++){

            for(int j=0;j<b.length;j++){

                if(a[i]==b[j]){

                    hs.add(a[i]);
                    break;
                }
            }
        }

        for(int no:hs ){

System.out.println(no);
        }

        
    }
    
}
