//import java.util.Scanner;
class election{
    public static void main(String[] args){
        int a=6;
        int[] arr={1,1,1,2,2,2,3,3};
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int[] arr=new int[a];
// for(int i=0;i<a; i++){
// arr[i]=sc.nextInt();
// }
        int max_count=0;
        int curr_count=1;
        for(int i=0;i<7;i++){

            if(arr[i] == arr[i+1]){
              curr_count++;
              max_count=curr_count;
            }else{
                curr_count=1;
            }
        }
            if(curr_count==max_count){
               System.out.println("-1");
            }
            else{
                  System.out.println(max_count);
            }
      
    }
}