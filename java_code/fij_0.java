/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fiJ
 */
public enum fij_0 implements aqk_2
{
    a(0, "NO_FLAG");

    private final String b;
    private final int c;

    private fij_0(int n2, String string2) {
        this.c = n2;
        this.b = string2;
    }

    public int a() {
        return this.c;
    }

    @Override
    public String d() {
        return Integer.toString(this.c);
    }

    @Override
    public String e() {
        return this.b;
    }

    @Override
    public String f() {
        return null;
    }
}

