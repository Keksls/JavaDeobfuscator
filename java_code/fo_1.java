/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from fo
 */
public abstract class fo_1 {
    protected static final Logger a = Logger.getLogger(fo_1.class);
    private static final int d = 32;
    private fn_1 e;
    protected boolean b = false;
    public static final fo_1 c = new fp_1();
    private final int f;

    public fo_1() {
        this.f = 32;
    }

    public fo_1(int n) {
        this.f = n;
    }

    public fn_1 c() {
        return this.e;
    }

    public void a(fn_1 fn_12) {
        this.e = fn_12;
    }

    public void d() {
        this.b = false;
        this.e = null;
    }

    public void e() {
        if (this.e != null) {
            this.e.a();
        }
    }

    public void f() {
        if (this.e != null) {
            this.e.b();
        }
    }

    protected void g() {
        this.b = false;
    }

    protected void a(String string) {
        a.error((Object)string);
        this.b = true;
    }

    protected void a(String string, Exception exception) {
        a.error((Object)string, (Throwable)exception);
        this.b = true;
    }

    public boolean h() {
        return this.b;
    }

    void i() {
        this.b = false;
    }

    public int j() {
        return this.f;
    }

    public abstract void a(ByteBuffer var1);

    public abstract void a(ByteBuffer var1, int var2);
}

