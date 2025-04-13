/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Collection;
import java.util.Collections;

/*
 * Renamed from eBI
 */
public final class ebi_0 {
    public static final ebi_0 a = new ebi_0();
    private final TIntObjectMap<ebh_0> b = new TIntObjectHashMap();
    private ebh_0 c;

    private ebi_0() {
    }

    public void a(ebh_0 ebh_02) {
        this.b.put(ebh_02.a(), (Object)ebh_02);
        this.b(ebh_02);
    }

    private void b(ebh_0 ebh_02) {
        if (this.c == null) {
            this.c = ebh_02;
        } else if (this.c.e() < ebh_02.e()) {
            this.c = ebh_02;
        }
    }

    public Collection<ebh_0> a() {
        return Collections.unmodifiableCollection(this.b.valueCollection());
    }

    public ebh_0 b() {
        return this.c;
    }
}

