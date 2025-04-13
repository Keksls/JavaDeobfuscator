/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Comparator;

public enum eEy {
    a(eEl.b, eEl.c),
    b(eEl.d, eEl.e);

    private final Comparator<eEv> c;
    private final eEx d;

    private eEy(Comparator<eEv> comparator, eEx eEx2) {
        this.c = comparator;
        this.d = eEx2;
    }

    public Comparator<eEv> a() {
        return this.c;
    }

    public boolean a(long l, ArrayList<eEv> arrayList) {
        return this.d.a(l, arrayList);
    }
}

