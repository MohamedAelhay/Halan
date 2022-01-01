import java.util.ArrayList;

public class Node {
    private Integer value;
    private ArrayList<Node> nodes = new ArrayList<>();

    Node(int val) {
        this.value = val;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = nodes;
    }
}
