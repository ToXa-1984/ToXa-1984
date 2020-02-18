package lesson9new;

/**
 * Данный класс наследуется от Animal и имплементирует интерфейс Functional,
 * при этом реализует метод прописанный в данном интерфейсе
 */
public class Dog extends Animal implements Functional {
    @Override
    public void run() {
        System.out.println("Dog run");
    }
}