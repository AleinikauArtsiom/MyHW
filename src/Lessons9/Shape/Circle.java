package Lessons9.Shape;

class Circle extends Shapee {
    double r;
    public Circle (double r){
        this.r = r;

    }
   public double pP () {
        double circleP = 2 * 3.14 * r;
       //System.out.println("P - " + circleP );

       return circleP;
   }
   public double sS(){
        double circleS = 3.14 * (r * r);
      // System.out.println("S - " + circleS);
       return circleS;
    }
}
