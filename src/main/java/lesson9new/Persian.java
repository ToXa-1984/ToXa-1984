package lesson9new;

/**
 * final обозначен неизменяемый класс, от него невозможно наследоваться;
 * Этот класс наследуется от класса Cat, получая при этом его поля и методы
 */
public final class Persian extends Cat {
    private boolean isGrey;

    /**
     * конструкция super() вызывает конструктор родительского класса
     */
    public Persian(int legs, boolean isGrey) {
        super(legs);
        this.isGrey = isGrey;
    }

    public Persian(int legs, boolean seeInNight, boolean isGrey) {
        super(legs, seeInNight);
        this.isGrey = isGrey;
    }

    public Persian(boolean seeInNight) {

    }

    public boolean isGrey() {
        return isGrey;
    }

    public void setGrey(boolean grey) {
        isGrey = grey;
    }
}