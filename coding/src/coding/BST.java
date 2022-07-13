package coding;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

import coding.*;
public class BST {


public static Node insert(Node root, int data) {
    if(root == null) {
        return new Node(data);
    } else {
        Node cur;
        if(data <= root.data) {
            cur = insert(root.left, data);
            root.left = cur;
        } else {
            cur = insert(root.right, data);
            root.right = cur;
        }
        return root;
    }
}
static List<Integer> result= new ArrayList<>();
public static void preOrder(Node root) {
    
    if(root==null){
        return ;
    }else{
    	System.out.println(root.data);
        result.add(root.data);
         preOrder(root.left);
         preOrder(root.right);
    }
}
static List<Integer> result1= new ArrayList<>();
public static void inOrder(Node root) {
    
    if(root==null){
        return ;
    }else{
   
    	inOrder(root.left);
         result1.add(root.data);
         inOrder(root.right);
    }
}
static List<Integer> result2= new ArrayList<>();
public static void postOrder(Node root) {
    
    if(root==null){
        return ;
    }else{
   
    	postOrder(root.left);
         
         postOrder(root.right);
         result2.add(root.data);
    }
}

static int height(Node root) {
	  if(root == null) {
		  return -1;
	  }else {
		  int left1=0,right1=0;
		  left1=height(root.left);
		  right1=height(root.right);
		  int maxi=(left1>right1)?left1:right1;
		  return  maxi+1;
	  }  
}
static List<Integer> result3= new ArrayList<>();
public  static void levelorder(Node root) {
	Queue<Node> waitingOrder = new LinkedList<>();
		waitingOrder.add(root);
		while(waitingOrder.size()!= 0) {
			Node temp=waitingOrder.remove();
			result3.add(temp.data);
			if(temp.left !=null) {
				waitingOrder.add(temp.left);
			}
			if(temp.right !=null) {
				waitingOrder.add(temp.right);
			}	
		}
	System.out.println(result3.toString());
}

public static void main(String[] args) {
	Node root = null;
	root = insert(root, 1);
	insert(root, 2);
	insert(root, 5);
	insert(root, 3);
	insert(root, 6);
	insert(root, 4);
	//preOrder(root);
	//postOrder(root);
	//height(root);
	levelorder(root);
	System.out.println(result.toString());
	
}
}