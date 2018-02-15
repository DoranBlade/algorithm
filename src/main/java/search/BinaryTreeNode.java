package search;

/**
 * 二叉树节点
 * created by eric on 18-2-14
 */
public class BinaryTreeNode<T extends SearchKey> {

    // 节点值
    private T value;

    // 左子节点
    private BinaryTreeNode<T> left;

    // 右子节点
    private BinaryTreeNode<T> right;

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public void insert(BinaryTreeNode<T> node) {
        if (getValue().getKey() - node.getValue().getKey() > 0) {
            if (this.getLeft() == null) {
                this.setLeft(node);
            } else {
                this.getLeft().insert(node);
            }
        }
        if (getValue().getKey() - node.getValue().getKey() < 0) {
            if (this.getRight() == null) {
                this.setRight(node);
            } else {
                this.getRight().insert(node);
            }
        }
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }
}
