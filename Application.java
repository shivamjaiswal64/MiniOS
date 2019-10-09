import java.util.*;
class Application{
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		try{
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
			while(true){
			int sw = sc.nextInt();
			switch(sw){
				case 1 : r.exec("notepad.exe"); break;	// To open NotePad in Window
				case 2 : r.exec("C:\\Program Files\\Microsoft Office\\Office12\\winword.exe");	break;
				case 3 : r.exec("calc.exe");	break;
				case 4 : r.exec("new String[] {"cmd", "/K", "Start"}");	System.out.println("It might not open");	break;
				case 5 : r.exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");	
						 System.out.println("Have a patience! Chrome is opening...");	break;
				case 6 : r.exec("C:\\Program Files\\Microsoft Office\\Office12\\EXCEL.exe");	break;
				case 7 : r.exec("C:\\Windows\\System32\\SnippingTool.exe"); break;
				case 8 : r.exec("C:\\Windows\\System32\\dialer.exe");	break;
				case 0 : System.exit(0);
				default : System.out.println("Enter valid number!");
			}
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
