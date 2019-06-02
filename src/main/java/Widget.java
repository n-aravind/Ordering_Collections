public class Widget implements Comparable<Widget>{
    private long height;
    private long weight;
    private String some;

    public Widget(long height, long weight) {
        this.height = height;
        this.weight = weight;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public int compareTo(Widget o) {
        int heightComp = Long.compare(height,o.height);
        return (heightComp != 0 ? heightComp : Long.compare(weight,o.weight));
    }

    @Override
    public String toString() {
        return "Widget{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
