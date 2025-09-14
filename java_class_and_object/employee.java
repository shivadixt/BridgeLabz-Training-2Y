class employee{
 String name;
 int id;
 double salary;
 employee(String n,int i,double s){
  name=n;
  id=i;
  salary=s;
 }
 void show(){
  System.out.println("name:"+name);
  System.out.println("id:"+id);
  System.out.println("salary:"+salary);
 }
 public static void main(String args[]){
  employee e1=new employee("kiran",101,50000);
  e1.show();
 }
}
