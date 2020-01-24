package dependencyInjection;

import dependencyInjection.digTools.IDigable;

public class Worker {

    public void DigHole(IDigable digTool){
        digTool.doDig();
    }
}
