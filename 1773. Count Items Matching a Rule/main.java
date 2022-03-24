import java.util.List;

public class main {
    public static void main(String[] args) {
        
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        int rowLength = items.size();
        
        for(int i = 0; i < rowLength; i++){
                if (ruleKey.equals("type")) {
                    if(items.get(i).get(0).equals(ruleValue)) matches++;
                }
                else if (ruleKey.equals("color")) { 
                    if(items.get(i).get(1).equals(ruleValue)) matches++;

                }
                else {
                    if(items.get(i).get(2).equals(ruleValue)) matches++;       
                }
         }

        return matches;
    }
}