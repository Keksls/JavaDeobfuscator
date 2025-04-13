/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class dbe
implements Comparator<bVs> {
    final /* synthetic */ dbd a;

    dbe(dbd dbd2) {
        this.a = dbd2;
    }

    public int a(bVs bVs2, bVs bVs3) {
        String string = bVs2.l();
        String string2 = bVs3.l();
        if (string == null || string2 == null) {
            return 0;
        }
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((bVs)object, (bVs)object2);
    }
}

