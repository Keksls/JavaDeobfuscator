/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;

/*
 * Renamed from eZZ
 */
public class ezz_0 {
    public static final ezz_0 a = new ezz_0();
    public static final int b = 1;
    public static final int c = 2;
    private final TIntObjectHashMap<ezy_0> d = new TIntObjectHashMap();

    public ezz_0() {
        this.d.put(1, (Object)new ezy_0(1));
        this.d.put(2, (Object)new ezy_0(2));
    }

    public void a(ezy_0 ezy_02) {
        this.d.put(ezy_02.a(), (Object)ezy_02);
    }

    public ezy_0 a(int n) {
        return (ezy_0)this.d.get(n);
    }

    public boolean b(int n) {
        return this.d.contains(n);
    }

    public String toString() {
        return "PetDefinitionManager{m_definitions=" + this.d.size() + "}";
    }
}

