public class miss2 {
    public static void main(String args[]){

        int a[]={1,2,3,4,6};
    int range = 6;

        int or = (range * (range+1))/2;
        
        int cur =0;
        for(int i=0;i<a.length;i++){
                  
            cur = cur+a[i];
        }

        int ans = or - cur;

        System.out.println(ans);
    }
}
