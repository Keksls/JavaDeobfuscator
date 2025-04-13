/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongShortIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongShortIterator;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/*
 * Renamed from eXs
 */
public abstract class exs_2
extends TO<exx_2, wf_2>
implements UF,
gq_1<wh_2> {
    private static final Logger e = Logger.getLogger(exs_2.class);
    protected final long s;
    protected final eyk_1 t;
    protected final byte u;
    protected String v;
    private final ArrayList<eyj_2> k;

    public exs_2(long l, tv_0<exx_2, wf_2> tv_02, eyk_1 eyk_12, short s2, byte by) {
        super(tv_02, eyh_2.a(), s2, true);
        this.a(Ui.f);
        this.s = l;
        this.t = eyk_12;
        this.u = by;
        this.k = new ArrayList();
    }

    public long r() {
        return this.s;
    }

    public final byte s() {
        return this.u;
    }

    public final eyk_1 t() {
        return this.t;
    }

    @Override
    public boolean a(exx_2 exx_22) {
        return exx_22 != null;
    }

    public void a(eyg_2 eyg_22, exx_2 exx_22) {
        this.b(eyg_22, exx_22);
    }

    public exe_1<exk_2> a(eyg_2<exk_2> eyg_22, long l, short s2, eyu_1 eyu_12, long l2, long l3) {
        epq_2 epq_22;
        exe_1<exk_2> exe_12 = new exe_1<exk_2>();
        exe_12.a((byte)1);
        exx_2 exx_22 = (exx_2)this.e(l);
        Long l4 = ewd_1.a();
        if (exx_22 == null) {
            e.error((Object)("Impossible de r\u00e9cup\u00e9rer l'item " + l));
            return exe_12;
        }
        if (this.n()) {
            e.error((Object)"Requ\u00eate d'achat sur un inventaire marchand verouill\u00e9");
            exe_12.a((byte)3);
            return exe_12;
        }
        if (!this.a(exx_22) || s2 <= 0) {
            return exe_12;
        }
        eyu_1 eyu_13 = eyg_22.dK();
        short s3 = exx_22.e();
        long l5 = exx_22.p() * (long)s2;
        if (l5 > Integer.MAX_VALUE || l5 < 0L) {
            e.error((Object)("[BROCANTE] Tentative d'achat d'un objet en brocante invalide : prix total incoh\u00e9rent (d\u00e9passement de capacit\u00e9 ou n\u00e9gatif) [price=" + l5 + "]"));
            return exe_12;
        }
        long l6 = eyu_13.a();
        short s4 = exx_22.q().f;
        if (s3 < s2 * s4 || l6 < l5 || s4 < 0) {
            e.error((Object)("[BROCANTE] Quantit\u00e9 insuffisante(" + s2 + "/" + s3 + ") ou le joueur n'a pas les moyens(" + l6 + "/" + l5 + ") ou les constantes sont invalides packSize=" + s4));
            return exe_12;
        }
        exk_2 exk_22 = exx_22.h().c(exk_2.S().a().d());
        exk_22.a((short)(s2 * s4));
        if (!eyg_22.b(exk_22)) {
            e.warn((Object)("[BROCANTE] Impossible d'acheter : Les inventaires du joueur ne peuvent acceuillir l'objet de type " + exk_22.aT_()));
            exk_22.release();
            exe_12.a((byte)2);
            return exe_12;
        }
        this.a(eyg_22, exx_22);
        if (exx_22.e() == s2 * s4) {
            this.c(l);
            exx_22.release();
        } else {
            this.a(exx_22.a(), (short)(-(s2 * s4)));
        }
        exg_2 exg_22 = eyg_22.c(exk_22);
        if (eyg_22 instanceof epq_2) {
            epq_22 = (epq_2)((Object)eyg_22);
            ewd_1.a(l4, "FromMerchantInventoryToInventory", ewf_1.a(l3, l2), ewf_1.a(epq_22), ewf_1.a(exk_22), ewf_1.f(epq_22.T_()));
        }
        eyu_13.b(l6 - l5);
        if (eyu_12 != null) {
            eyu_12.c(l5);
        }
        if (eyg_22 instanceof epq_2) {
            epq_22 = (epq_2)((Object)eyg_22);
            ewd_1.a(l4, "BuyInMerchantInventory", ewf_1.a(epq_22), ewf_1.a(l3, l2), ewf_1.e(l5), ewf_1.c(epq_22.T_(), this.r()));
        }
        exe_12.a((byte)0);
        exe_12.a(exg_22);
        exe_12.a(exk_22);
        exe_12.a(l5);
        exe_12.a(s2 * s4);
        return exe_12;
    }

    public String u() {
        return this.v;
    }

    public void c(String string) {
        this.v = string;
    }

    public void a(exx_2 exx_22, long l) {
        exx_2 exx_23 = (exx_2)this.e(exx_22.a());
        if (exx_23 == exx_22) {
            exx_23.a(l);
            this.a(um_0.c(this.i, exx_22, this.b(exx_22.a())));
        } else {
            e.error((Object)("Impossible de d\u00e9finir le prix sur un objet qui ne fait pas partie de l'inventaire: " + exx_22.a()));
        }
    }

    public void a(exx_2 exx_22, fev_0 fev_02) {
        exx_2 exx_23 = (exx_2)this.e(exx_22.a());
        if (exx_23 == exx_22) {
            exx_23.a(fev_02);
            this.a(um_0.d(this.i, exx_22, this.b(exx_22.a())));
        } else {
            e.error((Object)("Impossible de d\u00e9finir le prix sur un objet qui ne fait pas partie de l'inventaire: " + exx_22.a()));
        }
    }

    @Override
    public boolean b(wh_2 wh_22) {
        if (this.s != wh_22.a) {
            e.warn((Object)("Mauvais uid \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + this.s + ", trouv\u00e9=" + wh_22.a));
        }
        if (this.t.ordinal() != (wh_22.b & 0xFF)) {
            e.warn((Object)("Mauvais type d'item requis \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + this.t + ", trouv\u00e9=" + wh_22.b));
        }
        if (this.k() != wh_22.c) {
            e.warn((Object)("Mauvais nombre de slots la d\u00e9s\u00e9rialisation: attendu=" + this.k() + ", trouv\u00e9=" + wh_22.c));
        }
        if (this.u != wh_22.d) {
            e.warn((Object)("Mauvaise packMax \u00e0 la d\u00e9s\u00e9rialisation: attendu=" + this.u + ", trouv\u00e9=" + wh_22.d));
        }
        this.v = wh_22.f;
        this.b(wh_22.g);
        this.aO_();
        boolean bl = true;
        tt_0 tt_02 = this.e();
        this.a(null);
        for (wi_2 wi_22 : wh_22.e) {
            exx_2 exx_22 = (exx_2)this.c.a(wi_22.b);
            if (exx_22 != null) {
                try {
                    if (!this.a(exx_22, wi_22.a)) {
                        bl = false;
                        e.error((Object)("Following item (" + exx_22 + ") can't be add to inventory for following slot : " + wi_22.a + " itemSerial : " + exx_22.h().aq()));
                    }
                }
                catch (uz_0 uz_02) {
                    bl = false;
                    e.error((Object)uz_02);
                }
                catch (Uy uy) {
                    bl = false;
                    e.error((Object)uy);
                }
                catch (uc_0 uc_02) {
                    bl = false;
                    e.error((Object)uc_02);
                }
                if (bl) continue;
                exx_22.a((exk_2)null);
                exx_22.release();
                continue;
            }
            e.error((Object)("D\u00e9s\u00e9rialisation d'un MerchantItem null \u00e0 la position " + wi_22.a));
            bl = false;
        }
        this.a(tt_02);
        return bl;
    }

    @Override
    public boolean a(wh_2 wh_22) {
        this.c(wh_22);
        TLongShortIterator tLongShortIterator = this.b.iterator();
        while (tLongShortIterator.hasNext()) {
            tLongShortIterator.advance();
            short s2 = tLongShortIterator.value();
            exx_2 exx_22 = (exx_2)this.e(s2);
            if (exx_22 == null) {
                e.error((Object)("Incoh\u00e9rence d'Inventory, l'item $" + tLongShortIterator.key() + " est r\u00e9f\u00e9renc\u00e9 mais n'est pas pr\u00e9sent dans le tableau"), (Throwable)new Exception());
                continue;
            }
            if (!exx_22.j()) continue;
            wi_2 wi_22 = new wi_2();
            wi_22.a = s2;
            boolean bl = exx_22.a(wi_22.b);
            if (bl) {
                wh_22.e.add(wi_22);
                continue;
            }
            e.error((Object)("Impossible de convertir l'item \u00e0 la position " + s2 + " sous forme d\u00e9s\u00e9rialis\u00e9e brute"));
            return false;
        }
        return true;
    }

    public void c(wh_2 wh_22) {
        wh_22.c();
        wh_22.a = this.s;
        wh_22.b = (byte)this.t.ordinal();
        wh_22.c = this.k();
        wh_22.d = this.u;
        wh_22.f = this.v;
        wh_22.g = this.n();
    }

    @Override
    public void a(eyj_2<? extends eyg_2> eyj_22) {
        if (this.k.contains(eyj_22)) {
            e.error((Object)"Tentative d'ajout multiple du m\u00eame listener d'evenement sur un MerchantInventory");
            return;
        }
        this.k.add(eyj_22);
    }

    public void b(eyj_2 eyj_22) {
        this.k.remove(eyj_22);
    }

    protected final void b(eyg_2 eyg_22, exx_2 exx_22) {
        int n = this.k.size();
        for (int k = 0; k < n; ++k) {
            this.k.get(k).a(eyg_22, exx_22);
        }
    }

    @Override
    public String g() {
        return "merchant";
    }
}

