/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aPJ
 */
class apj_0<RE extends sd_0<efh_0, efi_0>, EC extends efi_0> {
    final /* synthetic */ aph_0 a;

    apj_0(aph_0 aph_02) {
        this.a = aph_02;
    }

    protected boolean a() {
        return true;
    }

    protected boolean b() {
        return false;
    }

    protected RE a(efh_0 efh_02, So so, Su su, Su su2, aff_1 aff_12, List<efi_0> list) {
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
        sd_0<efh_0, efi_0> sd_02 = ejh_02.x();
        efi_0 efi_02 = list.get(list.size() - 1);
        ejh_0 ejh_03 = this.a(list, so, su, su2, aff_12);
        efn_0 efn_02 = ejh_03 instanceof eHV ? ((eHV)ejh_03).a(ejh_03, true) : efn_0.a(true, false, ejh_03);
        sd_02.a(ejh_03);
        sd_02.a(efh_02, efi_02, so, su, su2, aff_12.d(), aff_12.e(), aff_12.f(), (Sr)efn_02);
        return (RE)sd_02;
    }

    protected ejh_0 a(List<efi_0> list, So so, Su su, Su su2, aff_1 aff_12) {
        ejh_0 ejh_02;
        efi_0 efi_02 = list.get(list.size() - 1);
        LinkedList<efi_0> linkedList = new LinkedList<efi_0>(list);
        linkedList.remove(efi_02);
        if (efi_02 instanceof bov_0) {
            bov_0 bov_02 = (bov_0)efi_02;
            efh_0 efh_02 = bgh_0.a().d(bov_02.h());
            ejh_02 = efh_02 != null ? (ejh_0)this.a(efh_02, so, su, su2, aff_12, linkedList) : null;
        } else {
            ejh_02 = null;
        }
        if (ejh_02 instanceof eHV && this.a()) {
            ejh_02.j(null);
        }
        return ejh_02;
    }

    protected boolean a(RE RE) {
        return false;
    }

    protected boolean b(RE RE) {
        return true;
    }

    protected aqd_1 a(efh_0 efh_02, List<efi_0> list) {
        sr_0<efh_0, elb_0> sr_02;
        if (this.a.b(efh_02) && (sr_02 = eig_0.a(efh_02, list.get(list.size() - 1))) != null) {
            return sr_02.P();
        }
        return efh_02.u();
    }

    public void a(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list) {
        this.a(blx_12, aff_12, efh_02, s2, list, list);
    }

    public void a(blx_1 object, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list, List<efi_0> list2) {
        Object object2;
        bvx_2 bvx_22;
        Object object3;
        Object object4;
        if (efh_02.aa()) {
            object4 = null;
            object3 = ((blx_1)object).bz();
            object4 = (blx_1)((bvx_2)object3).a(aff_12.d(), aff_12.e());
            bvx_22 = this.a(efh_02, ((epq_2)object).ge(), (Su)object, (Su)object4, aff_12, list2);
            if (this.a(bvx_22) && object4 != null) {
                object = object4;
            }
            if (((sd_0)((Object)bvx_22)).R()) {
                int n = aff_12.d();
                int n2 = aff_12.e();
                short s3 = aff_12.f();
                if (!this.b(bvx_22)) {
                    object4 = null;
                }
                if (object4 == null || efh_02.C()) {
                    if (this.b()) {
                        object2 = this.a.d.a(efh_02, (apq_2)object, ((els_0)object3).h(), aff_12.d(), aff_12.e(), aff_12.f());
                        int n3 = object2.size();
                        for (int k = 0; k < n3; ++k) {
                            List list3 = (List)object2.get(k);
                            int n4 = list3.size();
                            for (int i2 = 0; i2 < n4; ++i2) {
                                Su su = (Su)list3.get(i2);
                                aff_12.c(su.G(), su.H(), su.I());
                                this.b((blx_1)object, aff_12, efh_02, s2, list);
                            }
                        }
                    } else {
                        this.b((blx_1)object, aff_12, efh_02, s2, list);
                    }
                } else {
                    aff_12.c(((epq_2)object4).G(), ((epq_2)object4).H(), ((epq_2)object4).I());
                    this.b((blx_1)object, aff_12, efh_02, s2, list);
                }
                aff_12.c(n, n2, s3);
            } else {
                this.b((blx_1)object, aff_12, efh_02, s2, list);
            }
            this.c(bvx_22);
        } else {
            this.b((blx_1)object, aff_12, efh_02, s2, list);
        }
        if (efh_02 instanceof eFy && (object3 = ((eFy)(object4 = (eFy)efh_02)).ah()) instanceof eHV) {
            eHV eHV2;
            bvx_22 = ((blx_1)object).bz();
            blx_1 blx_12 = (blx_1)bvx_22.a(aff_12.d(), aff_12.e());
            RE RE = this.a(efh_02, ((epq_2)object).ge(), (Su)object, blx_12, aff_12, list2);
            if (this.a(RE) && blx_12 != null) {
                object = blx_12;
            }
            if (RE instanceof eHV && (eHV2 = (eHV)RE).aG() && (object2 = eHV2.aF()) != null) {
                this.c((blx_1)object, (aff_1)object2, efh_02, s2, list);
            }
            this.c(RE);
        }
    }

