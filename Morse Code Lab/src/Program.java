import java.util.List;

import edu.neumont.nlp.DecodingDictionary;

public class Program {
	public static void main(String[] args) {
		// First Message:
		decode("....-.-.-.---..--.-..--..-...--..-.........");
		decode("-.....-.-.----.........-----.-.-.-...-.--.");
		decode(".--..-...-..-..----..");
		decode(".--.-...--..-.-.--.-.----.");

		// Star Wars
		decode("...----.-.---..-.-...-..--......-.");
	}

	public static <T> void printList(List<T> list) {
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(i + ": " + list.get(i));
			}
		}
		else
		{
			System.out.println("List == null");
		}
	}

	public static void decode(String message) {
		System.out.println("Decoding: " + message);

		DecodingDictionary dd = new DecodingDictionary();
		ExhaustiveDecoder decoder = new ExhaustiveDecoder(dd, 100);
		List<String> possibilities = decoder.decode(message);
		System.out.println("Possibilities:");
		printList(possibilities);
	}
}
