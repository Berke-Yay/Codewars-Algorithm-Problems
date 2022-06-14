package codewars;

public class shortest_word {
    //This function returns the shortest word in a string input
    public static int findShort(String s) {
        String[] words = s.split("\\s");
        int result = words[0].length();
        for(int i=1;i<words.length;i++){
            if(words[i].length()<result){
                result = words[i].length();
            }
        }
        return result;
    }
}
