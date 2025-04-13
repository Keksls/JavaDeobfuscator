/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fak
 */
public class fak_0
implements faq {
    private final int b;
    private final int c;
    private final int d;
    private final wx_0 e;
    private final wu_0 f;
    private final wu_0 g;
    private final boolean h;

    public fak_0(int n, int n2, int n3, wu_0 wu_02, wx_0 wx_02, wu_0 wu_03, boolean bl) {
        this.b = n;
        this.c = n2;
        this.e = wx_02;
        this.f = wu_02;
        this.g = wu_03;
        this.h = bl;
        this.d = wx_02.f() ? 0 : n3;
    }

    @Override
    public int a() {
        return this.b;
    }

    @Override
    public int b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.d;
    }

    @Override
    public wx_0 d() {
        return this.e;
    }

    @Override
    public wu_0 e() {
        return this.f;
    }

    @Override
    public wu_0 f() {
        return this.g;
    }

    @Override
    public boolean g() {
        return this.h;
    }
}

