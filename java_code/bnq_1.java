/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TByteIntHashMap
 */
import gnu.trove.map.hash.TByteIntHashMap;

/*
 * Renamed from bnq
 */
final class bnq_1
extends eqk_2 {
    private final qb_2 b;
    final /* synthetic */ bnh_1 a;

    bnq_1(bnh_1 bnh_12, qb_2 qb_22) {
        this.a = bnh_12;
        this.b = qb_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
        try {
            if (this.a.cz == null) {
                this.a.cz = new TByteIntHashMap();
            } else {
                this.a.cz.clear();
            }
            if (this.a.aj == null) {
                this.a.aj = new TByteIntHashMap();
            } else {
                this.a.aj.clear();
            }
            for (qe_2 qe_22 : this.b.c) {
                this.a.cz.put(qe_22.a, qe_22.b);
                this.a.aj.put(qe_22.a, qe_22.c > 0 ? qe_22.c : qe_22.b);
            }
            this.a.bI();
        }
        catch (Exception exception) {
            bnh_1.fo().error((Object)("Exception \u00e0 la deserialisation de l'apparence d'un personnage id=" + this.a.a_()), (Throwable)exception);
        }
    }
}

