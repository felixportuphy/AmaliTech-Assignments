 // Felix_Portuphy
public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber,int secondNumber,int thirdNumber){
        int sum=firstNumber+secondNumber;
        if(thirdNumber==sum)
            return true;
        else
            return false;
    }
}
