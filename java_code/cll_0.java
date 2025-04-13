/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cll
 */
public class cll_0
extends Pw {
    protected static final Logger a = Logger.getLogger(cll_0.class);
    private final long b;

    public cll_0(long l) {
        this.b = l;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(8);
        byteBuffer.putLong(this.b);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 12013;
    }
}

