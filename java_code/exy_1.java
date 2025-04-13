/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eXY
 */
public enum exy_1 implements aqk_2
{
    a(0, "NOT_RECYCLABLE"),
    b(1, "SHARD"),
    c(2, "POWDER");

    private final String d;
    private final byte e;

    private exy_1(byte by, String string2) {
        this.e = by;
        this.d = string2;
    }

    @Nullable
    public static exy_1 a(int n) {
        for (exy_1 exy_12 : exy_1.values()) {
            if (exy_12.e != n) continue;
            return exy_12;
        }
        return null;
    }

    @Override
    public String d() {
        return Integer.toString(this.e);
    }

    @Override
    public String e() {
        return this.d;
    }

    @Override
    public String f() {
        return this.d;
    }

    public static exy_1 a(byte by) {
        for (exy_1 exy_12 : exy_1.values()) {
            if (exy_12.e != by) continue;
            return exy_12;
        }
        return a;
    }
}

