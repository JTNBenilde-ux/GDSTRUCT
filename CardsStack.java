import java.util.ArrayList;

public class CardsStack {
    private ArrayList<Cards> stack;

    public CardsStack() {
        stack = new ArrayList<>();
    }

    public void push(Cards card) {
        stack.add(card);
    }

    public Cards pop() {
        if (isEmpty()) return null;
        return stack.remove(stack.size() - 1);
    }

    public Cards top() {
        if (isEmpty()) return null;
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public int size() {
        return stack.size();
    }

    public void printCards() {
        if (stack.isEmpty()) {
            System.out.println("(none)");
            return;
        }
        for (Cards c : stack) {
            System.out.println("- " + c.getName());
        }
    }
}
