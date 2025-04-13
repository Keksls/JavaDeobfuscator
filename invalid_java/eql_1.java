/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eqL
 */
class eql_1
extends WY<eqk_1> {
    final /* synthetic */ eqk_1 d;

    eql_1(eqk_1 eqk_12, eqk_1 eqk_13, int n) {
        this.d = eqk_12;
        super(eqk_13, n);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        byteBuffer.putLong(this.d.c);
    }

    @Override
    public void a(ByteBuffer byteBuffer, int n) {
        this.d.c = byteBuffer.getLong();
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }
}

