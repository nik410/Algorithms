class Solution {
    public boolean exi(char[][] board, String word, int x, int y, int index){
          if(index == word.length()){          
            return true;        
        } 
        
        if( x < 0 || x == board.length || y < 0 || y == board[0].length || board[x][y] != word.charAt(index)){
            return false;
        }

             
          boolean left = false, right = false, down = false, up = false;
            
        char ch = board[x][y]; 
         board[x][y] = '#';
       
            left = exi(board, word, x - 1, y, index + 1);
              
            right = exi(board, word, x + 1, y, index + 1);
           
            up = exi(board, word, x, y - 1, index + 1);
            
            down = exi(board, word, x, y + 1, index + 1);
          
          board[x][y] = ch;

        return (left || right || down || up);
    }

    public boolean exist(char[][] board, String word) {
        
        
         for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // Check if the word can be formed starting from the current cell
                if (exi(board, word, i, j, 0)) {
                    return true;  // If found, return true
                }
            }
        }
        return false;
    }
}
