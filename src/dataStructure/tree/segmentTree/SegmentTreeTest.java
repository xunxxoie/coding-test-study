package dataStructure.tree.segmentTree;

public class SegmentTreeTest {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int length = arr.length;

        // 전처리
        int[] prefix = new int[length+1];
        for(int i = 0; i < length; i++){
            prefix[i+1] =  prefix[i] + arr[i];
        }
    }

    public int rangeSum(int[] prefix, int l, int r){
        return prefix[r] - prefix[l];
    }

    static class SegmentTree{
        static int[] arr;
        static long[] tree;

        static void build(int node, int start, int end){
            // 리프노드인 경우
            if(start == end){
                tree[node] = arr[start];
                return;
            }

            // 내부노드인 경우
            int mid = (start + end)/2;

            // 왼쪽 자식과 오른쪽 자식을 재귀적으로 호출
            build(2*node, start, mid);
            build(2*node+1, mid + 1, end);

            tree[node] = tree[2 * node] + tree[2 * node + 1];
        }

        static long query(int node, int start, int end, int l, int r){
            // 현재 노드가 나타내는 구간이 완전히 안겹치는 경우
            if(r < start || l > end)
                return 0;

            // 현재 노드가 나타내는 구간이 완전히 겹치는 경우
            if(l <= start && r >= end)
                return tree[node];

            // 현재 노드가 나타내는 구간이 일부만 겹치는 경우
            int mid =  (start + end)/2;
            return query(2*node, start, mid, l, r) + query(2*node + 1, mid+1, end, l, r);
        }

        static void update(int node, int start, int end, int idx, int value){
            // 리프노드인 경우
            if(start == end){
                arr[idx] = value;
                tree[start] = value;
                return;
            }
            int mid = (start + end)/2;
            if(idx<=mid){
                // 왼쪽 자식의 서브트리에 있는 경우
                update(2*node, start, mid, idx, value);
            }else{
                // 오른쪽 자식의 서브트리에 있는 경우
                update(2*node+1, mid + 1, end, idx, value);
            }
            tree[node] = tree[2 * node] + tree[2 * node + 1];
        }
    }
}
