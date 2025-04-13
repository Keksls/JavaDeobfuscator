/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crm
 */
public class crm_0
extends cwj_2 {
    private long f;
    private long g;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.get();
        this.a = byteBuffer.getShort();
        this.f = byteBuffer.getLong();
        this.g = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 12020;
    }

    public long b() {
        return this.f;
    }

    public long c() {
        return this.g;
    }
}

