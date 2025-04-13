/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fgv
 */
public class fgv_0<T extends fgR<?>> {
    protected static final Logger a = Logger.getLogger(fgv_0.class);
    private int b;
    private long c;
    private fgy_0 d;
    private T e;

    protected fgv_0(int n, long l) {
        this.b = n;
        this.c = l;
    }

    public int e() {
        return this.b;
    }

    protected void a(int n) {
        this.b = n;
    }

    public long f() {
        return this.c;
    }

    public void a(long l) {
        this.c = l;
    }

    public T g() {
        return this.e;
    }

    protected void a(T t) {
        this.e = t;
    }

    @Nullable
    public fgy_0 h() {
        return this.d;
    }

    public void a(fgy_0 fgy_02) {
        this.d = fgy_02;
    }

    public String toString() {
        return "AbstractTerritory {id=" + this.b + ", protector=" + (this.d != null ? Integer.valueOf(this.d.B()) : null) + "}";
    }
}

