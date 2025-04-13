/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwL
 */
public class cwl_2
extends cwj_2 {
    protected static final Logger f = Logger.getLogger(cwl_2.class);
    private int g;
    private long h;
    private int i;
    private int j;
    private int k;

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
        this.k = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13925;
    }

    public int b() {
        return this.g;
    }

    public long c() {
        return this.h;
    }

    public int d() {
        return this.j;
    }

    public int i() {
        return this.k;
    }

    public int j() {
        return this.i;
    }
}

