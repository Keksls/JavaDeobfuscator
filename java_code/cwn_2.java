/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwN
 */
public class cwn_2
extends cwo_2 {
    private long g;
    private byte h;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.h = byteBuffer.get();
        this.g = byteBuffer.getLong();
        this.a(byteBuffer);
        return true;
    }

    @Override
    public int a() {
        return 13319;
    }

    public byte b() {
        return this.h;
    }

    public long c() {
        return this.g;
    }
}

