package decorator.auto;

public abstract class SpecialEquipment implements Component {
    protected final Component BASIS_COMPONENT;

    protected SpecialEquipment(Component component) {
        this.BASIS_COMPONENT = component;
    }
}
