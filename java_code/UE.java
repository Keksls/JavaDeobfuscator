/*
 * Decompiled with CFR 0.152.
 */
public class UE
implements tw_0 {
    private final long a;
    private final boolean b;

    public UE(long l) {
        this(l, false);
    }

    public UE(long l, boolean bl) {
        this.b = bl;
        this.a = l;
    }

    public boolean isValid(ts_0 ts_02) {
        boolean bl;
        boolean bl2 = bl = ts_02.a() == this.a;
        return this.b ? !bl : bl;
    }
}

