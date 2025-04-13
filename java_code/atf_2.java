/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from atF
 */
public final class atf_2 {
    private static final Logger c = Logger.getLogger(atf_2.class);
    private static final boolean d = true;
    public static final String a = "(.*)/(.*)";
    private final HashMap<String, Anm> e = new HashMap();
    private boolean f = false;
    private final boolean g;
    private final boolean h;
    private final Semaphore i = new Semaphore(1);
    private static final atf_2 j = new atf_2();

    private atf_2() {
        this.g = true;
        this.h = false;
    }

    public static atf_2 a() {
        return j;
    }

    public boolean b() {
        return this.g;
    }

    public boolean c() {
        return this.h;
    }

    public void a(String string, String string2) {
        try (arf_1 arf_12 = arf_1.a(gg_0.b(string));){
            int n = 0;
            int n2 = arf_12.c();
            Pattern pattern = Pattern.compile(a);
            for (int k = 0; k < n2; ++k) {
                int n3 = arf_12.b() & 0xFFFF;
                byte[] byArray = arf_12.a(n3);
                String string3 = Cz.a(byArray);
                Matcher matcher = pattern.matcher(string3);
                if (!matcher.matches()) {
                    c.error((Object)(string3 + " not matches pattern : " + pattern));
                    continue;
                }
                String string4 = matcher.group(1);
                String string5 = matcher.group(2);
                String string6 = string2.replaceAll("\\$1", string4).replaceAll("\\$2", string5);
                try {
                    Anm anm = this.b(string6, false);
                    anm.k_();
                    c.trace((Object)("Preloading common Anm : " + string6));
                    ++n;
                    continue;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    c.error((Object)String.format("[Animation] Anm not found : %s", string6), (Throwable)new att_1(string6));
                    continue;
                }
                catch (IOException iOException) {
                    c.error((Object)("Unable to load " + string6), (Throwable)iOException);
                }
            }
            c.trace((Object)("Preloading Anms : " + n + " files"));
        }
        catch (IOException iOException) {
            c.error((Object)"Error while loading Common Animations :", (Throwable)iOException);
        }
    }

    public atd_2 a(String string, boolean bl) {
        Anm anm = this.b(string, bl);
        if (anm == null) {
            return null;
        }
        String string2 = gi_0.k(string);
        String string3 = gi_0.i(string);
        return new atd_2(anm, string2, string3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Anm b(String string, boolean bl) {
        Anm anm;
        this.i.acquireUninterruptibly();
        try {
            anm = this.e.get(string);
            if (anm == null) {
                anm = (Anm)Anm.c.d();
                anm.a(string, bl);
                this.e.put(string, anm);
            }
        }
        finally {
            this.i.release();
        }
        return anm;
    }

    public void a(String string, fo_0 fo_02, atd_2 atd_22) {
        this.a(string, fo_02, atd_22, false);
    }

    public void a(String string, fo_0 fo_02, atd_2 atd_22, boolean bl) {
        assert (atd_22 != null);
        assert (fo_02 != null);
        String string2 = atd_22.f() + string;
        Anm anm = this.e.get(string2);
        if (anm == null) {
            try {
                anm = this.b(string2, this.g);
            }
            catch (IOException iOException) {
                c.error((Object)("Unable to load file " + string2), (Throwable)iOException);
            }
        }
        if (anm == null) {
            atd_22.a((Anm)null, (gc_0)null);
            return;
        }
        if (anm.f()) {
            atd_22.a(anm, anm.c().f().a(fo_02.c()), bl);
        } else {
            atd_22.b = fo_02.b();
            atd_22.a((Anm)null, (gc_0)null);
        }
    }

    public void d() {
        this.i.acquireUninterruptibly();
        Set<Map.Entry<String, Anm>> set = this.e.entrySet();
        Iterator<Map.Entry<String, Anm>> iterator = set.iterator();
        for (int k = this.e.size(); k > 0; --k) {
            Map.Entry<String, Anm> entry = iterator.next();
            Anm anm = entry.getValue();
            if (this.f && anm.a()) {
                try {
                    anm.a(true);
                }
                catch (IOException iOException) {
                    c.error((Object)"IOException during AnmManager update", (Throwable)iOException);
                }
            }
            if (anm.f()) {
                anm.k();
            } else {
                anm.d();
            }
            if (anm.j() > 0) continue;
            assert (anm.aw() == 0);
            anm.u();
            iterator.remove();
        }
        this.f = false;
        this.i.release();
    }
}

