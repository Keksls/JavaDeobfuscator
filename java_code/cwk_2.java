/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwK
 */
public class cwk_2
extends cwj_2 {
    protected static final Logger f = Logger.getLogger(cwk_2.class);
    private byte g = 0;
    private long h = 0L;
    private byte i = 0;
    private int j = 0;
    private byte k = 0;
    private int l;
    private int m;
    private double n;
    private int o;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.d = byteBuffer.get();
        this.a = byteBuffer.getShort();
        this.c = byteBuffer.getLong();
        this.h = byteBuffer.getLong();
        this.g = byteBuffer.get();
        this.l = byteBuffer.getInt();
        this.m = byteBuffer.getInt();
        this.i = byteBuffer.get();
        this.j = byteBuffer.getInt();
        this.k = byteBuffer.get();
        this.n = byteBuffer.getDouble();
        this.o = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12821;
    }

    public byte b() {
        return this.g;
    }

    public long c() {
        return this.h;
    }

    public byte d() {
        return this.i;
    }

    public byte i() {
        return this.k;
    }

    public int j() {
        return this.l;
    }

    public int k() {
        return this.m;
    }

    public int o() {
        return this.j;
    }

    public double p() {
        return this.n;
    }

    public int q() {
        return this.o;
    }
}

