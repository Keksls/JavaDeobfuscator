/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eZU
 */
public class ezu_0
extends eZR
implements eZS {
    private short d;
    private boolean e;

    public ezu_0(short s2) {
        this.d = s2;
    }

    public ezu_0() {
    }

    public short a() {
        return this.d;
    }

    @Override
    public byte e() {
        return 2;
    }

    public boolean b() {
        return this.e;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    @Override
    public void a(short s2) {
        this.d = s2;
    }

    @Override
    public void a(abx_2 abx_22) {
        abx_22.a(this.d);
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.d = byteBuffer.getShort();
    }
}

