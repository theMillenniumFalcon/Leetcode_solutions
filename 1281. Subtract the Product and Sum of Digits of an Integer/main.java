public class main {
    public static void main(String[] args) {
        
    }

    public int subtractProductAndSum(int n) {
        int sum=0, prod=1;
        
        while(n>0)
        {
            prod *= n%10;
            sum += n%10;
            n = n/10;
        }
        int diff = prod - sum;
        return diff;
    }
}
