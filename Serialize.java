package ru.lesson6;


import java.io.*;

public class Serialize {
    private static class Book implements Serializable{
    private String title;

        public Book(String title) {
            this.title = title;
        }}

        private static class Student implements Serializable{
            private int id;
            private String name;
            private int score;
            private Book book;

            public Student(int id, String name, int score) {
                this.id = id;
                this.name = name;
                this.score = score;
            }

            public void info(){
                System.out.println(id+ " "+ name+ " "+ score);

            }
        }


        public static void main(String[] args) {
            Student st1 = new Student(1,"Bob",87);
            Student st2 = new Student(2,"Bill", 56);
            Book jb = new Book("JB");
            st1.book    = jb;
            st2.book = jb;

            try(ObjectOutputStream ou = new ObjectOutputStream(new FileOutputStream("D:\\Экскременты в сети\\qwe.txt"))){
                ou.writeObject(st1);
                ou.writeObject(st2);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Student st11 = null;
            Student st12 = null;
            try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D:\\Экскременты в сети\\qwe.txt"))){
                st11 = (Student) oi.readObject();
                st12 = (Student) oi.readObject();

                st11.info();
                st12.info();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(st11.book);
            System.out.println(st12.book);

        }


    }






