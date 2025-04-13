/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

final class bcW
implements adx_1<cbm_0> {
    private static final Logger a = Logger.getLogger(bcW.class);

    bcW() {
    }

    @Override
    public boolean a(cbm_0 cbm_02) {
        a.info((Object)"Receiving companion list");
        byte[] byArray = cbm_02.b();
        List<eBt> list = this.a(byArray);
        bai_0 bai_02 = azu_0.j().n();
        long l = bai_02.u();
        eBo.a.d(l);
        for (eBt eBt2 : list) {
            try {
                eBo.a.a(l, eBt2);
                eBt2.b(bdb.a);
                this.a(eBt2);
                if (!azu_0.j().c(cxq_0.a)) continue;
                cxq_0.a.g();
                cxq_0.a.i();
            }
            catch (Exception exception) {
                a.error((Object)"Exception levee", (Throwable)exception);
            }
        }
        a.info((Object)("Companions received : " + list.size()));
        return false;
    }

    private List<eBt> a(byte[] byArray) {
        ArrayList<eBt> arrayList = new ArrayList<eBt>();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            arrayList.add(eBv.b(byteBuffer));
        }
        return arrayList;
    }

    private void a(eBt eBt2) {
        for (exk_2 exk_22 : eBt2.h()) {
            exk_22.P();
        }
    }

    @Override
    public int a() {
        return 23201;
    }
}

