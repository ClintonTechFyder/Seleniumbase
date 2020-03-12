package Signupforms;

import java.util.ArrayList;

public class SignUpPageRec {

	private String firstName;
	private String lastName;
	private String countryCode;
	private String phoneNumber;
	public String email;

	public SignUpPageRec(String firstName, String lastName, String countryCode, String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static class Employer {

		public boolean contactByPhone;
		public boolean contactByEmail;
		public String companyName;
		public String companyWebsite;
		public String companyAddress;
		public String aboutCompany;
		
		public Employer() {
		}

		public boolean isContactByPhone() {
			return contactByPhone;
		}

		public void setContactByPhone(boolean contactByPhone) {
			this.contactByPhone = contactByPhone;
		}

		public boolean isContactByEmail() {
			return contactByEmail;
		}

		public void setContactByEmail(boolean contactByEmail) {
			this.contactByEmail = contactByEmail;
		}

		public String getCompanyName() {
			return companyName;
		}

		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}

		public String getCompanyWebsite() {
			return companyWebsite;
		}

		public void setCompanyWebsite(String companyWebsite) {
			this.companyWebsite = companyWebsite;
		}

		public String getCompanyAddress() {
			return companyAddress;
		}

		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}

		public String getAboutCompany() {
			return aboutCompany;
		}

		public void setAboutCompany(String aboutCompany) {
			this.aboutCompany = aboutCompany;
		}

	}


	public static class Contractor {
		public String country;
		public String city;
		public String jobTitle;
		public int yearsExperince;
		public String website;
		public String overview;
		public ArrayList<String> skills = new ArrayList<String>();
		public String professionalCertifications;

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getJobTitle() {
			return jobTitle;
		}

		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}

		public int getYearsExperince() {
			return yearsExperince;
		}

		public void setYearsExperince(int yearsExperince) {
			this.yearsExperince = yearsExperince;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public String getOverview() {
			return overview;
		}

		public void setOverview(String overview) {
			this.overview = overview;
		}

		public ArrayList<String> getSkills() {
			return skills;
		}

		public void setSkills(ArrayList<String> skills) {
			this.skills = skills;
		}

		public String getProfessionalCertifications() {
			return professionalCertifications;
		}

		public void setProfessionalCertifications(String professionalCertifications) {
			this.professionalCertifications = professionalCertifications;
		}
	}

}
