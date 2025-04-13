/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from axA
 */
public class axa_2
implements axz_2 {
    protected static final Logger a = Logger.getLogger(axa_2.class);
    public static final axa_2 b = new axa_2();
    private final ArrayList<axz_2> c = new ArrayList();

    private axa_2() {
    }

    public void a(axz_2 axz_22) {
        if (!this.c.contains(axz_22)) {
            this.c.add(axz_22);
        }
    }

    @Override
    public void a() {
        a.info((Object)"Initializing hardware tests...");
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            axz_2 axz_22 = this.c.get(k);
            try {
                axz_22.a();
                continue;
            }
            catch (Throwable throwable) {
                a.error((Object)("Erreur \u00e0 l'initialisation du test hardware " + axz_22.d().a()), throwable);
            }
        }
    }

    @Override
    public boolean b() {
        a.info((Object)"Testing supported features...");
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            axz_2 axz_22 = this.c.get(k);
            axx_2 axx_22 = axz_22.d();
            boolean bl = false;
            try {
                bl = axz_22.b();
            }
            catch (Throwable throwable) {
                a.error((Object)("Erreur pendant le test hardware " + axx_22.a()), throwable);
            }
            a.info((Object)("\t* " + axx_22.a() + "..." + (bl ? " supported !" : " not supported !")));
            axy_2.b.a(axx_22, bl);
        }
        return true;
    }

    @Override
    public void c() {
        a.info((Object)"Cleaning up hardware tests...");
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            axz_2 axz_22 = this.c.get(k);
            try {
                axz_22.c();
                continue;
            }
            catch (Throwable throwable) {
                a.error((Object)("Erreur pendant le cleanup du test hardware " + axz_22.d().a()), throwable);
            }
        }
    }

    @Override
    public axx_2 d() {
        return null;
    }
}

