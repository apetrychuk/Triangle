/**
 * Created by Андрей on 15.05.2016.
 */
public class Model {

    private int sideA;
    private int sideB;
    private int sideC;

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    private double hypotenyse;
    private double height;

    Model(int sideA,int sideB, int sideC){
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public double getHypotenyse() {
        return hypotenyse;
    }

    public void setHypotenyse(double hypotenyse) {
        this.hypotenyse = hypotenyse;
    }

    public double findHypoteyse(int a, int b){
        return Math.sqrt(a*a+b*b);
    }

    public double findHeight(int a, int b,double c){
        return a*b/c;
    }

    public boolean checkExistTriangle(int a, int b,double c){
        if ((a > 0) && (b > 0) && (c > 0)){
            if((a + b > c) && (a + c > b) && (b + c > a)){
                return true;
            }
        }
        return false;
    }
}
