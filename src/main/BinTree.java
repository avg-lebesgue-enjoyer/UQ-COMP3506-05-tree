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
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }

  /** Should MUTATE `this`. Return `this` for chaining. */
  public BinTree<T> reverse() {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }

  public int height() {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }
  
  public boolean isProper() {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
  }

  public boolean isComplete() {
    throw new UnsupportedOperationException("<!> NOT IMPLEMENTED!");
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
