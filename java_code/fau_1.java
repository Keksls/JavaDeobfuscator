/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fAu
 */
public class fau_1
extends faq_2 {
    private static final Logger a = Logger.getLogger(fai_1.class);
    public static final String TAG = "isFalse";

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
            return (Boolean)object == false;
        }
        return false;
    }
}

