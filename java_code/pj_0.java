/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

/*
 * Renamed from Pj
 */
public abstract class pj_0
extends TG
implements Tw {
    private static final Logger q = Logger.getLogger(pj_0.class);
    private static final String r = "ie_actions";
    private final ArrayList<ph_0> s = new ArrayList(1);
    final EnumMap<Tv, Integer> t = new EnumMap(Tv.class);
    protected boolean a;
    private final fo_1 u = new pk_0(this);

    public final Collection<ph_0> av_() {
        return this.s;
    }

    @Override
    public boolean a(Tv tv, TF tF) {
        if (!this.N()) {
            return false;
        }
        boolean bl = this.b(tv, tF);
        if (!bl) {
            q.warn((Object)("Action non prise en compte par le ModelControler (ClientMapInteractiveElement) : " + tv));
        }
        return bl;
    }

    @Override
    public void onCheckIn() {
        super.onCheckIn();
        this.s.clear();
        this.t.clear();
    }

    @Override
    public void onCheckOut() {
        super.onCheckOut();
        this.a = false;
        assert (this.s.isEmpty());
        assert (this.t.isEmpty());
    }

    public boolean a(ph_0 ph_02) {
        ph_02.a(this);
        this.a((Ty)ph_02);
        return this.s.add(ph_02);
    }

    public final void aw_() {
        for (ph_0 ph_02 : this.s) {
            this.b((Ty)ph_02);
        }
        this.s.clear();
    }

    public abstract List<aff_1> aK_();

    @Override
    protected fo_1 e() {
        return this.u;
    }

    @Override
    protected final fo_1 f() {
        return fo_1.c;
    }

    @Override
    protected final fo_1 g() {
        return fo_1.c;
    }

    @Override
    public yx_0 h() {
        aff_1 aff_12 = this.P_();
        return yz_0.a(aff_12.d(), aff_12.e());
    }

    public abstract boolean aB_();

    public final void aI_() {
        for (ph_0 ph_02 : this.s) {
            this.b(ph_02);
        }
    }

    protected void b(ph_0 ph_02) {
        ph_02.e();
    }

    public void aD_() {
        this.a = true;
    }

    public void aE_() {
        this.a = false;
    }

    public abstract void c(ph_0 var1);

    public boolean d(ph_0 ph_02) {
        this.b((Ty)ph_02);
        return this.s.remove(ph_02);
    }

    protected final void a(Tv tv) {
        Integer n = this.t.get(tv);
        if (n != null && n != 0) {
            Map<String, Object> map = Collections.singletonMap("elementId", this.d);
            assert (aks_1.a().e() != null);
            String string = String.format("%s/%d%s", r, n, aks_1.a().c());
            aks_1.a().a(string, null, map, null, false);
        }
    }
}

