package main;

import java.util.Objects;

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
    if (other == null) { return false; }
    return
      Objects.equals(this.data, other.data)
      && (this.left == null  ? other.left == null  : this.left.isIdenticalTo(other.left))
      && (this.right == null ? other.right == null : this.right.isIdenticalTo(other.right))
    ;
  }

  /** Should MUTATE `this`. */
  public void reverse() {
    // Swap `this.left` and `this.right`
    Node<T> temp = this.left;
    this.left = this.right;
    this.right = temp;
    // Reverse subtrees
    if (this.left != null) { this.left.reverse(); }
    if (this.right != null) { this.right.reverse(); }
  }

  public int height() {
    return
      1 + Math.max(
        (this.left == null ? 0 : this.left.height()),
        (this.right == null ? 0 : this.right.height())
      )
    ;
  }

  public boolean isProper() {
    return
      this.left == null
      ? this.right == null
      : this.right != null && this.left.isProper() && this.right.isProper()
    ;
  }

  public int numberOfNodes() {
    return
      1
      + (this.left == null ? 0 : this.left.numberOfNodes())
      + (this.right == null ? 0 : this.right.numberOfNodes())
    ;

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