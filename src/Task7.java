//Вариант № 4. Выполнить преобразование класса в коллекцию. Создать пользовательское меню. Организовать добавление объектов в коллекцию и вывод отсортированных объектов коллекции на экран с помощью меню.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Room> rooms = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Add a room");
            System.out.println("2. Display sorted rooms");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addRoom(scanner);
                    break;
                case 2:
                    displaySortedRooms();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void addRoom(Scanner scanner) {
        System.out.println("Adding a room:");
        System.out.print("Enter room ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter room code number: ");
        String codeNumber = scanner.next();
        System.out.print("Enter number of people: ");
        int numberPeople = scanner.nextInt();
        System.out.print("Enter comfort type: ");
        String comfortType = scanner.next();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        rooms.add(new Room(id, codeNumber, numberPeople, comfortType, price));
        System.out.println("Room added successfully.");
    }

    private static void displaySortedRooms() {
        if (rooms.isEmpty()) {
            System.out.println("No rooms to display.");
            return;
        }

        // Copy the original list to avoid modifying the original list
        List<Room> sortedRooms = new ArrayList<>(rooms);

        // Sort the rooms by price
        Collections.sort(sortedRooms, Comparator.comparing(Room::getPrice));

        System.out.println("Sorted rooms by price:");
        for (Room room : sortedRooms) {
            System.out.println(room);
            System.out.println();
        }
    }

    public static class Room {
        private int id;
        private String codeNumber;
        private int numberPeople;
        private String comfortType;
        private double price;

        public Room(int id, String codeNumber, int numberPeople, String comfortType, double price) {
            this.id = id;
            this.codeNumber = codeNumber;
            this.numberPeople = numberPeople;
            this.comfortType = comfortType;
            this.price = price;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCodeNumber() {
            return codeNumber;
        }

        public void setCodeNumber(String codeNumber) {
            this.codeNumber = codeNumber;
        }

        public int getNumberPeople() {
            return numberPeople;
        }

        public void setNumberPeople(int numberPeople) {
            this.numberPeople = numberPeople;
        }

        public String getComfortType() {
            return comfortType;
        }

        public void setComfortType(String comfortType) {
            this.comfortType = comfortType;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return String.format("Room ID: %d\nCode Number: %s\nNumber of People: %d\nComfort Type: %s\nPrice: %.2f",
                    id, codeNumber, numberPeople, comfortType, price);
        }
    }
}