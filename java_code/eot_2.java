/*
 * Decompiled with CFR 0.152.
 */
import java.lang.ref.WeakReference;

/*
 * Renamed from eOt
 */
public final class eot_2
extends WeakReference<eol_2>
implements eol_2 {
    public eot_2(eol_2 eol_22) {
        super(eol_22);
    }

    @Override
    public void a(int n) {
        eol_2 eol_22 = (eol_2)this.get();
        if (eol_22 != null) {
            eol_22.a(n);
        }
    }

    @Override
    public eol_2 a() {
        return (eol_2)this.get();
    }
}

