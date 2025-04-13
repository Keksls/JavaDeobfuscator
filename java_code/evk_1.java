/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eVk
 */
public abstract class evk_1
implements ezx_1 {
    private final int a;
    private final int b;
    private final ezy_1 c;
    private final int e;
    public static final int d = -1;

    protected evk_1(int n, int n2, ezy_1 ezy_12, int n3) {
        this.a = n;
        this.b = n2;
        this.c = ezy_12;
        this.e = n3;
    }

    public int m() {
        return this.a;
    }

    public int n() {
        return this.b;
    }

    @Override
    public ezy_1 b() {
        return this.c;
    }

    @Override
    public int c() {
        return this.e;
    }
}

