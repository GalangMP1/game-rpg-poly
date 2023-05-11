public class App {
    public static void main(String[] args) {
        //Static polymorphism
        Hero hr = new Hero();
        hr.move();
        hr.move("on");

        Enemy en = new Enemy();
        en.move();
        en.move(20);

        //Dynamic polymorphism
        Character character;

        character = new Hero();
        character.move();

        character = new Enemy();
        character.move();

        character = new Witch();
        character.move();

        character = new Fighter();
        character.move();

        //Dynamic polymorphism with casting
        Witch w = new Witch();
        w.move();

        if (character instanceof Witch) {
            Witch witch = (Witch) character;
            Fighter fighter = castWitchToFighter(witch);
            fighter.move();
        }
    }

    private static Fighter castWitchToFighter(Witch witch) {
        Fighter fighter = new Fighter();
        return fighter;
    }
}

class Character {
    public void move() {
        System.out.println("Character is moving");
    }
}

class Hero extends Character {
    @Override
    public void move() {
        System.out.println("Hero is moving");
    }

    public void move(String direction) {
        System.out.println("Hero is moving " + direction);
    }
}

class Fighter extends Hero {
    @Override
    public void move() {
        System.out.println("Fighter is moving");
    }
}

class Enemy extends Character {
    @Override
    public void move() {
        System.out.println("Enemy is moving");
    }

    public void move(int step) {
        System.out.println("Enemy is moving " + step + " steps");
    }
}

class Witch extends Enemy {
    @Override
    public void move() {
        System.out.println("Witch is moving");
    }
}
     
