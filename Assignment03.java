/**
 * 
 */
import javax.swing.JOptionPane;
/**
 * 
 * @author brendanmcauliffe
 *
 */
public enum Assignment03 {Admin, Student, Staff, Adam, Scott, Sam, pass123, password, word123 ;
	
	 public static void main(String[] args) {
	int tries = 0;
	int total = 3;	
	int index;
	     Assignment03[] choices = { Assignment03.Admin, Assignment03.Student, Assignment03.Staff};
		 String[] usernames = { "Adam", "Scott", "Sam"};
		 String[] passwords = { "pass123", "password", "word123"};
		 
	 //initiates loop
		while (tries<total) {	 
		if (tries == total){
			JOptionPane.showMessageDialog(null, "Contanct administrator");
			total++; 
		}
		else {
		//Askes for username
			String uinput = JOptionPane.showInputDialog("Please enter username");
			for(index=0;index<usernames.length;index++) {
				System.out.println(uinput);
			if (uinput.equals(usernames[index])){
		//askes for password	
			String pinput = JOptionPane.showInputDialog("Please enter password");
				
			if  ( uinput.equals(usernames[index]) && pinput.equals(passwords[index])) {
				Assignment03 input = (Assignment03) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
				while (input!=null) { 
		         //Fill in switch case code below to check for account type and return appropriate Welcome message
						switch(input){ 
				 			case Admin: 
								JOptionPane.showMessageDialog( null, "Welcome Admin! You can update and read file.");
				 				break;
				 			case Student: 
				 				JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
				 				break;		
							case Staff: 
				 				JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file.");
				 				break;
									}
							}
	 				input = (Assignment03) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
				 }	
				 	}
				 	else
				 		tries++;
			}
				else
					tries++;
			}	
	}
	 }
	 }}
