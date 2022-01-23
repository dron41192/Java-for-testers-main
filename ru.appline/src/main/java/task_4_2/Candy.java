package task_4_2;

class Candy extends Gift {
    private String kind;

    public Candy(String name, float weight, float price, String kind) {
        super(name, weight, price);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + ", " +
                "вес: " + getWeight() + ", " +
                "цена: " + getPrice() + ", " +
                "вид: " + getKind();
    }
}
