/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bLY
 */
public enum bly_0 implements aqk_2
{
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final int f;

    private bly_0(int n2) {
        this.f = n2;
    }

    public static bly_0 a(int n) {
        for (bly_0 bly_02 : bly_0.values()) {
            if (bly_02.f != n) continue;
            return bly_02;
        }
        return a;
    }

    public int a() {
        return this.f;
    }

    @Override
    public String d() {
        return String.valueOf(this.f);
    }

    @Override
    public String e() {
        return this.toString();
    }

    @Override
    public String f() {
        return null;
    }
}

