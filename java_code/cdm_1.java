/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from cdm
 */
public class cdm_1
extends fko_0<cdl_1> {
    private static final Logger b = Logger.getLogger(cdm_1.class);
    public static final cdm_1 a = new cdm_1();

    private cdm_1() {
    }

    protected cdl_1 a(int n) {
        return new cdl_1(n);
    }

    @Override
    protected /* synthetic */ fkn_0 b(int n) {
        return this.a(n);
    }
}

