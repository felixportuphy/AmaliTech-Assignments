  // Felix_Portuphy
public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking,int hoursOfDay){

        if(hoursOfDay<0 || hoursOfDay>23) {
            return false;
        }
       else if(barking==true && (hoursOfDay<8 || hoursOfDay>22))
            return true;
        else{
            return false;
        }
    }
}
