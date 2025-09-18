public abstract class ToihanaFactory {
    public abstract Toihana createToihana();

    public void holdCelebration() {
        Toihana toihana = createToihana();
        toihana.organize();
    }
}
