/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class eKq {
    public static final short a = -1;
    private short b;
    private short c;
    private short d;
    private short e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private final erd_2 m;
    private final eKp n;

    public eKq(@NotNull erd_2 erd_22, @NotNull eKp eKp2) {
        this.m = erd_22;
        this.n = eKp2;
        this.b = 0;
        this.c = (short)10;
        this.e = (short)-1;
        this.d = (short)-1;
        this.f = true;
        this.g = false;
        this.h = true;
        this.i = false;
        this.k = false;
        this.l = false;
        this.j = true;
    }

    public short a() {
        return this.b;
    }

    public short b() {
        return this.d != -1 ? this.d : this.c;
    }

    public short c() {
        return this.e != -1 ? this.e : this.c;
    }

    public short d() {
        return this.c;
    }

    public boolean e() {
        return this.f;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public erd_2 h() {
        return this.m;
    }

    public eKp i() {
        return this.n;
    }

    public void a(short s2) {
        this.b = s2;
    }

    public void b(short s2) {
        this.c = s2;
    }

    public void a(short s2, short s3, short s4) {
        this.c = s2;
        this.d = s3;
        this.e = s4;
    }

    public void a(boolean bl) {
        this.f = bl;
    }

    public void b(boolean bl) {
        this.g = bl;
    }

    public void c(boolean bl) {
        this.h = bl;
    }

    public boolean j() {
        return this.i;
    }

    public void d(boolean bl) {
        this.i = bl;
    }

    public boolean k() {
        return this.k;
    }

    public void e(boolean bl) {
        this.k = bl;
    }

    public boolean l() {
        return this.l;
    }

    public void f(boolean bl) {
        this.l = bl;
    }

    public boolean m() {
        return this.j;
    }

    public void g(boolean bl) {
        this.j = bl;
    }
}

