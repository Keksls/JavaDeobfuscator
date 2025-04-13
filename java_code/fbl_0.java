/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from fbL
 */
public enum fbl_0 implements aqk_2
{
    a(-1, "Nation ennemie"),
    b(1, "Nation alli\u00e9e");

    private final byte c;
    private final String d;

    private fbl_0(int n2, String string2) {
        this.c = (byte)n2;
        this.d = string2;
    }

    public byte a() {
        return this.c;
    }

    @Override
    public String d() {
        return String.valueOf(this.c);
    }

    @Override
    public String e() {
        return this.d;
    }

    @Override
    public String f() {
        return null;
    }

    @Nullable
    public static fbl_0 a(byte by) {
        for (fbl_0 fbl_02 : fbl_0.values()) {
            if (fbl_02.c != by) continue;
            return fbl_02;
        }
        return null;
    }
}

