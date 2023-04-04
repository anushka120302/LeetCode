public class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if ("".equals(arr[i]) || ".".equals(arr[i])) continue;
            if ("..".equals(arr[i]) && !stack.isEmpty()) stack.pop();
            else if (!"..".equals(arr[i])) stack.push(arr[i]);
        }
        if (stack.isEmpty()) return "/";
        String result = "";
        while (!stack.isEmpty()) result = "/" + stack.pop() + result;
        return result;
    }
}