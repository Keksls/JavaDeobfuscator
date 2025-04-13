/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Collection;
import java.util.Collections;

public class FV {
    private final TShortObjectHashMap<FU> a = new TShortObjectHashMap();

    public void a(FU fU) {
        this.a.put(fU.a(), (Object)fU);
    }

    public Collection<FU> a() {
        return Collections.unmodifiableCollection(this.a.valueCollection());
    }

    public FU a(short s2) {
        return (FU)this.a.get(s2);
    }

    public void b() {
        this.a.clear();
    }
}

