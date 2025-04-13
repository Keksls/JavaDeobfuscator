/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.List;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Tc
 */
public enum tc_0 implements td_0
{
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    public static final List<tc_0> f;
    public static final int g;
    private final byte h;

    private tc_0(int n2) {
        this.h = (byte)n2;
    }

    @Override
    public byte a() {
        return this.h;
    }

    @Nullable
    public static tc_0 a(byte by) {
        for (tc_0 tc_02 : tc_0.values()) {
            if (tc_02.h != by) continue;
            return tc_02;
        }
        return null;
    }

    public tb_0<tc_0> a(short s2) {
        return new tb_0<tc_0>(this, s2);
    }

    static {
        f = List.of(b, c, d);
        g = tc_0.values().length;
    }
}

