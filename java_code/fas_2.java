/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from fAs
 */
public class fas_2
extends faq_2 {
    public static final String TAG = "isEmpty";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        Object object2;
        Object object3 = object2 = this.g ? this.f : object;
        if (object2 instanceof Collection) {
            return ((Collection)object2).isEmpty();
        }
        return false;
    }
}

