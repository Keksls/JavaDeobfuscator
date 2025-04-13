/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.iterator.TLongObjectIterator;
import gnu.trove.list.array.TLongArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from etP
 */
public class etp_0
extends esi_0 {
    private static final List<aov_1[]> a = new ArrayList<aov_1[]>();
    private ArrayList<aoq_1> b;
    private aom_1 c;

    @Override
    protected List<aov_1[]> i() {
        return a;
    }

    @Override
    public boolean a() {
        return true;
    }

    public etp_0(List<aot_2> list) {
        if (this.a(list) == 0) {
            if (list.get(0).t_() == aov_1.d) {
                this.b = null;
                this.c = (aom_1)list.get(0);
            } else {
                this.b = new ArrayList();
                this.c = null;
                for (aot_2 aot_22 : list) {
                    aoq_1 aoq_12 = (aoq_1)aot_22;
                    this.b.add(aoq_12);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public long a(Object object, Object object2, Object object3, Object object4) {
        epq_2 epq_22;
        if (object == null) {
            if (!(object3 instanceof eyc_0)) throw new aob_1("on cherche l'\u00e9quipement d'un user null");
            epq_22 = ((eyc_0)object3).b();
        } else {
            if (!(object instanceof epq_2)) {
                throw new aob_1("on cherche l'\u00e9quipement d'autre chose qu'un character : " + object.getClass().getSimpleName() + ", ids are " + this.b);
            }
            epq_22 = (epq_2)object;
        }
        if (epq_22 == null) {
            return 0L;
        }
        TLongArrayList tLongArrayList = this.c(object, object2, object3, object4);
        return this.a(epq_22, tLongArrayList);
    }

    protected int a(epq_2 epq_22, TLongArrayList tLongArrayList) {
        int n;
        exh_1 exh_12 = epq_22.dS();
        if (exh_12 == null) {
            return 0;
        }
        int n2 = 0;
        for (n = 0; n < tLongArrayList.size(); ++n) {
            Object object2;
            ArrayList<Object> arrayList;
            gq_1<wb_1> gq_12;
            int n3 = (int)tLongArrayList.get(n);
            TLongObjectIterator<exg_2> tLongObjectIterator = exh_12.i();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                gq_12 = (exg_2)tLongObjectIterator.value();
                arrayList = ((exg_2)gq_12).g().d(n3);
                if (arrayList == null) continue;
                for (Object object2 : arrayList) {
                    n2 += ((exk_2)object2).e();
                }
            }
            gq_12 = epq_22.R_();
            if (gq_12 != null && (arrayList = ((TL)((Object)gq_12)).d(n3)) != null) {
                for (Object object2 : arrayList) {
                    n2 += ((exk_2)object2).e();
                }
            }
            Iterator<Object> iterator = epq_22.cG();
            object2 = epq_22.dC();
            if (iterator == null || object2 == null) continue;
            List<exk_2> list = ((eyz_0)((Object)iterator)).b((eyt_0)object2, n3);
            for (exk_2 exk_22 : list) {
                n2 += exk_22.e();
            }
        }
        if (epq_22 instanceof ewt_2) {
            ewx_2 ewx_22 = (ewx_2)((ewt_2)((Object)epq_22)).a(ewl_1.a);
            for (int k = 0; k < tLongArrayList.size(); ++k) {
                ewz_2 ewz_22 = ewx_22.a((int)tLongArrayList.get(k));
                if (ewz_22 == null) continue;
                n2 += ewz_22.b();
            }
        }
        for (n = 0; n < tLongArrayList.size(); ++n) {
            n2 += evl_2.a(epq_22.R(), (int)tLongArrayList.get(n));
        }
        return n2;
    }

    public TLongArrayList c(Object object, Object object2, Object object3, Object object4) {
        TLongArrayList tLongArrayList;
        if (this.c != null) {
            tLongArrayList = this.c.a(object, object2, object3, object4);
        } else {
            tLongArrayList = new TLongArrayList();
            for (int k = 0; k < this.b.size(); ++k) {
                long l = this.b.get(k).a(object, object2, object3, object4);
                tLongArrayList.add(l);
            }
        }
        return tLongArrayList;
    }

    @Override
    public Enum c() {
        return eyO.U;
    }

    static {
        aov_1[] aov_1Array = new aov_1[]{aov_1.d};
        a.add(aov_1Array);
    }
}

