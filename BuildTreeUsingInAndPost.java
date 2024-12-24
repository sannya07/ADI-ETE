class Result {
  static Node buildTree(int in[], int post[], int N) {
    if(in.length!=post.length || in==null || post==null) return null;
    
    //to store in order indexes
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<in.length;i++){
        hm.put(in[i],i);
    }
    return helper(in,0,in.length-1,post,0,post.length-1,hm);
  }
    
  static Node helper(int[] in,int inStart,int inEnd, int[] post,int postStart, int postEnd, HashMap<Integer,Integer> hm){
      if(inStart>inEnd || postStart>postEnd) return null;
      //finding the root value
      int rootValue=post[postEnd];
      Node root= new Node(rootValue);
      
      int inRoot=hm.get(rootValue);
      int numsLeft=inRoot-inStart;
      
      root.leftChild=helper(in, inStart, inRoot-1,post, postStart, postStart+numsLeft-1,hm);
      root.rightChild=helper(in, inRoot+1, inEnd, post, postStart+numsLeft,postEnd-1, hm);
      
      return root;
      
  }
}
