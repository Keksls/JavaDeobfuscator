/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongObjectHashMap
 */
import gnu.trove.map.hash.TLongObjectHashMap;

/*
 * Renamed from eZP
 */
public class ezp_0 {
    private final TLongObjectHashMap<eZR> a = new TLongObjectHashMap();

    public void a(exk_2 exk_22, long l, short s2) {
        long l2 = exk_22.a();
        if (this.a.contains(l2)) {
            throw new ezo_0("On add l'objet " + l2 + " d\u00e9j\u00e0 pr\u00e9sent dans les sacs");
        }
        this.a.put(l2, (Object)new ezq_0(exk_22, l, s2));
    }

    public void a(long l) {
        if (this.a.contains(l) && this.a.remove(l) instanceof ezq_0) {
            return;
        }
        this.a.put(l, (Object)new ezt_0());
    }

    public void a(long l, short s2) {
        eZR eZR2 = (eZR)this.a.get(l);
        if (eZR2 == null) {
            this.a.put(l, (Object)new ezu_0(s2));
            return;
        }
        if (eZR2 instanceof ezt_0) {
            throw new ezo_0("On essaye de mettre \u00e0 jour l'objet " + l + " qui a d\u00e9j\u00e0 \u00e9t\u00e9 remove du sac");
        }
        ((eZS)((Object)eZR2)).a(s2);
    }

    public void a(TLongObjectHashMap<eZR> tLongObjectHashMap) {
        this.a.putAll(tLongObjectHashMap);
    }

    public TLongObjectHashMap<eZR> a() {
        return this.a;
    }

    public void b() {
        this.a.clear();
    }
}

