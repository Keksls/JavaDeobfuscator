/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from esi
 */
public abstract class esi_0
extends aoq_1 {
    protected static final Logger d = Logger.getLogger(esi_0.class);
    private boolean a;

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void s_() {
        this.a = !this.a;
    }

    public long e() {
        return this.a ? -1L : 1L;
    }
}

