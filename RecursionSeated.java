public class Driver {
	public static void main(String args[]) {
		System.out.println(SeatGuest("       ",'1'));
	}
	public static int SeatGuest(String intable, char person) {
		int count = 0;
		String temptable;
		char[] seats;
		for (int i=0; i<intable.length();i++) {
			seats = intable.toCharArray();
			if (seats[i]>' ') {continue;}
			seats[i]=person;
			if (checkSeats(seats)) {
				if (person=='5') {
					System.out.println(String.valueOf(seats));
					count++;
				}
				else {
					temptable = String.valueOf(seats);
					count+=SeatGuest(temptable,(char)(person+1));
				}
			}
		}return count;
	}
	public static boolean checkSeats(char[] seats) {
		for(int i=0; i<seats.length-1;i++) {
			if ((seats[i]>='1' && seats[i]<='3')&&
				(seats[i+1]>='1' && seats[i+1]<='3')) {
				return false;
			}
			
			if ((seats[i]>='4' && seats[i]<='5')&&
					(seats[i+1]>='4' && seats[i+1]<='5')) {
					return false;
				}
		}return true;
				
	}
}