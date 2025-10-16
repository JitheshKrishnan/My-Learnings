//! Topics: Array, Hash Table, String, Design, Matrix

//? Medium Difficulty

//* My Solution: 117ms

import java.util.ArrayList;
import java.util.List;

class Spreadsheet {

    List<int[]> spreadsheet;

    public Spreadsheet(int rows) {
        this.spreadsheet = new ArrayList<>();
        for(int i = 0; i < rows; i++)
            this.spreadsheet.add(new int[26]);
    }
    
    public void setCell(String cell, int value) {
        spreadsheet.get(Integer.parseInt(cell.substring(1))-1)[cell.charAt(0)-'A'] = value;
    }
    
    public void resetCell(String cell) {
        spreadsheet.get(Integer.parseInt(cell.substring(1))-1)[cell.charAt(0)-'A'] = 0;
    }
    
    public int getValue(String formula) {
        String form = formula.substring(1);
        String[] var = form.split("\\+");
        int values[] = new int[2];
        for(int i = 0; i < 2; i++){
            if(Character.isDigit(var[i].charAt(0)))
                values[i] = Integer.parseInt(var[i]);
            else
                values[i] = spreadsheet.get(Integer.parseInt(var[i].substring(1))-1)[var[i].charAt(0)-'A'];
        }
        return values[0] + values[1];
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */

public class DesignSpreadsheet_3484 {
    public static void main(String[] args) {
        Spreadsheet sheet = new Spreadsheet(3);

        System.out.println(sheet.getValue("=5+7"));   // 12
        sheet.setCell("A1", 10);
        System.out.println(sheet.getValue("=A1+6")); // 16
        sheet.setCell("B2", 15);
        System.out.println(sheet.getValue("=A1+B2")); // 25
        sheet.resetCell("A1");
        System.out.println(sheet.getValue("=A1+B2")); // 15
    }
}

//* Better Solution:

// class Spreadsheet {
//     private int rows;
//     private Map<String, Integer> cells;

//     public Spreadsheet(int rows) {
//         this.rows = rows;
//         this.cells = new HashMap<>();
//     }
    
//     public void setCell(String cell, int value) {
//         cells.put(cell, value);
//     }
    
//     public void resetCell(String cell) {
//         cells.remove(cell);
//     }
    
//     public int getValue(String formula) {
//         String[] parts = formula.substring(1).split("\\+");
//         return get(parts[0]) + get(parts[1]);
//     }

//     private int get(String s) {
//         try {
//             return Integer.parseInt(s);
//         } catch (NumberFormatException e) {
//             return cells.getOrDefault(s, 0);
//         }
//     }
// }