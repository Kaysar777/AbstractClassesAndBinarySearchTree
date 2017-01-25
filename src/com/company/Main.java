package com.company;

//Ves' smysl etogo - eto 4toby rabotat' s bolee abstraktnymi obyektami.


public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");

        for (String s : data) {
            tree.addItem(new Node(s));
        }

        System.out.println();

        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("Darwin"));
        tree.traverse(tree.getRoot());
        System.out.println();


        tree.removeItem(new Node("Brisbane"));
        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("Perth"));
        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("Melbourne"));
        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("Canberra"));
        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("Adelaide"));
        tree.traverse(tree.getRoot());
        System.out.println();

        tree.removeItem(new Node("Sydney"));
        tree.traverse(tree.getRoot());
        System.out.println();

    }
}
