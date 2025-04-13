/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eUJ
 */
public final class euj_1
implements eui_1 {
    private byte a;

    euj_1() {
    }

    public euj_1(byte by) {
        this.a = by;
    }

    public byte b() {
        return this.a;
    }

    @Override
    public byte[] a() {
        return new byte[]{this.a};
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.get();
    }

    @Override
    public short d() {
        return 3;
    }
}

