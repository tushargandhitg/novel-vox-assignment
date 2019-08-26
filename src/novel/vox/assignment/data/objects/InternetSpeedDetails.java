package novel.vox.assignment.data.objects;

import java.util.HashMap;
import java.util.Map;

import novel.vox.assignment.enums.Month;

public class InternetSpeedDetails {

	private String serviceProvider;
	private Map<Month, Float> monthlyAverageDetails;

	private InternetSpeedDetails() {
	}

	public String getServiceProvider() {
		return serviceProvider;
	}

	public Map<Month, Float> getMonthlyAverageDetails() {
		return monthlyAverageDetails;
	}

	public static InternetSpeedDetails build(String[] row) {
		InternetSpeedDetails details = new InternetSpeedDetails();
		details.serviceProvider = row[0];
		details.monthlyAverageDetails = getMonthlyAverageDetails(row);
		return details;
	}

	private static Map<Month, Float> getMonthlyAverageDetails(String[] row) {
		Map<Month, Float> average = new HashMap<>();
		average.put(Month.JAN, Float.valueOf(row[1]));
		average.put(Month.FEB, Float.valueOf(row[2]));
		average.put(Month.MAR, Float.valueOf(row[3]));
		average.put(Month.APR, Float.valueOf(row[4]));
		average.put(Month.MAY, Float.valueOf(row[5]));
		average.put(Month.JUNE, Float.valueOf(row[6]));
		average.put(Month.JULY, Float.valueOf(row[7]));
		average.put(Month.AUG, Float.valueOf(row[8]));
		average.put(Month.SEPT, Float.valueOf(row[9]));
		average.put(Month.OCT, Float.valueOf(row[10]));
		average.put(Month.NOV, Float.valueOf(row[11]));
		average.put(Month.DEC, Float.valueOf(row[12]));
		return average;
	}
}
