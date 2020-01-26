package abstractFactory;

public class FactoryBasel implements AbstractFactory {

    public Eatables createEatable(){
        return new Burger();
    }

    public Clothes createClothes(){
        return new Pants();
    }

    public Cosmetics createCosmetics(){
        return new Makeup();
    }

}
