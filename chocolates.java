class chocolates{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int sc.nextInt();
        // int[] a=new int(n);
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }

        int n=3;
        int[] a={10,20,30};
        int total=0;
         for(int box:a){
            total+=(box/3);
           // int result=(int) total-1;
           if(box % n != 0){
            total+=1;
        }
        }
        
              System.out.println(total);
        }
        
        // System.out.println(total);
    }


// class chocolates {
//     public static void main(String[] args) {
//         // Uncomment these lines if you want to read input from the user
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // int[] a = new int[n];
//         // for (int i = 0; i < n; i++) {
//         //     a[i] = sc.nextInt();
//         // }

//         int n = 3;
//         int[] a = {10, 20, 30};
//         int total = 0;

//         for (int box : a) {
//             total += (box / 3);
//         }

//         // Adjust the total if necessary
//         for (int box : a) {
//             if (box % 3 != 0) {
//                 total += 1;
//             }
//         }

//         System.out.println(total);
//     }
// }




