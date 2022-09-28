public class $_1_welcome {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,15,6,7,8,9,10};
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

