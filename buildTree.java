static Node buildTree(int arr[], int n) {
  if(n==0) return null;
  
  Node root=new Node(arr[0]);
  Queue<Node> q=new LinkedList<>();
  q.offer(root);
  int i=1;
  while(!q.isEmpty()){
      Node current=q.poll();
      if(i<n){
          current.left=new Node(arr[i++]);
          q.add(current.left);
      }
      if(i<n){
          current.right=new Node(arr[i++]);
          q.add(current.right);
      }
  }
  return root;
}
