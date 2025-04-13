/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from clb
 */
public class clb_0
extends Pw {
    protected static final Logger a = Logger.getLogger(clb_0.class);
    protected static final boolean b = false;

    @Override
    public byte[] b() {
        boolean bl = false;
        ByteBuffer byteBuffer = ByteBuffer.allocate(0);
        return this.a((byte)3, byteBuffer.array());
    }

    @Override
    public int a() {
        return 13345;
    }
}

