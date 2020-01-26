package abstractFactory;

public class FactoryBrugg implements AbstractFactory {

    public Eatables createEatable(){
        return new Bread();
    }

    public Clothes createClothes(){
        return new Shirt();
    }

    public Cosmetics createCosmetics(){
        return new Perfume();
    }
}
