package com.company;

public class Main {

    public static void main(String[] args) {
//        String color = "Красный1";
//        switch (color){
//            case "Белый":
//                System.out.println("Значение переменной равно: Белый");
//                break;
//            case "Желтый":
//                System.out.println("Значение переменной равно: Желтый");
//                break;
//            case "Красный":
//                System.out.println("Вы добрый и мягкий!");
//                break;
//            default:
//                System.out.println("Вы грубый!");
//        }
//
//        if (color != "Красный" && !color.isEmpty()){
//            System.out.println("Условие верно");
//        }
//
//        int num = 10;
//
//        if (num > 3 && num < 9){
//            System.out.println("Число в диапазоне от 3 до 20");
//        }
//
//        if (num > 3 || num < 9){
//            System.out.println("Число в диапазоне от 3 до 20");
//        }
//
//
        print("Наше слово");
        System.out.println(sum(200, 30));
    }

    public static void print(){
        System.out.println("Вызван метод print");
    }

    public static void print(String word){
        System.out.println("Ваше слово: " + word);
    }

    public static int sum(int num1, int num2){
        return num1 + num2;
    }








}
