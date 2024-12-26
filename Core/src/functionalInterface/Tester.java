package functionalInterface;

import java.util.function.UnaryOperator;

public class Tester {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(100);

        UnaryOperator<ClassRoom> adjuster = ClassRoom.adjustChairs();
        ClassRoom updatedClassRoom = adjuster.apply(classRoom);

        System.out.println("Updated " + updatedClassRoom);
    }
}