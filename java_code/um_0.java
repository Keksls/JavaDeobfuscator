/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from Um
 */
public class um_0
extends Uk {
    private ts_0 f;
    protected short d;
    protected short e;

    public um_0(Ui ui, ul_0 ul_02) {
        super(ui, ul_02);
    }

    public static um_0 a(Ui ui, ts_0 ts_02) {
        return um_0.a(ui, ul_0.a, ts_02, (short)0);
    }

    public static um_0 a(Ui ui, ts_0 ts_02, short s2) {
        return um_0.a(ui, ul_0.b, ts_02, s2);
    }

    public static um_0 b(Ui ui, ts_0 ts_02, short s2) {
        return um_0.a(ui, ul_0.e, ts_02, (short)0, s2);
    }

    public static um_0 a(Ui ui, ts_0 ts_02, short s2, short s3) {
        return um_0.a(ui, ul_0.e, ts_02, s2, s3);
    }

    public static um_0 c(Ui ui, ts_0 ts_02, short s2) {
        return um_0.a(ui, ul_0.f, ts_02, s2);
    }

    public static um_0 d(Ui ui, ts_0 ts_02, short s2) {
        return um_0.a(ui, ul_0.g, ts_02, s2);
    }

    public static um_0 b(Ui ui, ts_0 ts_02) {
        return um_0.a(ui, ul_0.c, ts_02, (short)0);
    }

    public static um_0 e(Ui ui, ts_0 ts_02, short s2) {
        return um_0.a(ui, ul_0.d, ts_02, s2);
    }

    public static Uk a(Ui ui) {
        return new Uj(ui, ul_0.h);
    }

    private static um_0 a(Ui ui, ul_0 ul_02, ts_0 ts_02, short s2) {
        return um_0.a(ui, ul_02, ts_02, s2, (short)-1);
    }

    private static um_0 a(Ui ui, ul_0 ul_02, ts_0 ts_02, short s2, short s3) {
        um_0 um_02 = new um_0(ui, ul_02);
        um_02.f = ts_02;
        um_02.d = s2;
        um_02.e = s3;
        return um_02;
    }

    public ts_0 c() {
        return this.f;
    }

    public short d() {
        return this.d;
    }

    public short e() {
        return this.e;
    }

    @Override
    @Nullable
    public String g() {
        ts_0 ts_02 = this.f;
        if (!(ts_02 instanceof UF)) {
            a.error((Object)("Log de type " + this.getClass().getName() + " sur un InventoryItemModifiedEvent d'un item de type non-loggable : " + ts_02.getClass().getName()));
            return null;
        }
        String string = ((UF)((Object)ts_02)).g();
        switch (this.b()) {
            case a: 
            case b: {
                return "itemAcquired=" + string;
            }
            case f: {
                return "itemPriceChange=" + string;
            }
            case g: {
                return "itemPackSizeChange=" + string;
            }
            case e: {
                return "itemQuantityModified=" + string + " quantity=" + this.e;
            }
            case c: 
            case d: {
                return "itemLost=" + string;
            }
        }
        a.error((Object)("Log de type " + this.getClass().getName() + " sur un InventoryItemModifiedEvent d'action " + this.b() + " inconnue"));
        return null;
    }

    @Override
    public String toString() {
        return "InventoryItemModifiedEvent{m_concernedItem=" + this.f + ", m_position=" + this.d + ", m_quantity=" + this.e + "} " + super.toString();
    }
}

