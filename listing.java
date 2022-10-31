import java.util.ArrayList;


public class listing {
    private int listingId = 1;
	private int appointmentCount ;
	private String address;
	private int squareFt;
	private int numBed;
	private int numBath;
	private appointment apt;
	private ArrayList<appointment> appointments;
	
	
	public listing(String address, int squareFt, int numBed, int numBath) {
		listingId ++;
		address = this.address;
		squareFt = this.squareFt;
		numBed = this.numBed;
		numBath = this.numBath;
		appointments = new ArrayList<appointment>();
		appointmentCount = 0;
	}


	public String getAppointments() {
		String display = "";
		for(int i = 0; i <appointments.size(); i++) {
			display = appointments.get(i).toString();
		}
		return display;
	}
	
	
	public boolean creatAppointment(String date, int duration) {
		apt = new appointment(date, duration);
		appointments.add(apt);
		
		int flag = 0;
	    if (appointmentCount == 0) {
	      appointments.add(apt);
	      appointmentCount++;
	      return true;
	    } else {
	      for (int cnt = 0; cnt < appointments.size(); cnt++) {
	        if ((appointments.get(cnt).getEnd()).compareTo(apt.getDate()) < 0) {
	          flag = 1;
	        }
	      }
	      if (flag == 1) {
	    	  appointments.add(apt);
	        return true;
	      }
	    }
	    return false;
	  }
	


	public int getListingId() {
		return listingId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSquareFt() {
		return squareFt;
	}


	public void setSquareFt(int squareFt) {
		this.squareFt = squareFt;
	}


	public int getNumBed() {
		return numBed;
	}


	public void setNumBed(int numBed) {
		this.numBed = numBed;
	}


	public int getNumBath() {
		return numBath;
	}


	public void setNumBath(int numBath) {
		this.numBath = numBath;
	}
}
