import java.util.Scanner;
class Animal {// я сделал все это немного по своему, но смысл тот же
    public int sprint;
    public int swim;
    public double jump;
}
class Cat extends Animal {
    public Cat(int sprint, int swim, double jump) {
        this.sprint = sprint;
        this.swim = swim;
        this.jump = jump;
    }
}
class Dog extends Animal {
    public Dog(int sprint, int swim, double jump) {
        this.sprint = sprint;
        this.swim = swim;
        this.jump = jump;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Animal[] cat = new Cat[2];
        cat[0] = new Cat(200, 0, 2.0);
        cat[1] = new Cat(170, 7, 1.5);
        Animal[] dog = new Dog[2];
        dog[0] = new Dog(500, 10, 0.5);
        dog[1] = new Dog(700, 0, 1.5);
        while (true) {
            System.out.println("You can try out animals skills! Or stop the program. For that enter: Start or Stop");
            Scanner scanner = new Scanner(System.in);
            String ansver = scanner.nextLine();
            if(ansver.equals("Start")){
                System.out.println("You can try out animals skills! For that choose: Cat or Dog");
                String animal = scanner.nextLine();
                if (animal.equals("Cat")) {
                    System.out.println("Choose cat number: 1 or 2");
                    int number = scanner.nextInt();
                    if (number == 1){
                        System.out.println("First cat can try to Sprint, Swim, or Jump. Try to tell your cat to do so");
                        Scanner scanne = new Scanner(System.in);
                        String job = scanne.nextLine();
                        int length;
                        if (job.equals("Sprint")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(cat[number - 1].sprint >= length){
                                System.out.println("Cat did it");
                            } else {
                                System.out.println("Cat didn't move");
                            }
                        } else if (job.equals("Swim")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if (cat[number - 1].swim > 0){
                                if(cat[number].swim >= length){
                                    System.out.println("Holy thing it CAN");
                                } else {
                                    System.out.println("Cat didn't move");
                                }
                            } else {
                                System.out.println("Cats cannot swim");
                            }
                        } else if (job.equals("Jump")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(cat[number - 1].jump >= length){
                                System.out.println("Cat did it");
                            } else {
                                System.out.println("Cat didn't move");
                            }
                        }
                    } else if (number == 2){
                        System.out.println("First cat can try to Sprint, Swim, or Jump. Try to tell your cat to do so");
                        Scanner scanne = new Scanner(System.in);
                        String job = scanne.nextLine();
                        int length;
                        if (job.equals("Sprint")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(cat[number - 1].sprint >= length){
                                System.out.println("Cat did it");
                            } else {
                                System.out.println("Cat didn't move");
                            }
                        } else if (job.equals("Swim")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if (cat[number - 1].swim > 0){
                                if(cat[number - 1].swim >= length){
                                    System.out.println("Holy thing it CAN");
                                } else {
                                    System.out.println("Cat didn't move");
                                }
                            } else {
                                System.out.println("Cats cannot swim");
                            }
                        } else if (job.equals("Jump")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(cat[number - 1].jump >= length){
                                System.out.println("Cat did it");
                            } else {
                                System.out.println("Cat didn't move");
                            }
                        }
                    }
                } else if (animal.equals("Dog")) {
                    System.out.println("Choose dog number: 1 or 2");
                    int number = scanner.nextInt();
                    if (number == 1){
                        System.out.println("First dog can try to Sprint, Swim, or Jump. Try to tell your dog to do so");
                        Scanner scanne = new Scanner(System.in);
                        String job = scanne.nextLine();
                        int length;
                        if (job.equals("Sprint")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(dog[number - 1].sprint >= length){
                                System.out.println("Dog did it");
                            } else {
                                System.out.println("Dog didn't move");
                            }
                        } else if (job.equals("Swim")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(dog[number - 1].swim >= length){
                                System.out.println("Dog did it");
                            } else {
                                System.out.println("Dog didn't move");
                            }
                        } else if (job.equals("Jump")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(dog[number - 1].jump >= length){
                                System.out.println("Dog did it");
                            } else {
                                System.out.println("Dog didn't move");
                            }
                        }
                    } else if (number == 2){
                        System.out.println("First dog can try to Sprint, Swim, or Jump. Try to tell your dog to do so");
                        Scanner scanne = new Scanner(System.in);
                        String job = scanne.nextLine();
                        int length;
                        if (job.equals("Sprint")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(dog[number - 1].sprint >= length){
                                System.out.println("Dog did it");
                            } else {
                                System.out.println("Dog didn't move");
                            }
                        } else if (job.equals("Swim")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(dog[number - 1].swim >= length){
                                System.out.println("Dog did it");
                            } else {
                                System.out.println("Dog didn't move");
                            }
                        } else if (job.equals("Jump")){
                            System.out.println("Enter length");
                            length = scanne.nextInt();
                            if(dog[number - 1].jump >= length){
                                System.out.println("Dog did it");
                            } else {
                                System.out.println("Dog didn't move");
                            }
                        }
                    }

                }
            }else {
                break;
            }

        }

    }
}