    protected void c(RE RE) {
        LinkedHashSet<RE> linkedHashSet = new LinkedHashSet<RE>();
        linkedHashSet.add(RE);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add((sd_0<?, ?>)RE);
        while (!linkedHashSet2.isEmpty()) {
            Set<sd_0<?, ?>> set = this.a(linkedHashSet2);
            linkedHashSet2.clear();
            linkedHashSet2.addAll(set);
            linkedHashSet.addAll(set);
        }
        for (sd_0 sd_02 : linkedHashSet) {
            sd_02.q();
        }
    }

    @NotNull
    private Set<sd_0<?, ?>> a(Set<sd_0<?, ?>> set) {
        HashSet hashSet = new HashSet();
        for (sd_0<?, ?> sd_02 : set) {
            ejh_0 ejh_02;
            Object object;
            Sr sr = sd_02.l();
            if (sr instanceof efn_0 && (object = (efn_0)sr) != null && (ejh_02 = ((efn_0)object).f()) != null) {
                hashSet.add(ejh_02);
            }
            if ((object = sd_02.v()) == null) continue;
            hashSet.add((sd_0<?, ?>)object);
        }
        return hashSet;
    }

    protected void b(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list) {
        aej_2 aej_22 = new afs_2(blx_12.P_(), aff_12).h();
        if (aej_22 == aej_2.k) {
            aej_22 = blx_12.F();
        }
        Iterable<int[]> iterable = this.a(efh_02, list).a(aff_12.d(), aff_12.e(), aff_12.f(), blx_12.G(), blx_12.H(), blx_12.I(), aej_22);
        tg_0 tg_02 = blx_12.bz().g();
        for (int[] nArray : iterable) {
            int n;
            int n2 = nArray[0];
            if (!tg_02.c(n2, n = nArray[1])) continue;
            this.a.a.a(n2, n, tg_02.i(n2, n));
            if (this.a.c == null) continue;
            this.a.c.c(n2, n, tg_02.i(n2, n));
        }
    }

    protected void c(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list) {
        aej_2 aej_22 = new afs_2(blx_12.P_(), aff_12).h();
        if (aej_22 == aej_2.k) {
            aej_22 = blx_12.F();
        }
        Iterable<int[]> iterable = this.a(efh_02, list).a(aff_12.d(), aff_12.e(), aff_12.f(), blx_12.G(), blx_12.H(), blx_12.I(), aej_22);
        tg_0 tg_02 = blx_12.bz().g();
        for (int[] nArray : iterable) {
            int n;
            int n2 = nArray[0];
            if (!tg_02.c(n2, n = nArray[1])) continue;
            this.a.b.a(n2, n, tg_02.i(n2, n));
            if (this.a.c == null) continue;
            this.a.c.c(n2, n, tg_02.i(n2, n));
        }
    }
}

