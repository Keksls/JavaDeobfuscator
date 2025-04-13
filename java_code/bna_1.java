/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bna
 */
final class bna_1
extends eqk_2 {
    private final tn_1 b;
    final /* synthetic */ bmv_1 a;

    bna_1(bmv_1 bmv_12, tn_1 tn_12) {
        this.a = bmv_12;
        this.b = tn_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        throw new UnsupportedOperationException("Le client ne devrait pas s\u00e9rialiser les donn\u00e9es sp\u00e9cifiques de collect du NPC");
    }

    @Override
    public void b() {
        int n = this.b.c.size();
        for (int k = 0; k < n; ++k) {
            tp_2 tp_22 = this.b.c.get(k);
            this.a.aw.add(tp_22.a);
        }
    }
}

