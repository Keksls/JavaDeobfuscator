/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eWo
 */
public class ewo_1 {
    private final ewp_1 a;

    public ewo_1(ewx_2 ewx_22) {
        this.a = (ewp_1)ewx_22;
    }

    protected ewp_1 a() {
        return this.a;
    }

    public final short a(int n, short s2) {
        if (s2 <= 0) {
            throw new exe_2("Impossible d'ajouter une quantit\u00e9 n\u00e9gative " + s2 + " \u00e0 l'item " + n);
        }
        if (this.a.a(n) == null) {
            return this.d(n, s2);
        }
        return this.e(n, s2);
    }

    public final boolean b(int n, short s2) {
        if (s2 >= 0) {
            throw new exe_2("Impossible de soustraire une quantit\u00e9 positive " + s2 + " \u00e0 l'item " + n);
        }
        ewz_2 ewz_22 = this.a.a(n);
        if (ewz_22 == null) {
            return false;
        }
        if (ewz_22.b() + s2 > 0) {
            this.e(n, s2);
        } else {
            this.a(n);
        }
        return true;
    }

    public final short c(int n, short s2) {
        if (s2 >= 0) {
            throw new exe_2("Impossible de soustraire une quantit\u00e9 positive " + s2 + " \u00e0 l'item " + n);
        }
        ewz_2 ewz_22 = this.a.a(n);
        if (ewz_22 == null) {
            return 0;
        }
        if (ewz_22.b() + s2 > 0) {
            return this.e(n, s2);
        }
        return this.a(n);
    }

    public final short d(int n, short s2) {
        ewz_2 ewz_22 = this.a.a(n);
        if (ewz_22 != null) {
            throw new exe_2("Un item " + ewz_22 + " est d\u00e9j\u00e0 pr\u00e9sent dans l'inventaire");
        }
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            throw new exe_2("Impossible de trouver le refItem " + n);
        }
        if (s2 <= 0) {
            throw new exe_2("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " d'une quantit\u00e9 de " + s2);
        }
        ews_1 ews_12 = new ews_1((ewv_2)r2);
        ews_12.a(Hw.a(s2, ((ezr_0)r2).o()));
        this.a.a(ews_12);
        if (ews_12.c() < s2) {
            return ews_12.c();
        }
        return s2;
    }

    public final void a(ewz_2 ewz_22) {
        if (!(ewz_22 instanceof ews_1)) {
            throw new exe_2("Impossible d'ajouter un item de type " + ewz_22.getClass().getSimpleName());
        }
        if (this.a.a(ewz_22.a()) != null) {
            throw new exe_2("Un item " + ewz_22 + " est d\u00e9j\u00e0 pr\u00e9sent dans l'inventaire");
        }
        this.a.a(ewz_22);
    }

    public final short a(int n) {
        ewz_2 ewz_22 = this.a.a(n);
        if (ewz_22 == null) {
            throw new exe_2("L'item " + n + " n'existe pas dans l'inventaire");
        }
        this.a.b(ewz_22);
        return ewz_22.b();
    }

    public final short e(int n, short s2) {
        if (s2 == 0) {
            throw new exe_2("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " d'une quantit\u00e9 de " + s2);
        }
        ews_1 ews_12 = (ews_1)this.a.a(n);
        if (ews_12 == null) {
            throw new exe_2("Impossible de trouver l'item " + n);
        }
        short s3 = ews_12.b();
        int n2 = s3 + s2;
        if (n2 <= 0) {
            throw new exe_2("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " \u00e0 une quantit\u00e9 de " + n2);
        }
        ews_12.a(Hw.a(Hw.c((long)n2), ews_12.c()));
        if (ews_12.c() < n2) {
            return Hw.c((long)(ews_12.c() - s3));
        }
        return s2;
    }

    public final void f(int n, short s2) {
        ews_1 ews_12 = (ews_1)this.a.a(n);
        if (ews_12 == null) {
            throw new exe_2("Impossible de trouver l'item " + n);
        }
        if (s2 <= 0) {
            throw new exe_2("Impossible de mettre \u00e0 jour la quantit\u00e9 de l'item " + n + " d'une quantit\u00e9 de " + s2);
        }
        ews_12.a(Hw.a(s2, ews_12.c()));
    }

    public String toString() {
        return "QuestInventoryController{m_inventory=" + this.a + "}";
    }
}

