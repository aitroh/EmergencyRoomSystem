package magallanes;

public class Patient implements Comparable<Patient>{
	String name;
	int priority;
	String condition;
	String arrivalTime;

	public Patient(String name, int priority, String condition, String arrivalTime) {
		this.name = name;
		this.priority = priority;
		this.condition = condition;
		this.arrivalTime = arrivalTime;
	}

	public int compareTo(Patient other) {

		if (this.priority < other.priority) {
			return -1;
		} else if (this.priority > other.priority) {
			return 1;
		} else {
			return this.arrivalTime.compareTo(other.arrivalTime);
		}
	}

	@Override
	public String toString() {
		return "[P" + priority + "] " + name + " - " + condition + " (" + arrivalTime + ")";
	}
}
