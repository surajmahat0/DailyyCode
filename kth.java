public class kth {

    public static void main(String args[]){

        int a[]={2,3,8,4,7,6,5};

        int k=6;

        for(int i=0;i<a.length-1;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]<a[j]){

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if(i==k-1){

                System.out.println(a[i]);
                break;
            }

       
            
        }
        
    }
    
}
