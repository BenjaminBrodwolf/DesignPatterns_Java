package decorator.auto;

public class SoundSystem extends SpecialEquipment {

    protected SoundSystem(Component component) {
        super(component);
    }

    @Override
    public int getPrice() {
        return BASIS_COMPONENT.getPrice() + 10_000;
    }

    @Override
    public String getDescription() {
        return BASIS_COMPONENT.getDescription() + " und Soundsystem";
    }
}
