/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bij
 */
public class bij_2
implements ajh_1 {
    public static final String a = "name";
    private static final Map<bii_2, bij_2> b = new EnumMap<bii_2, bij_2>(bii_2.class);
    private final bii_2 d;

    public static bij_2 a(bii_2 bii_22) {
        return b.get((Object)bii_22);
    }

    private bij_2(bii_2 bii_22) {
        this.d = bii_22;
    }

    public bii_2 a() {
        return this.d;
    }

    @Override
    public String[] d() {
        return b_;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return bae.h().a("mercenary.filter." + this.d.ordinal(), new Object[0]);
        }
        return null;
    }

    public String toString() {
        return "MercenaryFilterView{m_filter=" + this.d + "}";
    }

    static {
        for (bii_2 bii_22 : bii_2.values()) {
            b.put(bii_22, new bij_2(bii_22));
        }
    }
}

