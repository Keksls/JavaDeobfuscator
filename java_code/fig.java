/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongShortIterator
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongShortIterator;
import org.apache.log4j.Logger;

public class fig<S extends fib>
extends TK<S, yp_2>
implements gq_1<yq_1> {
    private static final Logger e = Logger.getLogger(fig.class);
    private fid k = fid.a;

    public fig(fid fid2, tv_0<S, yp_2> tv_02, tt_0<S> tt_02, short s2, boolean bl) {
        super(tv_02, tt_02, s2, bl);
        this.a(Ui.g);
        this.k = fid2;
    }

    @Override
    public boolean a(yq_1 yq_12) {
        yq_12.c();
        yq_12.a = (byte)this.k.ordinal();
        TLongShortIterator tLongShortIterator = this.b.iterator();
        while (tLongShortIterator.hasNext()) {
            tLongShortIterator.advance();
            short s2 = tLongShortIterator.value();
            fib fib2 = (fib)this.e(s2);
            if (fib2 == null) {
                e.error((Object)("Incoh\u00e9rence d'Inventory, l'item $" + tLongShortIterator.key() + " est r\u00e9f\u00e9renc\u00e9 mais n'est pas pr\u00e9sent dans le tableau"), (Throwable)new Exception());
                continue;
            }
            if (!fib2.j()) continue;
            yr_2 yr_22 = new yr_2();
            yr_22.a = s2;
            boolean bl = fib2.b(yr_22.b);
            if (bl) {
                yq_12.b.add(yr_22);
                continue;
            }
            e.error((Object)("Impossible de convertir le raccourci \u00e0 la position " + s2 + " sous forme d\u00e9-s\u00e9rialis\u00e9e brute"));
            return false;
        }
        return true;
    }

    @Override
    public boolean b(yq_1 yq_12) {
        this.aO_();
        boolean bl = true;
        fid[] fidArray = fid.values();
        if (yq_12.a >= 0 && yq_12.a < fidArray.length) {
            this.k = fidArray[yq_12.a];
        } else {
            bl = false;
        }
        try {
            for (yr_2 yr_22 : yq_12.b) {
                fib fib2 = (fib)this.c.a(yr_22.b);
                if (fib2 != null) {
                    if (this.a(fib2, yr_22.a)) continue;
                    bl = false;
                    continue;
                }
                bl = false;
                e.error((Object)"Erreur lors de la d\u00e9-serialisation d'un ArrayInventory : item null");
            }
        }
        catch (uz_0 uz_02) {
            e.error((Object)uz_02);
            bl = false;
        }
        catch (Uy uy) {
            e.error((Object)uy);
            bl = false;
        }
        catch (uc_0 uc_02) {
            e.error((Object)uc_02);
            bl = false;
        }
        return bl;
    }

    public fid p() {
        return this.k;
    }

    public boolean a(long l, fie fie2) {
        fib fib2 = (fib)this.e(l);
        return fib2 != null && fib2.n() == fie2;
    }
}

