package ignored.bachelor.common;

/**
 * Created by IntelliJ IDEA.
 * User: ddochi
 * Date: 2021-12-30
 * Time: 오후 12:57
 * Luck is the residue of design. -Branch Rickey
 * <PRE>exercise_book|</PRE>
 */
public class CommonUtils {

    public static boolean isNumber (String input) {
        boolean flag = true;
        int length = input.length();

        for(int i = 0; i < length; i++) {
            int number = input.charAt(i) - 48;
            if(number < 0 || number > 9){
                flag = false;
                break;
            }
        }
        return flag;
    }

}
