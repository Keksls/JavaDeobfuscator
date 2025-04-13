/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from eqS
 */
public class eqs_2 {
    private static final Logger b = Logger.getLogger(eqs_2.class);
    public static final eqs_2 a = new eqs_2();
    private final TIntObjectHashMap<eqd_0> c = new TIntObjectHashMap();

    private eqs_2() {
    }

    public void a(eqd_0 eqd_02) {
        if (this.c.contains(eqd_02.a())) {
            throw new IllegalArgumentException("bonus d\u00e9j\u00e0 ins\u00e9r\u00e9 avec l'id " + eqd_02.a());
        }
        this.c.put(eqd_02.a(), (Object)eqd_02);
    }

    public eqd_0 a(int n) {
        return (eqd_0)this.c.get(n);
    }
}

