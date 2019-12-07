package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				index = i;
				break;
			}
		}
		return index;
	}

	public static int countPearls(List<Boolean> oysters) {
		int index = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				index++;
			}
		}
		return index;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> message) {
		boolean bool = false;
		String SOS = "... --- ...";
		int numOfStrings = 1;
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i) == "/") {
				numOfStrings++;
			}
		}
		for (int i = 0; i <= numOfStrings; i++) {
			if (message.get(i).contains(SOS)) {
				bool = true;
				break;
			}
		}
		return bool;
	}

	public static Double sortScores(List<Double> results) {
		double doub = 0.0;
		
		results.sort(c);
		return doub;
	}
	
	
	
	
	
	
	
	
	
}
