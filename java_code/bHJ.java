/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.Nullable;

public class bHJ
extends exr_1<bhg_0> {
    private static final bHJ c = new bHJ();
    private final asy_2<aSr> d;
    private final Set<bhg_0> e = new HashSet<bhg_0>();

    private bHJ() {
        this.d = new asz_2<aSr>(new aSr());
    }

    public static bHJ a() {
        return c;
    }

    @Nullable
    public bhg_0 a(int n) {
        if (n == 0) {
            return null;
        }
        bhg_0 bhg_02 = (bhg_0)this.b.get(n);
        if (bhg_02 == null && !this.b.containsKey(n)) {
            aSr aSr2 = this.d.a(n);
            if (aSr2 == null) {
                return null;
            }
            bhg_02 = bHJ.b(aSr2);
            if (bhg_02 != null) {
                this.a(bhg_02);
            }
        }
        return bhg_02;
    }

    @Override
    public void a(aSr aSr2) {
        bhg_0 bhg_02 = bHJ.b(aSr2);
        this.a(bhg_02);
        if (bhg_02 != null && bhg_02.k()) {
            this.e.add(bhg_02);
        }
    }

    @Nullable
    private static bhg_0 b(aSr aSr2) {
        if (aSr2 == null) {
            return null;
        }
        short s2 = aSr2.c();
        short s3 = aSr2.d();
        String[] stringArray = aSr2.g();
        ArrayList<exh_2> arrayList = new ArrayList<exh_2>();
        for (String string : stringArray) {
            if (string != null && !string.isEmpty()) {
                exh_2 exh_22 = exh_2.valueOf(string);
                arrayList.add(exh_22);
                continue;
            }
            a.error((Object)("Le slot [" + string + "] n'est pas valide"));
        }
        String[] stringArray2 = aSr2.h();
        ArrayList<exh_2> arrayList2 = new ArrayList<exh_2>();
        for (String string : stringArray2) {
            arrayList2.add(exh_2.valueOf(string));
        }
        Object[] objectArray = bHJ.a(arrayList);
        exh_2[] exh_2Array = bHJ.a(arrayList2);
        bhg_0 bhg_02 = new bhg_0(s2, s3, (exh_2[])objectArray);
        if (exh_2Array != null) {
            bhg_02.b(exh_2Array);
        }
        bhg_02.b(aSr2.f());
        bhg_02.c(aSr2.e());
        bhg_02.e(aSr2.i());
        bhg_02.a(aSr2.j());
        return bhg_02;
    }

    private static exh_2[] a(ArrayList<exh_2> arrayList) {
        if (arrayList.size() > 0) {
            return arrayList.toArray(new exh_2[arrayList.size()]);
        }
        return null;
    }

    public boolean b() {
        return this.b.isEmpty();
    }

    public Collection<bhg_0> c() {
        return Collections.unmodifiableSet(this.e);
    }

    @Override
    @Nullable
    public /* synthetic */ exq_1 b(int n) {
        return this.a(n);
    }
}

