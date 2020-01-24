import java.util.ArrayList;

public class main {
  public static void main(final String[] args) {
    final ArrayList<String> names = new ArrayList<>();
    final BinaryTree tree = new BinaryTree();
    names.add("Max");
    names.add("Jack");
    names.add("Rajesh");
    names.add("Annabelle");
    names.add("Randolf");
    readNamesIntoBinaryTree(names, tree);
    printNamesInOrderToScreen(tree);
  }

  public static BinaryTree readNamesIntoBinaryTree(final ArrayList<String> names, final BinaryTree tree) {

    for (final String name : names) {
      final Node node = new Node(name);

      if (tree.root == null) {
        tree.root = node;
      } else {
        putNode(tree.root, node);
      }
    }
    return tree;
  }

  public static void printNamesInOrderToScreen(final BinaryTree tree) {

    if (tree.root.getBefore() != null) {
      checkForNode(tree.root);
    }
  }

  public static void checkForNode(final Node node) {
    if (node.getBefore() != null) {
      checkForNode(node.getBefore());
    }

    System.out.println(node.getName());

    if (node.getAfter() != null) {
      checkForNode(node.getAfter());
    }

  }


  public static void putNode(final Node node, final Node nodeToAdd) {
    if (nodeToAdd.getName().compareTo(node.getName()) < 0) {
      setNodesBefore(node, nodeToAdd);
    } else {
      setNodesAfter(node, nodeToAdd);
    }
  }

  public static void setNodesBefore(final Node node, final Node node2) {
    if (node.getBefore() == null) {
      node.setBefore(node2);
    } else {
      putNode(node.getBefore(), node2);
    }
  }

  public static void setNodesAfter(final Node node, final Node node2) {
    if (node.getAfter() == null) {
      node.setAfter(node2);
    } else {
      putNode(node.getAfter(), node2);
    }
  }
}
