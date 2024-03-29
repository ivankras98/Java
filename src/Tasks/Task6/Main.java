/*Вариант № 4. Гостиница. Создать родительский класс "Комната" (Идентификатор, номер, количество человек, цена) и дочерние классы:
 - "Стандартная комната";
 - "Комната полулюкс";
 - "Комната люкс" (минимальный срок сдачи, максимальный срок сдачи).
 Реализовать класс для хранения списка номеров телефонов с методом добавления номера и методом печат списка номеров.
 */
 import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования класса Room
        Room room1 = new Room(1, "101", 2, "Standard", 100.0);
        Room room2 = new Room(2, "102", 3, "Luxury", 200.0);
        Room room3 = new Room(3, "103", 4, "Standard", 150.0);

        // Добавим комнаты в список
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        // Вывод информации о комнатах до сортировки
        System.out.println("Rooms before sorting:");
        for (Room room : rooms) {
            System.out.println(room);
            System.out.println();
        }

        // Сортировка по цене
        Collections.sort(rooms, Comparator.comparing(Room::getPrice));

        // Вывод информации о комнатах после сортировки по цене
        System.out.println("Rooms sorted by price:");
        for (Room room : rooms) {
            System.out.println(room);
            System.out.println();
        }

        // Сортировка по количеству мест
        Collections.sort(rooms, Comparator.comparing(Room::getNumberPeople));

        // Вывод информации о комнатах после сортировки по количеству мест
        System.out.println("Rooms sorted by number of people:");
        for (Room room : rooms) {
            System.out.println(room);
            System.out.println();
        }

        // Создание и добавление комнат в список
        List<Room> rooms2 = new ArrayList<>();
        rooms2.add(new StandardRoom(4, "104", 2, 120.0));
        rooms2.add(new SemiLuxuryRoom(5, "105", 3, 180.0, 3));
        rooms2.add(new LuxuryRoom(6, "106", 4, 250.0, 5, 10));

        // Вывод информации о комнатах
        System.out.println("Rooms2:");
        for (Room room : rooms2) {
            System.out.println(room);
            System.out.println();
        }

        // Создание и добавление номеров телефонов
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhoneNumber("John", "123-456-7890");
        phoneBook.addPhoneNumber("Alice", "987-654-3210");
        phoneBook.addPhoneNumber("Bob", "456-789-0123");

        // Печать списка номеров телефонов
        System.out.println("Phone Numbers:");
        phoneBook.printPhoneNumbers();
    }

    // Родительский класс "Комната"
    public static class Room {
        private int id;
        private String codeNumber;
        private int numberPeople;
        private String comfortType;
        private double price;

        // Конструктор
        public Room(int id, String codeNumber, int numberPeople, String comfortType, double price) {
            this.id = id;
            this.codeNumber = codeNumber;
            this.numberPeople = numberPeople;
            this.comfortType = comfortType;
            this.price = price;
        }

        // Геттеры и сеттеры
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

        // Переопределение метода toString() для вывода информации об объекте в отформатированном виде
        @Override
        public String toString() {
            return String.format("Room ID: %d\nCode Number: %s\nNumber of People: %d\nComfort Type: %s\nPrice: %.2f",
                    id, codeNumber, numberPeople, comfortType, price);
        }
    }

    // Дочерний класс "Стандартная комната"
    public static class StandardRoom extends Room {
        public StandardRoom(int id, String codeNumber, int numberPeople, double price) {
            super(id, codeNumber, numberPeople, "Standard", price);
        }
    }

    // Дочерний класс "Комната полулюкс"
    public static class SemiLuxuryRoom extends Room {
        private int minRentalPeriod;

        public SemiLuxuryRoom(int id, String codeNumber, int numberPeople, double price, int minRentalPeriod) {
            super(id, codeNumber, numberPeople, "SemiLuxury", price);
            this.minRentalPeriod = minRentalPeriod;
        }

        @Override
        public String toString() {
            return super.toString() + "\nMin Rental Period: " + minRentalPeriod + " days";
        }
    }

    // Дочерний класс "Комната люкс"
    public static class LuxuryRoom extends Room {
        private int minRentalPeriod;
        private int maxRentalPeriod;

        public LuxuryRoom(int id, String codeNumber, int numberPeople, double price, int minRentalPeriod, int maxRentalPeriod) {
            super(id, codeNumber, numberPeople, "Luxury", price);
            this.minRentalPeriod = minRentalPeriod;
            this.maxRentalPeriod = maxRentalPeriod;
        }

        @Override
        public String toString() {
            return super.toString() + String.format("\nRental Period: from %d to %d days", minRentalPeriod, maxRentalPeriod);
        }
    }

    // Класс для хранения списка номеров телефонов
    public static class PhoneBook {
        private List<String> phoneNumbers;

        public PhoneBook() {
            phoneNumbers = new ArrayList<>();
        }

        public void addPhoneNumber(String name, String number) {
            phoneNumbers.add(name + ": " + number);
        }

        public void printPhoneNumbers() {
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
        }
    }
}
