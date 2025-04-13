/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongIterator
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.iterator.TLongIterator;
import gnu.trove.set.hash.TLongHashSet;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from bzh
 */
public class bzh_1
implements eux_2<bnh_1> {
    public static final bzh_1 a = new bzh_1();

    private bzh_1() {
    }

    @Override
    public void a(bnh_1 bnh_12) {
    }

    @Override
    public void b(bnh_1 bnh_12) {
        if (!euu_2.a()) {
            return;
        }
        bzh_1.a();
        dds_0.a().d();
        cxo_0.a(bzg_1.a.a(bnh_12));
        if (cZI.A()) {
            cZI.a().a(bnh_12);
        }
    }

    @Override
    public void c(bnh_1 bnh_12) {
        if (!euu_2.a()) {
            return;
        }
        if (bnh_12 instanceof bmr_1) {
            bmr_1 bmr_12 = (bmr_1)bnh_12;
            bmr_12.cg().p();
        }
        bzh_1.a();
        long l = bnh_12.a_();
        cxo_0.b(l);
        cyt_0.a().d(l);
        dds_0.a().b(l);
        bmr_1 bmr_13 = azu_0.j().k();
        bmr_1 bmr_14 = bkr_2.v.r();
        if (bmr_14 != null && bmr_14.a_() == l) {
            bmk_1 bmk_12 = bzg_1.a.a(bmr_13);
            fis_1.a().a("characterSheet", (Object)bmk_12, "characterSheetDialog");
            bkr_2.v.a(bmr_13);
        }
        cwa_0.a.a(bmr_13);
        if (cZI.A()) {
            cZI.a().b(bnh_12);
        }
    }

    @Override
    public void d(bnh_1 bnh_12) {
    }

    public static void a() {
        bmr_1 bmr_12 = bzf_1.a();
        if (bmr_12 == null) {
            fis_1.a().a("heroesParty", Collections.emptyList());
            fis_1.a().a("heroesPartyIsFull", false);
            fis_1.a().a("companionPartyListFull", false);
            return;
        }
        long l = bmr_12.U_();
        ArrayList<bnh_1> arrayList = new ArrayList<bnh_1>();
        TLongHashSet tLongHashSet = euw_2.a.e(l);
        TLongIterator tLongIterator = tLongHashSet.iterator();
        while (tLongIterator.hasNext()) {
            bnh_1 bnh_12 = (bnh_1)euw_2.a.d(tLongIterator.next());
            arrayList.add(bnh_12);
        }
        arrayList.sort(new bzi_1());
        cxq_0.a.f();
        fis_1.a().a("heroesParty", arrayList);
        fis_1.a().a("heroesPartyIsFull", !bzf_1.a((byte)0));
        fis_1.a().a("companionPartyListFull", !bzf_1.a((byte)5));
    }

    @Override
    public /* synthetic */ void a(epq_2 epq_22) {
        this.d((bnh_1)epq_22);
    }

    @Override
    public /* synthetic */ void b(epq_2 epq_22) {
        this.c((bnh_1)epq_22);
    }

    @Override
    public /* synthetic */ void c(epq_2 epq_22) {
        this.b((bnh_1)epq_22);
    }

    @Override
    public /* synthetic */ void d(epq_2 epq_22) {
        this.a((bnh_1)epq_22);
    }
}

