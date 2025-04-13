/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctD
 */
public final class ctd_1
extends csy_2 {
    private int b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getLong();
        return true;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    @Override
    public int a() {
        return 12708;
    }
}

