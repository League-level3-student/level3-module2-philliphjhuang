package _02_More_Algorithms;

import java.util.Collections;
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

	public static List<Double> sortScores(List<Double> results) {
		for(int i = 0; i < results.size(); i++) {
			for(int j = i; j>0 ;j--) {
				if(results.get(j)<results.get(j-1)) {
					Collections.swap(results,j,j-1);
				}
			}
		}
		return results;
	}
	
	public static List<String> sortDNA(List<String> unsortedSequences){
		for(int i = 0; i < unsortedSequences.size();i++) {
			for(int j = i; j > 0; j--) {
				if(unsortedSequences.get(j).length()<unsortedSequences.get(j-1).length()) {
					Collections.swap(unsortedSequences, j, j-1);
				}
			}
		}
		return unsortedSequences;
	}
	
	public static List<String> sortWords(List<String> words) {
		for(int i = 0; i < words.size();i++) {
			for(int j = i; j > 0; j--) {
				if(words.get(j).compareTo(words.get(j-1))<0) {
					Collections.swap(words, j, j-1);
				}
			}
		}
		return words;
	}
}
