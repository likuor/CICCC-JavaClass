package classes;

// blueprint (template)
public class Pokemon {
    // fields (attributes) - instxance variables
    String name;
    String type;
    int healthPoint;
    int attackPoint;

    // constructor - a method to create an instance(object)
    // - default constructor: no parameters
    // - default constructor is given by the java compiler if you don't have any constructors
    Pokemon() {
        // null keyword - refers to an empty object (uninitialized object)
        this.name = null;
        this.type = null;
        this.healthPoint = 0;
        this.attackPoint = 0;
    }

    Pokemon(String name, String type, int healthPoint, int attackPoint) {
        // initialize your fields
        // 'this' (optional): "self reference"
        this.name = name;
        this.type = type;
        this.healthPoint = healthPoint;
        this.attackPoint = attackPoint;
    }

    // methods (behaviors) - functions
    void attack(Pokemon e) {
        if (e.dodge()) {
            System.out.println(e.name + " dodged the attack!");
        } else {
            System.out.println("I'm attacking you with " + attackPoint);
            e.healthPoint -= attackPoint;
        }
    }

    boolean dodge() {
        // random number from 0.0 to 1.0
        // > 0.5 -> true
        // <= 0.5 -> false
        return Math.random() > 0.5;
    }

    void evolve() {
        System.out.println("I'm evolving...");
        healthPoint += 20;
        attackPoint += 20;
    }
}