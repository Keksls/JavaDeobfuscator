/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bvT
 */
public class bvt_1
implements ajh_1 {
    private final bhg_0 b;
    private static final Map<Short, bvt_1> d = new HashMap<Short, bvt_1>();
    public static final bvt_1 a = new bvt_1(null);
    private static final String e = "name";
    private static final String[] f = new String[]{"name"};

    private bvt_1(bhg_0 bhg_02) {
        this.b = bhg_02;
    }

    public bhg_0 a() {
        return this.b;
    }

    public static bvt_1 a(bhg_0 bhg_02) {
        if (bhg_02 == null) {
            return a;
        }
        Short s2 = bhg_02.d();
        if (!d.containsKey(s2)) {
            d.put(s2, new bvt_1(bhg_02));
        }
        return d.get(s2);
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (e.equals(string)) {
            if (this.b == null) {
                return bae.h().a("exchange.machine.allType", new Object[0]);
            }
            return this.b.a();
        }
        return null;
    }
}

