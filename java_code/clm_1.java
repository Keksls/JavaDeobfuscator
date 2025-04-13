/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from clM
 */
public class clm_1
extends Pw {
    protected static final Logger a = Logger.getLogger(clm_1.class);
    protected static final boolean b = false;
    private final long c;
    private final String e;

    public clm_1(long l, String string) {
        this.c = l;
        this.e = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.c);
        if (this.e != null) {
            byte[] byArray = Cz.a(this.e);
            abx_22.a((short)byArray.length);
            abx_22.b(byArray);
        } else {
            abx_22.a((short)0);
        }
        return this.a((byte)2, abx_22.c());
    }

    @Override
    public int a() {
        return 22834;
    }
}

