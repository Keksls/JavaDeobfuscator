/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJK
 */
public class fjk_1
implements zf_0 {
    private final fvE a;

    public fjk_1(fvE fvE2) {
        this.a = fvE2;
    }

    @Override
    public int a() {
        return this.a.getScreenX() - fta_0.getInstance().getWidth() / 2;
    }

    @Override
    public int b() {
        return this.a.getScreenY() - fta_0.getInstance().getHeight() / 2;
    }

    @Override
    public int c() {
        return this.a.getWidth();
    }

    @Override
    public int d() {
        return this.a.getHeight();
    }
}

