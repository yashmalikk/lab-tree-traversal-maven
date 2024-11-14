package edu.grinnell.csc207.util;

/**
 * Nodes in a binary tree.
 *
 * @author Samuel A. Rebelsky
 *
 * @param <T>
 *   The type of value stored in nodes.
 */
class BinaryTreeNode<T> {

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The value in this node.
   */
  T value;

  /**
   * The left subtree.
   */
  BinaryTreeNode<T> left;

  /**
   * The right subtree.
   */
  BinaryTreeNode<T> right;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new binary tree node with specified value, left subtree,
   * and right subtree.
   *
   * @param val
   *   The value to be stored in the node.
   * @param l
   *   The left subtree.
   * @param r
   *   The right subtree.
   */
  public BinaryTreeNode(T val, BinaryTreeNode<T> l, BinaryTreeNode<T> r) {
    this.value = val;
    this.left = l;
    this.right = r;
  } // BinaryTreeNode(T, BinaryTreeNode, BinaryTreeNode)

  /**
   * Create a new leaf (a binary tree node with a value, but no subtrees).
   *
   * @param val
   *   The value to store in the node.
   */
  public BinaryTreeNode(T val) {
    this(val, null, null);
  } // BinaryTreeNode(T)
} // class BinaryTreeNode<T>
