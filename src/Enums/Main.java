package Enums;

public class Main {
    public static void main(String[] args) {
        Color c1 = Color.GREEN;

        System.out.println("Red ENUM name: " +  c1.name());
        System.out.println("Red ENUM value: " +  c1.getValue());

        for (Color color: Color.values()){
            System.out.println("Enum Values: " + color.getValue());
        }
    }
}
