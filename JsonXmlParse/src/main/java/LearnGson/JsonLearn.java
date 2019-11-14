package LearnGson;

import java.util.List;
import java.util.Map;

public class JsonLearn {


	String name;
	List<String> tech;
	Map<String, String> education;

	public List<String> getTech() {
		return tech;
	}

	public void setTech(List<String> tech) {
		this.tech = tech;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getEducation() {
		return education;
	}

	public void setEducation(Map<String, String> education) {
		this.education = education;
	}




}
