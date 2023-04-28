package src;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Library \n : ");
        Scanner scan = new Scanner(System.in);
        int BookId = scan.nextInt();
        ArrayList<String> booksStorage = new ArrayList<String>();
        // добавим в список ряд элементов
        booksStorage.add(0,"\"1984\" by George Orwell");
        booksStorage.add(1,"\"To Kill a Mockingbird\" by Harper Lee");
        booksStorage.add(2,"\"The Great Gatsby\" by F. Scott Fitzgerald");
        booksStorage.add(3,"\"Harry Potter and the Philosopher's Stone\" by J.K. Rowling");
        booksStorage.add(4,"\"Tales of the Brothers Grimm\" by Wilhelm Grimm, Jacob Grimm");
         boolean stop = false;
        switch (BookId) {
            case 0:
                String Element = booksStorage.get(0);
                System.out.println(Element);
                stop = true;
                break;
            case 1:
                String Element1 = booksStorage.get(1);
                System.out.println(Element1);
                stop = true;
                break;
            case 2:
                String Element2 = booksStorage.get(2);
                System.out.println(Element2);
                stop = true;
                break;
            case 3:
                String Element3 = booksStorage.get(3);
                System.out.println(Element3);
                stop = true;
                break;
            case 4:
                String Element4 = booksStorage.get(4);
                System.out.println(Element4);
                stop = true;
                break;
            default:
                System.out.println("This book is out of stock");
                stop = true;
        }
         if (stop == true) {
             System.out.println("shall we continue? \n" + "1.= Yes /n" + "2.= No /n");
             int Decision = scan.nextInt();
             if (Decision == 1) {
                 main(args);
             } else
             {
                 System.exit(0);
             }
         }
    }

}
