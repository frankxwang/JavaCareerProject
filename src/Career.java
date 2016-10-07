import java.io.*;
public class Career {
	//subjects math, science, english
	//hobby movies sports
	//food pizza burrito 
	String[][] careers = new String[12][4];
	String[] name = new String[2];
	int age;
	Career(String n1, String n2, int age){
		try {
			FileReader fs = new FileReader("careers.txt");
			BufferedReader br = new BufferedReader(fs);
			for(int i=0; i<12; i++){
				careers[i] = br.readLine().split(",");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		name[0] = n1;
		name[1] = n2;
		this.age = age;
	}
	void printInfo(){
		System.out.println("First Name: " + name[0] + "\nLast Name: " + name[1] + "\nAge: " + age);
	}
	void printCareer(String sub, String hob, String food){
		for(int i=0; i<careers.length; i++){
			String[] vals = careers[i];
			if(sub.equals(vals[0]) && hob.equals(vals[1]) && food.equals(vals[2])){
				System.out.println("You will become a: " + vals[3]);
				return;
			}
		}
		System.out.println("ERROR");
	}
}
