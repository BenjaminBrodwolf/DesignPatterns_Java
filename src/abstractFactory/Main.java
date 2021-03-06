package abstractFactory;

//Interface
interface Eatables { String eatableInformation(); }
interface Clothes { String clothesInformation();}
interface Cosmetics { String cosmeticsInformation();}

//Basel
class Burger implements Eatables {
    public String eatableInformation(){
        return "Product: Burger, Price: CHF 10";
    }
}
class Pants implements Clothes {
    public String clothesInformation(){
        return "Product: Pants, Price: CHF 50";
    }
}
class Makeup implements Cosmetics {
    public String cosmeticsInformation(){
        return "Product: Make-Up, Price: CHF 20";
    }
}

//Gempen
class Cheese implements Eatables {
    public String eatableInformation(){
        return "Product: Cheese, Price: CHF 5";
    }
}
class Pullover implements Clothes {
    public String clothesInformation(){
        return "Product: Pullover, Price: CHF 50";
    }
}
class Lipstick implements Cosmetics {
    public String cosmeticsInformation(){
        return "Product: Lipstick, Price: CHF 7";
    }
}
//Brugg
class Bread implements Eatables {
    public String eatableInformation(){
        return "Product: Bread, Price: CHF 4";
    }
}
class Shirt implements Clothes {
    public String clothesInformation(){
        return "Product: Shirt, Price: CHF 20";
    }
}
class Perfume implements Cosmetics {
    public String cosmeticsInformation(){
        return "Product: Perfume, Price: CHF 80";
    }
}

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new FactoryBasel();

        Eatables essen = factory.createEatable();
        Clothes clothes = factory.createClothes();
        Cosmetics cosmetics = factory.createCosmetics();

        System.out.println("Stock in Basel: ");
        System.out.println("Eatables: " + essen.eatableInformation());
        System.out.println("Clothes: " + clothes.clothesInformation());
        System.out.println("Cosmetics: " + cosmetics.cosmeticsInformation());

    }
}


