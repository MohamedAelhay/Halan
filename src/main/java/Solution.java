import java.util.ArrayList;

public class Solution {
    public static void main(String[] args){

        System.out.println("Problem 1: Palindrome String Test");
        PalindromeSolution palindrome = new PalindromeSolution();
        System.out.println("Test 1: " + palindrome.isPalindrome("anna"));
        System.out.println("Test 2: " + palindrome.isPalindrome("apple"));

        System.out.println();

        System.out.println("Problem 2: Linux Command to Change File Name");
        System.out.println("Test 1: mv original.txt changed.txt");

        System.out.println();

        System.out.println("Problem 3: String Compression");
        StringCompressionSolution stringCompression = new StringCompressionSolution();
        System.out.println("Test 1: " + stringCompression.runLengthEncode("aaaaaaaaaabbbaxxxxyyyzyx"));
        System.out.println("Test 2: " + stringCompression.runLengthDecode("a10b3a1x4y3z1y1x1"));

        System.out.println();

        System.out.println("Problem 4: Compose");
        ComposeFunction compose = new ComposeFunction();
        System.out.println("Test 1: " + compose.h(6));

        System.out.println();

        System.out.println("Problem 5: Compose");
        UniqueValues uniqueValues = new UniqueValues();
        System.out.println("Test 1: " + uniqueValues.removeDuplicates(new String[]{"Apples", "Oranges", "Flowers", "Apples"}));
        System.out.println("Test 2: " + uniqueValues.removeDuplicates(new String[]{"Apples", "Apples"}));

        System.out.println();

        System.out.println("Problem 6: Compose");
        Transpose transpose = new Transpose();
        int[][] matrix = {{1,2},
                          {3,4}};
        System.out.println("Test 1: " + transpose.transpose(matrix, 2, 2));

        System.out.println();

        System.out.println("Problem 7: Containers");
        System.out.println("Step One: empty Container A");
        System.out.println("Step Two: put all water from Container B to Container A");
        System.out.println("Step Three: Fill Container B again to the max");
        System.out.println("Step Four: put all water from Container B to Container A");
        System.out.println("Step Five: Now you have Container A filled and Container B has only 1 Liter");
        System.out.println("Step Six: empty Container A");
        System.out.println("Step Seven: put THE ONE LITER of water from Container B to Container A");
        System.out.println("Step Eight: Fill Container B again to the max");
        System.out.println("Final Step: put all water from Container B to Container A and now you have 4 liters in Container A");

        System.out.println();

        System.out.println("Problem 8: FirstDuplicateIndex");
        DuplicateIndex duplicateIndex = new DuplicateIndex();
        System.out.println("Test 1: " + duplicateIndex.indexOfFirstIndex(new int[]{5, 17, 3, 17, 4, -1}));
        System.out.println("Time Complexity: O(n) in worst case");
        System.out.println("Space Complexity: O(n) in worst case");

        System.out.println();

        System.out.println("Problem 9: Tree Structure");
        Tree tree = new Tree();
        Node root = new Node(10);
        root.getNodes().add(new Node(11));
        root.getNodes().add(new Node(12));
        System.out.println("Test 1: " + tree.sum(root));
    }
}
