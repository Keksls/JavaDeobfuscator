/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class enI
extends yj_0 {
    private static final Logger j = Logger.getLogger(enI.class);
    private static final ys_0[] k = ys_0.b();
    private int l;
    private int m;

    @Override
    public void a(arf_1 arf_12) {
        super.a(arf_12);
        this.l = arf_12.a() & 0xFF;
        this.m = arf_12.a() & 0xFF;
    }

    @Override
    public int a() {
        return this.l;
    }

    @Override
    public int b() {
        return this.m;
    }

    public boolean e(int n, int n2) {
        int n3 = this.a(n, n2, k, 0);
        if (n3 == 0) {
            return true;
        }
        if (n3 == 1) {
            return enI.k[0].c == 0;
        }
        return false;
    }
}

