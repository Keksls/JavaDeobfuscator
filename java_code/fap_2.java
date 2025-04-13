/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from fAp
 */
public class fap_2
extends faj_1 {
    public static final String TAG = "CollectionCondition";
    public static final String a = "size";

    @Override
    public String getTag() {
        return TAG;
    }

    @Override
    public boolean isValid(Object object) {
        if (this.g) {
            object = this.f;
        }
        if (this.d != null && this.d.equalsIgnoreCase(a)) {
            if (object instanceof Collection) {
                return this.q.isValid(((Collection)object).size());
            }
            if (object instanceof Object[]) {
                return this.q.isValid(((Object[])object).length);
            }
            return false;
        }
        return false;
    }
}

