package com.zuzia.oop.threetwo;

public class Pair<T extends Comparable<T>> {
    private T left;
    private T right;

    public Pair(T left, T right) {
        this.setLeft(left);
        this.setRight(right);
    }

    public void swap() {
        T tempLeft = this.getLeft();
        this.setLeft(this.getRight());
        this.setRight(tempLeft);
    }

    public T max() {
        return this.getLeft().compareTo(this.getRight()) > 0 ? this.getLeft() : this.getRight();
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("[%s;%s]", this.getLeft(), this.getRight());
    }
}
