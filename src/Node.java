public class Node {
  final String name;
  public Node before;
  public Node after;

  public Node(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setBefore(final Node before) {
    this.before = before;
  }

  public Node getBefore() {
    return before;
  }

  public void setAfter(final Node after) {
    this.after = after;
  }

  public Node getAfter() {
    return after;
  }

  @Override
  public String toString() {
    return name + " " + before + " " + after;
  }
}

