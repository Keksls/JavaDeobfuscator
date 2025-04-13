/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import org.apache.log4j.Logger;

public abstract class TB<T extends TG> {
    protected static final Logger a = Logger.getLogger(TB.class);
    private final TShortObjectHashMap<abn_1<T>> b = new TShortObjectHashMap();

    public final void a(Tz<T>[] tzArray) {
        for (Tz<T> tz : tzArray) {
            this.b.put(tz.a(), tz.b());
        }
    }

    public final abn_1<T> b(short s2) {
        return (abn_1)this.b.get(s2);
    }
}

