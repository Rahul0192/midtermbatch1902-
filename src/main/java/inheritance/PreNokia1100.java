package inheritance;

/**
 *
 * Implement interface SymbianPhone
 * Make necessary changes to make this class abstract
 *
 * Think Nokia company is planning to add a colorful display in future
 * but they cant implement that feature now. This implementation can be done by display()
 * Declare and assign value to a String instance variable called nameOfTheClass
 *
 *
 * */
public abstract class PreNokia1100 implements SymbianPhone {
        PreNokia1100(){
            super();
    }

        int x=10;
    public void sendText() {
        System.out.println("This will run the function of sending text");

    }

    public void makeCall() {
        System.out.println(" Now you able to make call");

    }

    public void contacList(){
        System.out.println(" You can find you list of friend ");

    }

    public abstract void takePicture();




}
