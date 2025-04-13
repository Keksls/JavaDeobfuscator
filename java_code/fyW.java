/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import java.io.File;
import java.net.URL;
import java.util.Map;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class fyW {
    private static final Logger d = Logger.getLogger(fyW.class);
    public static final String a = "file:";
    public static final String b = "init/";
    public static final String c = "components/";
    private final fyw_0 e;
    private final String f;

    public fyW(fyw_0 fyw_02, String string) {
        this.e = fyw_02;
        this.f = string.endsWith("/") ? string : string + "/";
    }

    public void a() {
        this.d(this.b("fontDefinitions.xml"));
        this.e(this.b("fonts.xml"));
        this.f(this.b("colors.xml"));
        this.g(this.b("cursors.xml"));
        this.h(this.b("textures.xml"));
        this.i(this.b("tooltips.xml"));
        this.j(this.b("pixmaps.xml"));
        this.j(this.b("pixmapBackgrounds.xml"));
        this.j(this.b("themeElements.xml"));
        this.c();
    }

    public void b() {
        this.f(this.b("colors.xml"));
    }

    @NotNull
    private String b(String string) {
        return a + this.f + b + string;
    }

    @NotNull
    static File[] a(String string) {
        File[] fileArray = new File(string + c).listFiles();
        if (fileArray == null || fileArray.length == 0) {
            throw new IllegalArgumentException("There is no theme components XML files!");
        }
        return fileArray;
    }

    private static ath_2 c(String string) {
        try {
            return fpm_0.b(new URL(string));
        }
        catch (Exception exception) {
            d.error((Object)("[THEME] Error while loading Xulor theme from file " + string), (Throwable)exception);
            throw new IllegalArgumentException("Error while loading Xulor theme from file " + string, exception);
        }
    }

    private void d(String string) {
        for (aqx_2 aqx_22 : fyW.c(string).a().k()) {
            if (!"fontDefinition".equalsIgnoreCase(aqx_22.b())) continue;
            this.e.e(aqx_22);
        }
    }

    private void e(String string) {
        for (aqx_2 aqx_22 : fyW.c(string).a().k()) {
            if (!"font".equalsIgnoreCase(aqx_22.b())) continue;
            this.e.f(aqx_22);
        }
    }

    private void f(String string) {
        for (aqx_2 aqx_22 : fyW.c(string).a().k()) {
            if (!"color".equalsIgnoreCase(aqx_22.b())) continue;
            this.e.g(aqx_22);
        }
        Map<String, azj_2> map = fys_0.a.c();
        if (!map.isEmpty()) {
            throw new RuntimeException(String.format("[THEME] Following colors have faulty declaration ! %s", map));
        }
    }

    private void g(String string) {
        for (aqx_2 aqx_22 : fyW.c(string).a().k()) {
            if (aqx_22.b().equalsIgnoreCase("cursor")) {
                this.e.h(aqx_22);
                continue;
            }
            if (!aqx_22.b().equalsIgnoreCase("animatedCursor")) continue;
            this.e.i(aqx_22);
        }
    }

    private void h(String string) {
        for (aqx_2 aqx_22 : fyW.c(string).a().k()) {
            if (!"texture".equalsIgnoreCase(aqx_22.b())) continue;
            this.e.j(aqx_22);
        }
    }

    private void i(String string) {
        for (aqx_2 aqx_22 : fyW.c(string).a().k()) {
            if (!"tooltip".equalsIgnoreCase(aqx_22.b())) continue;
            this.e.d(aqx_22);
        }
    }

    private void j(String string) {
        for (aqx_2 aqx_22 : fyW.c(string).a().k()) {
            if (fyW.a(aqx_22)) continue;
            this.e.b(aqx_22);
        }
    }

    private void c() {
        for (File file : fyW.a(this.f)) {
            for (aqx_2 aqx_22 : fyW.c(a + file.getPath()).a().k()) {
                if (fyW.a(aqx_22)) continue;
                this.e.c(aqx_22);
            }
        }
    }

    static boolean a(aqx_2 aqx_22) {
        return "#comment".equalsIgnoreCase(aqx_22.b()) || "#text".equalsIgnoreCase(aqx_22.b());
    }
}

