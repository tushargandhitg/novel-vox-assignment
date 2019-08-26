package novel.vox.assignment.enums;

public enum Month {

	INVALID("Invalid", "Invalid Value"), 
	JAN("Jan", "January"),
	FEB("Feb", "Feburary"),
	MAR("Mar", "March"),
	APR("April", "April"),
	MAY("May", "May"),
	JUNE("June", "June"),
	JULY("July", "July"),
	AUG("Aug", "August"),
	SEPT("Sept", "September"),
	OCT("Oct", "October"),
	NOV("Nov", "November"),
	DEC("Dec", "December")
	
	;

	private String shortHandNotation;
	private String description;

	Month(String shortHandNotation, String description) {
		this.description = description;
		this.shortHandNotation = shortHandNotation;
	}

	public String getShortHandNotation() {
		return shortHandNotation;
	}

	public String getDescription() {
		return description;
	}

	public static Month getFromShortHandNotation(String inputNotation) {

		switch (inputNotation) {
		case "Jan":
		case "JAN":
			return JAN;

		case "Feb":
		case "FEB":
			return FEB;

		case "April":
		case "APRIL":
			return APR;

		case "May":
		case "MAY":
			return MAY;

		case "June":
		case "JUNE":
			return JUNE;

		case "July":
		case "JULY":
			return JULY;

		case "Aug":
		case "AUG":
			return AUG;

		case "Sept":
		case "SEPT":
			return SEPT;

		case "Oct":
		case "OCT":
			return OCT;

		case "Nov":
		case "NOV":
			return NOV;

		case "Dec":
		case "DEC":
			return DEC;

		default:
			return INVALID;
		}

	}
	
	
}
