import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class file2Binary {
    public String readFiletoBinary(String mode, String inputFilePath, String position, int index) throws Exception
    {
        java.io.File unread = new java.io.File(inputFilePath);

        Scanner infile = new Scanner(unread);
        List<Integer> integers = new ArrayList<>();
        while (infile.hasNextInt()) {
            integers.add(infile.nextInt());
        }
        infile.close();

        String result = "";
        for(int ii=0;ii<integers.size();ii++){
            
            Integer i = integers.get(ii);
            String a = new StringBuilder(Integer.toBinaryString(i)).reverse().toString();
            while(a.length()<32){
                a = a+"0";
            }
            result = result.concat(a);
        }
        int num = (integers.size()%15)==0 ? integers.size()/15 :  integers.size()/15+1;
        for(int i =0;i<num;i++) {
            String tem = result.substring(i*15*32, ((i+1)*15*32 > result.length()) ? result.length(): (i+1)*15*32);
            String outputFilePath = "examples/join/"+ mode +"/"+position+String.valueOf(index)+"_"+String.valueOf(i)+"_bin.txt";
            //inputFilePath.substring(0, i+1) + inputFilePath.substring(i+1, j)+"_bin"+inputFilePath.substring(j);
            try{
                BufferedWriter out = new BufferedWriter(new FileWriter(outputFilePath));
                out.write(tem);
                out.close();
            }catch(IOException e){
                return null;
            }
        }
        System.out.println(String.format("position: %s%d, num: %d", position, index , num));
        return "outputFilePath";
    }

    public static void main(String[] args) throws Exception {
        file2Binary fb = new file2Binary();
        String mode = "equalJoin";
        String modeS = "e";
        String size = "20";
        String[] s1 = {"L", "R"};
        String[] s2 = {"localhost:44567", "localhost:44568", "localhost:44569"};
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length; j++){
                fb.readFiletoBinary(mode, "/home/zhanglipeng/obliFile/"+modeS+size+"/"+s1[i]+"_"+s2[j]+".txt", s1[i], j+1);
            }
        }
        //fb.readFiletoBinary(args[0]);
    }
}
