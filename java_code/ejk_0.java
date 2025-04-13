/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eJk
 */
class ejk_0
extends fo_1 {
    private wf_1 e;
    final /* synthetic */ eJj d;

    ejk_0(eJj eJj2) {
        this.d = eJj2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.e.a(byteBuffer);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        epq_2 epq_22 = (epq_2)this.d.h();
        this.e = new wf_1();
        this.e.b(byteBuffer);
        this.d.v = epq_22.aZ() == null ? erg_2.b().a() : erg_2.b().a((short)100, epq_22.aZ().a(), epq_22.aZ().e(), false, false, false);
        this.d.v.b(this.e);
    }

    @Override
    public int j() {
        this.e = new wf_1();
        this.d.v.a(this.e);
        return this.e.b();
    }
}

