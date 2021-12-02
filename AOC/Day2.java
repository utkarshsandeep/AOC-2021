package AOC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Day2 {
    public static void d2a() throws Exception {
        List<String> line = new ArrayList<>();
        FileReader file = new FileReader("C:\\Users\\utkarsh.singh\\IdeaProjects\\untitled\\Testing\\src\\AOC\\D2.txt");
        BufferedReader reader = new BufferedReader(file);
        while (reader.ready()) {
            line.add(reader.readLine());
        }
        System.out.println(line);
        List<Integer> f = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        List<Integer> u = new ArrayList<>();
        for(int i=0;i<line.size();i++) {
            if (line.get(i).substring(0,line.get(i).indexOf(' ')).equals("forward")){
                f.add(Integer.parseInt(line.get(i).substring(line.get(i).indexOf(' ')+1)));
            } else if (line.get(i).substring(0,line.get(i).indexOf(' ')).equals("down")){
                d.add(Integer.parseInt(line.get(i).substring(line.get(i).indexOf(' ')+1)));
            } else if (line.get(i).substring(0,line.get(i).indexOf(' ')).equals("up")){
                u.add(Integer.parseInt(line.get(i).substring(line.get(i).indexOf(' ')+1)));
            }
        }
        int fsum=0,dsum=0,usum=0;
        for(int i=0;i<f.size();i++){
            fsum+=f.get(i);
        }
        for(int i=0;i<d.size();i++){
            dsum+=d.get(i);
        }
        for(int i=0;i<u.size();i++){
            usum+=u.get(i);
        }
        System.out.println((fsum*(dsum-usum)));
    }

    public static void main(String[] args) throws Exception {
        d2a();
        d2b();
    }

    public static void d2b() throws Exception {
        List<String> line = new ArrayList<>();
        FileReader file = new FileReader("C:\\Users\\utkarsh.singh\\IdeaProjects\\untitled\\Testing\\src\\AOC\\D2.txt");
        BufferedReader reader = new BufferedReader(file);
        while (reader.ready()) {
            line.add(reader.readLine());
        }
        System.out.println(line);
        List<Integer> f = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        List<Integer> u = new ArrayList<>();
        int aim = 0,fsum=0,dsum=0;
        for(int i=0;i<line.size();i++) {
            if (line.get(i).substring(0,line.get(i).indexOf(' ')).equals("forward")){
                fsum+=(Integer.parseInt(line.get(i).substring(line.get(i).indexOf(' ')+1)));
                dsum+=(Integer.parseInt(line.get(i).substring(line.get(i).indexOf(' ')+1)))*aim;
            } else if (line.get(i).substring(0,line.get(i).indexOf(' ')).equals("down")){
                aim+=(Integer.parseInt(line.get(i).substring(line.get(i).indexOf(' ')+1)));
            } else if (line.get(i).substring(0,line.get(i).indexOf(' ')).equals("up")){
                aim-=(Integer.parseInt(line.get(i).substring(line.get(i).indexOf(' ')+1)));
            }
        }


        System.out.println((fsum*dsum));
    }
}
