/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bnp
 */
final class bnp_2
extends eqk_2 {
    private final pg_1 b;
    final /* synthetic */ bnh_1 a;

    bnp_2(bnh_1 bnh_12, pg_1 pg_12) {
        this.a = bnh_12;
        this.b = pg_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fs().error((Object)"Le chemin en cours ne devrait pas \u00e9tre envoy\u00e9 par le client");
    }

    @Override
    public void b() {
        ByteBuffer byteBuffer;
        ael_2 ael_22;
        if (this.b.c != null && (ael_22 = ael_2.a(byteBuffer = ByteBuffer.wrap(this.b.c.a))) != null && this.a.bv() != null) {
            this.a.bv().a(ael_22);
        }
    }
}

