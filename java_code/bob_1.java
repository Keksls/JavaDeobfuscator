/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

/*
 * Renamed from boB
 */
public abstract class bob_1
extends bon_2 {
    protected final ArrayList<epa_1> B = new ArrayList();

    public bob_1(epa_1 epa_12, bor_1 bor_12, epa_1 ... epa_1Array) {
        this(epa_12, bor_12, -1, epa_1Array);
    }

    public bob_1(epa_1 epa_12, bor_1 bor_12, byte by, epa_1 ... epa_1Array) {
        super(epa_12, by, bor_12);
        this.B.addAll(Arrays.asList(epa_1Array));
        int n = this.B.size();
        for (int k = 0; k < n; ++k) {
            this.B.get(k).a(this);
        }
    }

    @Override
    protected int a() {
        int n = 0;
        int n2 = this.B.size();
        for (int k = 0; k < n2; ++k) {
            n += this.B.get(k).a();
        }
        return n;
    }

    @Override
    protected int b() {
        int n = 0;
        int n2 = this.B.size();
        for (int k = 0; k < n2; ++k) {
            n += this.B.get(k).c();
        }
        return n;
    }
}

