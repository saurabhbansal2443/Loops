public class printFib {
    public static void main(String[] args) {
        int n = 5;

        int ft =0;
        int st =1;

        for(int i=1;i<=n;i++){

            int tt = ft + st;

            System.out.println(ft);

            ft = st;
            st = tt;
        }
    }
}
