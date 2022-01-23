package task_4_2;

class Chocolate extends Gift {
    private int percent;

    public Chocolate(String name, float weight, float price, int percent) {
        super(name, weight, price);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + ", " +
                "вес: " + getWeight() + ", " +
                "цена: " + getPrice() + ", " +
                "процент: " + getPercent() + "%";
    }
}
