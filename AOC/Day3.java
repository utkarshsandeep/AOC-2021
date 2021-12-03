package AOC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day3 {
    public static void d3a()throws Exception {
        List<String> line = new ArrayList<>();
        FileReader file = new FileReader("C:\\Users\\utkarsh.singh\\IdeaProjects\\untitled\\Testing\\src\\AOC\\D3.txt");
        BufferedReader reader = new BufferedReader(file);
        while (reader.ready()) {
            line.add(reader.readLine());
        }
        //System.out.println(line);
        int a[]=new int[12];
        for(int j=0;j<12;j++) {
            int sum=0;
            for (int i = 0; i < line.size(); i++) {
                if(line.get(i).charAt(j) == '1'){
                    sum++;
                }
            }
            if(sum>=500){
                a[j]=1;
            } else {
                a[j]=0;
            }
        }
        String bs1="";
        String bs2="";
        for(int i=0;i<12;i++){
            //System.out.print(a[i]);
            bs1+=a[i];
            if(a[i]==0){
                bs2+="1";
            } else {
                bs2+="0";
            }
        }

        int dec1=Integer.parseInt(bs1,2);
        int dec2=Integer.parseInt(bs2,2);
        System.out.println((dec1*dec2));
    }

    public static void main(String[] args) throws Exception{
        d3a();
        d3b();
    }

    public static void d3b()throws Exception {
        List<String> line = new ArrayList<>();
        List<String> line2 = new ArrayList<>();
        FileReader file = new FileReader("C:\\Users\\utkarsh.singh\\IdeaProjects\\untitled\\Testing\\src\\AOC\\D3.txt");
        BufferedReader reader = new BufferedReader(file);
        while (reader.ready()) {
            line.add(reader.readLine());
        }
        int a[]=new int[line.get(0).length()];
        for(int j=0;j<line.get(0).length();j++) {
            int sum=0;
            for (int i = 0; i < line.size(); i++) {
                if(line.get(i).charAt(j) == '1'){
                    sum++;
                }
            }
            if(sum>=(line.size()/2)){
                a[j]=1;
            } else {
                a[j]=0;
            }
        }
        for(int i=0;i<line.get(0).length();i++){
            System.out.print(a[i]+",");
        }
        List<String> line1 = line;
        Map<String,List<String>> mp = new HashMap<>();
        for(int j=0;j<line.get(0).length();j++){
            int i;
            List<String> data = new ArrayList<>();
            if (j!=0) {
                line1=mp.get(String.valueOf(j-1));
            }
            for(i=0;i<line1.size();i++){
                if(String.valueOf(line1.get(i).charAt(j)).equals(String.valueOf(revert(line1, j))))
                {
                    data.add(line1.get(i));
                }
            }
            mp.put(j+"",data);
            //System.out.println(line1);
        }
      System.out.println(mp);
        String mpd=null;
        for(String m : mp.keySet()){
            if(mp.get(m).size()==1){
                mpd=mp.get(m).get(0);
            }
        }
        int dec1=Integer.parseInt(mpd,2);
        System.out.println(dec1);//3004
    }

    public static int revert(List<String> data, int j) {
        int sum=0;
        for (int i = 0; i < data.size(); i++) {
            if(data.get(i).charAt(j) == '0'){
                sum++;
            }
        }
        if(sum>=(data.size()/2)){
            return 1;
        } else {
            return 0;
        }

    }

}
