/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from fkE
 */
public class fke_0
extends fkg_0<fkj_0> {
    private static final Logger b = Logger.getLogger(fke_0.class);

    public fke_0(fkj_0 fkj_02) {
        super(fkj_02);
    }

    public boolean a(int n, int n2) {
        short s2 = fkh_0.m(n);
        short s3 = fkh_0.o(n);
        short s4 = fkh_0.j(n2);
        short s5 = fkh_0.n(n2);
        afk_2 afk_22 = ((fkj_0)this.a).g();
        if (!(afk_22.b(s2, s4) && afk_22.b(s3, s4) && afk_22.b(s2, s5) && afk_22.b(s3, s5))) {
            return false;
        }
        return !fkk_0.a(((fkj_0)this.a).b(s2, s4)) && !fkk_0.a(((fkj_0)this.a).b(s3, s4)) && !fkk_0.a(((fkj_0)this.a).b(s2, s5)) && !fkk_0.a(((fkj_0)this.a).b(s3, s5));
    }
}

