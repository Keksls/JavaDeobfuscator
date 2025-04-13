/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctC
 */
public class ctc_1
extends ps_0 {
    private flf_0 a;
    private boolean b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.get() != 0;
        this.a = flf_0.b(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            A.error((Object)("Il reste " + byteBuffer.remaining() + " bytes inutilis\u00e9s"));
            return false;
        }
        return true;
    }

    @Override
    public int a() {
        return 12553;
    }

    public int b() {
        return this.a.a();
    }

    public flf_0 c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }
}

