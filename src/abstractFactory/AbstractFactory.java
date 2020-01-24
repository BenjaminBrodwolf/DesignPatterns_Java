package abstractFactory;

public interface AbstractFactory {

    public Main.Eatables createEatable();

    public Main.Clothes createClothes();

    public Main.Cosmetics createCosmetics();
}
