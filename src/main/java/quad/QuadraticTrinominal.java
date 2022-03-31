package quad;

public class QuadraticTrinominal {
    private double a;
    private double b;
    private double c;

    public QuadraticTrinominal(double a, double b, double c){
        if(Double.compare(a,0)==0){
            throw new IllegalArgumentException("asdasdasd");
        }
        this.a=a;
        this.b = b;
        this.c = c;
    }

    public double[] decision(){
        double descr = b*b - 4*a*c;
        if(descr < 0){
            return new double[]{0, 0, 0};
        }
        if(a == b && b == c){
            return new double[]{0, 0, 0, 0, 0};
        }
        double x1 = (-b + Math.sqrt(descr))/(2*a);
        double x2 = (-b - Math.sqrt(descr))/(2*a);
        if(x2 > x1){
            return new double[]{x2, x1};
        }
        if(Double.compare(x1, x2) == 0){
            return new double[]{x1};
        }
        return new double[]{x1, x2};
    }
}
