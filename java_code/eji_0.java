/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eJi
 */
class eji_0
extends fo_1 {
    private wf_1 e;
    final /* synthetic */ eJh d;

    eji_0(eJh eJh2) {
        this.d = eJh2;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putFloat(this.d.x);
        byteBuffer.putFloat(this.d.y);
        this.e.a(byteBuffer);
        if (eJh.a(this.d) instanceof erk_2) {
            byteBuffer.put(((erk_2)((Object)eJh.b(this.d))).dQ().c());
        } else {
            byteBuffer.put((byte)0);
        }
        byteBuffer.put((byte)this.d.D.a().ordinal());
        byteBuffer.putLong(this.d.D.c());
        byteBuffer.putInt(this.d.D.b());
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.x = byteBuffer.getFloat();
        this.d.y = byteBuffer.getFloat();
        this.e = new wf_1();
        this.e.b(byteBuffer);
        this.d.B = byteBuffer.get();
        this.d.A = new eqy_1();
        this.d.A.b(this.e);
        this.d.D = new vw_0();
        this.d.D.a(Vx.b(byteBuffer.get()));
        this.d.D.a(byteBuffer.getLong());
        this.d.D.a(byteBuffer.getInt());
    }

    @Override
    public int j() {
        this.e = new wf_1();
        this.d.A.a(this.e);
        return 8 + this.e.b() + 1 + 8 + 4 + 1;
    }
}

