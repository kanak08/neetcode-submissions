class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            List<Character> list_r= new ArrayList<>();
            List<Character> list_c= new ArrayList<>();
            for(int j=0;j<9;j++){
                if((board[i][j]) != ('.')){
                    if(list_r.contains(board[i][j])){return false;}
                    else{list_r.add(board[i][j]);}
                }
                if(board[j][i]!='.'){
                    if(list_c.contains(board[j][i])){return false;}
                    else{list_c.add(board[j][i]);}
                }
            }
        }
        for(int i=0;i<9;i=i+3){
            for(int j=0;j<9;j=j+3){
                if(i>=j){
                    List<Character> list_up= new ArrayList<>();
                    List<Character> list_dn= new ArrayList<>();
                    for(int m=i; m<i+3; m++){
                        for(int n=j; n<j+3; n++){
                            if(board[m][n]!='.'){
                                if(list_up.contains(board[m][n])){return false;}
                                else{list_up.add(board[m][n]);}
                            }
                            if(board[n][m]!='.'){
                                if(list_dn.contains(board[n][m])){return false;}
                                else{list_dn.add(board[n][m]);}
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
