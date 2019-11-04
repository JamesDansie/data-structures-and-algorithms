package code401challenges.graph;

public class Edge {
    int weight;
    Vertex vert1;

    public Edge(int weight, Vertex vert1) {
        this.weight = weight;
        this.vert1 = vert1;
    }

    public Vertex getVert1() {
        return vert1;
    }

    public void setVert1(Vertex vert1) {
        this.vert1 = vert1;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                ", vert1=" + vert1.getName() +
                '}';
    }
}
