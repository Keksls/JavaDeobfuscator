/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cyz
 */
public class cyz_1
extends ps_0 {
    protected static final Logger a = Logger.getLogger(cyz_1.class);
    protected static final boolean b = false;
    private long c;
    private int d;
    private boolean e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getInt();
        byte by = byteBuffer.get();
        this.e = by == 1;
        return true;
    }

    @Override
    public int a() {
        return 12307;
    }

    public long b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public boolean d() {
        return this.e;
    }
}

