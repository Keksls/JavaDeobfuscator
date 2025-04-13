/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;

public final class bOB {
    private static final Logger a = Logger.getLogger(bOB.class);
    private bvx_2 b;

    public fir_0 a(epq_2 epq_22, fio_0 fio_02, aff_1 aff_12, boolean bl) {
        fir_0 fir_02;
        if (this.b == null) {
            a.error((Object)"On ne check pas les critere si on a pas de combat associ\u00e9 dans le validateur");
            return fir_0.a;
        }
        if (fio_02 == null) {
            return fir_0.c;
        }
        Object Spell = fio_02.r();
        List<Long> list = enp_2.a.h(ens_2.aI);
        if (list.contains(((fin_0)Spell).i())) {
            return fir_0.y;
        }
        if (emf_1.a(Spell)) {
            return fir_0.t;
        }
        if (!emf_1.a(epq_22, Spell)) {
            return fir_0.s;
        }
        if (bl) {
            if (!emf_1.c(epq_22, fio_02, Spell)) {
                return fir_0.g;
            }
            if (!emf_1.b(epq_22, fio_02, Spell)) {
                return fir_0.h;
            }
            if (!emf_1.a(epq_22, fio_02, Spell)) {
                return fir_0.i;
            }
            if (!emf_1.a(epq_22, eps_0.J, fio_02, Spell)) {
                return fir_0.j;
            }
            if (!emf_1.d(epq_22, fio_02, Spell)) {
                return fir_0.k;
            }
        }
        if (!(fir_02 = epq_22.gh().b(epq_22, fio_02, (int)this.b.A().u())).a()) {
            return fir_02;
        }
        if (!this.b.A().p() || this.b.A().q() != epq_22.a_()) {
            return fir_0.v;
        }
        apc_2 apc_22 = ((fin_0)Spell).p();
        if (apc_22 != null) {
            if (apc_22.b(epq_22, null, fio_02, this.b)) {
                return fir_0.a;
            }
            if (!this.a(epq_22, (bpl_0)fio_02, apc_22)) {
                return fir_0.s;
            }
        }
        bmr_1 bmr_12 = azu_0.j().k();
        return fir_0.a;
    }

    private boolean a(epq_2 epq_22, bpl_0 bpl_02, apc_2 apc_22) {
        Object object;
        Iterator<Su> iterator2;
        Collection collection = this.b.j();
        for (Iterator<Su> iterator2 : collection) {
            if (!apc_22.b(epq_22, ((epq_2)((Object)iterator2)).P_(), bpl_02, this.b)) continue;
            return true;
        }
        Collection<sr_0> collection2 = this.b.aB();
        iterator2 = collection2.iterator();
        while (iterator2.hasNext()) {
            object = (sr_0)iterator2.next();
            if (!apc_22.b(epq_22, object, bpl_02, this.b)) continue;
            return true;
        }
        iterator2 = this.b.V();
        if (iterator2 != null) {
            while (iterator2.hasNext()) {
                object = iterator2.next();
                if (!apc_22.b(epq_22, object, bpl_02, this.b)) continue;
                return true;
            }
        }
        object = epq_22.P_();
        aff_1 aff_12 = new aff_1((aff_1)object);
        int n = bpl_02.p();
        int n2 = bpl_02.q();
        for (int k = 0; k <= n; ++k) {
            for (int i2 = 0; i2 <= n; ++i2) {
                int n3 = k + i2;
                if (n3 < n2 || n3 > n) continue;
                aff_12.a(k, i2);
                if (apc_22.b(epq_22, aff_12, bpl_02, this.b)) {
                    return true;
                }
                aff_12.g((aff_1)object);
                if (k == i2) continue;
                aff_12.a(-k, i2);
                if (apc_22.b(epq_22, aff_12, bpl_02, this.b)) {
                    return true;
                }
                aff_12.g((aff_1)object);
                aff_12.a(k, -i2);
                if (apc_22.b(epq_22, aff_12, bpl_02, this.b)) {
                    return true;
                }
                aff_12.g((aff_1)object);
                aff_12.a(-k, -i2);
                if (apc_22.b(epq_22, aff_12, bpl_02, this.b)) {
                    return true;
                }
                aff_12.g((aff_1)object);
            }
        }
        return false;
    }

    public void a(bvx_2 bvx_22) {
        this.b = bvx_22;
    }

    public void a() {
        this.b = null;
    }
}

