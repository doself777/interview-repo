package tribonacci.sample;

public class TribonacciSampleAnswer {

    public int tribonacci(int n) {
        if (n==1||n==2){
            return 1;
        }
        int numCount=2;
        int secondPreviousPosSum=0;
        int firstPreviousPosSum =1;
        int currentPosSum=1;
        int tmpSum=0;
        for (int i=numCount;i<n;i++){
            tmpSum =secondPreviousPosSum+firstPreviousPosSum+currentPosSum;
            secondPreviousPosSum=firstPreviousPosSum;
            firstPreviousPosSum=currentPosSum;

            currentPosSum = tmpSum;
        }
        return currentPosSum;
    }
}
