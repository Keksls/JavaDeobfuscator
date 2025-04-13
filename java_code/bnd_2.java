/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bnd
 */
final class bnd_2
extends eqk_2 {
    private final tq_1 b;
    final /* synthetic */ bmv_1 a;

    bnd_2(bmv_1 bmv_12, tq_1 tq_12) {
        this.a = bmv_12;
        this.b = tq_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmv_1.dj().error((Object)"Le client ne devrait pas s\u00e9rialiser le groupe du NPC");
    }

    @Override
    public void b() {
        this.a.au = this.b.c;
        if (this.a.au != 0L) {
            boq_1.a().a(this.a, this.b.d);
        } else if (!this.a.ab_() && !this.a.S_()) {
            bmv_1.dl().warn((Object)("D\u00e9serialisation d'un NPC id=" + bmv_1.a(this.a) + " avec un groupId=0 : anormal"));
        }
    }
}

