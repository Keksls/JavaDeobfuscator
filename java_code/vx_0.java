/*
 * Decompiled with CFR 0.152.
 */
import java.text.MessageFormat;

/*
 * Renamed from VX
 */
public class vx_0 {
    short a;
    boolean b;
    short c;
    boolean d;

    protected vx_0() {
    }

    public short a() {
        return this.c;
    }

    public boolean b() {
        return this.d;
    }

    public static vx_0 c() {
        return new vx_0();
    }

    public static vx_0 a(int n) {
        vx_0 vx_02 = new vx_0();
        vx_02.a = (short)n;
        return vx_02;
    }

    public vx_0 a(boolean bl) {
        this.b = bl;
        return this;
    }

    public vx_0 a(short s2) {
        this.c = s2;
        return this;
    }

    public boolean d() {
        return this.b;
    }

    public short e() {
        return this.a;
    }

    public vx_0 b(boolean bl) {
        this.d = bl;
        return this;
    }

    public boolean f() {
        return this.a <= 0;
    }

    public String toString() {
        return MessageFormat.format("{0}T{1}{2}", this.a, this.b ? "+" : "-", this.d ? "!" : "");
    }

    public void b(int n) {
        this.a = (short)n;
    }
}

