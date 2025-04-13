/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.base.Predicates;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eNj
 */
public class enj_1 {
    static final Logger a = Logger.getLogger(enj_1.class);
    private final ArrayList<ekl_0> b = new ArrayList();
    private final ArrayList<ene_1> c = new ArrayList();
    private final HashSet<aff_1> d = new HashSet();
    private final long e;
    private final int f;

    enj_1(long l, int n) {
        this.e = l;
        this.f = n;
    }

    public long a() {
        return this.e;
    }

    public boolean b() {
        return this.c.isEmpty();
    }

    public int c() {
        return this.d.size();
    }

    public boolean a(aff_1 aff_12) {
        return this.d.contains(aff_12);
    }

    public boolean a(int n, int n2) {
        for (aff_1 aff_12 : this.d) {
            if (!aff_12.b(n, n2)) continue;
            return true;
        }
        return false;
    }

    public List<ene_1> d() {
        return Collections.unmodifiableList(this.c);
    }

    boolean a(ekl_0 ekl_02, @Nullable tg_0 tg_02, eng_1 eng_12) {
        if (this.b.contains(ekl_02)) {
            a.error((Object)("Trying to register a microbot already registered : " + ekl_02), (Throwable)new RuntimeException());
            return false;
        }
        this.b.add(ekl_02);
        this.a(tg_02, eng_12);
        return true;
    }

    boolean b(ekl_0 ekl_02, @Nullable tg_0 tg_02, eng_1 eng_12) {
        if (!this.b.remove(ekl_02)) {
            return false;
        }
        this.a(tg_02, eng_12);
        return true;
    }

    protected void a(@Nullable tg_0 tg_02, eng_1 eng_12) {
        ArrayList<aff_1> arrayList;
        ArrayList<ene_1> arrayList2;
        ArrayList<ene_1> arrayList3;
        ArrayList<ene_1> arrayList4 = this.a(tg_02);
        if (eng_12 == null) {
            arrayList3 = null;
            arrayList2 = null;
            arrayList = null;
        } else {
            arrayList3 = new ArrayList<ene_1>();
            for (Iterable<aff_1> iterable : arrayList4) {
                if (this.c.remove(iterable)) continue;
                arrayList3.add((ene_1)iterable);
            }
            arrayList2 = new ArrayList<ene_1>(this.c);
            arrayList = new ArrayList<aff_1>(this.d);
        }
        this.c.clear();
        this.c.addAll(arrayList4);
        this.d.clear();
        for (Iterable<aff_1> iterable : this.c) {
            for (aff_1 aff_12 : iterable) {
                if (this.d.contains(aff_12)) continue;
                if (tg_02 != null) {
                    aff_12 = new aff_1(aff_12.d(), aff_12.e(), tg_02.i(aff_12.d(), aff_12.e()));
                }
                this.d.add(aff_12);
            }
        }
        if (!(eng_12 == null || arrayList3.isEmpty() && arrayList2.isEmpty())) {
            Iterable<aff_1> iterable;
            ArrayList<aff_1> arrayList5 = new ArrayList<aff_1>(this.d);
            iterable = arrayList5.stream().filter(((Predicate<aff_1>)arg_0 -> ((com.google.common.base.Predicate)Predicates.in(arrayList)).apply(arg_0)).negate()).collect(Collectors.toList());
            List list = arrayList.stream().filter(((Predicate<aff_1>)arg_0 -> ((com.google.common.base.Predicate)Predicates.in((Collection)arrayList5)).apply(arg_0)).negate()).collect(Collectors.toList());
            eng_12.a(this, arrayList3, arrayList2, (List<aff_1>)iterable, list);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected ArrayList<ene_1> a(@Nullable tg_0 tg_02) {
        Object object;
        aff_1 aff_12;
        TIntObjectHashMap tIntObjectHashMap = new TIntObjectHashMap();
        TIntObjectHashMap tIntObjectHashMap2 = new TIntObjectHashMap();
        for (ekl_0 iterable2 : this.b) {
            aff_12 = iterable2.P_();
            int n = aff_12.d();
            if (!tIntObjectHashMap.containsKey(n)) {
                tIntObjectHashMap.put(n, (Object)new enk_1());
            }
            ((enk_1)tIntObjectHashMap.get(n)).add(iterable2);
            int n2 = aff_12.e();
            if (!tIntObjectHashMap2.containsKey(n2)) {
                tIntObjectHashMap2.put(n2, (Object)new enk_1());
            }
            ((enk_1)tIntObjectHashMap2.get(n2)).add(iterable2);
        }
        if (tg_02 != null) {
            object = uq_0.a();
            ((uq_0)object).a(6, (byte)1, (short)4);
            ((uq_0)object).a(tg_02);
            tg_02.a(true);
        } else {
            object = null;
        }
        ArrayList<ene_1> arrayList = new ArrayList<ene_1>();
        try {
            aff_12 = tIntObjectHashMap.iterator();
            while (aff_12.hasNext()) {
                aff_12.advance();
                arrayList.addAll(enj_1.a((enk_1)aff_12.value(), this.f, (uq_0)object));
            }
            aff_12 = tIntObjectHashMap2.iterator();
            while (aff_12.hasNext()) {
                aff_12.advance();
                arrayList.addAll(enj_1.a((enk_1)aff_12.value(), this.f, (uq_0)object));
            }
        }
        finally {
            if (tg_02 != null) {
                tg_02.a(false);
                ((uq_0)object).release();
            }
        }
        return arrayList;
    }

    protected static ArrayList<ene_1> a(enk_1 enk_12, int n, @Nullable uq_0 uq_02) {
        ekl_0 ekl_02 = null;
        ekl_0 ekl_03 = null;
        ene_1 ene_12 = null;
        ArrayList<ene_1> arrayList = new ArrayList<ene_1>();
        Iterator iterator = enk_12.iterator();
        ekl_02 = null;
        while (iterator.hasNext()) {
            ekl_03 = (ekl_0)iterator.next();
            if (ekl_02 != null) {
                if (!ene_1.a(ekl_03.P_(), ekl_02.P_(), n)) {
                    ene_12 = null;
                } else if (uq_02 != null && !uq_02.b(ekl_02.P_(), ekl_03.P_())) {
                    ene_12 = null;
                } else if (ene_12 == null) {
                    ene_12 = new ene_1(ekl_02, ekl_03);
                    arrayList.add(ene_12);
                } else if (ene_12.a(ekl_03.P_(), n)) {
                    boolean bl = ene_12.a(ekl_03, n);
                    if (!bl) {
                        ene_12 = null;
                    }
                } else {
                    ene_12 = new ene_1(ekl_02, ekl_03);
                    arrayList.add(ene_12);
                }
            }
            ekl_02 = ekl_03;
        }
        return arrayList;
    }

    public static boolean a(aff_1 aff_12, List<enj_1> list) {
        for (enj_1 enj_12 : list) {
            if (!enj_12.a(aff_12.d(), aff_12.e())) continue;
            return true;
        }
        return false;
    }
}

