/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

/*
 * Renamed from aBV
 */
class abv_2
implements Comparator<String> {
    abv_2() {
    }

    public int a(String string, String string2) {
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }
}

