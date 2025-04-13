/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from QW
 */
class qw_0
extends fo_1 {
    static final /* synthetic */ boolean d;
    final /* synthetic */ qv_0 e;

    qw_0(qv_0 qv_02) {
        this.e = qv_02;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putShort(this.e.d);
        byteBuffer.putInt(this.e.a);
        byteBuffer.putInt(this.e.b);
        byteBuffer.putShort(this.e.c);
        byteBuffer.putShort(this.e.e);
        byteBuffer.put(this.e.f ? (byte)1 : 0);
        byteBuffer.put(this.e.g ? (byte)1 : 0);
        byteBuffer.put(this.e.j);
        byteBuffer.putShort(this.e.k);
        byteBuffer.putShort((short)this.e.l.size());
        for (aff_1 aff_12 : this.e.l) {
            byteBuffer.putInt(aff_12.d());
            byteBuffer.putInt(aff_12.e());
            byteBuffer.putShort(aff_12.f());
        }
        Object object = Cz.a(this.e.m);
        if (!d && ((Object)object).length >= 65535) {
            throw new AssertionError((Object)"chaine des parametres trop longue");
        }
        byteBuffer.putShort((short)(((Object)object).length & 0xFFFF));
        byteBuffer.put((byte[])object);
        byteBuffer.put((byte)this.e.o.length);
        for (int k = 0; k < this.e.o.length; ++k) {
            byteBuffer.put((byte)this.e.o[k]);
        }
        byteBuffer.putInt(this.e.n);
        byteBuffer.put((byte)(this.e.h ? 1 : 0));
        byteBuffer.put((byte)(this.e.i ? 1 : 0));
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int j() {
        byte[] byArray = Cz.a(this.e.m);
        return 23 + (2 + 10 * this.e.l.size()) + (2 + byArray.length) + (1 + this.e.o.length) + 2;
    }

    static {
        d = !qv_0.class.desiredAssertionStatus();
    }
}

