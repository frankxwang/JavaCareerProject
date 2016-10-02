import java.util.*;
public class Runner {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("What is your first and last name?");
			String[] name = in.nextLine().split(" ");
			System.out.println("What is your age?");
			int age = Integer.valueOf(in.nextLine());
			System.out.println("What do you like more, Math, Science, or English?");
			String subject = in.nextLine().toLowerCase();
			System.out.println("What do you like more, Movies, or Sports?");
			String hobby = in.nextLine().toLowerCase();
			System.out.println("What do you like more, Pizza, or Burrito?");
			String food = in.nextLine().toLowerCase();
			
			Career c = new Career(name[0], name[1], age);
			c.printInfo();
			c.printCareer(subject, hobby, food);
			
			System.out.println("Again? (Yes, No)");
			if(in.nextLine().toLowerCase().equals("no")){
				break;
			}
		}
	}
}
