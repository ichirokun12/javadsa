import java.util.*;

class Solution {
    HashMap<Integer, List<Integer>> graph = new HashMap<>();

    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.putIfAbsent(dest, new ArrayList<>());
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    public void dfs(int start, Set<Integer> visited) {
        if (visited.contains(start)) return;

        System.out.println(start + " ");
        visited.add(start);

        for (int neighbor : graph.get(start)) {
            if(!visited.contains(neighbor)) {
                dfs(neighbor, visited);
            }
        }
    }

    public void bfs(int start) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.println(current + " ");

            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }
}
