/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.Table
 */
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.util.ArrayList;

/*
 * Renamed from eAz
 */
public class eaz_0<T extends epq_2> {
    private final T a;
    private final Table<exh_2, Byte, eAy> b = HashBasedTable.create();

    public eaz_0(T t) {
        this.a = t;
    }

    public void a(exh_2 exh_22, eZw eZw2) {
        eZw2.c().forEach((by, eze_02) -> eze_02.a(exh_22).ifPresent(eAy2 -> this.b.put((Object)exh_22, by, eAy2)));
    }

    public void a(exh_2 exh_22) {
        ArrayList arrayList = new ArrayList();
        this.b.row((Object)exh_22).forEach((by, eAy2) -> {
            this.b((eAy)eAy2);
            arrayList.add(by);
        });
        arrayList.forEach(by -> this.b.row((Object)exh_22).remove(by));
    }

    public void a() {
        this.b.clear();
    }

    public void b() {
        this.b.values().forEach(this::a);
    }

    public void c() {
        this.b.values().forEach(this::b);
    }

    public void a(eAy eAy2) {
        int n;
        eps_0 eps_02 = eAy2.a();
        int n2 = eAy2.b();
        if (n2 > 0) {
            this.a(eps_02, n2);
        }
        if (n2 < 0) {
            this.b(eps_02, n2);
        }
        if ((n = eAy2.c()) != 0) {
            this.c(eps_02, n);
        }
    }

    public void b(eAy eAy2) {
        int n;
        eps_0 eps_02 = eAy2.a();
        int n2 = eAy2.b();
        if (n2 > 0) {
            this.b(eps_02, n2);
        }
        if (n2 < 0) {
            this.a(eps_02, n2);
        }
        if ((n = eAy2.c()) != 0) {
            this.c(eps_02, -n);
        }
    }

    private void a(eps_0 eps_02, Integer n) {
        epa_1 epa_12 = ((epq_2)this.a).a_(eps_02);
        if (epa_12 == null) {
            return;
        }
        epa_12.c(n);
    }

    private void b(eps_0 eps_02, Integer n) {
        epa_1 epa_12 = ((epq_2)this.a).a_(eps_02);
        if (epa_12 == null) {
            return;
        }
        epa_12.d(n);
    }

    private void c(eps_0 eps_02, Integer n) {
        epa_1 epa_12 = ((epq_2)this.a).a_(eps_02);
        if (epa_12 == null) {
            return;
        }
        epa_12.e(n);
    }
}

