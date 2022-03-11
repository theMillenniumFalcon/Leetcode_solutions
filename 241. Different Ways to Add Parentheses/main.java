import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        
    }

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < expression.length(); i++)
        {
            char ch = expression.charAt(i);
            if(ch == '-' || ch == '+' || ch == '*')
            {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i+1));
                for(int m : left)
                {
                    for(int n : right)
                    {
                        if(ch == '-')
                            list.add(m-n);
                        else if(ch == '+')
                            list.add(m+n);
                        else list.add(m*n);
                    }
                }
            }
        }
        if(list.size() == 0)
            list.add(Integer.valueOf(expression));
            
        return list;
    }
}