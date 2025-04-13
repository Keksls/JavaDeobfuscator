/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cyX
 */
public class cyx_2
extends ps_0 {
    protected static final Logger a = Logger.getLogger(cyx_2.class);
    private long b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        return true;
    }

    @Override
    public int a() {
        return 13001;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }
}

