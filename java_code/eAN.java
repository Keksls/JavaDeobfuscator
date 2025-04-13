/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public enum eAN {
    a(0, "item", true, 141),
    b(1, "bag", true, 142),
    c(2, "quest", true, 143),
    d(3, "cosmetic", true, 144),
    e(4, "endfight", false);

    public static final String f = ";";
    public static final String g = "o";
    private final int h;
    private final String i;
    private final boolean j;
    private final short k;

    private eAN(int n2, String string2, boolean bl) {
        this(n2, string2, bl, -1);
    }

    private eAN(int n2, String string2, boolean bl, short s2) {
        this.h = n2;
        this.i = string2;
        this.j = bl;
        this.k = s2;
    }

    public int a() {
        return this.h;
    }

    public String b() {
        return this.i;
    }

    public short c() {
        return this.k;
    }

    public boolean d() {
        return this.j;
    }

    @Nullable
    public static eAN a(int n) {
        for (eAN eAN2 : eAN.values()) {
            if (eAN2.h != n) continue;
            return eAN2;
        }
        return null;
    }

    @Nullable
    public static eAN a(String string) {
        for (eAN eAN2 : eAN.values()) {
            if (!eAN2.i.equals(string)) continue;
            return eAN2;
        }
        return null;
    }

    public static String a(eAN eAN2, Object object) {
        return eAN2.h + f + object;
    }
}

