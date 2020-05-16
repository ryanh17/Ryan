public class Node {
    //The nodes branch left or right.  The int is the node number it branches to.  If it is 0 it is a leaf node
    int left;
    int right;
    int id;
    Node(int id, int left, int right){
        this.id = id;
        this.left = left;
        this.right = right;
    }

    @Override
    public int hashCode() {
        return Integer.toString(id).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Node){
            Node other = (Node)obj;
            if(other.id == this.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "" + id;
    }
}
