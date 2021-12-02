package AOC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Day1 {
    public static void D1a() throws Exception {
        List<Integer> line = new ArrayList<>();
        FileReader file = new FileReader("C:\\Users\\utkarsh.singh\\IdeaProjects\\untitled\\Testing\\src\\AOC\\D1.txt");
        BufferedReader reader = new BufferedReader(file);
        while (reader.ready()) {
            line.add(Integer.parseInt(reader.readLine()));
                    }
        System.out.println(line);
        int p=0,n=0;
        for (int i = 1;i<line.size();i++) {
            if (line.get(i)>line.get(i-1)){
                p++;
            } else  {
                n++;
            }
        }
        System.out.println(p + "++++" + n); //1583
    }

    public static void D1b()throws Exception {
        List<Integer> line = new ArrayList<>();
        FileReader file = new FileReader("C:\\Users\\utkarsh.singh\\IdeaProjects\\untitled\\Testing\\src\\AOC\\D1.txt");
        BufferedReader reader = new BufferedReader(file);
        while (reader.ready()) {
            line.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(line);
        int p=0,n=0,d=0;
        for(int i = 3 ;i<line.size();i++){
            if ((line.get(i)+line.get(i-1)+line.get(i-2))>(line.get(i-1)+line.get(i-2)+line.get(i-3))){
                p++;
            } else if ((line.get(i)+line.get(i-1)+line.get(i-2))<(line.get(i-1)+line.get(i-2)+line.get(i-3))){
                n++;
            } else {
                d++;
            }
        }
        System.out.println(p+"----------"+d+"------"+n);//1627
    }

    public static void main(String[] args) throws Exception {
        D1a();
        D1b();
    }
}
