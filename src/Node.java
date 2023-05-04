import java.util.ArrayList;

public class Node {
    private int id;
    private ArrayList<Node> neighbors;
    private boolean isLeader;

    public Node(int id) {
        this.id = id;
        this.neighbors = new ArrayList<Node>();
        this.isLeader = false;
    }

    public void addNeighbor(Node neighbor) {
        neighbors.add(neighbor);
    }

    public void electLeader() {
        int maxId = id;
        for (Node neighbor : neighbors) {
            int neighborId = neighbor.getId();
            if (neighborId > maxId) {
                maxId = neighborId;
            }
        }
        if (maxId == id) {
            isLeader = true;
        } else {
            isLeader = false;
        }
    }

    public int getId() {
        return id;
    }

    public boolean isLeader() {
        return isLeader;
    }
}