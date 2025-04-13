/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fpY
 */
public class fpy_0
extends fbn_2 {
    private static Logger a = Logger.getLogger(fpy_0.class);
    private fro_0 b = null;

    @Override
    public void setup(fbl_1 fbl_12) {
        if (fbl_12 instanceof fpx_0) {
            ((fpx_0)fbl_12).a(this.b);
        }
    }

    public void setAlignment(fro_0 fro_02) {
        this.b = fro_02;
    }

    public fro_0 getAlignment() {
        return this.b;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fpy_0 fpy_02 = (fpy_0)fyo2;
        super.copyElement(fyo2);
        fpy_02.b = this.b;
    }
}

