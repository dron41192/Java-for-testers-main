package task_4_2;

class Marshmallow extends Gift {
    private String color;

    public Marshmallow(String name, float weight, float price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + ", " +
                "вес: " + getWeight() + ", " +
                "цена: " + getPrice() + ", " +
                "цвет: " + getColor();
    }
}
