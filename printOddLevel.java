class Result {
  static void printOdd(Node root) {
    if(root==null) return;
    Queue<Node> q=new LinkedList<>();
    q.offer(root);
    int level=1;
    while(!q.isEmpty()){
        int levelsize=q.size();
        for(int i=0;i<levelsize;i++){
            Node current=q.poll();
            if(level%2!=0){
                System.out.print(current.data+" ");
            }
            if(current.left!=null) q.add(current.left);
            if(current.right!=null) q.add(current.right);
        }
        level++;
    }
  }
}
