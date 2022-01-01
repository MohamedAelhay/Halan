public class Tree {
    public Integer sum(Node node) {
        Integer sum = 0;
        return this.traverse(node, sum);
    }

    private Integer traverse(Node node, Integer sum) {
        sum += node.getValue();

        if(!node.getNodes().isEmpty()){
            for (Node nodeChild : node.getNodes()){
                sum = traverse(nodeChild, sum);
            }
        }

        return sum;
    }
}
