import java.util.List;
import java.util.Set;

import edu.neumont.nlp.DecodingDictionary;

public class ExhaustiveDecoder {
	DecodingDictionary dictionary;

	public ExhaustiveDecoder(DecodingDictionary dd, int i) {
		this.dictionary = dd;

	}

	// Is this one recursive?
	public List<String> decode(String message) {
		List<String> result = null;
		recursiveDecoder(message);
		return result;
	}

	public void recursiveDecoder(String message) {
		Set<String> codes = dictionary.getCodes();
		System.out.println(codes);
		Set<String> wordsForCode = dictionary.getWordsForCode(message);
		String[] words = (String[]) wordsForCode.toArray();
		for(int i = 0; i < words.length; i++)
		{
			System.out.println(words);
		}
		
	}
}
