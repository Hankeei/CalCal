package calcal_project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//utils
		double height, weight;
		int activity ; //
		boolean gender; // male = true, female = false 
		Scanner select = new Scanner(System.in);
		String sel; // selection input
		boolean run = true; // Keep the program looping until the user decide to exit the program
		TextGui textgui = new TextGui();
		
		
		
		//Start of the program
		textgui.graphicgui();
		textgui.maingui();
		
		
		while(run) {
			textgui.askforinput();
			sel = select.nextLine();
			switch (sel) {
				case "1":
					//inputting data
					double inputresult[] = inputdata();
					height = inputresult[0];
					weight = inputresult[1];
					activity = (int) inputresult[2];
					if (inputresult[3] == 2) {gender = false;}
					break;
				case "2":
					//food menu
					break;
				case "3":
					//check inputted data 
					
					//Body
					
					//Food
					
					break;
				case "4":
					//reset all data
					System.out.println();
					System.out.println();
					//body
					height = 0;
					weight = 0;
					activity = 0;
					gender = true;
					
					//food
					
					break;
				case "5":
					//calculation
					break;
				case "0":
					//quitting the program
					System.out.println();
					System.out.println("-------------------------------------------");
					System.out.println("| Thank you for using calories calculator |");
					System.out.println("-------------------------------------------");
					
					run = false;
					break;
				default:	
					System.out.println("Invalid input, try again.");
					
			}
		}
		
		
		select.close();
	}
	
	public static double[] inputdata() {
		
		double h,w,g = 0,a = 0;
		char gs;
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Scanner scc = new Scanner(System.in);
		TextGui textgui = new TextGui();
		
		
		System.out.println();
		System.out.println("Enter your height: ");
		h = sc.nextDouble();
		System.out.println("Enter your weight: ");
		w = sc.nextDouble();
		while (run) {
			System.out.println("Select your gender (m/f): ");
			gs = scc.nextLine().charAt(1);
			if (gs == 'm') {g = 1 ;run = false;}else if (gs == 'f'){g = 2;run = false;} else {System.out.println("Invalid input, try again.");}
		}
		run = true;
		while (run) {
			System.out.println("Select your activity rate");
			System.out.println("a. Sedentary (little to no exercise)");
			System.out.println("b. Lightly (1-2 day sports per week)");
			System.out.println("c. Moderately (3-5 day sports per week)");
			System.out.println("d. Very active (6-7 day sports per week)");
			System.out.println("e. Extra (sports & physical job or 2x training)");
			textgui.askforinput();
			a = sc.nextDouble();
			if (a != 1 || a != 2 || a != 3 || a != 4 || a != 5) {
				System.out.println("Invalid input, try again.");
			} else {
				run = false;
			}
			
		}
		sc.close();
		scc.close();
		return new double[]{h , w , g , a};
		}

}
