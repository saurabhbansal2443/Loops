public class checkPrime {
    public static void main(String[] args) {
        int n = 13;

        boolean flag = true;

        for(int i=2;i<=n-1;i++){

            if(n%i==0){
                flag = false;
            }
        }

        if(flag==true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
