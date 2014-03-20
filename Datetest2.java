import java.util.Scanner;

import javax.swing.JOptionPane;


public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean exit = true;
		// TODO Auto-generated method stub
		try
			{
				do
					{
					exit=true;
					int day1=Integer.parseInt(JOptionPane.showInputDialog("1=> Please enter the day"));
					int day2=Integer.parseInt(JOptionPane.showInputDialog("2=> Please enter the day"));
					if((day1<32 && 0<day1) && (day2<32 && 0<day2))
					{
						do
						{
							exit=true;
							int mounth1=Integer.parseInt(JOptionPane.showInputDialog("1=> Please enter the mounth"));
							int mounth2=Integer.parseInt(JOptionPane.showInputDialog("2=> Please enter the mounth"));
							if((mounth1<13 && 0<mounth1) && (mounth1<13 && 0<mounth1))
							{
								do
									{
									exit=true;
									int year1=Integer.parseInt(JOptionPane.showInputDialog("1=> Please enter the year"));
									int year2=Integer.parseInt(JOptionPane.showInputDialog("2=> Please enter the year"));
									if(year1<0 && year2<0)
									{
										exit=false;
									}//saidaltıntop
									else
									{
											Date2 mydate1=new Date2(day1,mounth1,year1);
											JOptionPane.showMessageDialog(null,mydate1.getDate());
											Date2 mydate2=new Date2(day2,mounth2,year2);
											JOptionPane.showMessageDialog(null,mydate2.getDate());					
											if(mydate1.isBigger(mydate2)==true)
											{
												JOptionPane.showMessageDialog(null,"2.date is bigger than 1.date..");
											}
											else
											JOptionPane.showMessageDialog(null,"1.date is bigger than 2.date..");
									}
									}while(exit==false);
							}
							else
							{
								exit=false;
								JOptionPane.showMessageDialog(null, "Wrong vaule!! Please enter a value between 1 and 12..");
							}
							}while(exit==false);
					}
					else
					{
						exit=false;
						JOptionPane.showMessageDialog(null, "ERROR!! Wrong vaule!! Please enter a value between 1 and 31..");
					}
				}while(exit==false);
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERROR!! Wrong entery!! Good bye..");
		}

	}
}
