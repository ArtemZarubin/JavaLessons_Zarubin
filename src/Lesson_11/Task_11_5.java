package Lesson_11;

class Parent1 {
    final void display() {
        System.out.println("Це батьківський клас.");
    }
}

class Child1 extends Parent {
    // Спроба перевизначити метод батьківського класу призведе до помилки
    // зазначення, оскільки метод у батьківському класі визначений як final.
    // void display() {
    //     System.out.println("Це дочірній клас.");
    // }
}

public class Task_11_5 {
    public static void main(String[] args) {
        Parent1 parent = new Parent1();
        parent.display(); // Виведе "Це батьківський клас."

        /*Child1 child = new Child1();
        child.display(); // Виведе "Це батьківський клас." - метод не може бути перевизначений*/

        /*Parent1 childAsParent = new Child1();
        childAsParent.display(); Виведе "Це батьківський клас." - метод не може бути перевизначений*/
    }
}