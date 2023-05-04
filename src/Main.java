public class Main {
    public static void main(String[] args) {
        int numNodes = 10;
        ElectionProcess process = new ElectionProcess(numNodes);
        process.run();
    }
}