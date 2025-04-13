/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bSE
 */
public class bse_0
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "description";
    private final String d;
    private final String e;

    public bse_0(String string, String string2) {
        this.d = string;
        this.e = string2;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.d;
        }
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }
}

