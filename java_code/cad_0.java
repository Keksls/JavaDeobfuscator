/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAD
 */
public class cad_0
extends ps_0 {
    private byte a;
    private long b;
    private wt_0 c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        this.b = byteBuffer.getLong();
        this.c = wt_0.b(byteBuffer.getLong());
        return true;
    }

    public byte b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public wu_0 d() {
        return this.c;
    }

    @Override
    public int a() {
        return 1138;
    }
}

