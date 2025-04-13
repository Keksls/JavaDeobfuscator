/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fqa
 */
public class fqa_0
extends fbn_2 {
    private static Logger a = Logger.getLogger(fqa_0.class);
    private frs_0 b = null;

    @Override
    public void setup(fbl_1 fbl_12) {
        if (fbl_12 instanceof fpz_0) {
            ((fpz_0)fbl_12).setAlign(this.b);
        }
    }

    public void setAlignment(frs_0 frs_02) {
        this.b = frs_02;
    }

    public frs_0 getAlignment() {
        return this.b;
    }

    @Override
    public void copyElement(fyo fyo2) {
        fqa_0 fqa_02 = (fqa_0)fyo2;
        super.copyElement(fqa_02);
        fqa_02.b = this.b;
    }
}

