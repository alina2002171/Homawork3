import java.util.Arrays;

public class Maximum {
    private int a;
    private int b;
    private int c;

    private int[]array;

    public Maximum(int a, int b, int c, int[] array) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.array = array;

    }
    public void max(int a, int b){
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
    public void max(int a,int b,int c){
        if(a>b&&a>c){
            System.out.println(a);
        }else if(b>a&&b>c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }
    public void max(int[]array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
                System.out.println(max);
            }

        }

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "Maximum{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public void setArray(int[] array) {
        this.array = array;


    }
}
