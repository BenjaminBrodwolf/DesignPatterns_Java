package abstractFactory;

public class FactoryGempen implements AbstractFactory {

    public Eatables createEatable(){
        return new Cheese();
    }

    public Clothes createClothes(){
        return new Pullover();
    }

    public Cosmetics createCosmetics(){
        return new Lipstick();
    }

}
