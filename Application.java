import java.util.*;
class Application {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("----Mini Operating System----");
			System.out.println("Enter the number to open the  app ");
			System.out.println("1	NotePad");
			System.out.println("2	MS Word");
			System.out.println("3	Calculator");
			System.out.println("4	Command Prompt");
			System.out.println("5	Chrome");
			System.out.println("6	MS Excel");
			System.out.println("7	SnippingTool");
			System.out.println("8	Phone Dialer");
			System.out.println("Press 0 to close this program");
			while(true) {
			int sw = sc.nextInt();
				switch(sw) {
				case 1 : r.exec("notepad.exe");	break;	// To open NotePad in Window
				case 2 : r.exec("C:\\Program Files\\Microsoft Office\\Office12\\winword.exe");	break;
				case 3 : r.exec("calc.exe"); break;
				case 4 : r.exec("cmd.exe /c start"); break;
				case 5 :
					String path = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
					try {
						r.exec(path);
					}
					catch (java.io.IOException e) {
						System.out.println("64-bit Chrome not found. Trying 32-bit.");
						try {
							r.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
						}
						catch (java.io.IOException f) {
							System.out.println("Could not find Chrome, user either does not have it installed, or it is installed in an atypical location."); break;
						}
						System.out.println("Have a patience! Chrome is opening...");	
					}
							break;
				case 6 : r.exec("C:\\Program Files\\Microsoft Office\\Office12\\EXCEL.exe");	break;
				case 7 : r.exec("C:\\Windows\\System32\\SnippingTool.exe"); break;
				case 8 : r.exec("C:\\Windows\\System32\\dialer.exe"); break;
				case 0 : System.exit(0); break;
				default : System.out.println("Enter valid number!");
				}
			}
		}

		catch (Exception e) {
			System.out.println(e);
		}

	}
}
