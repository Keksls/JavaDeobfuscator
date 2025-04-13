/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aeN
 */
public abstract class aen_0 {
    protected short a;
    protected short b;

    public aen_0() {
        this(0, 0);
    }

    public aen_0(short s2, short s3) {
        this.a = s2;
        this.b = s3;
    }

    public final short a() {
        return this.a;
    }

    public final short b() {
        return this.b;
    }

    public final void a(short s2, short s3) {
        this.a = s2;
        this.b = s3;
    }

    public final boolean a(int n, int n2) {
        int n3 = this.a * 18;
        int n4 = this.b * 18;
        return n >= n3 && n < n3 + 18 && n2 >= n4 && n2 < n4 + 18;
    }

    public abstract void c();

    public void a(@NotNull arf_1 arf_12) {
        this.a = arf_12.b();
        this.b = arf_12.b();
    }

    public void a(@NotNull gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.a(this.b);
    }

    public final int a(int n) {
        assert (n >= 0 && n < 18);
        return n + this.a * 18;
    }

    public final int b(int n) {
        assert (n >= 0 && n < 18);
        return n + this.b * 18;
    }
}

