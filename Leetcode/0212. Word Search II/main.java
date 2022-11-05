import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

    }

    public class TrieNode {
        public TrieNode[] children;
        public String word;

        TrieNode() {
            children = new TrieNode[26];
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, root, res);
            }
        }

        return res;
    }

    public TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode p = root;
            for (char ch : word.toCharArray()) {
                int i = ch - 'a';
                if (p.children[i] == null) {
                    p.children[i] = new TrieNode();
                }
                p = p.children[i];
            }
            p.word = word;
        }

        return root;
    }

    public void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char ch = board[i][j];

        if (ch == ';' || p.children[ch - 'a'] == null) {
            return;
        }
        p = p.children[ch - 'a'];
        if (p.word != null) {
            res.add(p.word);
            p.word = null;
        }

        board[i][j] = ';';
        if (i > 0) {
            dfs(board, i - 1, j, p, res);
        }
        if (j > 0) {
            dfs(board, i, j - 1, p, res);
        }
        if (i < board.length - 1) {
            dfs(board, i + 1, j, p, res);
        }
        if (j < board[0].length - 1) {
            dfs(board, i, j + 1, p, res);
        }
        board[i][j] = ch;
    }
}