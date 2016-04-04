package com.sonata.pratice;

public class BinaryTree
{

	 Node root;

	    public BinaryTree(Node n)
	    {
	        root = n;
	    }
	    public void levelOrderofTreep(BinaryTree t, int height){
	    	levelOrderofTree(t.root, 0, height);
	    }

	    public void levelOrderofTree(Node t, int level, int height){
	    	if (t==null){
	    		return;
	    	}

	    	if (level ==1){

	    		printTree (t);

	    	}else if(level >height){
	    		levelOrderofTree( t.left,level-1,height);
	    		levelOrderofTree( t.right,level-1,height);
	    	}


	    }

	    public void printTree(Node t){
	    	System.out.print(t.data);

	    }
}
