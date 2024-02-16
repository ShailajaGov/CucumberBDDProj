package learning;

import java.util.regex.Pattern;

public class RegularExpressions {
	public static void main(String[] args)
	{
		boolean matchStatus ;
		matchStatus = Pattern.matches(".*Shail.*","My name is Shailaja Govindu");
		matchStatus = Pattern.matches("[jJ]ava","Java");
		matchStatus = Pattern.matches(".ava","9ava");//dot can be any number, symbol or letter 
		Pattern.matches("[0-9]am","3am");
		
		System.out.println("Pattern  .*Shail.* matches My name is Shailaja Govindu :"+Pattern.matches(".*Shail.*","My name is Shailaja Govindu"));
	
		System.out.println("Pattern.matches(\"[jJ]ava\",\"Java\") "+Pattern.matches("[jJ]ava","Java"));
	
		System.out.println("Pattern.matches(\".ava\",\"9ava\") "+Pattern.matches(".ava","9ava"));
	
		System.out.println("Pattern.matches(\".ava\",\"@ava\") " +Pattern.matches(".ava","@ava"));
		
		System.out.println("Pattern.matches(\".ava\",\"Lava\");" +Pattern.matches(".ava","Lava"));
		System.out.println("Pattern.matches(\"[0-9]am\",\"3am\")"+Pattern.matches("[0-9]am","3am"));
		
		System.out.println("Pattern.matches(\"[a-z]et\", \"pet\")"+Pattern.matches("[a-z]et", "pet"));//first letter can anything between a-z small letters
		System.out.println("Pattern.matches(\"[a-zA-Z]et\", \"Set\") "+Pattern.matches("[a-zA-Z]et", "Set"));//first letter can be capital or small letter
		System.out.println("Pattern.matches(\"[^0-9]ot\",\"@ot\") "+Pattern.matches("[^0-9]ot","@ot"));//first letter should not be a number it can be alphabet or symbol
		System.out.println("Pattern.matches(\"s[^aeiou]t\", \"srt\")"+Pattern.matches("s[^aeiou]t", "srt"));//middle letter cannot be any of letters a e i o u
	}

}
