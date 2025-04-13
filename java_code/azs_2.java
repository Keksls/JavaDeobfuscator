/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from azs
 */
public class azs_2
extends abp_1 {
    private ArrayList<azf_2> a;

    public azs_2(int n) {
        this.a = new ArrayList(n);
    }

    public azs_2(azs_2 azs_22) {
        this.a = new ArrayList(azs_22.a.size());
        this.a.addAll(azs_22.a);
    }

    public final int a() {
        return this.a.size();
    }

    public final azf_2 a(int n) {
        return this.a.get(n);
    }

    public final void a(int n, azf_2 azf_22) {
        try {
            this.a.set(n, azf_22);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.a.add(n, azf_22);
        }
    }

    public final void a(azf_2 azf_22) {
        this.a.add(azf_22);
    }

    @Override
    protected void j_() {
        this.a.clear();
        this.a = null;
    }
}

