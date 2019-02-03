package dogdoor;

public class Test
{


    public static void main(String args[]){
        System.out.println("Current thread"+Thread.currentThread().getName());
        DogDoor dogDoor =new DogDoor();
        dogDoor.openDoor();
        dogDoor.openDoor();

        dogDoor.openDoor();

    }
}
