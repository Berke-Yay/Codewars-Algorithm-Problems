package codewars;

public class ten_minutes_walk {
    public static boolean isValid(char[] walk) {
        //Given an array of chars, "snwe" represents the directions. Each direction takes one minute to go that way for 1 unit.
        //In the array we need to control if the person will come to the same place afterwards and if it takes exactly 10 minutes
        //To return true, simply the length of the array should be 10.
        //Furthermore, the person should walk to south x times if he walks to north x times.
        //Same for west and east.
        int n_count =0;
        int s_count =0;
        int w_count =0;
        int e_count =0;
        for (char c : walk) {
            switch(c){
                case 'n': n_count+=1;
                break;
                case 's': s_count+=1;
                break;
                case 'w': w_count+=1;
                break;
                case 'e': e_count+=1;
                break;
            }
        }
        if(walk.length ==10&n_count==s_count&w_count==e_count){return true;}
        else{return false;}
        
      }
      
}
