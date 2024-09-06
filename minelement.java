public class minelement {

    public static void main(String args[]){

        int a[] = {2,5,4,3,6,8,6};
        int max=a[0];

        for(int i=1;i<a.length;i++){

            if(a[i]<max){

                int temp =max;
                max = a[i];
                a[i] = temp;
            }
        }

        System.out.println("The maximum element is:"+max);
    }
    
}
