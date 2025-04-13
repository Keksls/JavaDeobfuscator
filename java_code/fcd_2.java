/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 *  org.apache.log4j.Logger
 */
import org.apache.commons.pool.ObjectPool;
import org.apache.log4j.Logger;

/*
 * Renamed from fCD
 */
public class fcd_2
extends fca_2 {
    private static final Logger i = Logger.getLogger(fcd_2.class);
    private static final ObjectPool j = new abm_1(new fce_2());
    private int k;
    private char m;

    public char j() {
        return this.m;
    }

    public void a(char c2) {
        this.m = c2;
    }

    public int k() {
        return this.k;
    }

    public void a(int n) {
        this.k = n;
    }

    public boolean b(char c2) {
        return this.q() && this.m == '\u0001' + c2 - 65;
    }

    public static fcd_2 l() {
        fcd_2 fcd_22;
        try {
            fcd_22 = (fcd_2)j.borrowObject();
            fcd_22.a = j;
        }
        catch (Exception exception) {
            i.error((Object)"Probl\u00e8me au borrowObject.");
            fcd_22 = new fcd_2();
            fcd_22.onCheckOut();
        }
        return fcd_22;
    }

    @Override
    public void onCheckIn() {
        this.m = (char)65535;
        this.k = -1;
    }

    @Override
    public String toString() {
        return String.format("%s{type=%s,target=%s,keyChar=%s,keyCode=%s,keyModifiers=%s}", new Object[]{this.getClass(), this.f(), this.e(), Character.valueOf(this.j()), this.k(), this.p()});
    }
}

