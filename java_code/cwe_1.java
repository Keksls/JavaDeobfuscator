/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

/*
 * Renamed from cwE
 */
public class cwe_1
extends ps_0 {
    private static final Logger a = Logger.getLogger(cwe_1.class);
    private wt_0 b;
    private String c;
    private String d;
    private wt_0 e;
    private ww_0 f;
    private boolean g;

    @Override
    public boolean a(byte[] byArray) {
        boolean bl;
        boolean bl2;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = wt_0.b(byteBuffer.getLong());
        this.e = wt_0.b(byteBuffer.getLong());
        this.f = ww_0.a(byteBuffer.getLong());
        this.g = byteBuffer.get() == 1;
        boolean bl3 = bl2 = byteBuffer.get() == 1;
        if (bl2) {
            byte[] byArray2 = new byte[byteBuffer.get()];
            byteBuffer.get(byArray2);
            this.c = Cz.a(byArray2);
        }
        boolean bl4 = bl = byteBuffer.get() == 1;
        if (bl) {
            byte[] byArray3 = new byte[byteBuffer.get()];
            byteBuffer.get(byArray3);
            this.d = Cz.a(byArray3);
        }
        return true;
    }

    public wu_0 b() {
        return this.b;
    }

    public wt_0 c() {
        return this.e;
    }

    public ww_0 d() {
        return this.f;
    }

    public boolean e() {
        return this.g;
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    @Override
    public int a() {
        return 15849;
    }
}

