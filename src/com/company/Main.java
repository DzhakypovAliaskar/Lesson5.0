package com.company;

import java.util.Scanner;

     class Main {

         public static void main(String[] args) {

             Scanner scanner = new Scanner(System.in);
             System.out.println("Введите ваше имя: ");
             String a = scanner.nextLine();
             System.out.println("Привет " + a);


                 Car car1 = new Car();
                 car1.yearOfIssue = 1961;
                 car1.price = 18.5;
                 car1.status = "В коллекции";
                 car1.setMileage(1000);

                 System.out.println("Год выпуска: " + car1.yearOfIssue + " Стоимость: " + car1.price +
                         " Статус: " + car1.status + " Пробег: " + car1.getMileage());

                 car1.manualTransmission();


                 Car car2 = new Car(4.8, 2008, 1000);
                 System.out.println("Стоимость: " + car2.price +
                         " Год выпуска: " + car2.yearOfIssue + " Мощность двигателя: " + car2.enginePower);

                 car2.additionalNotes();

                 Car car3 = new Car("В разработке:", 8.9, 2021, "Bugatti", 0);
                 System.out.println("Статус: " + car3.status + " Стоимость: " + car3.price +
                         " Год выпуска: " + car3.yearOfIssue + " Марка: " + car3.company + " Пробег: " + car3.getMileage());

                 car3.Speed();

             }


         }

