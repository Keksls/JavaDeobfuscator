/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from clh
 */
@Deprecated
public class clh_0
extends Pw {
    protected static final Logger a = Logger.getLogger(clh_0.class);
    protected static final boolean b = false;
    private final int c;
    private final int e;
    private final int f;
    private final long g;

    public clh_0(int n, int n2, int n3, long l) {
        this.c = n;
        this.e = n2;
        this.f = n3;
        this.g = l;
    }

    @Override
    public byte[] b() {
        int n = 20;
        ByteBuffer byteBuffer = ByteBuffer.allocate(20);
        byteBuffer.putInt(this.c);
        byteBuffer.putInt(this.e);
        byteBuffer.putInt(this.f);
        byteBuffer.putLong(this.g);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12626;
    }
}

