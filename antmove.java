class antmove{
    public static void main(String[] args){
        //int[] arr={1,-1,1,-1,1};
        //int a=5;
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int[] arr=new int[a];
      for(int i=0;i<a;i++){
        arr[i]=sc.nextInt();
      }
      sc.close();

        int count=0;
        int position=0;
        for(int move:arr){
            position+=move;
            if(position ==0){
                count+=1;
            }
        }
             System.out.println(count);
    }
}



def count_returns_to_origin(A):
    count = 0
    position = 0
    
    for move in A:
        position += move  # Update position based on the move
        if position == 0:
            count += 1  # Increment count if ant returns to origin
    
    return count
