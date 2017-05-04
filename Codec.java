package leetCode;

import java.net.URL;
import java.util.HashMap;
import java.util.Random;

/*
 * https://leetcode.com/problems/encode-and-decode-tinyurl/#/description
 * TinyURL is a URL shortening service where you enter a URL such as 
 * https://leetcode.com/problems/design-tinyurl and it returns a short
 *  URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. 
There is no restriction on how your encode/decode algorithm should 
work. You just need to ensure that a URL can be encoded to a tiny URL
 and the tiny URL can be decoded to the original URL.
 */
public class Codec {
	static HashMap<String, String> UrlMap = new HashMap<>();
	
public static String encode(String longUrl) {
    
	Random  randomGen = new Random();
	long ran= Math.abs(randomGen.nextLong());
	String random = ran+"";
	
	while(UrlMap.containsKey(random))
	{
		ran= Math.abs(randomGen.nextLong());
		random = ran+"";
	
	}
	UrlMap.put("http://tinyurl.com/"+random, longUrl);
	return "http://tinyurl.com/"+random;
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
    	return UrlMap.get(shortUrl);
        
    }
    public static void main(String[] args) {
    	String encode = encode("https://leetcode.com/problems/encode-and-decode-tinyurl/#/description");
    	System.out.println(encode);
    	System.out.println(decode(encode));
    }
}
