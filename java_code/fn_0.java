/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.decorator.TShortObjectMapDecorator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.decorator.TShortObjectMapDecorator;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.Collections;
import java.util.Map;

/*
 * Renamed from FN
 */
public class fn_0 {
    private final TShortObjectHashMap<fm_0> a = new TShortObjectHashMap();

    public fm_0 a(fm_0 fm_02) {
        return (fm_0)this.a.put(fm_02.a(), (Object)fm_02);
    }

    public Map<Short, fm_0> a() {
        return Collections.unmodifiableMap(new TShortObjectMapDecorator(this.a));
    }

    public boolean b() {
        return this.a.isEmpty();
    }

    public fm_0 a(short s2) {
        return (fm_0)this.a.get(s2);
    }

    public void c() {
        this.a.clear();
    }
}

