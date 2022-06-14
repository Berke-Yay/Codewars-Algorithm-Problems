package codewars;
public class tribonacci {
    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
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
    //A better solution
    public double[] tribonacci_better(double[] s, int n) {
        double[] r = new double[n];
        for(int i = 0; i < n; i++){
          r[i] = (i<3)?s[i]:r[i-3]+r[i-2]+r[i-1];
        }
        return r;
    }
}
