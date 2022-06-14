package codewars;

public class printer_error {
    public static String printerError(String s) {
        // In a print office, a printer needs to take a dye as an input. The dyes are represented with letters.
        //And there only dyes from 'a' to 'm'. The others are considered as errors.
        //We need to find the ratio of errors and total letters that are given.
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
    //The code below is the solution from Codewars' public solutions part. I just wrote this to remind this way. In other words, the below part is not my code.
    public static String printerError2(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
