package inheritance;
/**
 * Make necessary changes to inherit PreNokia1100
 * Declare and assign value to a String instance variable called nameOfTheClass
 * Implement a method to add photo gallery photoGallery()
 * Create default constructor and a parameterized constructor with int x parameter
 * */


public class Nokia1100 extends PreNokia1100 {
   Nokia1100(){
      super();
   }

   public  void takePicture() {
      System.out.println("you are able to take the picture");
   }

 public Nokia1100(int x){
    super.sendText();
    super.makeCall();
    super.contacList();

 }

   public static void main(String[] args) {

      Nokia1100 obj= new Nokia1100(6);

      obj.takePicture();
      System.out.println("print x value"+ "="+obj.x);

   }




   }
