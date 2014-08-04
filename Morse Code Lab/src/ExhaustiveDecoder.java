import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import edu.neumont.nlp.DecodingDictionary;

public class ExhaustiveDecoder {
	DecodingDictionary dictionary;
	List<Sentence> possibilities = new ArrayList<Sentence>();
	Set<String> codes;
	public ExhaustiveDecoder(DecodingDictionary dd, int i) {
		this.dictionary = dd;
		codes = dictionary.getCodes();
	}

	// Is this one recursive?
	public List<String> decode(String message) {
		List<String> result = null;
		recursiveDecoder(new Sentence(), message);
		return result;
	}

	public void recursiveDecoder(Sentence decodedMessage, String toGo) {
		if(toGo.length() <= 0){
			possibilities.add(decodedMessage);
		}
		else
		{
		
		
		dictionary.frequencyOfFollowingWord("", after)
			
		Set<String> words = dictionary.getWordsForCode(toGo);
		
		System.out.println(words.size());
		for(int i = 0; i < words.size(); i++)
		{
			System.out.println(words);
		}
		}		
	}
	
	public String getWord(string morseCode){
		
	}
}
