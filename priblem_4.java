import java.util.Scanner;

class electronic_company {
    static Scanner sc= new Scanner(System.in);
    //intialzaing the elements
    static class Product {
        String pro_name;
        String specification;
        int cost;
        int count;
        //constructor
        Product(String name, String specification, int cost, int count) {
            this.pro_name = name;
            this.specification = specification;
            this.cost = cost;
            this.count = count;
        }
    }

    static Product[] products = {
        new Product("charger", "25 watts, 13 watts,15 watts,20 watts", 900, 800),
        new Product("light", "25 watts, 13 watts,15 watts,20 watts,3 watt , 4 watts 8 watts", 130, 5000),
        new Product("processeor", "i3 i7 i5 Processor", 54000, 80),
        new Product("motherboard", "1st qulity 2nd 3rd and 4th ", 40000, 500)

    };

    //selecting the what u proform the operation
    public static void main(String[] args) {
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Product List");
            System.out.println("2. Product Count");
            System.out.println("3. View Product Details");
            System.out.println("4. Edit Product");
            System.out.println("5. Update Inventory");
            System.out.println("6. for Exit the problem");
            System.out.print("Enter your choice: ");
            int entry= sc.nextInt();

            switch (entry) {
                case 1:
                    ProductList();
                    break;
                case 2:
                    ProductCount();
                    break;
                case 3:
                    ProductDetails();
                    break;
                case 4:
                    edit_the_Product();
                    break;
                case 5:
                    update_company();
                    break;
                case 6:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    //1.viewing the productlist
    static void ProductList() {
        System.out.println("\nProduct List");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].pro_name);
        }
    }

    static void ProductCount() {
        System.out.println("\nProduct Count");
        System.out.print("Enter the what product u want name: ");
        String Name = sc.next();
        for (int i = 0; i < products.length; i++) {
            if (products[i].pro_name.equalsIgnoreCase(Name)) {
                System.out.println("Count: " + products[i].count);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    static void ProductDetails() {
        System.out.println("\nProduct Details");
        System.out.print("Enter the product name: ");
        String productName = sc.next();
        for (int i = 0; i < products.length; i++) {
            if (products[i].pro_name.equalsIgnoreCase(productName)) {
            System.out.println("Name: " + products[i].pro_name);
            System.out.println("Specification: " + products[i].specification);
            System.out.println("Cost: " + products[i].cost);
            System.out.println("Count: " + products[i].count);
            return;
            }
            }
            System.out.println("not found.");
            }
            static void edit_the_Product() {
                System.out.println("\nEdit Product");
                System.out.print("Enter the product name: ");
                String productName = sc.next();
                for (int i = 0; i < products.length; i++) {
                    if (products[i].pro_name.equalsIgnoreCase(productName)) {
                        System.out.print("new specification: ");
                        products[i].specification = sc.next();
                        System.out.print("new cost: ");
                        products[i].cost = sc.nextInt();
                        System.out.println("updated successfully.");
                        return;
                    }
                }
                System.out.println("not found.");
            }
            
            static void update_company() {
                System.out.println("\nUpdate Inventory");
                System.out.print("Enter the product name: ");
                String productName = sc.next();
                for (int i = 0; i < products.length; i++) {
                    if (products[i].pro_name.equalsIgnoreCase(productName)) {
                        System.out.print("Enter the number of quantities to add or delete: ");
                        int quantity = sc.nextInt();
                        products[i].count += quantity;
                        System.out.println("Inventory updated successfully.");
                        return;
                    }
                }
                System.out.println("not found.");
            }
        }