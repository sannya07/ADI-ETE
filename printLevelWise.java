static void printLevelWise(Node root) {
  if(root==null) return;
  
  Queue<Node> q=new LinkedList<>();
  q.offer(root);
  
  while(!q.isEmpty()){
      int levelsize=q.size();
      for(int i=0;i<levelsize;i++){
          Node current=q.poll();
          System.out.print(current.data);
          if(i<levelcsize-1) System.out.print(" ");
          if(current.left!=null) q.add(current.left);
          if(current.right!=null) q.add(current.right);
      }
      System.out.println();
  }
}
