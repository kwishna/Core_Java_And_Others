package jackson;

import LearnGson.JsonLearn;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Jackson Read/Write Json
 * Jackson Read/Write Xml.
 */
public class JacksonJson {

// 	https://www.journaldev.com/2324/jackson-json-java-parser-api-example-tutorial
	public static void main(String[] args) throws IOException {

//		ObjectMapper mapper = new ObjectMapper(JsonFactory.builder().build());
		ObjectMapper mapper = new ObjectMapper();

		JsonNode node = mapper.readTree(new File("jsonOne.json"));
		System.out.println(node);

		//converting json to Map
		byte[] mapData = Files.readAllBytes(Paths.get("data.txt"));
		HashMap myMap;
		myMap = mapper.readValue(mapData, HashMap.class);
		System.out.println("Map is: " + myMap);

		//another way
		myMap = mapper.readValue(mapData, new TypeReference<HashMap<String, String>>() {
		});
		System.out.println("Map using TypeReference: " + myMap);

		//read JSON like DOM Parser
		JsonNode rootNode = mapper.readTree("{\n" +
				"  \"name\": \"krishna Kumar Singh\",\n" +
				"  \"tech\": [\"Java\", \"Python\", \"javaScript\"],\n" +
				"  \"education\" : {\n" +
				"    \"primary\" : \"School\",\n" +
				"    \"srsec\" : \"Same School\",\n" +
				"    \"high\" : \"Different\"\n" +
				"  }\n" +
				"}");
		JsonNode idNode = rootNode.path("name"); // Getting Elements From Nodes
		System.out.println("id = " + idNode.asText());

		JsonNode phoneNosNode = rootNode.path("education");
		Iterator<JsonNode> elements = phoneNosNode.elements();
		while (elements.hasNext()) {
			JsonNode phone = elements.next();
			System.out.println("Edu = " + phone.asText());
		}

		// Edit A Node :-
		byte[] jsonData = Files.readAllBytes(Paths.get("employee.txt"));

		ObjectMapper objectMapper = new ObjectMapper();

		//create JsonNode
		JsonNode rootNod = objectMapper.readTree(jsonData);

		//update JSON data
		((ObjectNode) rootNod).put("id", 500);

		//add new key value
		((ObjectNode) rootNod).put("test", "test value");

		//remove existing key
		((ObjectNode) rootNod).remove("role");
		((ObjectNode) rootNod).remove("properties");
		objectMapper.writeValue(new File("updated_emp.txt"), rootNod);

		System.out.println("****************************************************");

		//create JsonParser object
		JsonParser jsonParser = new JsonFactory().createParser(new File("employee.txt"));
		while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
			String name = jsonParser.getCurrentName();
			// codes ... To Use Value
		}

		JsonNode node1 = mapper.createObjectNode();
		JsonNode node2 = JsonNodeFactory.instance.objectNode();
		JsonNode node3 = mapper.convertValue(Files.readAllBytes(Paths.get("data.txt")), JsonNode.class);
		

	}
/*			public void main() throws IOException {
				Employee emp = JacksonObjectMapperExample.getClass();

				JsonGenerator jsonGenerator = new JsonFactory()
						.createGenerator(new FileOutputStream("stream_emp.txt"));
				//for pretty printing
				jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());

				jsonGenerator.writeStartObject(); // start root object
				jsonGenerator.writeNumberField("id", emp.getId());
				jsonGenerator.writeStringField("name", emp.getName());
				jsonGenerator.writeBooleanField("permanent", emp.isPermanent());

				jsonGenerator.writeObjectFieldStart("address"); //start address object
				jsonGenerator.writeStringField("street", emp.getAddress().getStreet());
				jsonGenerator.writeStringField("city", emp.getAddress().getCity());
				jsonGenerator.writeNumberField("zipcode", emp.getAddress().getZipcode());
				jsonGenerator.writeEndObject(); //end address object

				jsonGenerator.writeArrayFieldStart("phoneNumbers");
				for(long num : emp.getPhoneNumbers())
					jsonGenerator.writeNumber(num);
				jsonGenerator.writeEndArray();

				jsonGenerator.writeStringField("role", emp.getRole());

				jsonGenerator.writeArrayFieldStart("cities"); //start cities array
				for(String city : emp.getCities())
					jsonGenerator.writeString(city);
				jsonGenerator.writeEndArray(); //closing cities array

				jsonGenerator.writeObjectFieldStart("properties");
				Set<String> keySet = emp.getProperties().keySet();
				for(String key : keySet){
					String value = emp.getProperties().get(key);
					jsonGenerator.writeStringField(key, value);
				}
				jsonGenerator.writeEndObject(); //closing properties
				jsonGenerator.writeEndObject(); //closing root object

				jsonGenerator.flush();
				jsonGenerator.close();
			}*/

}
