/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import org.apache.log4j.Logger;

/*
 * Renamed from aDc
 */
public final class adc_1
implements Runnable {
    private static final Logger a = Logger.getLogger(adc_1.class);
    private static final adc_1 b = new adc_1();
    private static final boolean c = false;
    private static final ArrayList<Object> d = new ArrayList();
    private final ArrayList<ade_1> e = new ArrayList(100);
    private final ArrayList<acz_1> f = new ArrayList();
    private final Queue<acz_1> g = new PriorityQueue<acz_1>(256, new add_1(this));
    private long h;
    private long i;
    private abs_1 j;

    public static adc_1 a() {
        return b;
    }

    private adc_1() {
        ado_1.a().a(this, 50L);
    }

    void a(abs_1 abs_12) {
        this.j = abs_12;
    }

    private long d() {
        if (this.j != null) {
            return this.j.s();
        }
        return System.currentTimeMillis();
    }

    public void a(acx_1 acx_12, adg_2 adg_22, List list, Iterable<? extends acy_1> iterable, Object ... objectArray) {
        if (acx_12 == null) {
            throw new IllegalArgumentException("Ev\u00e8nement is null");
        }
        if (adg_22 == null) {
            throw new IllegalArgumentException("Source is null");
        }
        d.clear();
        List<Object> list2 = d;
        if (list != null) {
            if (iterable != null) {
                int n = list.size();
                for (int k = 0; k < n; ++k) {
                    Object e2 = list.get(k);
                    for (acy_1 acy_12 : iterable) {
                        if (!acy_12.a(acx_12, adg_22, e2, objectArray)) continue;
                        d.add(e2);
                    }
                }
            } else {
                list2 = list;
            }
        }
        try {
            acx_12.a(adg_22, list2, objectArray);
        }
        catch (Exception exception) {
            a.error((Object)("Exception lev\u00e9e lors du traitement de l'event " + acx_12 + " " + (Serializable)(exception.getStackTrace() != null && exception.getStackTrace().length > 1 ? exception.getStackTrace()[0] : " ")), (Throwable)exception);
        }
        if (!adb_1.a().a(acx_12, adg_22, list2, objectArray)) {
            // empty if block
        }
    }

    public ade_1 a(long l, acx_1 acx_12, adg_2 adg_22, ArrayList arrayList, Iterable<? extends acy_1> iterable, Object ... objectArray) {
        return this.a(this.d() + l, acx_12, adg_22, (List)arrayList, iterable, objectArray);
    }

    public ade_1 a(long l, acx_1 acx_12, adg_2 adg_22, List list, Iterable<? extends acy_1> iterable, Object ... objectArray) {
        if (l <= this.d()) {
            this.a(acx_12, adg_22, list, iterable, objectArray);
            return null;
        }
        if (acx_12 == null) {
            throw new IllegalArgumentException("Ev\u00e8nement is null");
        }
        if (adg_22 == null) {
            throw new IllegalArgumentException("Source is null");
        }
        acz_1 acz_12 = acz_1.a();
        acz_12.a(acx_12);
        acz_12.a(iterable);
        acz_12.a(objectArray);
        acz_12.a(adg_22);
        acz_12.a(list);
        acz_12.a(l);
        ade_1 ade_12 = adg_22.a();
        if (ade_12 == null) {
            abn_1<ade_1> abn_12 = adg_22.b();
            ade_12 = abn_12 != null ? abn_12.b() : new ade_1();
            adg_22.a(ade_12);
            this.e.add(ade_12);
        } else if (!this.e.contains(ade_12)) {
            this.e.add(ade_12);
        }
        ade_12.a(acz_12);
        this.f.add(acz_12);
        return ade_12;
    }

    public void a(ade_1 ade_12) {
        if (ade_12 != null) {
            ade_12.k();
            while (!ade_12.f()) {
                acz_1 acz_12 = ade_12.a();
                this.g.remove(acz_12);
                this.f.remove(acz_12);
                acz_12.b();
            }
            this.e.remove(ade_12);
        }
    }

    Queue<acz_1> b() {
        return this.g;
    }

    public void c() {
        this.g.clear();
        this.f.clear();
        for (ade_1 ade_12 : this.e) {
            ade_12.d();
        }
        this.e.clear();
        d.clear();
    }

    @Override
    public void run() {
        acz_1 acz_12;
        abo_1 abo_12;
        long l = this.d();
        int n = this.f.size();
        for (int k = 0; k < n; ++k) {
            abo_12 = this.f.get(k);
            if (!((acz_1)abo_12).j()) {
                this.g.offer((acz_1)abo_12);
                continue;
            }
            adg_2 adg_22 = ((acz_1)abo_12).f();
            ade_1 ade_12 = adg_22.a();
            ade_12.b((acz_1)abo_12);
            ((acz_1)abo_12).b();
        }
        this.f.clear();
        while (!this.g.isEmpty() && (acz_12 = this.g.peek()).d() <= l) {
            this.g.poll();
            adg_2 adg_23 = acz_12.f();
            if (adg_23 != null) {
                abo_12 = adg_23.a();
                ((ade_1)abo_12).b(acz_12);
            } else {
                a.error((Object)("La source de l'eventsQueue est nulle : " + acz_12.e()));
            }
            try {
                if (!acz_12.j()) {
                    acz_12.a(true);
                    this.a(acz_12.e(), acz_12.f(), acz_12.g(), acz_12.h(), acz_12.i());
                }
            }
            catch (Exception exception) {
                a.error((Object)("Exception lev\u00e9e lors du traitement d'un \u00e9v\u00e8nnement schedule : " + acz_12), (Throwable)exception);
            }
            acz_12.b();
        }
    }
}

