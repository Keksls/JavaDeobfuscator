/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class agt
implements ale_1 {
    private int a;
    private long b;
    private float c;
    private boolean d;
    private boolean e;
    private short f;
    private short g;
    private float h;
    private int i;
    private int j;

    public agt() {
    }

    public agt(int n, long l, float f2, boolean bl, boolean bl2, short s2, short s3, float f3, int n2, int n3) {
        this.a = n;
        this.b = l;
        this.c = f2;
        this.d = bl;
        this.e = bl2;
        this.f = s2;
        this.g = s3;
        this.h = f3;
        this.i = n2;
        this.j = n3;
    }

    final void a(@NotNull arf_1 arf_12) {
        this.a = arf_12.c();
        this.b = arf_12.j();
        this.c = arf_12.d();
        this.d = arf_12.l();
        this.e = arf_12.l();
        this.f = arf_12.b();
        this.g = arf_12.b();
        this.h = arf_12.d();
        this.i = arf_12.c();
        this.j = arf_12.c();
    }

    final void a(@NotNull gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.c(this.b);
        gk_02.a(this.c);
        gk_02.a(this.d);
        gk_02.a(this.e);
        gk_02.a(this.f);
        gk_02.a(this.g);
        gk_02.a(this.h);
        gk_02.a(this.i);
        gk_02.a(this.j);
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public long b() {
        return this.b;
    }

    @Override
    public boolean c() {
        return this.d;
    }

    @Override
    public float d() {
        return this.c;
    }

    @Override
    public float e() {
        return this.g;
    }

    @Override
    public int f() {
        return this.j;
    }

    @Override
    public float g() {
        return this.h;
    }

    @Override
    public float h() {
        return this.f;
    }

    @Override
    public int i() {
        return this.i;
    }
}

