class mobile{
 String brand;
 String model;
 double price;
 mobile(String b,String m,double p){
  brand=b;
  model=m;
  price=p;
 }
 void show(){
  System.out.println("brand:"+brand);
  System.out.println("model:"+model);
  System.out.println("price:"+price);
 }
 public static void main(String a[]){
  mobile m1=new mobile("samsung","s25",70000);
  m1.show();
 }
}
