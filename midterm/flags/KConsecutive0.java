package midterm.flags;

import java.io.*;
import java.util.*;

public class KConsecutive0 {
	private static List<String> generateBinaryStrings(int N, int K) {
		List<String> result = new ArrayList<>();
		backtrack(result, new StringBuilder(), N, K, 0, 0);
		return result;
	}

	private static void backtrack(List<String> result, StringBuilder sb, int N, int K, int start, int count) {
		if (sb.length() == N) {
			if (count == K) {
				result.add(sb.toString());
			}
			return;
		}
		for (int i = N; i > 0; i--) {
			sb.append('0');
			backtrack(result, sb, N, K, i - 1, count + 1);
			sb.deleteCharAt(sb.length() - 1);
			sb.append('1');
			backtrack(result, sb, N, K, i - 1, count);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

	private static void writeToFile(List<String> binaryStrings, String filename) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			writer.write(binaryStrings.size() + "\n");
			for (String binaryString : binaryStrings) {
				writer.write(binaryString.join(" ", binaryString.split(" ")) + "\n");
			}
		}catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String string[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = scanner.nextInt();
		System.out.println("Enter K: ");
		int K = scanner.nextInt();
		scanner.close();
		List<String> binaryStrings = generateBinaryStrings(N, K);
		System.out.println(binaryStrings.toString());
		writeToFile(binaryStrings, "result.out");
	}
}
