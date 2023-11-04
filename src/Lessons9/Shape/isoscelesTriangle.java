package Lessons9.Shape;

 class isoscelesTriangle extends Shapee{
    double a;
    double a1;
    double c;
    public isoscelesTriangle (double a, double a1, double c){
    this.a = a;
    this.a1 = a1;
    this.c = c;

    }
    public double pP () {
        double triangleP;
       return  triangleP = ((a + a) + a1);
//        System.out.println("P - " + triangleP);

    }
    public double sS () {
        double triangleH = 0.5 * Math.sqrt(4 * (a * a) - (c * c));
        double triangleS;
        return triangleS = 0.5 * a * triangleH;
       // System.out.println("S - " + triangleS);
    }


}
