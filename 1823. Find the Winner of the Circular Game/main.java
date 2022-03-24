public class main {
    public static void main(String[] args) {
        
    }

    public int findTheWinner(int n, int k) {
        return helper(n, k) + 1;
    }

    public int helper(int size, int k){
        if(size == 1) return 0;
        return (helper(size - 1, k) + k) % size;
    }
}