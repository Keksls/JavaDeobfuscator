/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class fyV {
    private static final Logger a = Logger.getLogger(fyV.class);
    private final fyw_0 b;
    private final String c;
    private final fka_2 d;
    private fkg_2 e;
    private fkb_2 f;
    private fke_2 g;

    public fyV(fyw_0 fyw_02, String string, fka_2 fka_22) {
        this.b = fyw_02;
        this.c = string.endsWith("/") ? string : string + "/";
        this.d = fka_22;
    }

    public void a() {
        this.b();
        this.e(this.b("fontDefinitions.xml"));
        this.f(this.b("fonts.xml"));
        this.g(this.b("colors.xml"));
        this.h(this.b("cursors.xml"));
        this.i(this.b("textures.xml"));
        this.j(this.b("tooltips.xml"));
        this.c();
        this.f.j();
        this.e.j();
        this.g.a();
    }

    private void b() {
        PrintWriter printWriter = fyV.a(this.d.e() + "/" + this.d.b() + ".java");
        if (printWriter == null) {
            return;
        }
        this.f = new fkb_2(printWriter, this.d.b(), this.d.a(), this.b);
        PrintWriter printWriter2 = fyV.a(this.d.e() + "/" + this.d.c() + ".java");
        if (printWriter2 == null) {
            return;
        }
        this.e = new fkg_2(printWriter2, this.d.c(), this.d.a());
        this.b.a(this.e);
        PrintWriter printWriter3 = fyV.a(this.d.e() + "/" + this.d.d() + ".java");
        if (printWriter3 == null) {
            return;
        }
        this.g = new fke_2(printWriter3, this.d.d(), this.d.a());
    }

    @Nullable
    private static PrintWriter a(String string) {
        PrintWriter printWriter;
        File file = new File(string);
        if (!file.exists()) {
            try {
                file.createNewFile();
            }
            catch (IOException iOException) {
                a.error((Object)("Exception when creating file " + string), (Throwable)iOException);
            }
        }
        try {
            printWriter = new PrintWriter(file);
        }
        catch (FileNotFoundException fileNotFoundException) {
            a.error((Object)("Error when trying to open file " + string), (Throwable)fileNotFoundException);
            return null;
        }
        return printWriter;
    }

    @NotNull
    private String b(String string) {
        return "file:" + this.c + "init/" + string;
    }

    private static ath_2 c(String string) {
        try {
            return fpm_0.b(new URL(string));
        }
        catch (Exception exception) {
            a.error((Object)("[THEME] Error while loading Xulor theme from file " + string), (Throwable)exception);
            throw new IllegalArgumentException("Error while loading Xulor theme from file " + string, exception);
        }
    }

    private void d(String string) {
        fkc_2 fkc_22 = new fkc_2(this.f.l(), this.f.k(), string, null, false);
        this.f.a(fkc_22);
    }

    private void e(String string) {
        this.d("initFontDefinitions");
        for (aqx_2 aqx_22 : fyV.c(string).a().k()) {
            if (!"fontDefinition".equalsIgnoreCase(aqx_22.b())) continue;
            new fkl_2(aqx_22).a(this.f);
        }
    }

    private void f(String string) {
        this.d("initFonts");
        for (aqx_2 aqx_22 : fyV.c(string).a().k()) {
            if (!"font".equalsIgnoreCase(aqx_22.b())) continue;
            new fkn_2(aqx_22).a(this.f);
        }
    }

    private void g(String string) {
        this.d("initColors");
        for (aqx_2 aqx_22 : fyV.c(string).a().k()) {
            if (!"color".equalsIgnoreCase(aqx_22.b())) continue;
            fkj_2 fkj_22 = new fkj_2(aqx_22, this.d.d());
            fkj_22.a(this.f);
            fkj_22.a(this.g);
        }
    }

    private void h(String string) {
        this.d("initCursors");
        for (aqx_2 aqx_22 : fyV.c(string).a().k()) {
            if (aqx_22.b().equalsIgnoreCase("cursor")) {
                new fkk_2(aqx_22).a(this.f);
                continue;
            }
            if (!aqx_22.b().equalsIgnoreCase("animatedCursor")) continue;
            new fki_2(aqx_22).a(this.f);
        }
    }

    private void i(String string) {
        this.d("initTextures");
        for (aqx_2 aqx_22 : fyV.c(string).a().k()) {
            if (!"texture".equalsIgnoreCase(aqx_22.b())) continue;
            new fkq_2(aqx_22).a(this.f);
        }
    }

    private void j(String string) {
        this.d("initTooltips");
        for (aqx_2 aqx_22 : fyV.c(string).a().k()) {
            if (!"tooltip".equalsIgnoreCase(aqx_22.b())) continue;
            new fkr_1(aqx_22, this.b).a(this.f);
        }
    }

    private void c() {
        for (File file : fyW.a(this.c)) {
            for (aqx_2 aqx_22 : fyV.c("file:" + file.getPath()).a().k()) {
                if (fyW.a(aqx_22)) continue;
                this.b.a(aqx_22, this.d);
            }
        }
    }
}

