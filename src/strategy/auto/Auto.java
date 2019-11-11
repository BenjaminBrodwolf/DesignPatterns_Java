package strategy.auto;

public class Auto {

    private Motor motor;
    private Bremse bremse;
    private Musikanlage musikanlage;

    public Auto(){
        this.motor = new Motor1();
        this.bremse = new Bremse1();
        this.musikanlage = new Musikanlage1();
    }

    public void bremsen(){
        bremse.bremse();
    }

    public void beschleunigen(){
        motor.motor();
    }

    public void musikSpielen(){
        musikanlage.musikanalge();
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setBremse(Bremse bremse) {
        this.bremse = bremse;
    }

    public void setMusikanlage(Musikanlage musikanlage) {
        this.musikanlage = musikanlage;
    }
}
