/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cle
 */
public class cle_0
extends Pw {
    protected static final Logger a = Logger.getLogger(cle_0.class);
    protected static final boolean b = false;
    private final int c;
    private final int e;
    private final int f;

    public cle_0(int n, int n2, int n3) {
        this.c = n;
        this.e = n2;
        this.f = n3;
    }

    @Override
    public byte[] b() {
        int n = 12;
        ByteBuffer byteBuffer = ByteBuffer.allocate(12);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13286;
    }
}

