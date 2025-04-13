/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fjA
extends fjB {
    private final int e;
    private final int f;
    private fjC g;
    private final apc_2 h;
    private static final Logger i = Logger.getLogger(fjA.class);

    public fjA(long l, int n, int n2, int n3, String string) {
        super(l, n);
        this.e = n2;
        this.f = n3;
        this.h = this.a(l, string);
    }

    public fjA(long l, int n, int n2, int n3, int n4, fjv fjv2, String string) {
        super(l, n, n4, fjv2);
        this.e = n2;
        this.f = n3;
        this.h = this.a(l, string);
    }

    private apc_2 a(long l, String string) {
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(string);
        }
        catch (Exception exception) {
            i.warn((Object)("Unable to load DragoInfo for drago id " + l));
        }
        if (apc_22 == null) {
            apc_22 = aov_2.a;
        }
        return apc_22;
    }

    public int a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public void a(fjC fjC2) {
        this.g = fjC2;
    }

    public boolean c() {
        return this.g != null && !Cz.f(this.g.a());
    }

    public boolean a(epq_2 epq_22) {
        return this.h == null || this.h.b(epq_22, null, this, epq_22.Q_());
    }

    public fjC d() {
        return this.g;
    }

    public String toString() {
        return "DragoInfo{m_exitX=" + this.e + ", m_exitY=" + this.f + ", m_loading=" + this.g + "}";
    }
}

