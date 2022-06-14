package codewars;

public class ten_minutes_walk {
    public static boolean isValid(char[] walk) {
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
      //A better solution
      public static boolean isValid2(char[] walk) {
        if (walk.length != 10) {
          return false;
        }
        int x = 0, y = 0;
        for (int i = 0; i < 10; i++) {
          switch (walk[i]) {
            case 'n':
              y++;
              break;
            case 'e':
              x++;
              break;
            case 's':
              y--;
              break;
            case 'w':
              x--;
              break;
          }
        }
        return x == 0 && y == 0;
      }
}
