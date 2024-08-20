class Leader{
    public static void main(String[] args){
        int n=5;
        int[] arr={16,4,3,5,2};
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
               System.out.println(arr[i]);
            }
            else{
                i++;
            }
        }
        System.out.println(arr[n-1]);
    }
}