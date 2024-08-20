class election {
    public static void main(String[] args) {
        //int[] arr = {1, 1, 2, 2};
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int max_count = 0;
        int max_num = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            } 
            if (count > max_count) {
                max_count = count;
                max_num = arr[i];
            } 
            else if (count == max_count && max_num != arr[i]) {
                max_num = -1; 
            }
        }

        // Output the result
        System.out.println(max_num);
    }
}