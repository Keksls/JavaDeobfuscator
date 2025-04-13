/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bwy
 */
public class bwy_0
extends bwu_0 {
    private static final Logger f = Logger.getLogger(bwy_0.class);
    private static final bwy_0 g = new bwy_0();

    public static bwy_0 g() {
        return g;
    }

    private bwy_0() {
    }

    @Override
    public int a() {
        return -1;
    }

    @Override
    protected String b() {
        return null;
    }

    @Override
    protected String c() {
        return null;
    }

    @Override
    public void e(biI biI2) {
        if (biI2.cg().k()) {
            return;
        }
        biI2.g("AnimStatique");
        biI2.e(biI2.ab());
    }

    @Override
    public void f(biI biI2) {
    }
}

