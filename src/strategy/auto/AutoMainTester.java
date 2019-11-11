package strategy.auto;

public class AutoMainTester {

    public static void main(String[] args) {

        Auto auto = new Auto();

        auto.beschleunigen();
        auto.musikSpielen();
        auto.bremsen();

        System.out.println("------- CHANGE STUFF ------");

        auto.setBremse(new Bremse2());
        auto.setMotor(new Motor2());
        auto.setMusikanlage(new Musikanlage1());

        auto.beschleunigen();
        auto.musikSpielen();
        auto.bremsen();
    }
}
