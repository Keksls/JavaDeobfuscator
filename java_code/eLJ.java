/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.pool.ObjectPool
 */
import java.util.Collections;
import java.util.List;
import org.apache.commons.pool.ObjectPool;

public class eLJ
extends Uv {
    private ell_0 k;
    protected long j;
    private static final ObjectPool l = new abm_1(new elk_0());

    public ell_0 j() {
        return this.k;
    }

    public long k() {
        if (this.g != Ux.c) {
            throw new UnsupportedOperationException("Amount of cash can be retrieved for Cash Modification events only");
        }
        return this.j;
    }

    public static eLJ a(ty_0 ty_02, ell_0 ell_02) {
        eLJ eLJ2;
        try {
            eLJ2 = (eLJ)l.borrowObject();
            eLJ2.f = l;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors d'un checkOut sur un message de type WakfuItemExchangerModifiedEvent : " + exception.getMessage()));
            eLJ2 = new eLJ();
        }
        eLJ2.b(ty_02, ell_02);
        return eLJ2;
    }

    public static eLJ a(ty_0 ty_02, Ux ux, long l, ts_0 ts_02, short s2, ell_0 ell_02) {
        eLJ eLJ2;
        try {
            eLJ2 = (eLJ)eLJ.l.borrowObject();
            eLJ2.f = eLJ.l;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            eLJ2 = new eLJ();
        }
        eLJ2.b(ty_02, ux, l, ts_02, s2, ell_02);
        return eLJ2;
    }

    public static eLJ a(ty_0 ty_02, Ux ux, long l, List<ts_0> list, ell_0 ell_02) {
        eLJ eLJ2;
        try {
            eLJ2 = (eLJ)eLJ.l.borrowObject();
            eLJ2.f = eLJ.l;
        }
        catch (Exception exception) {
            a.error((Object)("Error in checkOut on ItemExchangerEndEvent type message : " + exception.getMessage()));
            eLJ2 = new eLJ();
        }
        eLJ2.b(ty_02, ux, l, list, ell_02);
        return eLJ2;
    }

    public static eLJ a(ty_0 ty_02, Ux ux, long l, long l2, ell_0 ell_02) {
        eLJ eLJ2;
        if (ux != Ux.c) {
            throw new UnsupportedOperationException("checkout with this parameters should only be use for a cash modification");
        }
        try {
            eLJ2 = (eLJ)eLJ.l.borrowObject();
            eLJ2.f = eLJ.l;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            eLJ2 = new eLJ();
        }
        eLJ2.b(ty_02, ux, l, l2, ell_02);
        return eLJ2;
    }

    public static eLJ a(ty_0 ty_02, Ux ux, long l, long l2) {
        eLJ eLJ2;
        if (ux != Ux.c) {
            throw new UnsupportedOperationException("checkout with this parameters should only be use for a cash modification");
        }
        try {
            eLJ2 = (eLJ)eLJ.l.borrowObject();
            eLJ2.f = eLJ.l;
        }
        catch (Exception exception) {
            a.error((Object)("Erreur lors d'un checkOut sur un message de type ItemExchangerEndEvent : " + exception.getMessage()));
            eLJ2 = new eLJ();
        }
        eLJ2.b(ty_02, ux, l, l2, null);
        return eLJ2;
    }

    private void b(ty_0 ty_02, Ux ux, long l, ts_0 ts_02, short s2, ell_0 ell_02) {
        this.b(ty_02, Uu.d);
        this.g = ux;
        this.e = l;
        this.h = Collections.singletonList(ts_02);
        this.i = s2;
        this.k = ell_02;
    }

    private void b(ty_0 ty_02, Ux ux, long l, List<ts_0> list, ell_0 ell_02) {
        this.b(ty_02, Uu.d);
        this.g = ux;
        this.e = l;
        this.h = list;
        this.k = ell_02;
    }

    private void b(ty_0 ty_02, Ux ux, long l, long l2, ell_0 ell_02) {
        this.b(ty_02, Uu.d);
        this.g = ux;
        this.e = l;
        this.j = l2;
        this.k = ell_02;
    }

    protected eLJ() {
        this.c = null;
        this.d = null;
        this.k = null;
    }

    protected void b(ty_0 ty_02, ell_0 ell_02) {
        this.b(ty_02, Uu.d);
        this.k = ell_02;
    }

    @Override
    public void a() {
        if (this.f != null) {
            this.f.returnObject((Object)this);
            this.f = null;
        } else {
            this.onCheckIn();
        }
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.k = null;
        this.j = -1L;
        this.h = null;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.k = null;
        this.j = -1L;
        this.h = null;
    }
}

