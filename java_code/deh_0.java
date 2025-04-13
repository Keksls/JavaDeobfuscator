/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from deh
 */
public class deh_0
implements ahr_1 {
    private static final boolean a = false;
    private static final Logger b = Logger.getLogger(deh_0.class);
    private static final deh_0 c = new deh_0();
    private final TShortObjectHashMap<dex_0> d = new TShortObjectHashMap();

    public deh_0() {
        this.d.put((short)17211, (Object)new dev_0());
        this.d.put((short)17820, (Object)new dew_0());
    }

    public static deh_0 a() {
        return c;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        dex_0 dex_02 = (dex_0)this.d.get((short)adt_12.a());
        return dex_02 == null || dex_02.a(adt_12);
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

