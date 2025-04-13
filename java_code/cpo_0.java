/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cpo
 */
public class cpo_0
extends Pw {
    protected static final Logger a = Logger.getLogger(cpo_0.class);
    private long b;
    private boolean c;

    public void a(long l) {
        this.b = l;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    @Override
    public byte[] b() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(9);
        byteBuffer.putLong(this.b);
        byteBuffer.put((byte)(this.c ? 1 : 0));
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13457;
    }
}

