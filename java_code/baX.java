/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class baX
extends alc_1
implements abq_1 {
    private ArrayList<ahr_1> e;
    private static final abm_1 f = new abm_1(new baY());

    public static baX a(int n, int n2, int n3, ArrayList<ahr_1> arrayList) {
        try {
            baX baX2 = (baX)f.borrowObject();
            baX2.a(n);
            baX2.b(n2);
            baX2.c(n3);
            baX2.a(arrayList);
            return baX2;
        }
        catch (Exception exception) {
            throw new RuntimeException("Erreur lors d'un checkOut : ", exception);
        }
    }

    @Override
    public void release() {
        try {
            f.returnObject(this);
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
    }

    baX() {
        super(0, 0, 0);
    }

    @Override
    protected long o() {
        for (ahr_1 ahr_12 : this.e) {
            azu_0.j().a(ahr_12);
        }
        return 0L;
    }

    @Override
    protected void l() {
        this.release();
    }

    public void a(ArrayList<ahr_1> arrayList) {
        this.e = arrayList;
    }
}

