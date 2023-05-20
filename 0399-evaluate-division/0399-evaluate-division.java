class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        // Step 1: Build the graph and populate the weights
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);

        // Step 2: Process the queries
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String dividend = query.get(0);
            String divisor = query.get(1);
            results[i] = dfs(dividend, divisor, new HashMap<>(), graph);
        }

        return results;
    }

    private Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String dividend = equation.get(0);
            String divisor = equation.get(1);
            double value = values[i];

            graph.putIfAbsent(dividend, new HashMap<>());
            graph.putIfAbsent(divisor, new HashMap<>());

            graph.get(dividend).put(divisor, value);
            graph.get(divisor).put(dividend, 1.0 / value);
        }

        return graph;
    }

    private double dfs(String curr, String target, Map<String, Boolean> visited, Map<String, Map<String, Double>> graph) {
        // If the current variable is not in the graph or the target variable is not in the graph, return -1.0
        if (!graph.containsKey(curr) || !graph.containsKey(target))
            return -1.0;

        // If the current variable is the target variable, return 1.0
        if (curr.equals(target))
            return 1.0;

        visited.put(curr, true);
        double result = -1.0;

        Map<String, Double> neighbors = graph.get(curr);
        for (Map.Entry<String, Double> neighbor : neighbors.entrySet()) {
            String next = neighbor.getKey();
            if (!visited.containsKey(next)) {
                visited.put(next, true);
                double value = neighbor.getValue();
                 double subResult = dfs(next, target, visited, graph);

                if (subResult != -1.0) {
                    result = value * subResult;
                    break;
                }
            }
        }

        visited.remove(curr);
        return result;
    }
}