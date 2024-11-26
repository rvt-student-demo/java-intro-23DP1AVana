package lv.rvt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Helper{
    public static BufferedReader getReader(String fileName) throws Exception{
        return Files.newBufferedReader(getFilePath(fileName));
}

public static BufferedWriter getWriter(String fileName, StandardOpenOption option) throws Exception{
    return Files.newBufferedWriter(getFilePath(fileName), option);
}

public static Path getFilePath(String fileName) throws FileNotFoundException{
    Path filePath = Paths.get("data", fileName);
    if(!Files.exists(filePath)){
        throw new FileNotFoundException("File not found");
}
return filePath;
}
}
