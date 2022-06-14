package codewars;

public class printer_error {
    public static String printerError(String s) {
        // your code
        int error_counter=0;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if(alphabet.indexOf(letter)>12){
                error_counter+=1;
            }
        }
        return error_counter+"/"+s.length();
    }
    //A better solution
    public static String printerError2(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
