package task_4_2;

public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy("Toffee", 14f, 10f, "caramel");
        Chocolate chocolate = new Chocolate("Alpen Gold", 5, 4, 40);
        Jellybean jellybean = new Jellybean("Gummy", 8, 9, "lemon");
        Marshmallow marshmallow = new Marshmallow("Haribo", 5, 7f, "pink");

        float generalWeight = candy.getWeight() +
                chocolate.getWeight() +
                jellybean.getWeight() +
                marshmallow.getWeight();

        float generalPrice = candy.getPrice() +
                chocolate.getPrice() +
                jellybean.getPrice() +
                marshmallow.getPrice();

        System.out.println("Общий вес подарка: " + generalWeight);
        System.out.println("Общая стоимость подарка: " + generalPrice);

        System.out.println(candy +
                "\n" + chocolate +
                "\n" + jellybean +
                "\n" + marshmallow);

    }
}
