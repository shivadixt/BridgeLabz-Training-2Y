class circle{
 double r;
 circle(double x){
  r=x;
 }
 double area(){
  return 3.14*r*r;
 }
 double circ(){
  return 2*3.14*r;
 }
 void show(){
  System.out.println("radius:"+r);
  System.out.println("area:"+area());
  System.out.println("circumference:"+circ());
 }
 public static void main(String a[]){
  circle c1=new circle(7);
  c1.show();
 }
}
