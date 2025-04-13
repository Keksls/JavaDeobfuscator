/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public abstract class eyD
extends apb_2 {
    protected static final Logger c = Logger.getLogger(esi_0.class);
    private boolean d;

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void s_() {
        this.d = !this.d;
    }

    public long c(Object object, Object object2, Object object3, Object object4) {
        if (this.d) {
            return -1L;
        }
        return 1L;
    }
}

