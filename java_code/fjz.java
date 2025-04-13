/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fjz
implements UG {
    private static final Logger a = Logger.getLogger(fjz.class);
    private final int b;
    private final apc_2 c;
    private final short d;
    private final int e;
    private final int f;
    private final int g;
    private fjC h = null;

    public fjz(int n, short s2, String string, int n2, int n3, int n4) {
        this.b = n;
        apc_2 apc_22 = null;
        try {
            apc_22 = eyS.c(string);
        }
        catch (Exception exception) {
            a.error((Object)("Impossible de compiler le crit\u00e8re " + string + " sur le cannonlink " + n), (Throwable)exception);
        }
        this.c = apc_22;
        this.d = s2;
        this.e = n2;
        this.f = n3;
        this.g = n4;
    }

    public int b() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public int f() {
        return this.g;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public apc_2 d() {
        return this.c;
    }

    @Override
    public short c() {
        return this.d;
    }

    public void a(fjC fjC2) {
        this.h = fjC2;
    }

    public boolean g() {
        return this.h != null && !Cz.f(this.h.a());
    }

    public fjC h() {
        return this.h;
    }
}

