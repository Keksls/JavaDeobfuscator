/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cwJ
 */
public abstract class cwj_2
extends ps_0 {
    protected short a;
    protected byte[] b;
    protected long c;
    protected byte d;
    protected static final Logger e = Logger.getLogger(cwj_2.class);

    @Override
    public abstract boolean a(byte[] var1);

    @Override
    public abstract int a();

    public short e() {
        return this.a;
    }

    public long f() {
        return this.c;
    }

    public byte[] g() {
        return this.b;
    }

    public byte h() {
        return this.d;
    }
}

