package cn.tim.tools.backup;

import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * User: luolibing
 * Date: 2017/9/4 11:23
 */
public class FileBackUp {

    private Path sourcePath;

    public FileBackUp(Path sourcePath) {
        this.sourcePath = sourcePath;
    }

    public void backUpTo(Path targetPath) throws IOException {
        if(Files.notExists(targetPath)) {
            Files.createDirectories(targetPath);
        }

        FileUtils.copyDirectoryToDirectory(sourcePath.toFile(), targetPath.toFile());
    }
}
