
/**
 * Runs Gibberish.
 *
 * Jason Wheaton
 * V1 - October 11
 */
public class GibberishRunner
{
    // instance variables - replace the example below with your own
    
    public static void main()
    {
        WordList5000 wordList5000 = new WordList5000();
        Gibberish gibberish = new Gibberish();
        String s = gibberish.makeGibberish(wordList5000);
        
        
        system.out.println (s);
    }
}
