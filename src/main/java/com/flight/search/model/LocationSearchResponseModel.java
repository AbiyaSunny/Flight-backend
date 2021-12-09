package com.flight.search.model;

	

	
	public class LocationSearchResponseModel {
		
		private String name;
		private String detailedName;
		private String iataCode;
		private String cityname;
		private String countryName;
		
		public LocationSearchResponseModel(String name, String detailedName, String iataCode, String cityname,
				String countryName) {
			super();
			this.name = name;
			this.detailedName = detailedName;
			this.iataCode = iataCode;
			this.cityname = cityname;
			this.countryName = countryName;
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public String getCityname() {
			return cityname;
		}
		public void setCityname(String cityname) {
			this.cityname = cityname;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDetailedName() {
			return detailedName;
		}
		public void setDetailedName(String detailedName) {
			this.detailedName = detailedName;
		}

		public String getIataCode() {
			return iataCode;
		}
		public void setIataCode(String iataCode) {
			this.iataCode = iataCode;
		}
		@Override
		public String toString() {
			return "LocationSearchResponseModel [name=" + name + ", detailedName=" + detailedName + ", iataCode="
					+ iataCode + ", cityname=" + cityname + ", countryName=" + countryName + "]";
		}
		
		
		
		
	}


