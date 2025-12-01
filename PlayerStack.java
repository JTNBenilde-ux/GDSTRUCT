import java.util.Stack;

public class PlayerStack {
    private Stack<String> stack;

    public PlayerStack() {
        stack = new Stack<>();
    }

    public void push(String player) {
        stack.push(player);
    }

    public String pop() {
        if (stack.isEmpty()) return null;
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public Stack<String> getStack() {
        return stack;
    }
}
