/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bUq
 */
public enum buq_0 implements aqk_2
{
    a(-1),
    b(4),
    c(13),
    d(1),
    e(11),
    f(12),
    g(3),
    h(5),
    i(6),
    j(7),
    k(8),
    l(10);

    private final byte m;

    private buq_0(byte by) {
        this.m = by;
    }

    public byte a() {
        return this.m;
    }

    @Nullable
    public static buq_0 a(byte by) {
        for (buq_0 buq_02 : buq_0.values()) {
            if (buq_02.m != by) continue;
            return buq_02;
        }
        return null;
    }

    @Override
    public String d() {
        return String.valueOf(this.m);
    }

    @Override
    public String e() {
        return this.name();
    }

    @Override
    public String f() {
        return null;
    }
}

