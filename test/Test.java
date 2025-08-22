package test;

import java.util.Arrays;

import main.BinTree;

public class Test {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println(
        "Expected nonempty `argv`. Here are the legal entries:\n"
        + "\t`show`:\t\tPrints the example trees\n"
        + "\t`identical`:\tTests the `.isIdenticalTo` method\n"
        + "\t`reverse`:\tTests the `.reverse` method\n"
        + "\t`height`:\tTests the `.height` method\n"
        + "\t`proper`:\tTests the `.isProper` method\n"
        + "\t`complete`:\tTests the `.isComplete` method\n"
      );
    }
    if (Arrays.stream(args).anyMatch("show"::equals)) {
      System.out.println("==== Showing trees... ====");
      System.out.println("Tree A:");
      System.out.println(BinTree.exampleA().toStringIndented());
      System.out.println("Tree B:");
      System.out.println(BinTree.exampleB().toStringIndented());
      System.out.println("Tree C:");
      System.out.println(BinTree.exampleC().toStringIndented());
      System.out.println("Tree D:");
      System.out.println(BinTree.exampleD().toStringIndented());
    }
    if (Arrays.stream(args).anyMatch("identical"::equals)) {
      System.out.println("==== Testing `.isIdenticalTo`... ====");
      System.out.println("A.isIdenticalTo(A): " + BinTree.exampleA().isIdenticalTo(BinTree.exampleA()));
      System.out.println("A.isIdenticalTo(B): " + BinTree.exampleA().isIdenticalTo(BinTree.exampleB()));
      System.out.println("A.isIdenticalTo(C): " + BinTree.exampleA().isIdenticalTo(BinTree.exampleC()));
      System.out.println("A.isIdenticalTo(D): " + BinTree.exampleA().isIdenticalTo(BinTree.exampleD()));
      System.out.println("");
      System.out.println("B.isIdenticalTo(A): " + BinTree.exampleB().isIdenticalTo(BinTree.exampleA()));
      System.out.println("B.isIdenticalTo(B): " + BinTree.exampleB().isIdenticalTo(BinTree.exampleB()));
      System.out.println("B.isIdenticalTo(C): " + BinTree.exampleB().isIdenticalTo(BinTree.exampleC()));
      System.out.println("B.isIdenticalTo(D): " + BinTree.exampleB().isIdenticalTo(BinTree.exampleD()));
      System.out.println("");
      System.out.println("C.isIdenticalTo(A): " + BinTree.exampleC().isIdenticalTo(BinTree.exampleA()));
      System.out.println("C.isIdenticalTo(B): " + BinTree.exampleC().isIdenticalTo(BinTree.exampleB()));
      System.out.println("C.isIdenticalTo(C): " + BinTree.exampleC().isIdenticalTo(BinTree.exampleC()));
      System.out.println("C.isIdenticalTo(D): " + BinTree.exampleC().isIdenticalTo(BinTree.exampleD()));
      System.out.println("");
      System.out.println("D.isIdenticalTo(A): " + BinTree.exampleD().isIdenticalTo(BinTree.exampleA()));
      System.out.println("D.isIdenticalTo(B): " + BinTree.exampleD().isIdenticalTo(BinTree.exampleB()));
      System.out.println("D.isIdenticalTo(C): " + BinTree.exampleD().isIdenticalTo(BinTree.exampleC()));
      System.out.println("D.isIdenticalTo(D): " + BinTree.exampleD().isIdenticalTo(BinTree.exampleD()));
    }
    if (Arrays.stream(args).anyMatch("reverse"::equals)) {
      System.out.println("==== Testing `.reverse`... ====");
      System.out.println("A: " + BinTree.exampleA().reverse().isIdenticalTo(BinTree.exampleAReversed()));
      System.out.println("B: " + BinTree.exampleB().reverse().isIdenticalTo(BinTree.exampleBReversed()));
      System.out.println("C: " + BinTree.exampleC().reverse().isIdenticalTo(BinTree.exampleCReversed()));
      System.out.println("D: " + BinTree.exampleD().reverse().isIdenticalTo(BinTree.exampleDReversed()));
      System.out.println("\nFor example, here's D reversed:");
      System.out.println(BinTree.exampleD().reverse());
    }
    if (Arrays.stream(args).anyMatch("height"::equals)) {
      System.out.println("==== Testing `.height`... ====");
      System.out.println("A: " + BinTree.exampleA().height());
      System.out.println("B: " + BinTree.exampleB().height());
      System.out.println("C: " + BinTree.exampleC().height());
      System.out.println("D: " + BinTree.exampleD().height());
    }
    if (Arrays.stream(args).anyMatch("proper"::equals)) {
      System.out.println("==== Testing `.isProper`... ====");
      System.out.println("A: " + BinTree.exampleA().isProper());
      System.out.println("B: " + BinTree.exampleB().isProper());
      System.out.println("C: " + BinTree.exampleC().isProper());
      System.out.println("D: " + BinTree.exampleD().isProper());
    }
    if (Arrays.stream(args).anyMatch("complete"::equals)) {
      System.out.println("==== Testing `.isComplete`... ====");
      System.out.println("A: " + BinTree.exampleA().isComplete());
      System.out.println("B: " + BinTree.exampleB().isComplete());
      System.out.println("C: " + BinTree.exampleC().isComplete());
      System.out.println("D: " + BinTree.exampleD().isComplete());
    }
  }
}