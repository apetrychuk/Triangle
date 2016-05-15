/**
 * Created by Андрей on 15.05.2016.
 */
public class View {
    public final String INPUT_INT_DATA = "Input int value for";
    public final String WRONG_INPUT_INT_DATA = "Wrong input. Please try again.";
    public final String OUT_HYPOTENYSE = "Hypotenyse:";
    public final String OUT_HEIGHT = "Height:";
    public final String THIANGLE_EXIST = "TRIANGLE EXIST";
    public final String TRIANGLE_NOT_EXIST = "Triangle do not exist";

    public void printMessage(String str){
        System.out.println(str);
    }

    public void printMessage(String str, String str2){
        System.out.println(str + " " + str2);
    }

    public void printMessageAndInt(String str, int value){
        System.out.println(str + " " + value);
    }

    public void printMessageAndDouble(String str, double value){
        System.out.println(str + " " + value);
    }
}
