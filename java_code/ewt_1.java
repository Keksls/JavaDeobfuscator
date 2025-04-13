/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eWt
 */
public class ewt_1 {
    private final ewu_1 a;

    public ewt_1(exb_2 exb_22) {
        this.a = (ewu_1)exb_22;
    }

    protected exb_2 b() {
        return this.a;
    }

    public final boolean a(exk_2 exk_22, boolean bl) {
        boolean bl2;
        if (bl) {
            return this.b(exk_22, true);
        }
        boolean bl3 = bl2 = !this.b(exk_22);
        if (bl2) {
            return this.a(exk_22);
        }
        return true;
    }

    public final boolean d(exk_2 exk_22) {
        return this.a(exk_22, false);
    }

    public final exk_2 b(long l) {
        exk_2 exk_22 = this.a.a(l);
        if (exk_22 == null) {
            throw new exf_2("Impossible de trouver l'item " + l);
        }
        return this.a.c(l);
    }

    public final short c(long l) {
        exk_2 exk_22 = this.a.a(l);
        if (exk_22 == null) {
            throw new exf_2("Impossible de trouver l'item " + l);
        }
        return exk_22.e();
    }

    public final void a(long l, short s2) {
        exk_2 exk_22 = this.a.a(l);
        if (exk_22 == null) {
            throw new exf_2("Impossible de trouver l'item " + l);
        }
        this.a(exk_22, s2);
    }

    @Nullable
    public final exk_2 b(long l, short s2) {
        if (s2 < 0) {
            throw new exf_2("Impossible de modifier la quantit\u00e9 de l'item " + l + ", on utilise une quantit\u00e9 n\u00e9gative");
        }
        exk_2 exk_22 = this.a.a(l);
        if (exk_22 == null) {
            throw new exf_2("Impossible de trouver l'item " + l);
        }
        int n = exk_22.e() - s2;
        return this.a(exk_22, (short)n);
    }

    public final void a(long l, long l2, short s2, short s3) {
        block13: {
            short s4;
            exg_2 exg_22 = this.a(l2);
            if (exg_22 == null) {
                throw new exf_2("Impossible de trouver le sac");
            }
            exk_2 exk_22 = this.a.a(l);
            if (exk_22 == null) {
                throw new exf_2("Impossible de trouver l'item " + l);
            }
            short s5 = s4 = s3 == -1 ? exk_22.e() : s3;
            if (s4 < 0 || s4 > exk_22.e()) {
                throw new exf_2("Quantit\u00e9 invalide : " + s4);
            }
            try {
                if (exg_22.b(exk_22, s2)) {
                    if (!exg_22.c(exk_22, s2)) {
                        throw new exf_2("Probl\u00e8me \u00e0 l'ajout de l'item.");
                    }
                    this.a.c(l);
                    if (!exg_22.g(exk_22)) {
                        exk_22.release();
                    }
                    break block13;
                }
                exk_2 exk_23 = exg_22.a(s2);
                if (exk_23 != null && exk_23.a(exk_22)) {
                    short s6 = (short)Math.min(s4, Math.min(exk_22.e(), exk_23.D()));
                    exg_22.b(exk_23.a(), s6);
                    if (s6 == exk_22.e()) {
                        this.a.c(l);
                    } else {
                        this.a.a(l, (short)(exk_22.e() - s6));
                    }
                    break block13;
                }
                throw new exf_2("La position n'est pas stackable.");
            }
            catch (uz_0 uz_02) {
                throw new exf_2("La destination est occup\u00e9e. " + uz_02);
            }
            catch (Uy uy) {
                throw new exf_2("Contenu d\u00e9ja pr\u00e9sent. Triche ?" + uy);
            }
            catch (uc_0 uc_02) {
                throw new exf_2("La destination est occup\u00e9e." + uc_02);
            }
        }
    }

    public void a(tw_0<exk_2> tw_02) {
        for (short s2 = (short)(this.a.b() - 1); s2 >= 0; s2 = (short)(s2 - 1)) {
            exk_2 exk_22 = this.a.a(s2);
            if (!tw_02.isValid(exk_22)) continue;
            exk_2 exk_23 = this.a.c(exk_22.a());
            exk_23.release();
        }
    }

    public void c() {
        this.a.f();
    }

    @Nullable
    protected exg_2 a(long l) {
        return null;
    }

    private boolean b(exk_2 exk_22, boolean bl) {
        if (this.a.d()) {
            if (bl) {
                return false;
            }
            this.a.a();
        }
        this.a.a(exk_22);
        return true;
    }

    private boolean a(exk_2 exk_22) {
        return this.b(exk_22, false);
    }

    private boolean b(exk_2 exk_22) {
        short s2 = this.a.b();
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            exk_2 exk_23 = this.a.a(s3);
            if (!exk_23.a(exk_22) || exk_23.D() == 0) continue;
            int n = Math.min(exk_22.e(), exk_23.D());
            this.a.a(exk_23.a(), (short)(exk_23.e() + n));
            if (exk_22.e() == n) {
                exk_22.release();
                return true;
            }
            exk_22.b((short)(-n));
        }
        return false;
    }

    @Nullable
    private exk_2 a(exk_2 exk_22, short s2) {
        if (s2 < 0 || s2 > exk_22.aR_()) {
            throw new exf_2("Impossible de d\u00e9finir la quantit\u00e9 de l'item " + exk_22.a() + " \u00e0 " + s2);
        }
        exk_2 exk_23 = null;
        if (s2 == 0) {
            exk_23 = this.a.c(exk_22.a());
        } else {
            this.a.a(exk_22.a(), s2);
        }
        return exk_23;
    }

    public String toString() {
        return "TemporaryInventoryController{m_inventory=" + this.a + "}";
    }
}

