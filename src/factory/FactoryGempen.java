package factory;

public class FactoryGempen implements AbstractFactory {

    public Main.Eatables createEatable(){
        return new Main.Cheese();
    }

    public Main.Clothes createClothes(){
        return new Main.Pullover();
    }

    public Main.Cosmetics createCosmetics(){
        return new Main.Lipstick();
    }

}
