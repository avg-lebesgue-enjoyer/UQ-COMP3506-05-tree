package main;

import java.math.BigInteger;

public class BinTree<T> {
  // SECTION: Boilerplate
  private Node<T> root;

  public BinTree(Node<T> root) {
    this.root = root;
  }

  // LAUNCH:

  public boolean isIdenticalTo(BinTree<T> other) {
    return
      this.root == null
      ? other.root == null
      : this.root.isIdenticalTo(other.root)
    ;
  }

  /** Should MUTATE `this`. */
  public BinTree<T> reverse() {
    if (this.root != null) {
      this.root.reverse();
    }
    return this; // for chaining
  }

  public int height() {
    return
      this.root == null
      ? 0
      : this.root.height()
    ;
  }
  
  public boolean isProper() {
    return
      this.root == null
      ? true
      : this.root.isProper()
    ;
  }

  public int numberOfNodes() {
    return
      this.root == null
      ? 0
      : this.root.numberOfNodes()
    ;
  }

  public boolean isComplete() {
    return
      this.root == null
      ? true
      : this.numberOfNodes() + 1 == (1 << this.height())
    ;
  }



  // SECTION: Visualise tree

  @Override
  public String toString() {
    if (this.root == null) {
      return "(empty tree)"; 
    } else {
      return this.root.toStringWith(0);
    }
  }
  public String toStringIndented() {
    return "\t" + this.toString().replace("\n", "\n\t").trim();
  }

  // SECTION: Example trees

  public static BinTree<Integer> exampleA() {
    return new BinTree<>(null);
  }
  public static BinTree<Integer> exampleAReversed() {
    return exampleA();
  }
  public static BinTree<Integer> exampleB() {
    return new BinTree<>(
      new Node<>(
        42,
        null,
        null
      )
    );
  }
  public static BinTree<Integer> exampleBReversed() {
    return exampleB();
  }
  public static BinTree<Integer> exampleC() {
    return new BinTree<>(
      new Node<>(
        42,
        new Node<>(
          1337,
          null,
          null
        ),
        null
      )
    );
  }
  public static BinTree<Integer> exampleCReversed() {
    return new BinTree<>(
      new Node<>(
        42,
        null,
        new Node<>(
          1337,
          null,
          null
        )
      )
    );
  }
  public static BinTree<Integer> exampleD() {
    return new BinTree<>(
      new Node<>(
        42,
        new Node<>(
          1337,
          new Node<>(
            10,
            new Node<>(
              31,
              null,
              null
            ),
            new Node<>(
              72,
              null,
              new Node<>(
                96,
                null,
                null
              )
            )
          ),
          null
        ),
        new Node<>(
          567,
          null,
          new Node<>(
            192,
            null,
            null
          )
        )
      )
    );
  }
  public static BinTree<Integer> exampleDReversed() {
    return new BinTree<>(
      new Node<>(
        42,
        new Node<>(
          567,
          new Node<>(
            192,
            null,
            null
          ),
          null
        ),
        new Node<>(
          1337,
          null,
          new Node<>(
            10,
            new Node<>(
              72,
              new Node<>(
                96,
                null,
                null
              ),
              null
            ),
            new Node<>(
              31,
              null,
              null
            )
          )
        )
      )
    );
  }
}
