package cse12pa4student;

import java.util.List;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {

	List<Measurement> l = new List<Measurement>();
	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		if(toRun.equals("A")){
			long startTime = System.nanoTime();
			int time = stopN - startN;
			mysteryA(time);
			long estimatedTime = System.nanoTime() - startTime;
			Measurement x = Measurement(toRun, time ,estimatedTime);
		}

		if(toRun.equals("B")){
			long startTime = System.nanoTime();
			int time = stopN - startN;
			mysteryB(time);
			long estimatedTime = System.nanoTime() - startTime;
			Measurement x = Measurement(toRun, time ,estimatedTime);
		}

		if(toRun.equals("C")){
			long startTime = System.nanoTime();
			int time = stopN - startN;
			mysteryC(time);
			long estimatedTime = System.nanoTime() - startTime;
			Measurement x = Measurement(toRun, time ,estimatedTime);
		}
		
		if(toRun.equals("D")){
			long startTime = System.nanoTime();
			int time = stopN - startN;
			mysteryD(time);
			long estimatedTime = System.nanoTime() - startTime;
			Measurement x = Measurement(toRun, time ,estimatedTime);
		}

		if(toRun.equals("E")){
			long startTime = System.nanoTime();
			int time = stopN - startN;
			mysteryE(time);
			long estimatedTime = System.nanoTime() - startTime;
			Measurement x = Measurement(toRun, time ,estimatedTime);
		}

		if(toRun.equals("F")){
			long startTime = System.nanoTime();
			int time = stopN - startN;
			mysteryF(time);
			long estimatedTime = System.nanoTime() - startTime;
			Measurement x = Measurement(toRun, time ,estimatedTime);
		}
		list.add()

		//Example call to mystery method
		mysteryA(50);
		return null;
	}
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		return null;
	}
	
	/* Add any helper methods you find useful */
		
}
