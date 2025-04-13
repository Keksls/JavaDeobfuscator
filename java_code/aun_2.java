/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from aun
 */
public class aun_2
implements aul_2 {
    protected static final Logger a = Logger.getLogger(aun_2.class);
    public static final aun_2 b = new aun_2();
    private final ArrayList<aul_2> c = new ArrayList();

    private aun_2() {
    }

    public void a(aul_2 aul_22) {
        this.c.add(aul_22);
    }

    @Override
    public void a() {
        a.info((Object)"Initializing benchmarks...");
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            aul_2 aul_22 = this.c.get(k);
            try {
                aul_22.a();
                continue;
            }
            catch (Exception exception) {
                a.error((Object)("Erreur \u00e0 l'initialisation du benchmark " + aul_22.c()), (Throwable)exception);
            }
        }
    }

    @Override
    public void a(aum_2 aum_22) {
        a.info((Object)"Running benchmarks...");
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            aul_2 aul_22 = this.c.get(k);
            a.info((Object)("\t* benchmarking " + aul_22.c() + "..."));
            try {
                aul_22.a(aum_22);
                continue;
            }
            catch (Exception exception) {
                a.error((Object)("Erreur \u00e0 l'execution du benchmark " + aul_22.c()), (Throwable)exception);
            }
        }
    }

    @Override
    public void b() {
        a.info((Object)"Cleaning up benchmarks...");
        int n = this.c.size();
        for (int k = 0; k < n; ++k) {
            aul_2 aul_22 = this.c.get(k);
            try {
                aul_22.b();
                continue;
            }
            catch (Exception exception) {
                a.error((Object)("Erreur au cleanup du benchmark " + aul_22.c()), (Throwable)exception);
            }
        }
    }

    @Override
    public String c() {
        return "Benchmark runner";
    }
}

