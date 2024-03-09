/*Задача № 4
Создать программу на языке Java для определения класса в некоторой предметной области. Описать свойства, конструктор, методы геттеры/сеттеры, перекрыть метод toString() для вывода полной информации об объекте в отформатированном виде:
к - Конструктор
Гостиница
Room – комната:
Свойства:
Id – идентификатор; к
codeNumbers – Код номера; к
numberPeople – Количество человек; к
comfortType – Комфортность;
price – цена.
*/
public class Main {
    public static void main(String[] args) {
        // Пример использования класса Room
        Room room1 = new Room(1, "101", 2, "Standard", 100.0);
        Room room2 = new Room(2, "102", 3, "Luxury", 200.0);

        // Вывод информации о комнатах
        System.out.println("Room 1:");
        System.out.println(room1);
        System.out.println("\nRoom 2:");
        System.out.println(room2);
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

