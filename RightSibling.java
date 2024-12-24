class Result {
  static int findRightSibling(Node root, int key) {
    if(root==null) return -1;
  
    Queue<Node> q= new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty()){
        int levelsize=q.size();
        for(int i=0;i<levelsize;i++){
            Node current=q.poll();
            if(current.data==key){
                if(i<levelsize-1){
                    return q.peek().data;
                }
            }  
            if(current.left!=null) q.add(current.left);
            if(current.right!=null) q.add(current.right);
        }
    }
    return -1;
  }
}
