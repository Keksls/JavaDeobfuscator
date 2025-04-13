/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongShortIterator
 *  gnu.trove.set.hash.TByteHashSet
 *  org.apache.log4j.Logger
 */
import gnu.trove.iterator.TLongShortIterator;
import gnu.trove.set.hash.TByteHashSet;
import org.apache.log4j.Logger;

/*
 * Renamed from eXQ
 */
public class exq_2
extends TL<exk_2, vf_2>
implements UF,
gq_1<wb_1> {
    public static final int k = 2;
    private static final Logger l = Logger.getLogger(exq_2.class);
    private static final boolean m = false;
    private static final boolean n = false;
    private final TByteHashSet o = new TByteHashSet();

    public exq_2() {
        super(exk_2.class, exg_1.a(), exf_1.a(), exh_2.c(), false, false);
        this.a(Ui.d);
    }

    public void a(exh_2 exh_22, boolean bl) {
        if (bl) {
            this.o.add(exh_22.A);
        } else {
            this.o.remove(exh_22.A);
        }
    }

    @Override
    public boolean a(byte by) {
        return this.o.contains(by);
    }

    @Override
    public void j() {
        super.j();
        this.o.clear();
    }

    @Override
    public final boolean a(wb_1 wb_12) {
        if (this.e) {
            l.warn((Object)"Impossible d'ajouter l'information de quantit\u00e9 \u00e0 un RawInventoryItemInventory qui n'est pas pr\u00e9vu pour");
        }
        wb_12.c();
        TLongShortIterator tLongShortIterator = this.c.iterator();
        while (tLongShortIterator.hasNext()) {
            Object object;
            tLongShortIterator.advance();
            short s2 = tLongShortIterator.value();
            try {
                exk_2 exk_22 = ((exk_2[])this.b)[s2];
                if (!exk_22.j()) continue;
                object = new wc_2();
                ((wc_2)object).a = this.f(exk_22.a());
                exk_22.a(((wc_2)object).b);
                wb_12.a.add((wc_2)object);
            }
            catch (ClassCastException classCastException) {
                object = ((exk_2[])this.b)[s2];
                l.error((Object)("erreur de cast : content is " + object.getClass().getName()), (Throwable)classCastException);
            }
            catch (Exception exception) {
                l.error((Object)("Exception lev\u00e9e lors de la r\u00e9cup\u00e9ration de l'item \u00e0 la position " + s2 + " de l'\u00e9quipement " + this), (Throwable)exception);
            }
        }
        return true;
    }

    @Override
    public boolean b(wb_1 wb_12) {
        try {
            this.aO_();
            if (this.e) {
                l.warn((Object)"Impossible de d\u00e9s\u00e9rialiser la quantit\u00e9 d'objets dans un inventaire, cette information n'est pas pr\u00e9sente dans le format RawInventory");
            }
            boolean bl = true;
            for (wc_2 wc_22 : wb_12.a) {
                try {
                    exk_2 exk_22 = (exk_2)this.d.a(wc_22.b);
                    if (exk_22 != null) {
                        if (this.b(exk_22, wc_22.a)) continue;
                        bl = false;
                        continue;
                    }
                    bl = false;
                    l.error((Object)"Erreur lors de la d\u00e9-serialisation d'un ArrayInventory : item null");
                }
                catch (uz_0 uz_02) {
                    l.error((Object)aho_2.a(uz_02));
                    bl = false;
                }
                catch (Uy uy) {
                    l.error((Object)aho_2.a(uy));
                    bl = false;
                }
                catch (uc_0 uc_02) {
                    l.error((Object)aho_2.a(uc_02));
                    bl = false;
                }
                catch (Exception exception) {
                    l.error((Object)aho_2.a(exception));
                    bl = false;
                }
            }
            return bl;
        }
        catch (ClassCastException classCastException) {
            l.error((Object)("Impossible d'initialiser un " + this.getClass() + " \u00e0 partir d'un " + wb_12.getClass() + " : RawArrayInventory attendu"), (Throwable)classCastException);
            return false;
        }
    }

    @Override
    public String g() {
        return "equipment";
    }

    @Override
    public String toString() {
        return "ItemEquipment{m_lockedPositions=" + this.o.size() + ", " + super.toString() + "}";
    }
}

