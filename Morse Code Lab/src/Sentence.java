import java.util.ArrayList;
import java.util.List;


public class Sentence {
	List<String> words;
	int quality = 0;
	int normalizationValue = 10000;
	
	public Sentence(){
		words = new ArrayList<String>();
	}
	
	public Sentence(List<String> words)
	{
		this.words = words;
	}
	
	public void setQuality(int quality){
		this.quality = quality;
	}
	
	public void addWord(String word)
	{
		words.add(word);
	}
	
	public String getAsSingleString()
	{
		String result = "";
		for(int i = 0; i < words.size(); i++){
			result += words.get(i) + " ";
		}
		return result;
	}
}
