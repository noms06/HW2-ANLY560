public class FirstCode {
	public static void main(String[] args) {
		float grade1 = 91.14f;
		float grade2 = 85.01f;
		float grade3 = 72.00f;
		float grade4 = 63.00f;
		float grade5 = 81.14f;
		System.out.println(grade1);
		float grades[] = {grade1,grade2,grade3,grade4,grade5};
		int sum = 0;
		for (float d : grades) sum += d;
		double average = 1.0d * sum / grades.length;
		System.out.println("Average value of array element is "  + average);
		int avg = (int)average;
		if(avg>90 & avg<100) {
		      System.out.println( " A: Fantastic Job ! " );
		} else if (avg>80 & avg<89.99) {
			System.out.println( " B: Good ! " );
		} else if (avg>70 & avg<79.99) {
			System.out.println( " C: Please Try More Next Time ! " );
		} else {
			System.out.println( " F: Unfortunately You Failed! " );
		}
		
		String finalgrade ="C";
		switch ( finalgrade )
		  {
		    case "A":
		    	System.out.println( " A: Fantastic Job ! " );
		      break ;
		    case "B":
		    	System.out.println( " B: Good ! " );
		      break ;
		    case "C":
				System.out.println( " C: Please Try More Next Time ! " );
		      break ;
		    case "D":
				System.out.println(" F: Unfortunately You Failed! ");
		      break ;
		    default :
		      System.out.println( " Invalid grade " );

		}
	}
}


