package magallanes;

import java.util.*;

public class ERQueue {

	PriorityQueue<Patient> q = new PriorityQueue<>();

	public void arrive(String name, int priority, String condition, String time) {

		Patient patient = new Patient(name, priority, condition, time);

		q.add(patient);

	}

	public void treatNext() {
		if (q.isEmpty()) {
			System.out.print("No Patients");
		} else {
			Patient treated = q.poll();
			System.out.print("Patients are now being treated!" + "\n");
			System.out.print("Treated: " + treated);
			System.out.println();
		}

	}

	public void displayQueue() {
		System.out.println("=== UPDATED QUEUE ===");
		System.out.print("Patients Waiting: " + q.size() );
		System.out.println();
		
		List<Patient> sortedList = new ArrayList<>(q);
		Collections.sort(sortedList);
		for (int i = 0; i < sortedList.size(); i++) {
			System.out.println((i + 1) + ". " + sortedList.get(i));
		}
	}
}