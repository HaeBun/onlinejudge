import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        return todoCalculate(todo_list, finished);
    }
    
    public String[] todoCalculate(String[] todoList, boolean[] finished) {
        ArrayList<String> arrays = new ArrayList<>();
        
        for (int i = 0; i < todoList.length; i++) {
            if (!finished[i]) {
                arrays.add(todoList[i]);
            }
        }
        
        String[] result = new String[arrays.size()];
        for (int i = 0; i < arrays.size(); i++) {
            result[i] = arrays.get(i);
        }
        
        return result;
    }
}