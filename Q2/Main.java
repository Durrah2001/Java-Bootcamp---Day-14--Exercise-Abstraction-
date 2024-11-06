package org.Q2;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(10, 4, 2, 1);


        System.out.println("Moving up/down: ");
        System.out.print("When move up, y-axis will be = ");
        movablePoint.moveUp();
        System.out.println("x= " + movablePoint.getX() + " " + "y= " + movablePoint.getY());

        System.out.print("When move down, y-axis will be = ");
        movablePoint.moveDown();
        System.out.println("x= " + movablePoint.getX() + " " + "y= " + movablePoint.getY());


        System.out.println("---------------------");

        System.out.println("Moving right/left: ");
        System.out.print("When move right, x-axis will be = ");
        movablePoint.moveRight();
        System.out.println("x= " + movablePoint.getX() + " " + "y= " + movablePoint.getY());


        System.out.print("When move left, x-axis will be = ");
        movablePoint.moveLeft();
        System.out.println("x= " + movablePoint.getX() + " " + "y= " + movablePoint.getY());


    }
}