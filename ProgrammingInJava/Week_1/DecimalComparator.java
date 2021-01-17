 // Felix_Portuphy
public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber,double secondNumber){
        double one=firstNumber*1000;
        double two=secondNumber*1000;
        if(one==two) {
            return true;
        }
        else
            return false;
    }
}
