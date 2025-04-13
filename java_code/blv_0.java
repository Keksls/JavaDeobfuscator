/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.Random;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bLV
 */
public class blv_0
implements ajh_1 {
    private static final Random h = new Random();
    private static final Logger i = Logger.getLogger(blv_0.class);
    public static final String a = "messageBody";
    public static final String b = "button1Text";
    public static final String d = "button2Text";
    public static final String e = "buttonContainer";
    public static final String f = "id";
    public static final String g = "icon";
    private static final String[] j = new String[]{"messageBody", "button1Text", "button2Text", "buttonContainer", "icon"};
    private final String k;
    private final int l;
    private final int m;
    private final int n;
    private final String o;
    private final String p;
    private final String q;
    private final Runnable r;
    private final Runnable s;
    private final Runnable t;
    private Runnable u;
    private final long v = h.nextLong();

    public blv_0(blt_0 blt_02) {
        this.k = blt_02.c();
        String string = blt_02.j();
        this.p = string == null ? null : bae.h().a(string, new Object[0]);
        String string2 = blt_02.k();
        this.q = string2 == null ? null : bae.h().a(string2, new Object[0]);
        this.l = blt_02.d();
        this.m = blt_02.e();
        this.n = blt_02.f();
        this.o = cfn_0.a(blt_02.g());
        this.r = blt_02.h();
        this.s = blt_02.i();
        this.t = blt_02.l();
    }

    @Override
    public String[] d() {
        return j;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string == null) {
            return null;
        }
        switch (string) {
            case "messageBody": {
                return this.k;
            }
            case "button1Text": {
                return this.p;
            }
            case "button2Text": {
                return this.q;
            }
            case "buttonContainer": {
                return null;
            }
            case "id": {
                return String.valueOf(this.v);
            }
            case "icon": {
                return this.o;
            }
        }
        return null;
    }

    public void a() {
        if (this.r == null) {
            return;
        }
        this.r.run();
    }

    public void b() {
        if (this.s == null) {
            return;
        }
        this.s.run();
    }

    public void c() {
        if (this.t == null) {
            return;
        }
        this.t.run();
    }

    public void a(Runnable runnable) {
        this.u = runnable;
    }

    public void e() {
        if (this.u == null) {
            return;
        }
        this.u.run();
    }

    public String f() {
        return String.valueOf(this.v);
    }

    public int g() {
        return this.l;
    }

    public int h() {
        return this.m;
    }

    public int i() {
        return this.n;
    }
}

