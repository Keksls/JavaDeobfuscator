/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bla
 */
public class bla_0
implements ajh_1 {
    public static final String a = "iconUrl";
    public static final String b = "iconId";
    private final int e;
    public static final String[] d = new String[]{"iconUrl", "iconId"};

    public bla_0(int n) {
        this.e = n;
    }

    @Override
    public String[] d() {
        return d;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return azs_0.a().n(String.valueOf(this.e));
        }
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }

    public int a() {
        return this.e;
    }
}

