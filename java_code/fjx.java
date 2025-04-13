/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fjx {
    private static final Logger a = Logger.getLogger(fjx.class);
    private final long b;
    private final int c;
    private final int d;
    private final apc_2 e;
    private final apc_2 f;
    private fjC g;

    public fjx(long l, int n, int n2, String string, String string2) {
        this.b = l;
        this.c = n;
        this.d = n2;
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(string);
        }
        catch (Exception exception) {
            a.error((Object)("[LD] Erreur au chargement du crit\u00e8re " + string + " du BoatLink " + l), (Throwable)exception);
        }
        this.e = apc_22;
        apc_2 apc_23 = null;
        try {
            apc_23 = eyS.c(string2);
        }
        catch (Exception exception) {
            a.error((Object)("[LD] Erreur au chargement du crit\u00e8re " + string2 + " du BoatLink " + l), (Throwable)exception);
        }
        this.f = apc_23;
    }

    public long a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public apc_2 d() {
        return this.e;
    }

    public boolean a(epq_2 epq_22, TG tG) {
        return this.e == null || this.e.b(epq_22, tG, this, epq_22.Q_());
    }

    public boolean b(epq_2 epq_22, TG tG) {
        return this.f == null || this.f.b(epq_22, tG, this, epq_22.Q_());
    }

    public void a(fjC fjC2) {
        this.g = fjC2;
    }

    public boolean e() {
        return this.g != null && !Cz.f(this.g.a());
    }

    public fjC f() {
        return this.g;
    }
}

