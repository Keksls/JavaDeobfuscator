/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bnc
 */
final class bnc_2
extends eqk_2 {
    private final pg_1 b;
    final /* synthetic */ bmv_1 a;

    bnc_2(bmv_1 bmv_12, pg_1 pg_12) {
        this.a = bmv_12;
        this.b = pg_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bmv_1.di().error((Object)"Le client ne devrait pas s\u00e9rialiser le chemin courant du NPC");
    }

    @Override
    public void b() {
        ByteBuffer byteBuffer;
        ael_2 ael_22;
        if (this.b.c != null && (ael_22 = ael_2.a(byteBuffer = ByteBuffer.wrap(this.b.c.a))) != null) {
            this.a.bv().a(ael_22);
        }
    }
}

