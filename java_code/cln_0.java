/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cln
 */
public class cln_0
extends Pw {
    private final int a;
    private final int b;
    private final int c;
    private final long e;

    public cln_0(int n, int n2, int n3, long l) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.e = l;
    }

    @Override
    public byte[] b() {
        int n = 20;
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putInt(this.a);
        byteBuffer.putInt(this.b);
        byteBuffer.putInt(this.c);
        byteBuffer.putLong(this.e);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13755;
    }
}

