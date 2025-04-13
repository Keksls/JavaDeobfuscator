/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cpr
 */
public class cpr_0
extends Pw {
    protected static final Logger a = Logger.getLogger(cpr_0.class);
    private long b;
    private long c;
    private boolean e;

    public void a(long l) {
        this.b = l;
    }

    public void b(long l) {
        this.c = l;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(17);
        byteBuffer.putLong(this.b);
        byteBuffer.putLong(this.c);
        byteBuffer.put((byte)(this.e ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13117;
    }
}

