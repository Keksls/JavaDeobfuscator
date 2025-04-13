/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bWb {
    protected static final Logger a = Logger.getLogger(bWb.class);
    private int b = 1;
    private dhq_0 c;
    private boolean d = true;
    private boolean e = false;

    public void a(aum_2 aum_22) {
        dhm_0 dhm_02 = new dhm_0(ans_0.D().a());
        ArrayList<dhq_0> arrayList = dhm_02.e();
        this.e = this.c(aum_22);
        this.c = this.a(arrayList, aum_22);
        this.b = this.d(aum_22);
        this.d = this.b(aum_22);
    }

    private boolean b(aum_2 aum_22) {
        return true;
    }

    private boolean c(aum_2 aum_22) {
        boolean bl = axy_2.b.a();
        return bl;
    }

    private dhq_0 a(ArrayList<dhq_0> arrayList, aum_2 aum_22) {
        return arrayList.get(0);
    }

    private int d(aum_2 aum_22) {
        return 1;
    }

    public void a() {
        a.info((Object)"Graphical preferences :");
        a.info((Object)("\t* resolution : " + this.c));
        a.info((Object)("\t* fullscreen : " + this.d));
        a.info((Object)("\t* level of details : " + this.b));
        a.info((Object)("\t* shaders activated : " + this.e));
    }
}

