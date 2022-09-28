public class $_3_minimum_value_in_array {
    public static void main(String[] args) {
        int a[]=new int[]{12,34,23,45,100,2,36,78};
        int min;
        min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("minimum number is : "+min);
    }
}
