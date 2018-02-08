package be.vdab.valueobjects;

public final class Adres {
	private final String straat;
	private final String huisnummer;
	private final String busnummer;
	private final String postcode;
	private final String gemeente;
	

	public Adres(String straat, String huisnummer, String busnummer, String postcode, String gemeente) {
		if(entryValid(straat) && entryValid(huisnummer) && entryValid(busnummer) &&
				entryValid(straat) && entryValid(gemeente)) {
			this.straat = straat;
			this.huisnummer = huisnummer;
			this.busnummer = busnummer;
			this.postcode = postcode;
			this.gemeente = gemeente;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getStraat() {
		return straat;
	}

	
	public String getHuisnummer() {
		return huisnummer;
	}

	public String getBusnummer() {
		return busnummer;
	}

	public String getPostcode() {
		return postcode;
	}

	public String getGemeente() {
		return gemeente;
	}

	private boolean entryValid(String entry) {
		return entry != null && !entry.trim().isEmpty();
	}

}
