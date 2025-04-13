/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Renamed from bnY
 */
public class bny_2
implements bnx_2 {
    public static final int a = 3683;
    private static final int f = 1500;
    private static final int g = 250;
    private static final String[] h = new String[]{"worldAndFightBarDialog"};
    public static final String b = "ecaflipDice";
    public static final String c = "ecaflipClubImage";
    public static final String d = "ecaflipClubLabel";
    public static final String e = "AnimDe-";
    private final bnh_1 i;
    private final ArrayList<frO> j = new ArrayList(1);
    private final List<fsk_0> k = new ArrayList<fsk_0>();
    private final ArrayList<fsM> l = new ArrayList();

    public bny_2(bnh_1 bnh_12) {
        this.i = bnh_12;
        for (String string : h) {
            fsM fsM2;
            fsk_0 fsk_02;
            fyy_0 fyy_02 = fpm_0.b().h().d(string);
            if (fyy_02 == null) continue;
            frO frO2 = (frO)fyy_02.a(b);
            if (frO2 != null) {
                this.j.add(frO2);
            }
            if ((fsk_02 = (fsk_0)fyy_02.a(c)) != null) {
                this.k.add(fsk_02);
            }
            if ((fsM2 = (fsM)fyy_02.a(d)) == null) continue;
            this.l.add(fsM2);
        }
    }

    @Override
    public void a(tk_0 tk_02) {
        if (tk_02.a() == 1000) {
            ejh_0 ejh_02 = ((epz_0)tk_02).b();
            if (ejh_02.bt_() != efc_0.b.a()) {
                return;
            }
            if (ejh_02.i() != this.i) {
                return;
            }
            fie_0 fie_02 = ((eja_0)ejh_02).aF();
            if (fie_02.p() == 3683) {
                this.a(fie_02.c());
            }
        } else if (tk_02.a() == 1001) {
            ejh_0 ejh_03 = ((epc_1)tk_02).b();
            if (ejh_03.bt_() != efc_0.b.a()) {
                return;
            }
            if (ejh_03.i() != this.i) {
                return;
            }
            fie_0 fie_03 = ((eja_0)ejh_03).aF();
            if (fie_03.p() == 3683) {
                this.a((short)0);
            }
        }
    }

    private void a(short s2) {
        for (int k = this.l.size() - 1; k >= 0; --k) {
            this.l.get(k).c(String.valueOf(s2));
        }
    }

    private static void a(List<? extends fvE> list, Collection<fqt> collection) {
        for (int k = list.size() - 1; k >= 0; --k) {
            collection.add(list.get(k).getAppearance());
        }
    }

    public void a(byte by) {
        if (by < 1 || by > 6) {
            return;
        }
        if (this.l.isEmpty() || this.k.isEmpty() || this.j.isEmpty()) {
            return;
        }
        ArrayList<fqt> arrayList = new ArrayList<fqt>();
        bny_2.a(this.l, arrayList);
        bny_2.a(this.k, arrayList);
        fvE fvE2 = this.l.get(0);
        fvE2.addTween(new fjo_2(azf_2.e, azf_2.b, arrayList, 0, 250, 1, fjw_2.b));
        fvE2.addTween(new fjo_2(azf_2.b, azf_2.e, arrayList, 1500, 250, 1, fjw_2.b));
        ArrayList<fqt> arrayList2 = new ArrayList<fqt>();
        for (int k = this.j.size() - 1; k >= 0; --k) {
            frO frO2 = this.j.get(k);
            frO2.setAnimName(e + by);
            arrayList2.add(frO2);
        }
        fvE fvE3 = this.j.get(0);
        fvE3.addTween(new fjo_2(azf_2.b, azf_2.e, arrayList2, 0, 250, 1, fjw_2.b));
        fvE3.addTween(new fjo_2(azf_2.e, azf_2.b, arrayList2, 1500, 250, 1, fjw_2.b));
    }

    @Override
    public void a() {
        bnz_2.a.a((abu_1)this.i);
    }

    public String toString() {
        return "EcaflipFightListener{m_character=" + this.i + "}";
    }
}

