import java.util.*;


public class SalamanderSearch {
    public static void main(String[] args) {
        char[][] enclosure1 = {
            {'.','.','.','.','.','.'},
            {'W','.','W','W','.','.'},
            {'.','.','W','.','.','W'},
            {'f','W','.','.','W','.'},
            {'W','.','W','s','.','.'},
        };

        char[][] enclosure2 = {
            {'.','.','.','.','.','.'},
            {'W','W','W','W','s','.'},
            {'.','.','W','.','.','W'},
            {'f','W','.','.','W','.'},
            {'W','.','W','.','.','.'},
        };
    }

    /**
     * Returns whether a salamander can reach the food in an enclosure.
     * 
     * The enclosure is represented by a rectangular char[][] that contains
     * ONLY the following characters:
     * 
     * 's': represents the starting location of the salamander
     * 'f': represents the location of the food
     * 'W': represents a wall
     * '.': represents an empty space the salamander can walk through
     * 
     * The salamander can move one square at a time: up, down, left, or right.
     * It CANNOT move diagonally.
     * It CANNOT move off the edge of the enclosure.
     * It CANNOT move onto a wall.
     * 
     * This method should return true if there is any sequence of steps that
     * the salamander could take to reach food.
     * 
     * @param enclosure
     * @return whether the salamander can reach the food
     * @throws IllegalArgumentException if the enclosure does not contain a salamander
     */
    public static boolean canReach(char[][] enclosure) {
        
        return false;

    }//end canReach

    public static int[] salamanderLocation(char[][] enclosure){
            //complexity is O(n*m) n= rows * m= columns

        //use r for rows, and c for columns - searching for 's'
        for(int r = 0; r < enclosure.length; r++){
            for(int c = 0; c < enclosure[r].length; c++){

                if(enclosure[r][c] == 's'){

                    int [] location = new int []{r, c};
                    return location;    

                }//end if
            }//end inner for
        }//end outer for

        //throws an IllegalArgumentException if no salamander is found in the enclosure
        throw new IllegalArgumentException("No salamander present");

    }//end salamanderLocation



    public static List<int[]> possibleMoves(char[][] enclosure, int[] current){

        List<int[]> moves = new ArrayList<>();

        int curR = current[0]; //current row
        int curC = current[1]; //current column

    //check up

        int newR = curR-1; //goes up
        int newC = curC;
        if(newR >=0 && enclosure[newR][newC] !='W'){

            moves.add(new int[]{newR, newC});

        }//end if

    //check down

        newR = curR+1; //goes down
        newC = curC;
        if(newR < enclosure.length && enclosure[newR][newC] !='W'){

            moves.add(new int[]{newR, newC});

        }//end if

    //check left

        newR = curR;
        newC = curC-1; //goes left
        if(newC >=0 && enclosure[newR][newC] !='W'){

            moves.add(new int[]{newR, newC});

        }//end if

    //check right

        newR = curR;
        newC = curC+1; //goes right
        if(newC < enclosure[newR].length  && enclosure[newR][newC] !='W'){

            moves.add(new int[]{newR, newC});

        }//end if

        return moves; //gives possible salamander moves

    }//end possibleMoves



}//end file
