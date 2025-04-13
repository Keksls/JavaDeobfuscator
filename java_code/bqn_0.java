/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bQN
 */
public enum bqn_0 implements aqk_2
{
    a(1),
    b(2),
    c(3),
    d(4);

    private final byte e;

    private bqn_0(byte by) {
        this.e = by;
    }

    public byte a() {
        return this.e;
    }

    @Override
    public String d() {
        return String.valueOf(this.e);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return null;
    }

    public static bqn_0 a(byte by) {
        for (bqn_0 bqn_02 : bqn_0.values()) {
            if (bqn_02.e != by) continue;
            return bqn_02;
        }
        return null;
    }
}

