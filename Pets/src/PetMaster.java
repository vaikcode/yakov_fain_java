/**
 * @author vaikcode
 *
 */

public class PetMaster {

	public static void main(String[] args) {

		String petReaction;
		String fishReaction;
		
		// Declare undefined pet
		Pet myPet = new Pet();
		
		myPet.eat();
		petReaction = myPet.say("Tweet!! Tweet!!");
		System.out.println(petReaction);
		myPet.sleep();
		System.out.println();

		// Declare defined pet - Fish
		Fish myFish = new Fish (20);
		
		myFish.dive(23);
		myFish.dive(54);
		myFish.dive(99);

		fishReaction = myFish.say("Hello!");
		System.out.println(fishReaction);
		
		myFish.sleep();		
		
	}
}
