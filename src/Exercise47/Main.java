package Exercise47;

public class Main {

 public static void main(String[] args) {
  // Test MyLinkedList
  System.out.println("=== Testing MyLinkedList ===");
  NodeList list = new MyLinkedList(null);
  list.addItem(new Node("Delta"));
  list.addItem(new Node("Alpha"));
  list.addItem(new Node("Charlie"));
  list.addItem(new Node("Bravo"));

  System.out.println("Traversing MyLinkedList:");
  list.traverse(list.getRoot());

  list.removeItem(new Node("Charlie"));
  System.out.println("After removing 'Charlie':");
  list.traverse(list.getRoot());

  // Test SearchTree
  System.out.println("\n=== Testing SearchTree ===");
  NodeList tree = new SearchTree(null);
  tree.addItem(new Node("Delta"));
  tree.addItem(new Node("Alpha"));
  tree.addItem(new Node("Charlie"));
  tree.addItem(new Node("Bravo"));

  System.out.println("Traversing SearchTree:");
  tree.traverse(tree.getRoot());

  tree.removeItem(new Node("Charlie"));
  System.out.println("After removing 'Charlie':");
  tree.traverse(tree.getRoot());
}
}