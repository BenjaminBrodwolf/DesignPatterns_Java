package dependencyInjection;

public class testDI {

    public static void main(String[] args) {

        Master master = new Master();
        master.commando(new Shovel());


        master.commando(new Excavator());



    }


}
