//c
class diwali_contest{
public static void main(String[] args){
//write your code here
// Scanner sc=Scanner(System.in);
// int p=sc.nextInt();
int p=150;
int time_left=4*60-p;
int i=1;
int count=0;
while(time_left>5*i){
time_left = time_left-5*i;
i+=1;
count+=1;
}
//return count;
System.out.println(count);
}
}



