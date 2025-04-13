/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Renamed from aPH
 */
final class aph_0 {
    final abv_0 a;
    final abv_0 b;
    final abv_0 c;
    final eKw d = new eKw();
    private final apl_0 e = new apl_0(this);
    private final apk_0<?, ?> f = new apk_0(this);
    private final apj_0<?, ?> g = new apj_0(this);

    aph_0(abv_0 abv_02, abv_0 abv_03, abv_0 abv_04) {
        this.a = abv_02;
        this.b = abv_03;
        this.c = abv_04;
    }

    public void a(List<efi_0> list, blx_1 blx_12, aff_1 aff_12) {
        this.a();
        short s2 = list.get(list.size() - 1).c();
        this.a(list, blx_12, aff_12, s2);
    }

    public void a(aff_1 aff_12) {
        this.a();
        if (this.a == null) {
            return;
        }
        this.a.a(aff_12.d(), aff_12.e(), aff_12.f());
    }

    void a(List<efi_0> list, blx_1 blx_12, aff_1 aff_12, short s2) {
        if (list == null) {
            throw new IllegalArgumentException("containers == null");
        }
        efi_0 efi_02 = list.get(list.size() - 1);
        if (efi_02 == null) {
            throw new IllegalArgumentException("container == null");
        }
        if (this.a == null && this.b == null && this.c == null) {
            return;
        }
        if (blx_12 == null || !blx_12.bv().at()) {
            return;
        }
        bvx_2 bvx_22 = blx_12.bz();
        if (bvx_22 == null) {
            return;
        }
        tg_0 tg_02 = bvx_22.g();
        for (efh_0 efh_02 : efi_02) {
            if (efh_02.h() != 2 || efh_02.a(1L) || efh_02.a(eff_0.c) || s2 > efh_02.P() || s2 < efh_02.O()) continue;
            this.a(blx_12, aff_12, tg_02, efh_02);
            this.a(list, blx_12, aff_12, bvx_22, tg_02, efh_02, s2);
        }
    }

    private void a(blx_1 blx_12, aff_1 aff_12, tg_0 tg_02, efh_0 efh_02) {
        if (this.c == null) {
            return;
        }
        aqd_1 aqd_12 = efh_02.U();
        if (aqd_12 == null) {
            return;
        }
        Iterable<int[]> iterable = aqd_12.a(aff_12.d(), aff_12.e(), aff_12.f(), blx_12.G(), blx_12.H(), blx_12.I(), blx_12.F());
        for (int[] nArray : iterable) {
            int n;
            int n2 = nArray[0];
            if (!tg_02.c(n2, n = nArray[1])) continue;
            short s2 = tg_02.i(n2, n);
            this.c.a(n2, n, s2);
        }
    }

    public void a(List<efi_0> list, blx_1 blx_12, aff_1 aff_12, bvx_2 bvx_22, tg_0 tg_02, efh_0 efh_02, short s2) {
        if (this.a == null && this.b == null) {
            return;
        }
        if (!this.a(blx_12, aff_12, bvx_22, tg_02, efh_02)) {
            return;
        }
        if (this.a(efh_02)) {
            this.b(blx_12, aff_12, efh_02, s2, list);
            return;
        }
        aqd_1 aqd_12 = efh_02.u();
        if (aqd_12.d() == aqe_1.m) {
            this.a(blx_12, aff_12, bvx_22, efh_02);
        } else {
            this.a(list, blx_12, aff_12, tg_02, efh_02, aqd_12, s2);
        }
    }

    private boolean a(blx_1 blx_12, aff_1 aff_12, bvx_2 bvx_22, tg_0 tg_02, efh_0 efh_02) {
        aqd_1 aqd_12 = efh_02.U();
        if (aqd_12 != null) {
            Iterable<int[]> iterable = aqd_12.a(aff_12.d(), aff_12.e(), aff_12.f(), blx_12.G(), blx_12.H(), blx_12.I(), blx_12.F());
            for (int[] nArray : iterable) {
                if (tg_02.g(nArray[0], nArray[1]) == null) continue;
                return false;
            }
        }
        return efh_02.Q() == null || efh_02.Q().b(blx_12, aff_12, efh_02, bvx_22);
    }

    private void a(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, List<efi_0> list, short s2) {
        this.g.a(blx_12, aff_12, efh_02, s2, list);
    }

    private void a(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list) {
        sr_0<efh_0, elb_0> sr_02 = eig_0.a(efh_02, list.get(list.size() - 1));
        if (sr_02 != null) {
            LinkedList<efi_0> linkedList = new LinkedList<efi_0>(list);
            linkedList.add((efi_0)((Object)sr_02));
            this.f.a(blx_12, aff_12, efh_02, s2, linkedList);
        }
    }

    private void b(blx_1 blx_12, aff_1 aff_12, efh_0 efh_02, short s2, List<efi_0> list) {
        int n = efh_02.i();
        fil_0 fil_02 = bow_0.a().a(n);
        if (fil_02 == null) {
            return;
        }
        LinkedList<efi_0> linkedList = new LinkedList<efi_0>(list);
        linkedList.add(fil_02);
        this.e.a(blx_12, aff_12, efh_02, s2, linkedList);
    }

    private boolean a(efh_0 efh_02) {
        int n = efh_02.j();
        return efe_0.a.contains(n);
    }

    boolean b(efh_0 efh_02) {
        int n = efh_02.j();
        return n == efc_0.ds.a() || n == efc_0.dn.a() || n == efc_0.du.a() || this.d(efh_02) || this.c(efh_02);
    }

    private boolean c(efh_0 efh_02) {
        return efh_02.j() == efc_0.dp.a();
    }

    private boolean d(efh_0 efh_02) {
        return efh_02.j() == efc_0.dt.a();
    }

    private void a(List<efi_0> list, blx_1 blx_12, aff_1 aff_12, tg_0 tg_02, efh_0 efh_02, aqd_1 aqd_12, short s2) {
        if (this.c(efh_02)) {
            this.a(blx_12, aff_12, efh_02, s2, list);
        } else if (this.d(efh_02)) {
            sr_0<efh_0, elb_0> sr_02 = eig_0.a(efh_02, list.get(list.size() - 1));
            if (sr_02 != null) {
                LinkedList<efi_0> linkedList = new LinkedList<efi_0>(list);
                list.add((efi_0)((Object)sr_02));
                this.a(linkedList, blx_12, aff_12, s2);
            }
        } else {
            this.a(blx_12, aff_12, efh_02, list, s2);
        }
    }

    private void a(blx_1 blx_12, aff_1 aff_12, bvx_2 bvx_22, efh_0 efh_02) {
        Iterator<Su> iterator = bvx_22.k();
        while (iterator.hasNext()) {
            Su su = iterator.next();
            abo_2<apu_2, ArrayList<Su>> abo_22 = efh_02.k().a(su, blx_12);
            switch (abo_22.a()) {
                case a: 
                case e: 
                case b: {
                    this.a.a(su.G(), su.H(), su.I());
                }
            }
        }
        this.a.a(aff_12.d(), aff_12.e(), aff_12.f());
        if (this.c != null) {
            this.c.c(aff_12.d(), aff_12.e(), aff_12.f());
        }
    }

    void a(String string, aim aim2) {
        if (this.a != null) {
            this.a.a(string, aim2);
        }
        if (this.b != null) {
            this.b.a(string, aim2);
        }
    }

    public void a() {
        if (this.a != null) {
            this.a.a();
        }
        if (this.b != null) {
            this.b.a();
        }
        if (this.c != null) {
            this.c.a();
        }
    }
}

