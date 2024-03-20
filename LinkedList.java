public class LinkedList {
    // A classe 'LinkedList' representa a lista encadeda em si.
    Node head;  // Aponta para o primeiro nó.

    public LinkedList(){
        this.head = null; // Inicializa 'head' como null para indicar uma lista vazia.
    }

    public void add(int data){  // Adiciona um novo nó com um valor especifico ao final da lista.
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){  // Percorre a lista e exibe os valores de cada nó.
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
        System.out.println();
    }
}
