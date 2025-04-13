/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from ath
 */
public class ath_2
implements aqv_2 {
    private ati_2 a;
    private ArrayList<aqw_2> b;

    public ati_2 a() {
        return this.a;
    }

    public void a(ati_2 ati_22) {
        this.a = ati_22;
    }

    @Override
    public aqx_2 c(String string) {
        if (this.a != null) {
            return this.a.c(string);
        }
        return null;
    }

    @Override
    public ArrayList<aqx_2> d(String string) {
        if (this.a != null) {
            return this.a.d(string);
        }
        return null;
    }

    @Override
    public void a(aqw_2 aqw_22) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if (!this.b.contains(aqw_22)) {
            this.b.add(aqw_22);
        }
    }

    @Override
    public void o() {
        if (this.b == null) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(this);
        }
    }

    @Override
    public void r() {
        if (this.b == null) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).b(this);
        }
    }

    @Override
    public void e(String string) {
        if (this.b == null) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).a(this, string);
        }
    }

    @Override
    public void p() {
        if (this.b == null) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).c(this);
        }
    }

    @Override
    public void q() {
        if (this.b == null) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).d(this);
        }
    }

    @Override
    public void f(String string) {
        if (this.b == null) {
            return;
        }
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            this.b.get(k).b(this, string);
        }
    }
}

