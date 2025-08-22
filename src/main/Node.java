package main;

public class Node<T> {
  // SECTION: Boilerplate
  private T data;
  private Node<T> left;
  private Node<T> right;

  public Node(T data, Node<T> left, Node<T> right) {
    this.data = data;
    this.left = left;
    this.right = right;
  }

  public T getData() { return data; }
  public void setData(T data) { this.data = data; }
  public Node<T> getLeft() { return left; }
  public void setLeft(Node<T> left) { this.left = left; }
  public Node<T> getRight() { return right; }
  public void setRight(Node<T> right) { this.right = right; }

  // LAUNCH: Useful methods

  public boolean isIdenticalTo(Node<T> other) {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }

  /** Should MUTATE `this`. */
  public void reverse() {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }

  public int height() {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }

  public boolean isProper() {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }



  // SECTION: Visualise tree
  public String toStringWith(int indentationLevel) {
    String padding = "| ".repeat(indentationLevel);
    return
      this.data.toString() + "\n" // Trust the caller to prepend necessary padding for this `Node` in particular
      + padding + "|\n"
      + padding + "+-l: " + (this.left == null ? "(null)\n" : this.left.toStringWith(indentationLevel + 1))
      + padding + "|\n"
      + padding + "+-r: " + (this.right == null ? "(null)\n" : this.right.toStringWith(indentationLevel + 1))
    ;
  }
}