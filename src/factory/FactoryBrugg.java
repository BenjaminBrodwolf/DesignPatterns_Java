package factory;

public class FactoryBrugg implements AbstractFactory {

    public Main.Eatables createEatable(){
        return new Main.Bread();
    }

    public Main.Clothes createClothes(){
        return new Main.Shirt();
    }

    public Main.Cosmetics createCosmetics(){
        return new Main.Perfume();
    }
}
