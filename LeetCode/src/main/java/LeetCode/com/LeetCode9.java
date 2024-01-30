package LeetCode.com;

public class LeetCode9 {

	public static void main(String[] args) {
		LeetCode9 leetCode9 = new LeetCode9();
		int x = 21;
		System.out.println(leetCode9.isPalindrome(x));
	}

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int reversed = 0;
		int temp = x;
		while (x != 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}
		return reversed == temp;
	}
}
