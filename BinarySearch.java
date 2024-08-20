class BinarySearch{
    public static int Binary_Search(int[] arr,int first,int last,int target){
        if(first <= last){
            int mid=first+(last-first)/2;
               if(arr[mid]==target){
                return mid;
               } ;                                                                                                                                  
               if(arr[mid]< target){
                return Binary_Search(arr,mid+1,last,target);
               }
               
                return Binary_Search(arr,first,mid-1,target);
               
        }
        return -1;

    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int target=4;
        int result=Binary_Search(arr,0,arr.length-1,target);

        if(result != -1){
            System.out.println("element found"+" "+result);
        }
        else{
            System.out.println("not found");
        }
    }
}


