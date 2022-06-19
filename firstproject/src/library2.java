import java.util.*;
import java.util.regex.*;

public class library2 {

    public ArrayList<String> arr = new ArrayList<String>();
    {
        arr.add("css");
        arr.add("html");
        arr.add("sql");
        arr.add("java");
        arr.add("c++");
        arr.add("data structure");
        arr.add("DBMS");
        arr.add("API");
    }

    Scanner sc = new Scanner(System.in);
    Scanner sd = new Scanner(System.in);
    String book;
    char choice;
    int u = 0;
    String fname;
    String lname;

    public void addbook() {
        while (true) {
            System.out.println("type '1' to add book");
            System.out.println("type 'e' to go back");
            System.out.println();

            try {
                System.out.println("enter the choice");
                choice = sc.next().charAt(0);
                if (choice == '1') {
                    System.out.println("add the book");
                    book = sd.nextLine();
                    arr.add(book);
                } else if (choice == 'e') {
                    break;
                } else {
                    System.out.println("Enter only those choices which are available in instructions");
                }
            } catch (Exception e) {
                System.out.println("Enter only those choices which are available in instructions");
            }
        }
    }

    public void issuebook() {
        while (true) {
            System.out.println("type '1' to take book");
            System.out.println("type 'e' to exit");
            System.out.println();

            try {
                System.out.println("enter the choice");
                choice = sc.next().charAt(0);
            } catch (Exception e) {
                System.out.println("enter choice only available in instructions");
            }
                if (choice == '1') {
                    int n = 1;
                    System.out.println("Book no. ! Books");
                    for (String e : arr) {
                        System.out.println("book" + n + "    ! " + e);
                        n++;
                    }
                    try {
                        System.out.println("enter the book number you want:");
                        u = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Enter only number");
                    }
                        String s1;
                String reg = "[^a-zA-Z+]";
                boolean t = true;
                try {
                    while (t == true) {
                        System.out.println("Enter your name");
                        fname = sd.nextLine().toUpperCase();
                        for (int i = 0; i < fname.length(); i++) {
                            s1 = String.valueOf(fname.charAt(i));

                            Pattern p = Pattern.compile(reg);
                            Matcher m = p.matcher(s1);
                            if (m.matches()) {
                                System.out.println("no numbers, Space and special symbols are allowed");
                                t = true;
                                break;
                            } else {
                                t = false;
                            }
                        }
                    }
                } catch (Exception e) {
                }
                System.out.println("your first name is " + fname);
                t = true;
                try {
                    while (t == true) {
                        System.out.println("Enter you Last Name");
                        lname = sd.nextLine().toUpperCase();
                        for (int i = 0; i < lname.length(); i++) {
                            s1 = String.valueOf(lname.charAt(i));

                            Pattern p = Pattern.compile(reg);
                            Matcher m = p.matcher(s1);
                            if (m.matches()) {
                                System.out.println("no numbers and special symbols are allowed");
                                t = true;
                                break;
                            } else {
                                t = false;
                            }
                        }
                    }
                } catch (Exception e) {
                }
                System.out.println("your last name is " + lname);

                        if (arr.get(u - 1).contains(fname)) {
                            int j=arr.get(u-1).indexOf(" is Unavailable");
                           String s=arr.get(u - 1).replaceAll(arr.get(u-1).substring(j), "");
                            System.out.println(s+" book is already been issued to "+fname+" "+lname);
                        }
                        else if (arr.get(u - 1).contains("Unavailable")) {
                            System.out.println(arr.get(u - 1));
                        } else if (u > 0 && (u - 1) < arr.size()) {
                            System.out.println(
                                    "The " + arr.get(u - 1) + " book issued to" + " " + fname + " " + lname);
                            arr.set(u - 1, arr.get(u - 1) + " is Unavailable , it is already been issued to" + " " + fname + " " + lname);
                        } else {
                            System.out.println("Enter correct book number");
                        }
                    
                } else if (choice == 'e') {
                    break;
                } else {
                    System.out.println("Enter only those choices which are available in instructions");
                }
            
        }
    }

    public void checkbook() {
        for (String e : arr) {
            System.out.println(e);
        }
    }

    public void returnbook() {
        while (true) {
            System.out.println("type '1' to return book");
            System.out.println("type 'e' to go back");
            System.out.println();

            try {
                System.out.println("enter the choice");
                choice = sc.next().charAt(0);

                if (choice == '1') {
                    int n = 1;
                    for (String e : arr) {
                        System.out.println("book" + n + "-" + e);
                        n++;
                    }
                    System.out.println("enter the book number you want to return:");
                    u = sc.nextInt();
                    if (arr.get(u - 1).contains("is Unavailable") == true) {
                        int j=arr.get(u-1).indexOf(" is Unavailable");
                           arr.set(u-1,arr.get(u - 1).replaceAll(arr.get(u-1).substring(j), ""));
                        System.out.println("Thank you for returning " + arr.get(u - 1) + " book");
                    } else if (arr.get(u - 1).contains("is Unavailable") == false) {
                        System.out.println("you have'nt taken this " + arr.get(u - 1) + " book");
                    } else {
                        System.out.println("Enter correct book number");
                    }
                } else if (choice == 'e') {
                    break;
                } else {
                    System.out.println("Enter only those choices which are available in instructions");
                }
            } catch (Exception e) {
                System.out.println("Enter only those choices which are available in instructions");
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<String> ar = new ArrayList<String>();

        ar.add("");

        library2 l = new library2();
        char choose;
        
        char choice;
        Scanner se = new Scanner(System.in);

        while (true) {
            System.out.println("type '1' to start");
            System.out.println("type 'e' to quit");
            System.out.println();
            System.out.println("enter your choice");
            choice = se.next().charAt(0);

            if (choice == '1') {
                
                while (true) {
                    System.out.println("type '1' to add book");
                    System.out.println("type '2' to issue book");
                    System.out.println("type '3' to check book");
                    System.out.println("type '4' to return book");
                    System.out.println("type 'e' exit");

                    try {
                        System.out.println("enter the choice");
                        choose = se.next().charAt(0);

                        if (choose == '1') {
                            l.addbook();
                        } else if (choose == '2') {
                            l.issuebook();
                        } else if (choose == '3') {
                            l.checkbook();
                        } else if (choose == '4') {
                            l.returnbook();
                        } else if (choose == 'e') {
                            break;
                        } else {
                            System.out.println("Enter only those choices which are available in instructions");
                        }
                    } catch (Exception e) {
                        System.out.println("Enter only those choices which are available in instructions");
                    }
                }
            }
            if (choice == 'e') {
                break;
            }
        }
    }
}
