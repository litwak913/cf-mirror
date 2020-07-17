import com.beust.jcommander.JCommander;
import io.github.litwak913.Config;
import io.github.litwak913.Mods;
import io.github.litwak913.ModsFiles;
import io.github.litwak913.Utility;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CFMirrorTests {
    @Test
    public void testEncodeModInfoJson() {
        String modInfoData = "[{\"id\":32274,\"name\":\"TestMod\",\"slug\":\"testmod\"}]";
        List<Mods> list = Utility.encodeModInfoJson(modInfoData);
        for (Mods v : list) {
            Assert.assertEquals("TestMod", v.getName());
            Assert.assertEquals("testmod", v.getSlug());
        }
    }

    @Test
    public void testEncodeModFileJson() {
        String modInfoData = "[{\"fileLength\":32274,\"fileName\":\"Tests\",\"downloadUrl\":\"www.google.com\"}]";
        List<ModsFiles> list = Utility.encodeModFileListJson(modInfoData);
        for (ModsFiles v : list) {
            Assert.assertEquals(32274, v.getFileLength());
            Assert.assertEquals("Tests", v.getFileName());
            Assert.assertEquals("www.google.com", v.getDownloadUrl());
        }
    }

    @Test
    public void testArgs() {
        Config cfg = new Config();
        String[] args = {"--output", "./hello"};
        JCommander jcmd = new JCommander().newBuilder().addObject(cfg).build();
        jcmd.parse(args);
        Assert.assertEquals(cfg.dir, "./hello");

    }

    @Test
    public void testFileLength() {
        int b = 1395864371;
        Assert.assertEquals("1.29GB", Utility.getSize(b));
    }
}
