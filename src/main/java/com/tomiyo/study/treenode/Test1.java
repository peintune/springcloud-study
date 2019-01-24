package com.tomiyo.study.treenode;

/**
 * @description: ${description}
 * @author: He Kun
 * @create: 2018-12-20 16:45
 **/
public class Test1 {

    public static void main(String[] args){

        Node root = new Node(0);

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        root.setLeftNode(node1);
        root.setRightNode(node2);

        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.setLeftNode(node3);
        node1.setRightNode(node4);

        Node node5 = new Node(5);
        Node node6 = new Node(6);
        node3.setLeftNode(node5);
        node3.setRightNode(node6);

        Node node7 = new Node(7);
        Node node8 = new Node(8);

        node6.setLeftNode(node7);
        node7.setLeftNode(node8);

        Solution.parseNode(root);

    }

    public static class Node {

        private Integer value;
        private Node leftNode;
        private Node rightNode;
        private String path = "";

        public Node(int value){
            this.value = value;
        }
        public void setLeftNode(Node node){
            this.leftNode = node;
        }

        public void setRightNode(Node node){
            this.rightNode = node;
        }

        public Node getLeftNode(){
            return this.leftNode;
        }

        public Node getRightNode(){
            return this.rightNode;
        }

        public boolean hasLeftNode(){
            return  null!=this.leftNode;
        }

        public boolean hasRightNode(){
            return null!=this.rightNode;
        }

        public int getValue(){
            return this.value;
        }

        public String getPath(){
            return this.path;
        }

        public Node setPath(String path){
            this.path = path;
            return this;
        }

    }

    public static class Solution {

        public static void parseNode(Node node){
            boolean leafNode = true;

            node.setPath(node.getPath() +" -> "+ node.getValue());

            if(node.hasLeftNode()){
                leafNode = false;
                parseNode(node.getLeftNode().setPath(node.getPath()));
            }

            if(node.hasRightNode()){
                leafNode = false;
                parseNode(node.getRightNode().setPath((node.getPath())));
            }

            if(leafNode){
                System.out.println(node.getPath().substring(3));
            }
        }
    }

}
