package CSV;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CSVLearn {

	public static void main(String[] args) throws IOException, CsvException {

		Reader r = Files.newBufferedReader(Paths.get(System.getProperty("user.dir")+"\\sample.csv"));
		CSVReader reader = new CSVReaderBuilder(r)
				.withErrorLocale(Locale.ENGLISH)
//				.withCSVParser(new CSVParser(char separator, char quotechar, char escape, boolean strictQuotes, boolean ignoreLeadingWhiteSpace, boolean ignoreQuotations, CSVReaderNullFieldIndicator nullFieldIndicator, Locale errorLocale))
				.build();
		CSVReader reader1 = new CSVReader(r);
		List<String[]> rows = reader.readAll();
		reader.readAll().forEach(a -> {
			Arrays.asList(a).forEach(b -> {
				System.out.print(b);
				System.out.print(", ");
			});
			System.out.println(", ");
		});
		System.out.println("********************************************");

//		FileWriter appender = new FileWriter("sample.csv", true);

		CSVWriter write = new CSVWriter(Files.newBufferedWriter(Paths.get(System.getProperty("user.dir")+"\\sample.csv")));
		String[] row = new String[]{"6","FirstName6","LastName6","60000"};
		write.writeNext(row);

		List<String[]> rowss = new ArrayList<String[]>();
		rows.add(new String[]{"10","FirstName10","LastName10","100000"});
		rows.add(new String[]{"11","FirstName11","LastName11","110000"});
		rows.add(new String[]{"12","FirstName12","LastName12","120000"});
		rows.add(new String[]{"13","FirstName13","LastName13","130000"});
		write.writeAll(rowss);

		write.flush();
		write.close();
	}
}
