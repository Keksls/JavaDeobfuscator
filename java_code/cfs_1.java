/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from cfs
 */
public class cfs_1
implements ahr_1 {
    protected static final Logger a = Logger.getLogger(cfs_1.class);
    public static final cfs_1 b = new cfs_1();

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 12147: {
                cur_2 cur_22 = (cur_2)adt_12;
                this.a(cur_22);
                return false;
            }
            case 12988: {
                cuq_2 cuq_22 = (cuq_2)adt_12;
                this.a(cuq_22);
                return false;
            }
        }
        return true;
    }

    public void a(cur_2 cur_22) {
        ArrayList<uz_1> arrayList = cur_22.b();
        if (cur_22.c()) {
            aUh.a("playerGift.error.capReached", new Object[0]);
        }
        ArrayList<bxi_2> arrayList2 = new ArrayList<bxi_2>();
        for (int k = 0; k < arrayList.size(); ++k) {
            uz_1 uz_12 = arrayList.get(k);
            bxi_2 bxi_22 = new bxi_2();
            bxi_22.a(uz_12);
            arrayList2.add(bxi_22);
        }
        bxh_2.a().a(arrayList2);
        azu_0.j().a(dca.a());
    }

    public void a(cuq_2 cuq_22) {
        boolean bl = cuq_22.b();
        bxh_2.a().a(bl);
        dca.a().a(true);
        if (bxh_2.a().c()) {
            azu_0.j().b(dca.a());
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }
}

