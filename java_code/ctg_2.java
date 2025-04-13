/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctG
 */
public final class ctg_2
extends csy_2 {
    private long b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        this.c = new byte[n];
        byteBuffer.get(this.c);
        return false;
    }

    public long b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    @Override
    public int a() {
        return 12643;
    }
}

