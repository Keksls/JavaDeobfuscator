/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from ccJ
 */
public class ccj_2
extends fkk_0 {
    private static final Logger l = Logger.getLogger(ccj_2.class);
    private final ccl_2 m = new ccl_2();
    private final cdb_1 n = new cdb_1(9, 9);
    private ccn_2[] o;

    public ccj_2(int n) {
        super(n);
    }

    @Override
    public void a(arf_1 arf_12) {
        super.a(arf_12);
        this.m.a(arf_12);
        this.n.a(arf_12);
        this.d(arf_12);
    }

    private void d(arf_1 arf_12) {
        int n = arf_12.b() & 0xFFFF;
        this.o = new ccn_2[n];
        for (int k = 0; k < n; ++k) {
            this.o[k] = ccn_2.a(arf_12);
        }
    }

    public ccl_2 a() {
        return this.m;
    }

    cdb_1 b() {
        return this.n;
    }

    ccn_2[] c() {
        return this.o;
    }
}

