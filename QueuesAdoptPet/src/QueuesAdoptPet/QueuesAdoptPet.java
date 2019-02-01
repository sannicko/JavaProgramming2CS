/**
 *
 * Title:           Assignment Queues for Adopt-a-Pet
 *
 * Due Date: 11/21/2018
 *
 * Description of program, & explanation of programming concept(s) being applied
 * in program. This program will ask the user to select on option, to donate or
 * adopt a pet cat or dog, the program will creates a Pet object and add it to
 * the species queue and general Animal Shelter queue. When a person selects to
 * adopt a specific species pet, remove the first pet object from the
 * appropriate species queue, and also from the Animal Shelter queue. When a
 * person comes in to adopt the oldest pet in the shelter, then process the
 * Animal Shelter as a PriorityQueue.
 *
 */
package QueuesAdoptPet;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author 5867108
 */
public class QueuesAdoptPet {

    // Global variables for storing different type of Pets
    Queue<Pet> dogs = new LinkedList<>();
    Queue<Pet> cats = new LinkedList<>();
    PriorityQueue<Pet> animalShelter = new PriorityQueue<>();

    public static void main(String[] args) {
        // Creating object of current class
        QueuesAdoptPet petQueues = new QueuesAdoptPet();
        // Call the menu function
        petQueues.menu();
    }

    // Menu method it will run until the user presses 6 to exit
    public void menu() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("1 Donate a Cat");
            System.out.println("2 Donate a Dog");
            System.out.println("3 Adopt a Cat");
            System.out.println("4 Adopt a Dog");
            System.out.println("5 Adopt Oldest Pet");
            System.out.println("6 Exit");
            System.out.print("Enter Choice : ");
            int choice = input.nextInt();

            if (choice == 1) {
                Pet pet = new Pet();
                System.out.print("Enter Name : ");
                String name = input.next();
                System.out.print("Enter Date of Birth yyyymmdd format: ");
                int date = input.nextInt();
                System.out.print("Enter Species : ");
                String species = input.next();
                pet.setName(name);
                pet.setDateOfBirth(date);
                pet.setSpecies(species);
                enqueueCats(pet);
                enqueueAnimals(pet);
            } else if (choice == 2) {
                Pet pet = new Pet();
                System.out.print("Enter Name : ");
                String name = input.next();
                System.out.print("Enter Date of Birth : ");
                int date = input.nextInt();
                System.out.print("Enter Species : ");
                String species = input.next();
                pet.setName(name);
                pet.setDateOfBirth(date);
                pet.setSpecies(species);
                enqueueDogs(pet);
                enqueueAnimals(pet);
            } else if (choice == 3) {
                dequeueCats();
            } else if (choice == 4) {
                dequeueDogs();
            } else if (choice == 5) {
                dequeueAnimals();
            } else if (choice == 6) {
                System.out.println("Thank you for using this application. Good Bye");
                System.exit(0);
            }
            System.out.println(cats);
            System.out.println(dogs);
            System.out.println(animalShelter);
        }
    }

    // Adding the Pet object to to Cat queue
    private void enqueueCats(Pet p) {
        cats.add(p);
        System.out.println("The cat has been successfully added");
        System.out.println("");
    }

    // Adding the Pet object to to Dog queue
    private void enqueueDogs(Pet p) {
        dogs.add(p);
        System.out.println("The dog has been successfully added");
        System.out.println("");

    }

    // Removes the top element from the Cat queue and animalShelter queue
    private void dequeueCats() {
        Queue q = new LinkedList();
        Pet p = cats.poll();
        Iterator itr = animalShelter.iterator();
        PriorityQueue<Pet> p1 = new PriorityQueue<>();
        while (itr.hasNext()) {
            Pet p2 = (Pet) itr.next();
            if (!p2.equals(p)) {
                p1.add(p2);
            }
        }
        animalShelter.clear();
        itr = p1.iterator();
        while (itr.hasNext()) {
            animalShelter.add((Pet) itr.next());
        }
    }

    // Removes the top element from the Dog queue and animalShelter queue
    private void dequeueDogs() {
        Pet p = dogs.poll();
        Queue q = new LinkedList();
        Iterator itr = animalShelter.iterator();
        PriorityQueue<Pet> p1 = new PriorityQueue<>();
        while (itr.hasNext()) {
            Pet p2 = (Pet) itr.next();
            if (!p2.equals(p)) {
                p1.add(p2);
            }
        }
        animalShelter.clear();
        itr = p1.iterator();
        while (itr.hasNext()) {
            animalShelter.add((Pet) itr.next());
        }
    }

    // Add new Pet object to the animal queue
    private void enqueueAnimals(Pet p) {
        animalShelter.add(p);
    }

    // Remove element from top of animalShelter queue
    private Pet dequeueAnimals() {
        return animalShelter.poll();
    }
}
