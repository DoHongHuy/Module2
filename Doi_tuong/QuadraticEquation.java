package com.Doi_tuong;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return (this.b * this.b) - (4 * (this.a * this.c));
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(delta())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(delta())) / (2 * this.a);
    }

    public double getRoot3() {
        return (-this.b) / (a * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = sc.nextDouble();
        System.out.print("Nhập b:");
        double b = sc.nextDouble();
        System.out.print("Nhập c:");
        double c = sc.nextDouble();
        QuadraticEquation get = new QuadraticEquation(a, b, c);
        if (get.delta() > 0) {
            System.out.println("Phương trình có 2 nghiệm X1:" + get.getRoot1() + "\n" + get.getRoot2());
        } else if (get.delta() == 0) {
            System.out.println("Phương trình có 1 nghiệm X1:" + get.getRoot3());
        } else {
            System.out.println("Phương trình vô nghiệm");

        }
    }
}