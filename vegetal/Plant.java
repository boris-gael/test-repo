package vegetal;

public class Plant {

    int nbLeaves = 1;
    {
        System.out.println("Code bloc: instance initializers: " + nbLeaves);
    }
    
    public Plant() {
        nbLeaves = 15;
    }

    public void describe() {
        System.out.println("I'am a plant, and i have " + nbLeaves + " leaves." );
    }

}