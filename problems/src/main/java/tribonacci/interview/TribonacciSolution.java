package tribonacci.interview;

public class TribonacciSolution {

    public int tribonacci(int n) {
        
        if(n==0){
            return 0;
        }
       
        int var1=0;
        int var2=1;
        int var3=1;
        
        for(int i=3;i<=n;i++){
            int sum = var1+var2+var3;
            var1 = var2;
            var2 = var3;
            var3 = sum;
        }

        return var3;

    }
}
