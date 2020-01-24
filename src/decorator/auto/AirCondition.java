package decorator.auto;

public class AirCondition extends SpecialEquipment {
    public AirCondition(Component component) {
        super(component);
    }

    @Override
    public int getPrice() {
        return BASIS_COMPONENT.getPrice() + 8_000;
    }

    @Override
    public String getDescription() {
        return BASIS_COMPONENT.getDescription() + " und Klimaanlage";
    }
}
