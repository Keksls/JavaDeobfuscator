/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJV
 */
public class bjv_2
implements ajh_1 {
    public static final String a = "name";
    public static final String b = "xpValue";
    public static final String d = "xpProgress";
    private final String e;
    private final long f;
    private final String g;

    public bjv_2(String string, long l, float f2) {
        this.e = string;
        this.f = l;
        this.g = new BigDecimal(f2).setScale(2, RoundingMode.HALF_UP) + "%";
    }

    @Override
    public String[] d() {
        return new String[]{a, b, d};
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (a.equals(string)) {
            return this.e;
        }
        if (b.equals(string)) {
            return this.f;
        }
        if (d.equals(string)) {
            return this.g;
        }
        return null;
    }
}

