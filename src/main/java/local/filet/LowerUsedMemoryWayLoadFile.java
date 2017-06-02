package local.filet;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by codedrinker on 02/06/2017.
 */
public class LowerUsedMemoryWayLoadFile {
    public static void main(String[] args) throws IOException {
        String path = "/Users/codedrinker/Downloads/ideaIU-2016.3.7.dmg";
        long heapSize = Runtime.getRuntime().totalMemory();
        long heapMaxSize = Runtime.getRuntime().maxMemory();
        long heapFreeSize = Runtime.getRuntime().freeMemory();

        getPrintln(heapSize);
        getPrintln(heapMaxSize);
        getPrintln(heapFreeSize);

        long start = System.currentTimeMillis();
//        List<String> strings = Files.readLines(new File(path), Charsets.UTF_8);
//        List<String> strings = IOUtils.readLines(new FileReader(new File(path)));
//        System.out.println(strings.size());

        LineIterator it = FileUtils.lineIterator(new File(path), "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                String lie2 = line;
            }
        } finally {
            LineIterator.closeQuietly(it);
        }



        heapSize = Runtime.getRuntime().totalMemory();
        heapMaxSize = Runtime.getRuntime().maxMemory();
        heapFreeSize = Runtime.getRuntime().freeMemory();

        System.out.println((System.currentTimeMillis() - start) / 1000);


        getPrintln(heapSize);
        getPrintln(heapMaxSize);
        getPrintln(heapFreeSize);
    }

    private static void getPrintln(long heapSize) {
        System.out.println(heapSize / 1024 / 1024 + " M");
    }
}
