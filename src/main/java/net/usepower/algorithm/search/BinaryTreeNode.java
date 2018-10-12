package net.usepower.algorithm.search;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 二叉树节点
 * created by eric on 18-2-14
 */
@Setter
@Getter
@NoArgsConstructor
public class BinaryTreeNode {

    // 节点值
    private Integer value;

    // 左子节点
    private BinaryTreeNode left;

    // 右子节点
    private BinaryTreeNode right;

    public BinaryTreeNode(Integer value) {
        this.value = value;
    }

    public void insert(BinaryTreeNode node) {
        if (getValue() - node.getValue() > 0) {
            if (this.getLeft() == null) {
                this.setLeft(node);
            } else {
                this.getLeft().insert(node);
            }
        }
        if (getValue() - node.getValue() < 0) {
            if (this.getRight() == null) {
                this.setRight(node);
            } else {
                this.getRight().insert(node);
            }
        }
    }

}
