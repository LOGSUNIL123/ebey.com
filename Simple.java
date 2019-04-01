public class Simple{

    public int add (int a, int b)
    {
       int result;
        result = a+b;
       return result;
    }

public void comparission(){
  int x = 100, y =200;
  if(x>y)
{
   System.out.println("X is Big Number");
}
 else{
System.out.println("Y is Big Number");
    } 

 }

public static int sub(int a, int b){

    int result;
    result = a-b;
    return result;
}


public static void comparission2(){
   int c =100, d=300;  
   if(c<d){
 
    System.out.println("C is Less Than D");
}else{
    System.out.println("C is Grater Than D");

   } 

    }

public static void main(String args[]){

      Simple obj = new Simple();

      int res = obj.add(100,200); 
      System.out.println(res);


      obj.comparission();

       res = Simple.sub(200,30);
        System.out.println(res);

     Simple.comparission2();
           
    }

 }