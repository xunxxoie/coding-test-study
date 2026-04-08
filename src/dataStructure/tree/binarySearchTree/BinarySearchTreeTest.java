package dataStructure.tree.binarySearchTree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        Node root = new Node(10);

        BinarySearchTree bst = new BinarySearchTree(root);
    }

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(Integer data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinarySearchTree{
        Node root;
        int size;

        public BinarySearchTree(Node root){
            this.root = root;
            this.size = 1;
        }

        public void add(Node node){
            // 루트 노드부터 시작해, 데이터의 대소를 비교하여 적절한 위치에 삽입한다.

            // 트리가 비어있으면 루트로 삽입
            if(this.root == null){
                this.root = node;
                this.size++;
                return;
            }

            Node current = this.root;

            do{
                if(node.data == current.data){
                    // 십입 데이터와 같으면 종료(중복 허용 X)
                    return;
                } else if (node.data < current.data) {
                    // 삽입 데이터가 작으면
                    // 삽입하려는 곳에 노드가 없으면 노드를 삽입하고 종료
                    if(current.left == null){
                        current.left = node;
                        this.size++;
                        return;
                    }

                    // 삽입하려는 곳에 노드가 있으면 다음 노드로 이동
                    current = current.left;
                }else{
                    // 삽입 데이터가 크면
                    // 삽입하려는 곳에 노드가 없으면 노드를 삽입하고 종료
                    if(current.right == null){
                        current.right = node;
                        this.size++;
                        return;
                    }

                    // 삽입하려는 곳에 노드가 있으면 다음 노드로 이동
                    current = current.right;
                }
            }while(true);
        }

        public void remove(int target){
            Node parentNode = findParentNode(target);
            Node targetNode = findTargetNode(target);

            NodeType type = findNodeType(targetNode);
            boolean isRoot = (parentNode == null);

            switch (type){
                case NO_CHILD:
                    if(isRoot){
                        this.root = null;
                        break;
                    }else{
                        if(parentNode.left == targetNode){
                            parentNode.left = null;
                        }else{
                            parentNode.right = null;
                        }
                        break;
                    }
                case ONE_CHILD:
                    if(isRoot){
                        this.root = (this.root.left != null) ? this.root.left : this.root.right;
                        break;
                    }else{
                        Node newChildNode = targetNode.left != null ? targetNode.left : targetNode.right;

                        if(parentNode.left == targetNode){
                            parentNode.left = newChildNode;
                        }else{
                            parentNode.right = newChildNode;
                        }
                        break;
                    }
                case TWO_CHILD:
                    // 오른쪽 서브트리의 최솟값(중위 후계자)을 찾는다
                    Node successor = targetNode.right;
                    while (successor.left != null) {
                        successor = successor.left;
                    }

                    // 후계자 값을 저장 후, 후계자 노드를 먼저 삭제한다 (후계자는 NO_CHILD 또는 ONE_CHILD)
                    int successorData = successor.data;
                    remove(successorData);

                    // 삭제 대상 노드의 값을 후계자 값으로 교체한다
                    targetNode.data = successorData;
                    break;
            }
        }

        public Node findTargetNode(int target){
            Node currentNode = this.root;

            while(currentNode != null){
                if (currentNode.data == target){
                    return currentNode;
                }

                if(target < currentNode.data){
                    currentNode = currentNode.left;
                }else{
                    currentNode = currentNode.right;
                }
            }
            return null;
        }

        public Node findParentNode(int target){
            Node currentNode = this.root;

            while(currentNode != null){
                if(currentNode.left.data == target
                    || currentNode.right.data == target
                ){
                    return currentNode;
                }

                if(target < currentNode.data){
                    currentNode = currentNode.left;
                }else{
                    currentNode = currentNode.right;
                }
            }
            return null;
        }


        public NodeType findNodeType(Node node){
            if (node.left != null && node.right != null) {
                return NodeType.TWO_CHILD;
            } else if (node.left != null || node.right != null) {
                return NodeType.ONE_CHILD;
            } else {
                return NodeType.NO_CHILD;
            }
        }

        enum NodeType{
            TWO_CHILD,
            ONE_CHILD,
            NO_CHILD
        }
    }
}
