package functionalInterface;

import java.util.Scanner;
import java.util.function.UnaryOperator;

class ClassRoom {
    private int chairs;

    public ClassRoom(int chairs) {
        this.chairs = chairs;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }
    @Override
    public String toString() {
        return "ClassRoom { chairs=" + chairs + " }";
    }

    public static UnaryOperator<ClassRoom> adjustChairs() {
        return classRoom -> {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of students: ");
            int studentCount = scanner.nextInt();

            if (studentCount > classRoom.getChairs()) {
                classRoom.setChairs(studentCount); 
            } else if (studentCount < classRoom.getChairs()) {
                classRoom.setChairs(studentCount); 
            }
            scanner.close();
            return classRoom;
        };
    }
}



