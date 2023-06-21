package Lesson_8;

public class Task_8 {
    private int outerField = 10;
    private static int staticOuterField = 20;

    // Внутрішній клас
    public class InnerClass {
        private int innerField = 5;

        public void innerMethod() {
            System.out.println("Inner field: " + innerField);
            System.out.println("Outer field: " + outerField);
        }
    }

    // Статичний вкладений клас
    public static class StaticNestedClass {
        private int nestedField = 15;

        public void nestedMethod() {
            System.out.println("Nested field: " + nestedField);
            System.out.println("Static outer field: " + staticOuterField);
        }
    }

    // Локальний клас
    public void outerMethod() {
        final int localVar = 7;

        class LocalClass {
            public void localMethod() {
                System.out.println("Local variable: " + localVar);
            }
        }

        LocalClass localObj = new LocalClass();
        localObj.localMethod();
    }

    // Анонімний клас
    public void anonymousMethod() {
        Runnable anonymousClass = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside anonymous class");
            }
        };

        anonymousClass.run();
    }

    public static void main(String[] args) {
        Task_8 outerObj = new Task_8();

        // Використання внутрішнього класу
        Task_8.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.innerMethod();

        // Використання статичного вкладеного класу
        Task_8.StaticNestedClass nestedObj = new Task_8.StaticNestedClass();
        nestedObj.nestedMethod();

        // Використання локального класу
        outerObj.outerMethod();

        // Використання анонімного класу
        outerObj.anonymousMethod();
    }
}