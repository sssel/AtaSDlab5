import java.util.GregorianCalendar;

public class BST {
    private Node root;

    public void insert(Student newElem){
        root = insertNode(root, newElem);
    }
    private Node insertNode(Node current, Student newElem){
        if (current == null) return new Node(newElem);
        if (newElem.Surname.compareTo(current.student.Surname)<0){
            current.left = insertNode(current.left, newElem);
            current = rotationR(current);
        }
        else{
            current.right = insertNode(current.right, newElem);
            current = rotationL(current);
        }
        return current;
    }

    private Node rotationR (Node current){
        Node temp = current.left;
        current.left = temp.right;
        temp.right = current;
        current = temp;
        return current;
    }
    private Node rotationL (Node current){
        Node temp = current.right;
        current.right = temp.left;
        temp.left = current;
        current = temp;
        return current;
    }
    public void find(GregorianCalendar key){
        System.out.println("Element with key "+key.get(GregorianCalendar.YEAR));
        Node findN = findNode(root,key);
        if (findN == null){
            System.out.println("No element with such key");
        }
        else {
            System.out.println(findN.student.toString());
        }
    }
    private Node findNode(Node current, GregorianCalendar key){
        if (current == null) return null;
        if (current.student.DateOfBirth.get(GregorianCalendar.YEAR)<key.get(GregorianCalendar.YEAR)){
            current = findNode(current.left, key);
        } else if (current.student.DateOfBirth.get(GregorianCalendar.YEAR)>key.get(GregorianCalendar.YEAR)) {
            current = findNode(current.right, key);
        } else return current;
        return current;
    }
}
