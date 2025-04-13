/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TByteObjectProcedure
 *  org.apache.log4j.Logger
 */
import gnu.trove.procedure.TByteObjectProcedure;
import org.apache.log4j.Logger;

/*
 * Renamed from cdl
 */
public class cdl_1
extends fkn_0 {
    private static final Logger c = Logger.getLogger(cdl_1.class);
    private ccn_2[] d;
    private cdb_1 e;
    private final acp_2<byte[]> f = new acp_2();

    public cdl_1(int n) {
        super(n);
    }

    @Override
    public void a(arf_1 arf_12) {
        int n;
        super.a(arf_12);
        int n2 = arf_12.h();
        this.d = new ccn_2[n2];
        for (n = 0; n < n2; ++n) {
            this.d[n] = ccn_2.a(arf_12);
        }
        this.e = new cdb_1((byte)this.d(), (byte)this.e());
        this.e.a(arf_12);
        n = arf_12.k();
        this.f.a(n);
        for (int k = 0; k < n; ++k) {
            byte by = (byte)arf_12.b();
            byte[] byArray = this.b(arf_12);
            this.f.a(by, byArray);
        }
    }

    private byte[] b(arf_1 arf_12) {
        int n = arf_12.b();
        byte[] byArray = new byte[n];
        for (int k = 0; k < n; ++k) {
            byArray[k] = (byte)arf_12.b();
        }
        return byArray;
    }

    public cdb_1 a() {
        return new cdb_1(this.e);
    }

    public ccn_2[] b() {
        return this.d;
    }

    public int c() {
        return this.f.d();
    }

    public void a(TByteObjectProcedure<byte[]> tByteObjectProcedure) {
        int n = this.f.d();
        for (int k = 0; k < n; ++k) {
            if (tByteObjectProcedure.execute(this.f.b(k), (Object)this.f.c(k))) continue;
            return;
        }
    }
}

