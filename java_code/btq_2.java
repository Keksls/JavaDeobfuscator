/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from bTQ
 */
class btq_2
implements Comparator<btj_2> {
    final /* synthetic */ bto_2 a;

    btq_2(bto_2 bto_22) {
        this.a = bto_22;
    }

    public int a(btj_2 btj_22, btj_2 btj_23) {
        return btj_22.b() - btj_23.b();
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((btj_2)object, (btj_2)object2);
    }
}

