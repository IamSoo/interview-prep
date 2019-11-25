package tree;

public class BinaryTreeInJava {

    public Node addNode(Node current, int value){
        if(current == null){
           return  current = new Node(value);
        }

        if(current.value > value){
            current.left = addNode(current,value);
        }else if(current.value < value){
            current.right = addNode(current,value);
        }else{
            return current;
        }
        return current;
    }
}
