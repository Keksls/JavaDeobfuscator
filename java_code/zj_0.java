/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.text.EntityText;

/*
 * Renamed from Zj
 */
public class zj_0
extends zi_0
implements za_0 {
    private int c;
    private int d = 1;

    public zj_0(ayn_2 ayn_22, String string, int n) {
        super(ayn_22, string, n);
    }

    protected void x() {
        this.a(new zl_0());
    }

    @Override
    public void a(acb_0 acb_02, int n) {
        this.c(n);
    }

    @Override
    public int i() {
        return this.c;
    }

    @Override
    public void d(int n) {
        this.c = n;
    }

    @Override
    public int j() {
        return this.d;
    }

    @Override
    public void e(int n) {
        this.d = n;
    }

    @Override
    public void a(float f2, float f3, float f4, float f5) {
        this.n().a(new aft_2(f2, f3, -1.0f));
        this.n().a((int)f4, (int)f5 + 3);
    }

    @Override
    public final EntityText n() {
        return super.n();
    }

    @Override
    public void l() {
    }

    @Override
    public /* synthetic */ Entity k() {
        return this.n();
    }
}

