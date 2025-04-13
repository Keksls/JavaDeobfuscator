/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cuS
 */
public class cus_1
extends cut_1
implements akz_2 {
    private long a;
    private byte b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.get();
        this.a = byteBuffer.getLong();
        this.a(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 13607;
    }

    @Override
    public byte b() {
        return this.b;
    }

    @Override
    public long c() {
        return this.a;
    }
}

