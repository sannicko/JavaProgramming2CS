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

public class Pet implements Comparable<Pet> {

    private String name;
    private Integer dateOfBirth;
    private String species;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Integer dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Compare method will compare two pet objects based on their date of birth
    @Override
    public int compareTo(Pet pet) {
        return this.dateOfBirth - pet.dateOfBirth;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", dateOfBirth=" + dateOfBirth + ", species=" + species + '}';
    }

}
