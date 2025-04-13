/*
 * Decompiled with CFR 0.152.
 */
import java.util.EnumMap;
import java.util.Map;

public class eAI
implements eAG {
    private final Map<eAE, eAH> a = new EnumMap<eAE, eAH>(eAE.class);

    @Override
    public int a(eAE eAE2, int n, int n2) {
        eAH eAH2 = this.a.get((Object)eAE2);
        if (eAH2 == null) {
            return 0;
        }
        return eAH2.a(n, n2);
    }

    @Override
    public void a() {
        this.a.clear();
    }

    @Override
    public void b(eAE eAE2, int n, int n2) {
        eAH eAH2 = this.a.get((Object)eAE2);
        if (eAH2 == null) {
            eAH2 = new eAH();
            this.a.put(eAE2, eAH2);
        }
        eAH2.b(n, n2);
    }

    @Override
    public void a(eAE eAE2, int n, int n2, int n3) {
        eAH eAH2 = this.a.get((Object)eAE2);
        if (eAH2 == null) {
            eAH2 = new eAH();
            this.a.put(eAE2, eAH2);
        }
        eAH2.a(n, n2, n3);
    }
}

