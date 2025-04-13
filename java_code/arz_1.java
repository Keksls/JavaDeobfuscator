/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TIntObjectIterator
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TIntObjectIterator;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.apache.log4j.Logger;

/*
 * Renamed from arZ
 */
public final class arz_1
implements asg_1 {
    private static final Logger a = Logger.getLogger(arz_1.class);
    private static final arz_1 b = new arz_1();
    private final TIntObjectHashMap<art_1> c = new TIntObjectHashMap();
    private static final Object d = new Object();

    private arz_1() {
    }

    public static arz_1 a() {
        return b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(art_1 art_12) {
        Object object = d;
        synchronized (object) {
            if (!this.c.contains(art_12.d())) {
                this.c.put(art_12.d(), (Object)art_12);
                art_12.a(this);
            } else {
                a.error((Object)("Multiple enregistrements d'un binary storage travaillant sur " + art_12.f()));
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public art_1 a(int n) {
        Object object = d;
        synchronized (object) {
            return (art_1)this.c.get(n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public art_1 a(String string) {
        Object object = d;
        synchronized (object) {
            if (!this.c.contains(string.hashCode())) {
                art_1 art_12 = new art_1(string);
                art_12.a(string.hashCode());
                this.a(art_12);
            }
            return (art_1)this.c.get(string.hashCode());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b() {
        Object object = d;
        synchronized (object) {
            TIntObjectIterator tIntObjectIterator = this.c.iterator();
            while (tIntObjectIterator.hasNext()) {
                tIntObjectIterator.advance();
                ((art_1)tIntObjectIterator.value()).a();
            }
        }
    }

    @Override
    public void a(arm_1 arm_12, String string) {
        a.info((Object)("Enregistrement du binary storage travaillant sur " + arm_12.f()));
    }

    @Override
    public void a(arm_1 arm_12, ars_1 ars_12) {
    }

    @Override
    public void b(arm_1 arm_12, ars_1 ars_12) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(arm_1 arm_12) {
        Object object = d;
        synchronized (object) {
            this.c.remove(arm_12.d());
            a.info((Object)("Desenregistrement du binary storage travaillant sur " + arm_12.f() + " (" + this.c.size() + " binary storage restants)"));
        }
    }

    @Override
    public void c(arm_1 arm_12, ars_1 ars_12) {
    }
}

