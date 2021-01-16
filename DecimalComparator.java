 // Felix_Portuphy
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber){
        double One=firstNumber*1000;
        double Two=secondNumber*1000;
        if(One==Two) {
            return true;
        }
        else
            return false;
    }
}
