/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class baV
extends alc_1
implements abq_1 {
    private List<blx_1> e;
    private String f;
    private long g;
    private static final abm_1 h = new abm_1(new baw_0());

    public static baV a(int n, int n2, int n3, List<blx_1> list, String string, int n4) {
        try {
            baV baV2 = (baV)h.borrowObject();
            baV2.a(n);
            baV2.b(n2);
            baV2.c(n3);
            baV2.e = list;
            baV2.f = string;
            baV2.g = n4;
            return baV2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    baV() {
        super(0, 0, 0);
    }

    @Override
    public void release() {
        try {
            h.returnObject(this);
        }
        catch (Exception exception) {
            a.error((Object)("Exception dans le release de " + this.getClass().toString() + "(normalement impossible)"));
        }
    }

    @Override
    public void onCheckOut() {
    }

    @Override
    public void onCheckIn() {
        this.e = null;
        this.f = null;
        this.g = 0L;
    }

    @Override
    protected long o() {
        if (this.e == null || this.e.isEmpty()) {
            return 0L;
        }
        for (int k = 0; k < this.e.size(); ++k) {
            blx_1 blx_12 = this.e.get(k);
            blx_12.bv().e(this.f);
        }
        return this.g;
    }

    @Override
    protected void l() {
        this.release();
    }

    public void a(blx_1 blx_12) {
        if (this.e == null) {
            this.e = new ArrayList<blx_1>();
        }
        this.e.add(blx_12);
    }
}

