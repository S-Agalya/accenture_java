// import java.util.Scanner;
// class Prime_factor{
//     public static void prime_factor(){
//          int num=6;
         
         
//          int[] arr={1,2,3,4,5};
//          int sum=0;
//        boolean hasValidate=false;
//          for(int i=2;i<=num;i++){
//             int count=0;
//               if(num%i==0){
//             //System.out.println(i);
//             while(num%i == 0){
//                num /= i;
//                count++;
//             }
//             if(i<arr.length){
//                 sum += count* arr[i];
//                 hasValidate=true;
//             }
            
//          }
        
         
//          } System.out.println(hasValidate? sum:-1);   
         
//     }
//     public static void main(String[] args){
//               prime_factor();

//          }
// }

class Prime_factor
{
	public static void main (String[] args) 
	{
		// your code goes here
      for(int i=1;i<=5;i++){
          int sq=i*i;
          System.out.println(i+"-"+sq);
      }
      
	}
}
