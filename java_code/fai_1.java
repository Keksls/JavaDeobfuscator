/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fAI
 */
public class fai_1
extends faq_2 {
    private static final Logger a = Logger.getLogger(fai_1.class);
    public static final String TAG = "isTrue";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        if (object instanceof Boolean) {
            return (Boolean)object;
        }
        return false;
    }

    public faq_2 a() {
        fai_1 fai_12 = new fai_1();
        this.copyElement(fai_12);
        return fai_12;
    }
}

