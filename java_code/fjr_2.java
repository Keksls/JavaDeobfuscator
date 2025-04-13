/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fJr
 */
public class fjr_2
extends fjh_2<fjf_2> {
    public fjr_2(fjf_2 fjf_22, fjf_2 fjf_23, fvE fvE2, int n, int n2, fjw_2 fjw_22) {
        super(fjf_22, fjf_23, fvE2, n, n2, fjw_22);
    }

    @Override
    public boolean a(int n) {
        if (!super.a(n)) {
            return false;
        }
        if (this.c != null) {
            fjf_2 fjf_22 = (fjf_2)this.j;
            fjf_2 fjf_23 = (fjf_2)this.k;
            int n2 = (int)this.c.a(fjf_22.width, fjf_23.width, this.d, this.e);
            int n3 = (int)this.c.a(fjf_22.height, fjf_23.height, this.d, this.e);
            this.c().setSize(n2, n3, true);
        }
        return true;
    }

    @Override
    public void a() {
        fjf_2 fjf_22 = (fjf_2)this.k;
        this.c().setSize(fjf_22.width, fjf_22.height, true);
        super.a();
    }

    public String toString() {
        return "[ResizeTween] " + this.j + " -> " + this.k;
    }
}

