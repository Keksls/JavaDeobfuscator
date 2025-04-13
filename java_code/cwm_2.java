/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwM
 */
public class cwm_2
extends cwj_2 {
    protected static final Logger f = Logger.getLogger(cwm_2.class);
    private long g;
    private int h;
    private int i;
    private int j;
    private short k;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.get();
        this.a = byteBuffer.getShort();
        this.c = byteBuffer.getLong();
        this.g = byteBuffer.getInt();
        this.h = byteBuffer.getInt();
        this.i = byteBuffer.getInt();
        this.j = byteBuffer.getInt();
        this.k = byteBuffer.getShort();
        return true;
    }

    @Override
    public int a() {
        return 13283;
    }

    public long b() {
        return this.g;
    }

    public int c() {
        return this.i;
    }

    public int d() {
        return this.j;
    }

    public short i() {
        return this.k;
    }

    public int j() {
        return this.h;
    }
}

