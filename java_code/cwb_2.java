/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwb
 */
public class cwb_2
extends ps_0 {
    private int a;
    private short b;
    private long c;

    public int b() {
        return this.a;
    }

    public short c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length == 14) {
            ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
            this.a = byteBuffer.getInt();
            this.b = byteBuffer.getShort();
            this.c = byteBuffer.getLong();
            return true;
        }
        return false;
    }

    @Override
    public int a() {
        return 13532;
    }
}

