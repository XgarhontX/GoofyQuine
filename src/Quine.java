import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NotQuine {
    static final int I_LEFT = 10;
    static final char[] s = {
            ' ', ' ', ' ', ' ', '}', ';', '\n',
            ' ', ' ', ' ', ' ', 'p', 'u', 'b', 'l', 'i', 'c', ' ', 's', 't', 'a', 't', 'i', 'c', ' ', 'v', 'o', 'i', 'd', ' ', 'm', 'a', 'i', 'n', '(', 'S', 't', 'r', 'i', 'n', 'g', '[', ']', ' ', 'a', 'r', 'g', 's', ')', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'i', 'f', ' ', '(', 'I', '_', 'L', 'E', 'F', 'T', ' ', '<', '=', ' ', '0', ')', ' ', '{', 'S', 'y', 's', 't', 'e', 'm', '.', 'e', 'x', 'i', 't', '(', '0', ')', ';', '}', ' ', '/', '/', 's', 'e', 'n', 't', 'i', 'n', 'e', 'l', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 't', 'r', 'i', 'n', 'g', 'B', 'u', 'i', 'l', 'd', 'e', 'r', ' ', 's', 'b', ' ', '=', ' ', 'n', 'e', 'w', ' ', 'S', 't', 'r', 'i', 'n', 'g', 'B', 'u', 'i', 'l', 'd', 'e', 'r', '(', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', 'i', 'm', 'p', 'o', 'r', 't', ' ', 'j', 'a', 'v', 'a', '.', 'i', 'o', '.', 'F', 'i', 'l', 'e', ';', '\\', 'n', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', 'i', 'm', 'p', 'o', 'r', 't', ' ', 'j', 'a', 'v', 'a', '.', 'i', 'o', '.', 'F', 'i', 'l', 'e', 'W', 'r', 'i', 't', 'e', 'r', ';', '\\', 'n', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', 'i', 'm', 'p', 'o', 'r', 't', ' ', 'j', 'a', 'v', 'a', '.', 'i', 'o', '.', 'I', 'O', 'E', 'x', 'c', 'e', 'p', 't', 'i', 'o', 'n', ';', '\\', 'n', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', 'p', 'u', 'b', 'l', 'i', 'c', ' ', 'c', 'l', 'a', 's', 's', ' ', 'N', 'o', 't', 'Q', 'u', 'i', 'n', 'e', '\"', ' ', '+', ' ', '(', 'I', '_', 'L', 'E', 'F', 'T', '-', '1', ')', ' ', '+', ' ', '\"', ' ', '{', '\\', 'n', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', 't', 's', 't', 'a', 't', 'i', 'c', ' ', 'f', 'i', 'n', 'a', 'l', ' ', 'i', 'n', 't', ' ', 'I', '_', 'L', 'E', 'F', 'T', ' ', '=', ' ', '\"', ' ', '+', ' ', '(', 'I', '_', 'L', 'E', 'F', 'T', '-', '1', ')', ' ', '+', ' ', '\"', ';', '\\', 'n', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', 't', 's', 't', 'a', 't', 'i', 'c', ' ', 'f', 'i', 'n', 'a', 'l', ' ', 'c', 'h', 'a', 'r', '[', ']', ' ', 's', ' ', '=', ' ', '{', '\\', 'n', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', 't', '\\', 't', '\\', 't', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'f', 'o', 'r', ' ', '(', 'i', 'n', 't', ' ', 'i', ' ', '=', ' ', '0', ';', ' ', 'i', ' ', '<', ' ', 's', '.', 'l', 'e', 'n', 'g', 't', 'h', ';', ' ', 'i', '+', '+', ')', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'w', 'i', 't', 'c', 'h', ' ', '(', 's', '[', 'i', ']', ')', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'c', 'a', 's', 'e', ' ', '\'', '\\', 'n', '\'', ':', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', '\'', '\\', '\\', 'n', '\\', '\'', ',', '\\', 'n', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'i', 'f', ' ', '(', 'i', ' ', '!', '=', ' ', 's', '.', 'l', 'e', 'n', 'g', 't', 'h', ' ', '-', ' ', '1', ')', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', 't', '\\', 't', '\\', 't', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'b', 'r', 'e', 'a', 'k', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'c', 'a', 's', 'e', ' ', '\'', '\\', '\\', '\'', ':', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', '\'', '\\', '\\', '\\', '\\', '\\', '\'', ',', ' ', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'b', 'r', 'e', 'a', 'k', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'c', 'a', 's', 'e', ' ', '\'', '\\', '\'', '\'', ':', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', '\'', '\\', '\\', '\\', '\'', '\\', '\'', ',', ' ', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'b', 'r', 'e', 'a', 'k', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'c', 'a', 's', 'e', ' ', '\'', '\\', '\"', '\'', ':', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', '\'', '\\', '\\', '\\', '\"', '\\', '\'', ',', ' ', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'b', 'r', 'e', 'a', 'k', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'd', 'e', 'f', 'a', 'u', 'l', 't', ':', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', '\"', '\\', '\'', '\"', ' ', '+', ' ', 's', '[', 'i', ']', ' ', '+', ' ', '\"', '\\', '\'', ',', ' ', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'b', 'r', 'e', 'a', 'k', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'f', 'o', 'r', ' ', '(', 'i', 'n', 't', ' ', 'i', ' ', '=', ' ', '0', ';', ' ', 'i', ' ', '<', ' ', 's', '.', 'l', 'e', 'n', 'g', 't', 'h', ';', ' ', 'i', '+', '+', ')', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', 'b', '.', 'a', 'p', 'p', 'e', 'n', 'd', '(', 's', '[', 'i', ']', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 'y', 's', 't', 'e', 'm', '.', 'o', 'u', 't', '.', 'p', 'r', 'i', 'n', 't', 'l', 'n', '(', 's', 'b', '.', 't', 'o', 'S', 't', 'r', 'i', 'n', 'g', '(', ')', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'F', 'i', 'l', 'e', ' ', 'f', ' ', '=', ' ', 'n', 'e', 'w', ' ', 'F', 'i', 'l', 'e', '(', '\"', 's', 'r', 'c', '/', 'N', 'o', 't', 'Q', 'u', 'i', 'n', 'e', '\"', ' ', '+', ' ', '(', 'I', '_', 'L', 'E', 'F', 'T', '-', '1', ')', ' ', '+', ' ', '\"', '.', 'j', 'a', 'v', 'a', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 't', 'r', 'y', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'F', 'i', 'l', 'e', 'W', 'r', 'i', 't', 'e', 'r', ' ', 'f', 'w', ' ', '=', ' ', 'n', 'e', 'w', ' ', 'F', 'i', 'l', 'e', 'W', 'r', 'i', 't', 'e', 'r', '(', 'f', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'f', 'w', '.', 'w', 'r', 'i', 't', 'e', '(', 's', 'b', '.', 't', 'o', 'S', 't', 'r', 'i', 'n', 'g', '(', ')', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'f', 'w', '.', 'c', 'l', 'o', 's', 'e', '(', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', ' ', 'c', 'a', 't', 'c', 'h', ' ', '(', 'E', 'x', 'c', 'e', 'p', 't', 'i', 'o', 'n', ' ', 'e', ')', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 'y', 's', 't', 'e', 'm', '.', 'o', 'u', 't', '.', 'p', 'r', 'i', 'n', 't', 'l', 'n', '(', 'e', '.', 'g', 'e', 't', 'M', 'e', 's', 's', 'a', 'g', 'e', '(', ')', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 'y', 's', 't', 'e', 'm', '.', 'e', 'x', 'i', 't', '(', '1', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 't', 'r', 'i', 'n', 'g', ' ', 'p', 'a', 't', 'h', ' ', '=', ' ', 'f', '.', 'g', 'e', 't', 'A', 'b', 's', 'o', 'l', 'u', 't', 'e', 'P', 'a', 't', 'h', '(', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 't', 'r', 'y', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'R', 'u', 'n', 't', 'i', 'm', 'e', '.', 'g', 'e', 't', 'R', 'u', 'n', 't', 'i', 'm', 'e', '(', ')', '.', 'e', 'x', 'e', 'c', '(', '\"', 'j', 'a', 'v', 'a', ' ', '\\', '\"', '\"', ' ', '+', ' ', 'p', 'a', 't', 'h', ' ', '+', ' ', '\"', '\\', '\"', '\"', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', ' ', 'c', 'a', 't', 'c', 'h', ' ', '(', 'I', 'O', 'E', 'x', 'c', 'e', 'p', 't', 'i', 'o', 'n', ' ', 'e', ')', ' ', '{', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 'y', 's', 't', 'e', 'm', '.', 'o', 'u', 't', '.', 'p', 'r', 'i', 'n', 't', 'l', 'n', '(', 'e', '.', 'g', 'e', 't', 'M', 'e', 's', 's', 'a', 'g', 'e', '(', ')', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 'y', 's', 't', 'e', 'm', '.', 'e', 'x', 'i', 't', '(', '1', ')', ';', '\n',
            ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '}', '\n',
            ' ', ' ', ' ', ' ', '}', '\n',
            '}', '\n',
    }; //Copy from here down
    public static void main(String[] args) {
        if (I_LEFT <= 0) {System.exit(0);} //sentinel

        StringBuilder sb = new StringBuilder();
        //Before s
        sb.append("import java.io.File;\n");
        sb.append("import java.io.FileWriter;\n");
        sb.append("import java.io.IOException;\n");
        sb.append("public class NotQuine" + (I_LEFT-1) + " {\n");
        sb.append("\tstatic final int I_LEFT = " + (I_LEFT-1) + ";\n");
        sb.append("\tstatic final char[] s = {\n");
        sb.append("\t\t\t");
        //s
        for (int i = 0; i < s.length; i++) {
            switch (s[i]) {
                case '\n':
                    sb.append("\'\\n\',\n");
                    if (i != s.length - 1) {
                        sb.append("\t\t\t");
                    }
                    break;
                case '\\':
                    sb.append("\'\\\\\', ");
                    break;
                case '\'':
                    sb.append("\'\\\'\', ");
                    break;
                case '\"':
                    sb.append("\'\\\"\', ");
                    break;
                default:
                    sb.append("\'" + s[i] + "\', ");
                    break;
            }
        }
        //After s
        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }

        //Print
        System.out.println(sb.toString());

        //File Out
        File f = new File("src/NotQuine" + (I_LEFT-1) + ".java");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write(sb.toString());
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

        //Compile & Exec
        String path = f.getAbsolutePath();
        try {
            Runtime.getRuntime().exec("java \"" + path + "\""); //javac is automatically called
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}
