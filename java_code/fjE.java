/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fjE
extends fjB {
    private static final Logger e = Logger.getLogger(fjE.class);
    private final apc_2 f;
    private final int g;
    private final int h;
    private final int i;
    private fjC j;
    private int k;
    private int l;

    public fjE(long l, int n, int n2, int n3, int n4, String string) {
        super(l, n);
        this.g = n2;
        this.h = n3;
        this.i = n4;
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(string);
        }
        catch (Exception exception) {
            e.error((Object)("Impossible de compiler le crit\u00e8re " + string + " sur le zaap " + l), (Throwable)exception);
        }
        this.f = apc_22;
    }

    public fjE(long l, int n, int n2, int n3, int n4, String string, int n5, fjv fjv2, int n6, int n7) {
        super(l, n, n5, fjv2);
        this.g = n2;
        this.h = n3;
        this.i = n4;
        this.k = n6;
        this.l = n7;
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(string);
        }
        catch (Exception exception) {
            e.error((Object)("Impossible de compiler le crit\u00e8re " + string + " sur le zaap " + l), (Throwable)exception);
        }
        this.f = apc_22;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public boolean a(epq_2 epq_22) {
        return this.f == null || this.f.b(epq_22, null, this, epq_22.Q_());
    }

    public void a(fjC fjC2) {
        this.j = fjC2;
    }

    public boolean d() {
        return this.j != null && !Cz.f(this.j.a());
    }

    public fjC i() {
        return this.j;
    }

    public int j() {
        return this.k;
    }

    public int k() {
        return this.l;
    }

    public String toString() {
        return "ZaapInfo{m_id=" + this.a + ", m_exitX=" + this.g + ", m_exitY=" + this.h + ", m_exitWorldId=" + this.i + "}";
    }
}

