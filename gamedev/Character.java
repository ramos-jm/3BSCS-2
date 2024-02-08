package gamedev;
public class Character {
    private String type;
    private String defenseStrategy;

   

    public Character(String type, String defenseStrategy){
        this.type = type;
       
        this.defenseStrategy = defenseStrategy;
    }

    public void attack() {
        if (type.equals("Knight")) {
            System.out.println("Knight attacks with a sword!");
        } else if (type.equals("Wizard")) {
            System.out.println("Wizard casts a spell!");
        } else if (type.equals("Archer")) {
            System.out.println("Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("Knight")) {
            if(defenseStrategy.equals("Shield")){
                System.out.println("Using a shield to defend!");
            }else if(defenseStrategy.equals("Dodge")){
                System.out.println("Dodgin to avoid attack!");
            }
	        else if(defenseStrategy.equals("Barrier")){
            System.out.println("Creating a magic barrier for defense!");
        }		

        } else if (type.equals("Wizard")) {
            System.out.println("Creating a magic barrier for defense!");
        } else if (type.equals("Archer")) {
            System.out.println("Using a shield to defend!");
        }
    }


    public move

   

    
}
