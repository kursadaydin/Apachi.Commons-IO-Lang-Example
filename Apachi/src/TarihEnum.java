
public enum TarihEnum {
	FORMAT1("1","dd.MM.yyyy"),
	FORMAT2("2","dd-MM-yyyy"),
	FORMAT3("3","MM/dd/yyyy mm.HH");
	
	private String formatType;
	private String format;
	
	public String getFormatType() {
		return formatType;
	}

	public String getFormat() {
		return format;
	}

	private TarihEnum(String formatType, String format) {
		this.formatType = formatType;
		this.format = format;
	}
	
	
	

}
