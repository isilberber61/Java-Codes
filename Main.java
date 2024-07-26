import java.util.Scanner;

class Node {
    int value;
    Node left, right;

    public Node(int item) {
        value = item;
        left = right = null;
    }
}

class BinarySearchTree{
    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }


    // Insert a new key
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.value) {
            root.left = insertRec(root.left, key);
        } else if (key > root.value) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }


    // Delete a key
    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.value) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.value) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.value = minValue(root.right);

            root.right = deleteRec(root.right, root.value);
        }
        return root;
    }

    int minValue(Node root) {
        int minValue = root.value;
        while (root.left != null) {
            minValue = root.left.value;
            root = root.left;
        }
        return minValue;
    }

    // Search a key
    boolean search(int key) {
        return searchRec(root, key) != null;
    }

    Node searchRec(Node root, int key) {
        if (root == null || root.value == key) {
            return root;
        }
        if (key < root.value) {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }

    // In-order traversal
    void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.value + " ");
            inOrderRec(root.right);
        }
    }

    // Pre-order traversal
    void preOrder() {
        preOrderRec(root);
        System.out.println();
    }

    void preOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    // Post-order traversal
    void postOrder() {
        postOrderRec(root);
        System.out.println();
    }

    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.value + " ");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Binary Search Tree Menü ---");
            System.out.println("1. Add Element");
            System.out.println("2. Delete Element");
            System.out.println("3. Search Element");
            System.out.println("4. In-order Traversal");
            System.out.println("5. Pre-order Traversal");
            System.out.println("6. Post-order Traversal");
            System.out.println("7. Exit");
            System.out.print("Make a choice (1-7): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("How many data do you want to add? ");
                    int numberOfEntries = scanner.nextInt();

                    for (int i = 0; i < numberOfEntries; i++) {
                        System.out.print("Enter the data you want to add: ");
                        int keyToInsert = scanner.nextInt();
                        bst.insert(keyToInsert);
                    }
                    System.out.println("Data added.");
                    break;

                case 2:
                    System.out.print("Enter the data you want to delete: ");
                    int keyToDelete = scanner.nextInt();
                    bst.delete(keyToDelete);
                    System.out.println("Data deleted.");
                    break;

                case 3:
                    System.out.print("Enter the data you want to search for: ");
                    int keyToSearch = scanner.nextInt();
                    if (bst.search(keyToSearch)) {
                        System.out.println("Data found.");
                    } else {
                        System.out.println("No data found.");
                    }
                    break;

                case 4:
                    System.out.print("In-order traversal: ");
                    bst.inOrder();
                    break;

                case 5:
                    System.out.print("Pre-order traversal: ");
                    bst.preOrder();
                    break;

                case 6:
                    System.out.print("Post-order traversal: ");
                    bst.postOrder();
                    break;

                case 7:
                    System.out.println("Çıkış yapılıyor...");
                    break;

                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
                    break;
            }
        } while (choice != 7);

        scanner.close();

//        bst.insert(50);
//        bst.insert(30);
//        bst.insert(20);
//        bst.insert(40);
//        bst.insert(70);
//        bst.insert(60);
//        bst.insert(80);
//
//        System.out.print("In-order traversal: ");
//        bst.inOrder();
//
//        System.out.print("Pre-order traversal: ");
//        bst.preOrder();
//
//        System.out.print("Post-order traversal: ");
//        bst.postOrder();
//
//        System.out.println("Search 40: " + bst.search(40));
//        System.out.println("Search 90: " + bst.search(90));
//
//        // Enter the data to be deleted
//        System.out.print("Enter the data to be deleted: ");
//        int keyToDelete = scanner.nextInt();
//
//        //Delete Processing
//        bst.delete(keyToDelete);
//
//        System.out.print("In-order traversal after deleting " + keyToDelete + ": ");
//        bst.inOrder();
//
//
//
//        // Add Processing
//
//        // Get the data the user wants to add
//        System.out.print("Enter the data you want to add: ");
//        int keyToInsert = scanner.nextInt();
//
//        bst.insert(keyToInsert);
//
//        System.out.print("In-order traversal after inserting " + keyToInsert + ": ");
//        bst.inOrder();
//
//        scanner.close();
    }
}
