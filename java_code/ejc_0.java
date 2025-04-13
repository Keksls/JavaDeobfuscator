/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eJc
 */
class ejc_0
extends fo_1 {
    private wf_1 e;
    private xp_2 f;
    final /* synthetic */ eJb d;

    ejc_0(eJb eJb2) {
        this.d = eJb2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.put(this.d.D ? (byte)1 : 0);
        this.e.a(byteBuffer);
        this.f.a(byteBuffer);
        byteBuffer.put((byte)this.d.A.a().ordinal());
        byteBuffer.putLong(this.d.A.c());
        byteBuffer.putInt(this.d.A.b());
        byteBuffer.put(this.d.C);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.D = byteBuffer.get() == 1;
        this.e = new wf_1();
        this.e.b(byteBuffer);
        this.f = new xp_2();
        this.f.b(byteBuffer);
        this.d.z = new eqy_1();
        this.d.z.b(this.e);
        this.d.B = new eri_2();
        this.d.B.b(this.f);
        this.d.A = new vw_0();
        this.d.A.a(Vx.b(byteBuffer.get()));
        this.d.A.a(byteBuffer.getLong());
        this.d.A.a(byteBuffer.getInt());
        this.d.z.b(byteBuffer.get());
    }

    @Override
    public int j() {
        this.e = new wf_1();
        this.d.z.a(this.e);
        this.f = new xp_2();
        this.d.B.a(this.f);
        return 1 + this.e.b() + this.f.b() + 1 + 8 + 4 + 1;
    }
}

