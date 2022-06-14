package codewars;
public class tribonacci {
    public double[] tribonacci(double[] s, int n) {
        //The function returns a tribonacci sequence to n elements with the given first three elements that are in array s.
          double[] sequence = new double[n];
          if(n==0){
              return sequence;
          }
          sequence[0] = s[0];
          if(n==1){return sequence;}
          sequence[1] = s[1];
          if(n==2){return sequence;}
          sequence[2] = s[2];
          if(n==3){return sequence;}
          for(int i=3;i<n;i++){
              sequence[i] = sequence[i-1] + sequence[i-2] + sequence[i-3];
          }
          
          return sequence;
    }
}
