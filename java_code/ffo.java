/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class ffo
implements Comparator<ffm> {
    ffo() {
    }

    public int a(ffm ffm2, ffm ffm3) {
        String string = ffm2.b().toUpperCase();
        String string2 = ffm3.b().toUpperCase();
        return string.compareTo(string2);
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ffm)object, (ffm)object2);
    }
}

