class item{
 int code;
 String name;
 double price;
 item(int c,String n,double p){
  code=c;
  name=n;
  price=p;
 }
 void show(){
  System.out.println("code:"+code+" name:"+name+" price:"+price);
 }
 double total(int q){
  return price*q;
 }
 public static void main(String a[]){
  item i1=new item(101,"pen",10);
  i1.show();
  System.out.println("total for 5:"+i1.total(5));
 }
}
