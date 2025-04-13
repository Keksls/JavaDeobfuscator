/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bHs
 */
public enum bhs_0 implements ajh_1
{
    a(-2),
    b(385),
    d(646);

    protected final short e;
    public static final String f = "isCosmetics";
    public static final String g = "isQuest";
    public static final String h = "isBags";
    public static final String[] i;

    private bhs_0(short s2) {
        this.e = s2;
    }

    @Override
    public String[] d() {
        return i;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(f)) {
            return this == d;
        }
        if (string.equals(h)) {
            return this == a;
        }
        if (string.equals(g)) {
            return this == b;
        }
        return null;
    }

    static {
        i = new String[]{f, g, h};
    }
}

