public class Main {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
        }
    }

    static class LinkedList {
        private Node head;
        private int size;

        public LinkedList() {
            head = null;
            size = 0;
        }

        public void add(String value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        public String removeFirst() {
            if (head == null) return null;

            String removed = head.data;
            head = head.next;
            size--;
            return removed;
        }

        public int size() {
            return size;
        }

        public boolean contains(String value) {
            Node current = head;

            while (current != null) {
                if (current.data.equals(value)) return true;
                current = current.next;
            }

            return false;
        }

        public int indexOf(String value) {
            Node current = head;
            int index = 0;

            while (current != null) {
                if (current.data.equals(value)) return index;
                current = current.next;
                index++;
            }

            return -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            Node current = head;

            while (current != null) {
                sb.append(current.data);
                if (current.next != null) sb.append(", ");
                current = current.next;
            }
            return sb.append("]").toString();
        }
    }

    public static void main(String[] args) {

        LinkedList agents = new LinkedList();

        //Valorant characters
        agents.add("Raze");
        agents.add("Vys");
        agents.add("Omen");
        agents.add("Sova");
        agents.add("Waylay");

        System.out.println("Valorant Agents: " + agents);
        System.out.println("Size: " + agents.size());
        System.out.println("\nRemoved first: " + agents.removeFirst());
        System.out.println("After removal: " + agents);
        System.out.println("Size: " + agents.size());
        System.out.println("\nContains Omen? " + agents.contains("Omen"));
        System.out.println("Contains Jett? " + agents.contains("Jett"));
        System.out.println("\nIndex of Sova: " + agents.indexOf("Sova"));
        System.out.println("Index of Reyna: " + agents.indexOf("Reyna"));
        System.out.println("Index of Phoenix: " + agents.indexOf("Phoenix")); // not present
    }}