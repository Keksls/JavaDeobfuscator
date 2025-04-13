/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;

class aZI
implements Comparator<aZF> {
    final /* synthetic */ aZH a;

    aZI(aZH aZH2) {
        this.a = aZH2;
    }

    public int a(aZF aZF2, aZF aZF3) {
        return aZF2.c().compareTo(aZF3.c());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((aZF)object, (aZF)object2);
    }
}

