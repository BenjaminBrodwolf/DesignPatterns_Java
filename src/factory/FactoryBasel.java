package factory;

public class FactoryBasel implements AbstractFactory {

    public Main.Eatables createEatable(){
        return new Main.Burger();
    }

    public Main.Clothes createClothes(){
        return new Main.Pants();
    }

    public Main.Cosmetics createCosmetics(){
        return new Main.Makeup();
    }

}
