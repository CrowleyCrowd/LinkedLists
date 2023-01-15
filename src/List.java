public class List {
    private Node first;
    private Node last;
    
    /**
     * Define an empty list
     */
    public List() {
        this.first = null;
        this.last = null;
    }

    /**
     * Add first node
     * @param info
     */
    public void unshift (int info) {
        Node newNode = new Node(info);
        if(this.isEmpty()) {
            this.first = newNode;
            this.last = newNode;
        } else {
            newNode.setLink(this.first);
            this.first = newNode;
        }
    }

    /**
     * Add last node
     * @param info
     */
    public void push (int info) {
        Node newNode = new Node(info);
        if(first == null) {
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setLink(newNode);
            this.last = newNode;
            //no mandatory
            //this.last.setLink(null);
        }
    }

    /**
     * Check  for an empty node
     * @return
     */
    public boolean isEmpty() {
        return this.first == null;
    }

    /**
     * Search in node
     * @param info
     * @return
     */
    public boolean search(int info) {
        Node p = first;
        while(p.getLink() != null) {
            if (p.getInfo() == info) {
                return true;
            }
            p = p.getLink();
        }
        return false;
    }

    /**
     * Delete first node
     * @return
     */
    public boolean shift() {
        if (this.isEmpty()) {
            return false;
        }
        if (this.first.getLink() == null) {
            this.first = null;
            this.last = null;
            return true;
        }

        Node temp = this.first;
        this.first = this.first.getLink();
        temp = null;
        return true;
    }

    /**
     * Delete last node
     * @return
     */
    public boolean pop() {
        if (this.isEmpty()) {
            return false;
        }
        if(this.first.getLink() == null) {
            this.first = null;
            this.last = null;
            return true;
        }
        Node temp =this.first;
        Node temp2 = this.first;
        while (temp.getLink() != null) {
            temp2 = temp;
            temp = temp.getLink();
        }
        this.last = temp2;
        this.last.setLink(null);
        temp = null;
        return true;
    }

    /**
     * Print List
     * @return
     */
    public String print() {
        String str = "";
        Node p = this.first;
        while (p.getLink() != null) {
            str += p.getInfo() + " | ";
            p = p.getLink();
        }
        return str;
    }
}
