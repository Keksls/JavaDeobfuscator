/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.prefs.Preferences;
import javax.swing.JFileChooser;
import org.apache.log4j.Logger;

/*
 * Renamed from daN
 */
public class dan_0
implements ahr_1,
Runnable {
    private static final dan_0 a = new dan_0();
    private static final String b = "ankamagames.wakfu.mixDebuggerDirectory";
    static final Logger c = Logger.getLogger(dan_0.class);
    private static final long d = 5000L;
    private dat_0 e;
    private ans_1 f;

    public static dan_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17791: {
                azu_0.j().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public void c() {
        this.e.b();
    }

    public void d() {
        this.e.c();
    }

    public void e() {
        int n;
        String string = Preferences.userRoot().get(b, null);
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Choisissez le r\u00e9pertoire de sauvegarde des logs.");
        jFileChooser.setFileSelectionMode(1);
        jFileChooser.setFileFilter(new daQ());
        if (string != null) {
            jFileChooser.setSelectedFile(new File(string));
        }
        if ((n = jFileChooser.showOpenDialog(null)) == 0) {
            File file = jFileChooser.getSelectedFile();
            try {
                Preferences.userRoot().put(b, file.getCanonicalPath());
            }
            catch (IOException iOException) {
                c.warn((Object)("Probl\u00e8me \u00e0 la s\u00e9lection du r\u00e9pertoire : " + file.getAbsolutePath()));
            }
        }
    }

    public void f() {
        PrintWriter printWriter;
        String string = Preferences.userRoot().get(b, null);
        wu_0 wu_02 = wc_0.p().a();
        StringBuilder stringBuilder = new StringBuilder();
        int n = wu_02.m();
        int n2 = wu_02.j();
        int n3 = wu_02.k();
        int n4 = wu_02.l();
        int n5 = wu_02.n();
        if (string != null) {
            stringBuilder.append(string).append("\\");
        } else {
            stringBuilder.append(".\\");
        }
        stringBuilder.append("mixDebugger-");
        stringBuilder.append(wu_02.o()).append(n < 10 ? "0" : "").append(n).append(n2 < 10 ? "0" : "").append(n2);
        stringBuilder.append("-").append(n3 < 10 ? "0" : "").append(n3).append(n4 < 10 ? "0" : "").append(n4).append(n5 < 10 ? "0" : "").append(n5);
        stringBuilder.append(".txt");
        String string2 = stringBuilder.toString();
        try {
            printWriter = new PrintWriter(gi_0.o(string2));
        }
        catch (IOException iOException) {
            c.warn((Object)"Probl\u00e8me \u00e0 la sauvegarde des logs");
            return;
        }
        printWriter.println("---=== Crit\u00e8res ===---");
        printWriter.println();
        printWriter.println(this.e.b(false));
        printWriter.println();
        printWriter.println("---=== Ev\u00e8nements ===---");
        printWriter.println();
        printWriter.println(this.e.c(false));
        printWriter.println("---=== Logs ===---");
        printWriter.println();
        printWriter.println(this.e.a(false));
        printWriter.flush();
        printWriter.close();
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.f = new dao_0(this);
            fpm_0.b().a(this.f);
            this.e = new dat_0(this);
            fis_1.a().a("mixDebugger", this.e);
            fpm_0.b().a("mixDebuggerDialog", cfi_0.a("mixDebuggerDialog"), 1L, (short)10000);
            ado_1.a().a(this, 5000L, -1);
            fpm_0.b().a("wakfu.mixDebugger", cHK.class);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            amu_1.a(dat_0.class);
            this.e.a();
            this.e = null;
            ado_1.a().b(this);
            fis_1.a().a("mixDebugger");
            fpm_0.b().o("mixDebuggerDialog");
            fpm_0.b().b(this.f);
            fpm_0.b().e("wakfu.mixDebugger");
        }
    }

    @Override
    public void run() {
        this.a(false);
    }

    public void a(boolean bl) {
        if (bl || this.e.e()) {
            fis_1.a().a((ajf_1)this.e, "cache", "memoryCache", "sourcesTotalSize");
        }
    }

    public dat_0 g() {
        return this.e;
    }
}

