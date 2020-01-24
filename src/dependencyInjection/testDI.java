package dependencyInjection;

import dependencyInjection.digTools.Excavator;
import dependencyInjection.digTools.Shovel;


// “Dependency Injection”:
// Die Abhängigkeiten werden zur Laufzeit dynamisch bekannt gemacht oder injiziert.

//DI bedeutet eigentlich nichts anderes, als Abhängigkeiten zu konkreten Implementierungen aufzulösen
// indem man z.B. mit Interfaces arbeitet. Das sorgt dafür, dass die aufrufende Komponente oder Klasse
// die Abhängigkeiten an die aufgerufene Komponente oder Klasse zur Laufzeit übergibt.

public class testDI {

    public static void main(String[] args) {

        Master master = new Master();
        master.commandoToDig(new Shovel());

        master.commandoToDig(new Excavator());


    }


}
