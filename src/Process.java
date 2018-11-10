import java.util.Date;
import java.util.TimerTask;

public class Process extends TimerTask {
	int pID;//Process ID
	int task;//the task being perform
	int address;//position that the queue is at
	Date start;//double check this///should be the start time of the process
	Date end; //double check this///should be the end time of the process
	int attempts;///count of tries to lock the integer list///not sure what this means
	int sleepTime;//sleep time of the process between 1 and 5
	
	

	public Process(int pID, int task, int address, Date start, Date end, int attempts, int sleepTime) {
		super();
		this.pID = pID;
		this.task = task;
		this.address = address;
		this.start = start;
		this.end = end;
		this.attempts = attempts;
		this.sleepTime = sleepTime;
	}


	public Process() {
		super();
		this.pID = 0;
		this.task = 0;
		this.address = 0;
		this.start = new Date();
		this.end = new Date();
		this.attempts = 0;
		this.sleepTime = 0;
	}


	public int getpID() {
		return pID;
	}



	public void setpID(int pID) {
		this.pID = pID;
	}



	public int getTask() {
		return task;
	}



	public void setTask(int task) {
		this.task = task;
	}



	public int getAddress() {
		return address;
	}



	public void setAddress(int address) {
		this.address = address;
	}



	public Date getStart() {
		return start;
	}



	public void setStart(Date start) {
		this.start = start;
	}



	public Date getEnd() {
		return end;
	}



	public void setEnd(Date end) {
		this.end = end;
	}



	public int getAttempts() {
		return attempts;
	}



	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}



	public int getSleepTime() {
		return sleepTime;
	}



	public void setSleepTime(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	

	@Override
	public String toString() {
		return "Process [pID=" + pID + ", task=" + task + ", address=" + address + ", start=" + start + ", end=" + end
				+ ", attempts=" + attempts + ", sleepTime=" + sleepTime + "]";
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	

}
