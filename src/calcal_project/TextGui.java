package calcal_project;

public class TextGui {
		
		//line for aesthetic (not working in eclipse as the console doesn't support most of the unicode)
		//°º¤ø,¸¸,ø¤º°`°º¤ø,¸,ø¤°º¤ø,¸¸,ø¤º°`°º¤ø,¸
		//*****************************************
		//^ use above line for separating please so we can keep it sync
		
		public void graphicgui() {//Creating a introduction to our program with ascii art generated online
			System.out.println("   _____        _               _                         ");
			System.out.println("  / ____|      | |             (_)                        ");
			System.out.println(" | |      __ _ | |  ___   _ __  _   ___  ___              ");
			System.out.println(" | |     / _` || | / _ \\ | '__|| | / _ \\/ __|             ");
			System.out.println(" | |____| (_| || || (_) || |   | ||  __/\\__ \\             ");
			System.out.println("  \\_____|\\__,_||_| \\___/ |_|   |_| \\___||___/             ");
			System.out.println("  / ____|      | |             | |       | |              ");
			System.out.println(" | |      __ _ | |  ___  _   _ | |  __ _ | |_  ___   _ __ ");
			System.out.println(" | |     / _` || | / __|| | | || | / _` || __|/ _ \\ | '__|");
			System.out.println(" | |____| (_| || || (__ | |_| || || (_| || |_| (_) || |   ");
			System.out.println("  \\_____|\\__,_||_| \\___| \\__,_||_| \\__,_| \\__|\\___/ |_|   ");
			System.out.println();
			//System.out.println("");
			//System.out.println("");
		}
		
		public void maingui() {
			System.out.println();
			System.out.println("*****************************************");
			System.out.println("1. Enter personal data");
			System.out.println("2. Enter food consume today");
			System.out.println("3. Check the inputted data");
			System.out.println("4. Reset all inputted data");
			System.out.println("5. Check the result");
			System.out.println("0. Exit the program");
			System.out.println("*****************************************");
		}
		
		public void askforinput() {
			System.out.println();
			System.out.print("Select a option: ");
		}
		
}
