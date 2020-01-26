package abstractFactory;

public interface AbstractFactory {

    public Eatables createEatable();

    public Clothes createClothes();

    public Cosmetics createCosmetics();
}
