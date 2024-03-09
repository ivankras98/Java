/*Вариант 4). Гостиница. Реализовать сортировку по цене и по количеству мест (человек).*/


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
    }

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
}
