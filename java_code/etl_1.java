/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from eTl
 */
public class etl_1 {
    private final Map<Long, etk_1> b = new HashMap<Long, etk_1>();
    public static final etl_1 a = new etl_1();

    private etl_1() {
    }

    public etk_1 a(long l) {
        if (l <= 0L) {
            throw new etf_1("guildId can not be <= 0");
        }
        etk_1 etk_12 = this.b.get(l);
        if (etk_12 == null) {
            etk_12 = this.c(l);
        }
        return etk_12;
    }

    public etk_1 b(long l) {
        return this.c(l);
    }

    private etk_1 c(long l) {
        etk_1 etk_12 = new etk_1();
        this.b.put(l, etk_12);
        return etk_12;
    }
}

