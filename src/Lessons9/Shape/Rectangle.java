package Lessons9.Shape;

 class Rectangle extends Shapee {
    double a;
    double b;
    public Rectangle (double a, double b){
        this.a = a;
        this.b = b;

    }
    public double pP (){
        double rectangleP = a + b  + a + b;
        //System.out.println("P - " + rectangleP);
        return rectangleP;
    }
    public double sS(){
        double rectangleS = a*b;
        //System.out.println("S - " + rectangleS);
        return rectangleS;
    }



}
