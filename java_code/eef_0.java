/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from eEf
 */
public class eef_0<T extends epq_2>
implements eZa,
ezk_1,
ezo_1 {
    private static final Logger b = Logger.getLogger(eef_0.class);
    private static final int c = Integer.MIN_VALUE;
    protected final T a;
    private int d = Integer.MIN_VALUE;
    private int e = Integer.MIN_VALUE;

    public eef_0(T t) {
        this.a = t;
    }

    public void b() {
        ezj_1 ezj_12 = ((epq_2)this.a).dx().d();
        if (ezj_12 != null) {
            this.e = ezj_12.e();
            this.d = ezj_12.c();
        }
    }

    @Override
    public void a(ezm_1 ezm_12) {
        try {
            this.a(ezm_12.d().c());
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised", (Throwable)exception);
        }
        this.b(ezm_12);
    }

    @Override
    public void b(ezj_1 ezj_12) {
        ezm_1 ezm_12 = ((epq_2)this.a).dx();
        if (ezm_12.d() != ezj_12) {
            return;
        }
        try {
            this.a(ezj_12.c());
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised", (Throwable)exception);
        }
        this.f(ezj_12);
    }

    @Override
    public void c(ezj_1 ezj_12) {
        ezm_1 ezm_12 = ((epq_2)this.a).dx();
        if (ezm_12.d() != ezj_12) {
            return;
        }
        try {
            this.a(ezj_12.c());
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised", (Throwable)exception);
        }
        this.f(ezj_12);
    }

    @Override
    public void a(eyz_0 eyz_02) {
        eyz_0 eyz_03 = ((epq_2)this.a).cG();
        if (eyz_03 != eyz_02) {
            return;
        }
        ezm_1 ezm_12 = ((epq_2)this.a).dx();
        ezj_1 ezj_12 = ezm_12.d();
        if (ezj_12 == null) {
            return;
        }
        try {
            this.a(ezj_12.c());
        }
        catch (Exception exception) {
            b.error((Object)"Exception raised", (Throwable)exception);
        }
        this.f(ezj_12);
    }

    @Override
    public void d(ezj_1 ezj_12) {
        eeh_0.b(this.a);
    }

    @Override
    public void e(ezj_1 ezj_12) {
        eeh_0.a(this.a);
    }

    @Override
    public void b(ezm_1 ezm_12, ezj_1 ezj_12) {
    }

    private void a(int n) {
        ((epq_2)this.a).ht();
        try {
            eyz_0 eyz_02 = ((epq_2)this.a).d(this.e);
            eeh_0.a(this.a, eyz_02, this.d, n);
            eeh_0.b(this.a);
        }
        finally {
            ((epq_2)this.a).hu();
        }
    }

    private void b(ezm_1 ezm_12) {
        this.f(ezm_12.d());
    }

    private void f(ezj_1 ezj_12) {
        this.e = ezj_12 == null ? Integer.MIN_VALUE : ezj_12.e();
        this.d = ezj_12 == null ? Integer.MIN_VALUE : ezj_12.c();
    }

    @Override
    public void a(ezm_1 ezm_12, ezj_1 ezj_12) {
    }

    @Override
    public void a(ezj_1 ezj_12) {
    }

    @Override
    public void a(exh_2 exh_22, Long l) {
    }

    @Override
    public void b(exh_2 exh_22, Long l) {
    }
}

