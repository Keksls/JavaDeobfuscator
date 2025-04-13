/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eUK
 */
public final class euk_1
implements eui_1 {
    private byte a;
    private byte b;

    euk_1() {
    }

    public euk_1(byte by, byte by2) {
        this.a = by;
        this.b = by2;
    }

    public byte b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    @Override
    public byte[] a() {
        return new byte[]{this.a, this.b};
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
        this.b = byteBuffer.get();
    }

    @Override
    public short d() {
        return 4;
    }
}

