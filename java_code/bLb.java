/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public enum bLb implements ajh_1
{
    a(0),
    b(1),
    d(5),
    e(2),
    f(3),
    g(4);

    public static final String h = "name";
    public static final List<bLb> i;
    public static final bLb j;
    public static final List<bLb> k;
    public static final bLb l;
    private static final bLb[] m;
    private final int n;

    private bLb(int n2) {
        this.n = n2;
    }

    public int a() {
        return this.n;
    }

    @NotNull
    public static bLb a(int n) {
        for (bLb bLb2 : m) {
            if (bLb2.n != n) continue;
            return bLb2;
        }
        return b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(h)) {
            return bae.h().a("market.options.keepFieldMode." + this.n, new Object[0]);
        }
        return null;
    }

    @Override
    public String[] d() {
        return new String[]{h};
    }

    static {
        i = List.of(a, d, b, g);
        j = a;
        k = List.of(a, d, b, e, f);
        l = b;
        m = bLb.values();
    }
}

