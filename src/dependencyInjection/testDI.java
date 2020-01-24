package dependencyInjection;

import dependencyInjection.digTools.Excavator;
import dependencyInjection.digTools.Shovel;

public class testDI {

    public static void main(String[] args) {

        Master master = new Master();
        master.commandoToDig(new Shovel());

        master.commandoToDig(new Excavator());
    }


}
