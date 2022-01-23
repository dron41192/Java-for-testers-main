package task_4_2;

class Jellybean extends Gift {
    private String flavor;

    public Jellybean(String name, float weight, float price, String flavor) {
        super(name, weight, price);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString(){
        return "Название: " + getName() + ", " +
                "вес: " + getWeight() + ", " +
                "цена: " + getPrice() + ", " +
                "вкус: " + getFlavor();
    }
}
