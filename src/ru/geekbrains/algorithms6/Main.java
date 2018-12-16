package ru.geekbrains.algorithms6;

public class Main {

    public static void main(String[] args) {
        Tree[] trees = new Tree[10];

        for (int i = 0; i < trees.length; i++) {
            trees[i] = new Tree();
            while (true){
                trees[i].insert((int)((Math.random()*100)+(Math.random()*(-100))));
            }
        }







    }
}
