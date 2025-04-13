/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortByteIterator
 *  gnu.trove.map.hash.TByteIntHashMap
 *  gnu.trove.map.hash.TShortByteHashMap
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import gnu.trove.iterator.TShortByteIterator;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.map.hash.TShortByteHashMap;
import java.util.Iterator;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bng
 */
final class bng_1 {
    private static final Logger a = Logger.getLogger(bng_1.class);
    private final bnh_1 b;
    private final efj_0 c = new efj_0();

    bng_1(@NotNull bnh_1 bnh_12) {
        this.b = bnh_12;
    }

    void a() {
        TByteIntHashMap tByteIntHashMap = this.b.eI();
        if (tByteIntHashMap == null) {
            return;
        }
        this.c.a(12);
        int[] nArray = tByteIntHashMap.values();
        TShortByteHashMap tShortByteHashMap = new TShortByteHashMap();
        this.b.dR().f(12);
        for (int k = 0; k < nArray.length; ++k) {
            this.a(tShortByteHashMap, nArray[k]);
        }
        this.a(tShortByteHashMap, this.b.en());
        this.a(tShortByteHashMap);
    }

    private void a(TShortByteHashMap tShortByteHashMap, int n) {
        Iterator<efh_0> iterator;
        if (n <= 0) {
            return;
        }
        Object r2 = eyo_1.g().d(n);
        if (r2 == null) {
            a.warn((Object)("L'item " + n + " n'existe pas"));
            return;
        }
        if (((ezr_0)r2).x() > 0) {
            tShortByteHashMap.adjustOrPutValue(((ezr_0)r2).x(), (byte)1, (byte)1);
        }
        if (!(iterator = ((ezr_0)r2).u()).hasNext()) {
            return;
        }
        this.a(n, iterator);
    }

    private void a(TShortByteHashMap tShortByteHashMap) {
        this.b.dR().g(14);
        this.c.a(14);
        TShortByteIterator tShortByteIterator = tShortByteHashMap.iterator();
        while (tShortByteIterator.hasNext()) {
            exz_2 exz_22;
            tShortByteIterator.advance();
            bhd_1 bhd_12 = bhe_0.a().a(tShortByteIterator.key());
            if (bhd_12 == null || (exz_22 = bhd_12.c(tShortByteIterator.value())) == null) continue;
            Iterator<efh_0> iterator = exz_22.iterator();
            this.a(bhd_12.h(), iterator);
        }
    }

    private void a(int n, Iterator<efh_0> iterator) {
        this.c.a((long)n);
        efi_0 efi_02 = this.c.a();
        while (iterator.hasNext()) {
            efh_0 efh_02 = iterator.next();
            this.a(n, efi_02, efh_02);
        }
    }

    private void a(int n, efi_0 efi_02, efh_0 efh_02) {
        if (this.a(efi_02, efh_02)) {
            return;
        }
        if (efh_02.j() != efc_0.eR.a() && bng_1.b(efh_02)) {
            a.warn((Object)("HMI is not set on a NullEffect on the item " + n));
        }
    }

    private boolean a(efi_0 efi_02, efh_0 efh_02) {
        if (!this.a(efh_02)) {
            return false;
        }
        if (efh_02.j() == efc_0.eR.a()) {
            if (bng_1.b(efh_02)) {
                efh_02.a(efi_02, this.b, this.b.ge(), efc_0.a(), this.b.G(), this.b.H(), this.b.I(), this.b, null, false);
            }
            return true;
        }
        if (efh_02.j() == efc_0.eq.a()) {
            return this.c(efi_02, efh_02);
        }
        if (efe_0.a.contains(efh_02.j())) {
            return this.b(efi_02, efh_02);
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(efh_0 efh_02) {
        boolean bl;
        apc_2 apc_22 = efh_02.Q();
        ejh_0 ejh_02 = (ejh_0)efc_0.a().b(efh_02.j());
        if (ejh_02 == null) {
            return false;
        }
        sd_0 sd_02 = ejh_02.x();
        try {
            bl = apc_22 == null || apc_22.b(this.b, this.b, sd_02, this.b.Q_());
        }
        catch (RuntimeException runtimeException) {
            a.error((Object)"Exception levee", (Throwable)runtimeException);
            bl = false;
        }
        finally {
            sd_02.q();
        }
        return bl;
    }

    private boolean b(efi_0 efi_02, efh_0 efh_02) {
        if (efh_02.s()) {
            return true;
        }
        fil_0 fil_02 = fim_0.a().a(efh_02.i());
        if (fil_02 != null) {
            for (efh_0 efh_03 : fil_02) {
                this.a(efi_02, efh_03);
            }
        } else {
            a.error((Object)("Group d'effet inconnu:" + efh_02.i()));
        }
        return true;
    }

    private boolean c(efi_0 efi_02, efh_0 efh_02) {
        if (efh_02.s()) {
            return true;
        }
        bpe_0 bpe_02 = (bpe_0)fih_0.a().a(efh_02.a(0, (short)0, eFb.a));
        if (bpe_02 != null) {
            for (efh_0 efh_03 : bpe_02) {
                this.a(efi_02, efh_03);
            }
        } else {
            a.error((Object)("etat inconnu:" + efh_02.a(0)));
        }
        return true;
    }

    private static boolean b(efh_0 efh_02) {
        return efh_02.S().hasNext() || efh_02.T().hasNext();
    }
}

