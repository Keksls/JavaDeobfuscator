/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarFile;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import org.apache.log4j.Logger;

public class aVk {
    private static final Logger c = Logger.getLogger(aVk.class);
    public static final aVk a = new aVk();
    public static final boolean b = !ahu_2.c();

    protected aVk() {
    }

    public String a(String string) {
        String string2 = String.format(azs_0.a().a("videosPath"), new Object[0]);
        return String.format("zip:///%s!/%s", new File(string2).getCanonicalPath(), string);
    }

    public void b(String string) {
        this.a(string, false);
    }

    public void a(String string, float f2) {
        this.a(string, false, f2);
    }

    public void a(String string, boolean bl) {
        this.a(string, bl, false);
    }

    public void a(String string, boolean bl, boolean bl2) {
        this.a(string, bl, bl2, 1.0f);
    }

    public void a(String string, boolean bl, float f2) {
        this.a(string, bl, false, f2);
    }

    public void a(String string, boolean bl, boolean bl2, float f2) {
        if (b) {
            return;
        }
        try {
            String string2 = this.a(string);
            if (bl) {
                ddE.a().a(string2);
                ddE.a().a(bl2);
                azu_0.j().a(ddE.a());
                return;
            }
            cXh.a.a(string2);
            cXh.a.a(f2);
            cXh.a.a(bl2);
            azu_0.j().a(cXh.a);
            dfc.d((short)16892);
        }
        catch (gm_0 gm_02) {
            c.error((Object)"Unable to find video file path property", (Throwable)gm_02);
        }
        catch (IOException iOException) {
            c.error((Object)"Unable to find video file", (Throwable)iOException);
        }
    }

    public List<String> a() {
        try {
            String string = String.format(azs_0.a().a("videosPath"), new Object[0]);
            return new JarFile(string).stream().filter(jarEntry -> !jarEntry.isDirectory()).map(ZipEntry::getName).collect(Collectors.toList());
        }
        catch (gm_0 gm_02) {
            c.error((Object)"Unable to find video file path property", (Throwable)gm_02);
            return Collections.emptyList();
        }
        catch (IOException iOException) {
            c.error((Object)"Unable to find video file", (Throwable)iOException);
            return Collections.emptyList();
        }
    }
}

