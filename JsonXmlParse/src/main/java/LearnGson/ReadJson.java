package LearnGson;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJson {

	public static void main(String[] args) throws IOException {

		// Ways To Create Object
		Gson gson = new Gson();
		Gson gson1 = new GsonBuilder().setPrettyPrinting().create();

		// De-serialization 1
		JsonReader r = new JsonReader(Files.newBufferedReader(Paths.get(System.getProperty("user.dir")+"\\jsonOne.json")));
		JsonLearn s1 = gson.fromJson(r, JsonLearn.class);
		System.out.println("De-Serialization 1 : "+s1.getEducation());

		// De-serialization 2
		String randomJson = "{\n" +
				"  \"name\": \"krishna Kumar Singh\",\n" +
				"  \"tech\": [\"Java\", \"Python\", \"javaScript\"],\n" +
				"  \"education\" : {\n" +
				"    \"primary\" : \"School\",\n" +
				"    \"srsec\" : \"Same School\",\n" +
				"    \"high\" : \"Different\"\n" +
				"  }\n" +
				"}";
		JsonLearn s2 = gson.fromJson(randomJson, JsonLearn.class);
		System.out.println("De-Serialization 2 : "+s2.getEducation());

		// De-serialization 3
		JsonLearn s3 = gson.fromJson(randomJson, new TypeToken<JsonLearn>(){}.getType());
		System.out.println("De-Serialization 3 : "+s3.education);

		// Serialization 1
		JsonObject e = new JsonObject();
		e.addProperty("name", "Krishna");
			JsonArray arr = new JsonArray();
			arr.add("School");
			arr.add("College");
			arr.add("University");
		e.add("edu", arr);

		String s4 = gson1.toJson(e);
		System.out.println("Serialization 1 : "+s4);

		// Serialization 2
		String js = gson1.toJson(s1);
		System.out.println("Serialization 2 : "+js);

		// Serialization 3
		Writer w = Files.newBufferedWriter(Paths.get("Serial.json"));
		w.write(js);
		w.close();

		// Pretty Printing
		JsonElement parse = JsonParser.parseString(js);
		System.out.println("Pretty Print : "+gson1.toJson(parse));
	}
}
